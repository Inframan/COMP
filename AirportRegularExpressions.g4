lexer grammar AirportRegularExpressions;







////////////////////////////***********************************REGULAR EXPRESSIONS *************************/////////////////////////////////////////////////////////////////////////////
LATTITUDE_VALUES:  (  ('-' | '+')?   (('0'..'8')?('0'..'9')   |  '90')'.'('0'..'9')*  )
| (    ('-' | '+')?   (('0'..'8')?('0'..'9')   |  '90') '-'  ('-' | '+')?('0'..'9')+ '-'  ('-' | '+')? ('0'..'9')+ );


LONGITTUDE_VALUES:  (  ('-' | '+')?   (   ('1'('0'..'7')('0'..'9'))  |  (('0'..'9')?('0'..'9'))   |  '180')'.'('0'..'9')*  )
| (   ('-' | '+')?   (   ('1'('0'..'7')('0'..'9'))  |  (('0'..'9')?('0'..'9'))   |  '180') '-'  ('-' | '+')?('0'..'9')+ '-'  ('-' | '+')? ('0'..'9')+ );

PERCENTAGE: ( '1'.'0' | '0'.'0'('1'..'9') | '0'.('1'..'9')('0'..'9')?);

FLOAT: ('-' | '+')?('0'..'9')+'.'('0'..'9')+;

TRAFFICSCALLAR: INT('F'|'M'|'N');

INT: ('-' | '+')?('0'..'9')+;

ALTITUDE_VALUES: FLOAT( 'M' | 'F')?;

STRING4: (('a'..'z') | ('A'..'Z') | ('0'..'9'))  (('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?;

STRING0_TO4: (('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?;

STRING48: STRING4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4; //12*4 = 48

MAGVAR_VALUES: ('-' | '+')? (   ('3'('0'..'5')('0'..'9'))  |  (('0'..'2')?('0'..'9')?('0'..'9'))   |  '360');

TAXIWAYPOINT_ORIENTATION_VALUES: 'FORWARD' | 'REVERSE';

TAXIWAYPOINT_TYPE: 'NORMAL' | 'HOLD_SHORT' |  'ILS_HOLD_SHORT' |  'HOLD_SHORT_NO_DRAW' | 'ILS_HOLD_SHORT_NO_DRAW';

INTEGER_0_TO_3999: ('0'..'3')?('0'..'9')('0'..'9')?('0'..'9');

DECIMAL_PART: '.'('0'..'9')+;

HEADING_VALUES: (   ('3'('0'..'5')('0'..'9')) |  (('0'..'2')?('0'..'9')?('0'..'9'))   |  '360') DECIMAL_PART?;

TAXIWAY_PARKING_TYPE: 'NONE' |                      'DOCK_GA' |
                      'FUEL' |                      'GATE_HEAVY' |
                      'GATE_MEDIUM' |                      'GATE_SMALL' |
                      'RAMP_CARGO' |                      'RAMP_GA' |
                      'RAMP_GA_LARGE' |                      'RAMP_GA_MEDIUM' |
                      'RAMP_GA_SMALL' |                      'RAMP_MIL_CARGO' |
                      'RAMP_MIL_COMBAT' |                      'VEHICLE';


TAXIWAY_PARKING_NAME: 'PARKING' |
                      'DOCK' |
                      'GATE' |
                      'GATE_A to GATE_Z' |
                      'NONE' |
                      'N_PARKING' |
                      'NE_PARKING' |
                      'NW_PARKING' |
                      'SE_PARKING' |
                      'S_PARKING' |
                      'SW_PARKING' |
                      'W_PARKING' |
                      'E_PARKING';

TAXIWAY_PARKING_TEEOFFSET: (('0'..'4')?('0'..'9')'.'('0'..'9') | '50.0');


STRING0_TO_8: STRING0_TO4 STRING0_TO4;

INTEGER_0_TO_255: (  ( ('0'..'1')?('0'..'9')?('0'..'9'))
 | ('2'(('0'..'4')('0'..'9'))
  | ( '5'('0'..'5'))));

TAXI_NAME_SIZE: 'SIZE1' | 'SIZE2' | 'SIZE3' | 'SIZE4' | 'SIZE5';

TAXI_NAME_JUSTIFICATION: 'LEFT' | 'RIGHT';

ALL_STRING: .*;