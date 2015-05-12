grammar Airport_Parser;


//airports: data + EOF;
/*
data: AIRPORT_OPEN + airporAttributeAnaliser + children + AIRPORT_CLOSE;

airporAttributeAnaliser: ;

children: ;
*/

EQUALS: '=' ;

SIMPLE_TAG_CLOSE: '/>' ;

TAG_CLOSE: '>' ;

AIRPORT_OPEN:  '<Airport' {ignoreWord=false;} ;

AIRPORT_CLOSE: '</Airport>' {ignoreWord=true;} ;

AIRLINE_CODES: 'airlineCodes';

COUNTRY: 'country' ;

CITY: 'city' ;

NAME: 'name' ;

LAT: 'lat';

LON: 'lon';

ALT: 'alt' ;

MAGVAR : 'magvar' ;

TRAFFICSCALAR: 'trafficScalar' ;

AIRPORT_TEST_RADIUS: 'airportTestRadius' ;

IDENT: 'ident' ;

SERVICES_OPEN: '<Services' ;

TRIGGER_OPEN: '<trigger' ;

TRIGGER_CLOSE: '</trigger>';

TRIGGER_WEATHER_DATA_OPEN: '<TriggerWeatherData' ;

FUEL_OPEN: '<Fuel' ;

TYPE: 'type' ;

AVAILABILITY: 'availability' ;

SERVICES_CLOSE: '</Services>' ;

TOWER_OPEN: '<Tower' ;

TOWER_CLOSE: '</Tower>' ;

RUNWAY_OPEN: '<Runway' ;

RUNWAY_CLOSE: '</Runway>' ;

SURFACE: 'surface' ;

HEADING: 'heading' ;

LENGTH: 'length' ;

WIDTH: 'width' ;

NUMBER: 'number' ;

DESIGNATOR: 'designator' ;

PRIMARY_DESIGNATOR: 'primaryDesignator' ;

SECONDARY_DESIGNATOR: 'secondaryDesignator' ;

PATTERN_ALTITUDE: 'patternAltitude' ;

PRIMARY_TAKE_OFF: 'primaryTakeoff' ;

PRIMARY_LANDING: 'primaryLanding' ;

PRIMARY_PATTERN: 'primaryPattern' ;

SECONDARY_TAKE_OFF: 'secondaryTakeoff' ;

SECONDARY_LANDING: 'secondaryLanding' ;

SECONDARY_PATTERN: 'secondaryPattern' ;

PRIMARY_MARKING_BIAS: 'primaryMarkingBias' ;

SECONDARY_MARKING_BIAS: 'secondaryMarkingBias' ;

MARKINGS_OPEN: '<Markings' ;

ALTERNATE_THRESHOLD: 'alternateThreshold' ;

ALTERNATE_TOUCHDOWN: 'alternateTouchdown' ;

ALTERNATE_FIXED_DISTANCE: 'alternateFixedDistance' ;

ALTERNATE_PRECISION: 'alternatePrecision' ;

LEADING_ZERO_IDENT: 'leadingZeroIdent' ;

NO_THRESHOLD_END_ARROWS: 'noThresholdEndArrows' ;

EDGES: 'edges' ;

THRESHOLD: 'threshold' ;

FIXED_DISTANCE: 'fixedDistance' ;

TOUCHDOWN: 'touchdown' ;

DASHES: 'dashes' ;

PRECISION: 'precision' ;

EDGE_PAVEMENT: 'edgePavement' ;

SINGLE_END: 'singleEnd' ;

PRIMARY_CLOSED: 'primaryClosed' ;

SECONDARY_CLOSED: 'secondaryClosed' ;

PRIMARY_STOL: 'primaryStol' ;

SECONDARY_STOL: 'secondaryStol' ;

LIGHTS_OPEN: '<Lights' ;

CENTER: 'center' ;

EDGE: 'edge' ;

CENTER_RED: 'centerRed' ;

OFFSET_THRESHOLD: '<OffsetThreshold' ;

BLAST_PAD: '<BlastPad' ;

OVERRUN: '<Overrun' ;

END: 'end' ;

VASI_OPEN: '<Vasi' ;

SIDE: 'side' ;

BIAS_X: 'biasX' ;

BIAS_Y: 'biasY' ;

BIAS_Z: 'biasZ' ;

SPACING: 'spacing' ;

PITCH: 'pitch' ;

START_OPEN: '<Start' ;

//COM_OPEN: '<Com' ;

FREQUENCY: 'frequency';

APPROACH_LIGHTS_OPEN: '<ApproachLights' ;

SYSTEM: 'system' ;

STROBES: 'strobes' ;

REIL: 'reil' ;

END_LIGHTS: 'endLights' ;

ILS_OPEN: '<Ils' ;

RANGE: 'range' ;

BACK_COURSE: 'backCourse' ;

GLIDE_SLOPE_OPEN: '<GlideSlope' ;

VISUAL_MODEL_OPEN: '<VisualModel' ;

VISUAL_MODEL_CLOSE: '</VisualModel>' ;

INSTANCE_ID: 'instanceId' ;

RUNWAY_START_OPEN: '<RunwayStart' ;

RUNWAY_ALIAS_OPEN: '<RunwayAlias' ;

HELIPAD_OPEN: '<Helipad' ;

CLOSED: 'closed' ;

TRANSPARENT: 'transparent' ;

RED: 'red' ;

GREEN: 'green' ;

BLUE: 'blue' ;

DME_OPEN: '<Dme' ;

ILS_CLOSE: '</Ils>' ;

TAXIWAY_POINT_OPEN: '<TaxiwayPoint' ;

INDEX: 'index' ;

ORIENTATION: 'orientation' ;

TAXIWAY_PARKING_OPEN: '<TaxiwayParking' ;

RADIUS: 'radius' ;

TEE_OFFSET_1: 'teeOffset1' ;

TEE_OFFSET_2: 'teeOffset2' ;

TEE_OFFSET_3: 'teeOffset3' ;

TEE_OFFSET_4: 'teeOffset4' ;

PUSH_BACK: 'pushBack' ;

TAXI_NAME_OPEN: '<TaxiName' ;

TAXIWAY_PATH_OPEN: '<TaxiwayPath' ;

START: 'start' ;

WEIGHT_LIMIT: 'weightLimit' ;

DRAW_SURFACE: 'drawSurface' ;

DRAW_DETAIL: 'drawDetail' ;

LEFT_EDGE: 'leftEdge' ;

RIGHT_EDGE: 'rightEdge' ;

CENTER_LINE: 'centerLine' ;

CENTER_LINE_LIGHTED: 'centerLineLighted' ;

LEFT_EDGE_LIGHTED: 'leftEdgeLighted' ;

RIGHT_EDGE_LIGHTED: 'rightEdgeLighted' ;

GATE_NAME: 'gateName' ;

PARKING_NUMBER: 'parkingNumber' ;

SCENERY_OBJECT_OPEN: '<SceneryObject' ;

SCENERY_OBJECT_CLOSE: '</SceneryObject>' ;

ALTITUDE_IS_AGL: 'altitudeIsAgl' ;

BANK: 'bank' ;

IMAGE_COMPLEXITY: 'imageComplexity' ;

LIBRARY_OBJECT_OPEN: '<LibraryObject' ;

SCALE: 'scale' ;

VERTEX_OPEN: '<Vertex' ;

TAXIWAY_SIGN_OPEN: '<TaxiwaySign' ;

LABEL: 'label' ;

STATE: 'state' ;

SIZE: 'size' ;

JUSTIFICATION: 'justification' ;

PROFILE: 'profile' ;

RUNWAY: 'runway' ;

SUFFIX: 'suffix' ;

GPS_OVERLAY: 'gpsOverlay' ;

//FIX_TYPE: 'fixType' ;

//FIX_REGION: 'fixRegion' ;

//FIX_IDENT: 'fixIdent' ;

//ALTITUDE: 'altitude' ;

MISSED_ALTITUDE: 'missedAltitude' ;

//APPROACH_LEGS_OPEN: '<ApproachLegs>' ;

//APPROACH_LEGS_CLOSE: '</ApproachLegs>' ;

//LEG_OPEN: '<Leg' ;

//RECOMMENDED_TYPE: 'recommendedType' ;

//RECOMMENDED_REGION: 'recomendedRegion' ;

//RECOMMENDED_IDENT: 'recomendedIdent' ;

//THETA: 'theta' ;

//RHO: 'rho' ;

//ALTITUDE_DESCRIPTOR: 'altitudeDescriptor' ;

//ALTITUDE1: 'altitude1' ;

//FLY_OVER: 'flyOver' ;

MAGNETIC_COURSE: 'magneticCourse' ;

DISTANCE: 'distance' ;

TIME: 'time' ;

//ROACH_LEGS_OPEN: '<MissedApproachLegs>' ;

//MISSED_APPROACH_LEGS_CLOSE: '</MissedApproachLegs>' ;

//TRANSITION_OPEN: '<Transition' ;

//TRANSITION_TYPE: 'transitionType' ;

//TRANSITION_LEGS_OPEN: '<TransitionLegs>' ;

//TRANSITION_LEGS_CLOSE: '</TransitionLegs>' ;

PREVIOUS_OPEN: '<Previous' ;

ALTITUDE_MINIMUM: 'altitudeMinimum' ;

NEXT_OPEN: '<Next' ;

SCALAR: 'scalar' ;

TRIGGER_HEIGHT: 'triggerHeight' ;



/*
xmsVersion  : '<?xml version="1.0" encoding="ISO-8859-1"?>' fsdata EOF;
/*<FSData
   Version
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xsi:noNamespaceSchemaLocation="bglcomp.xsd">'
   Airports
   '</FSData>'       // match keyword hello followed by an identifier
*/


  /* Version
   Xmls
   'xsi:noNamespaceSchemaLocation="bglcomp.xsd">'
   unFiltered
   '</FSData>'
   ;

unFiltered: SceneryObject | Airports | Marker | unFiltered + unFiltered ;

*/
/*

Marker: [0-9];


SceneryObject: '<SceneryObject' [.*] '</SceneryObject>' -> skip;

Version: 'version=' [\"9.0\"] ;

Xmls:  'xmlns:xsi='[\"]'http://www.w3.org/2001/XMLSchema-instance'[\"] ;

Algarism : [0-9] ;     //match algarisms

Airports : [a-z]+ ;
*/
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines







////////////////////////////***********************************REGULAR EXPRESSIONS *************************/////////////////////////////////////////////////////////////////////////////

TRAFFICSCALLAR: INT('F'|'M'|'N');


ALTITUDE_VALUES: FLOAT( 'M' | 'F')?;


TAXIWAYPOINT_ORIENTATION_VALUES: 'FORWARD' | 'REVERSE';

TAXIWAYPOINT_TYPE: 'NORMAL' | 'HOLD_SHORT' |  'ILS_HOLD_SHORT' |  'HOLD_SHORT_NO_DRAW' | 'ILS_HOLD_SHORT_NO_DRAW';



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
'GATE_'('A'..'Z') |
'NONE' |
'N_PARKING' |
'NE_PARKING' |
'NW_PARKING' |
'SE_PARKING' |
'S_PARKING' |
'SW_PARKING' |
'W_PARKING' |
'E_PARKING';



TAXIWAY_PARKING_PUSHBACK: 'NONE'|
'BOTH' |
'LEFT' |
'RIGHT';





TAXI_NAME_SIZE: 'SIZE1' | 'SIZE2' | 'SIZE3' | 'SIZE4' | 'SIZE5';

LEFT_RIGHT: 'LEFT' | 'RIGHT';


TAXIWAY_PATH_TYPE: 'RUNWAY' |
'PARKING' |
'TAXI' |
'PATH' |
'CLOSED' |
'VEHICLE';

TAXIWAY_PATH_SURFACE: 'ASPHALT' |
'BITUMINOUS' |
'BRICK' |
'CLAY' |
'CEMENT' |
'CONCRETE' |
'CORAL' |
'DIRT' |
'GRASS' |
'GRAVEL' |
'ICE' |
'MACADAM' |
'OIL_TREATED' |
'PLANKS' |
'SAND' |
'SHALE' |
'SNOW' |
'STEEL_MATS' |
'TARMAC' |
'UNKNOWN' |
'WATER';

BOOLEAN: 'TRUE' | 'FALSE';

TAXIWAY_PATH_EDGE: 'NONE' |
'SOLID' |
'DASHED' |
'SOLID_DASHED';









TAXIWAY_PATH_NUMBER_NOT_RUNWAY: 'EAST'|
'NORTH' |
'NORTHEAST' |
'NORTHWEST' |
'SOUTH' |
'SOUTHEAST' |
'SOUTHWEST' |
'WEST';

TAXIWAY_PATH_NUMBER_DESIGNATOR: 'NONE' |
'C' |
'CENTER' |
'L' |
'LEFT' |
'R' |
'RIGHT' |
'W' |
'WATER' |
'A' |
'B';

///////////////////TOWER/////////////

METERS_OR_FEET: 'M' | 'F';


/////////////RUNWAY/////////////////

RUNWAY_SURFACE: 'ASPHALT' |
'BITUMINOUS' |
'BRICK' |
'CLAY' |
'CEMENT' |
'CONCRETE' |
'CORAL' |
'DIRT' |
'GRASS' |
'GRAVEL' |
'ICE' |
'MACADAM' |
'OIL_TREATED' |
'PLANKS' |
'SAND' |
'SHALE' |
'SNOW' |
'STEEL_MATS' |
'TARMAC' |
'UNKNOWN' |
'WATER';


RUNWAY_NUMBER: TAXIWAY_PATH_NUMBER_RUNWAY | TAXIWAY_PATH_NUMBER_NOT_RUNWAY;

///////////////////////MARKINGS /////////////////////


////////////////////LIGHTS////////////
LIGHTS_VALUES: 'NONE' |
'LOW' |
'MEDIUM' |
'HIGH';


///////////////OFFSET THREASHHOLD AND BLAST PAD AND OVERRUN///////////////


PRIMARY_OR_SECONDARY_END: 'PRIMARY' |
'SECONDARY';


OFFSET_THREASHHOLD_SURFACE: 'ASPHALT' |
'BITUMINOUS' |
'BRICK' |
'CLAY' |
'CEMENT' |
'CONCRETE' |
'CORAL' |
'DIRT' |
'GRASS' |
'GRAVEL' |
'ICE' |
'MACADAM' |
'OIL_TREATED' |
'PLANKS' |
'SAND' |
'SHALE' |
'SNOW' |
'STEEL_MATS' |
'TARMAC' |
'UNKNOWN' |
'WATER';


//////////////APPROACHLIGHTS////////

APPROACH_LIGHTS_SYSTEM: 'NONE' |
'ALSF1' |
'ALSF2' |
'CALVERT' |
'CALVERT2' |
'MALS' |
'MALSF' |
'MALSR' |
'ODALS' |
'RAIL' |
'SALS' |
'SALSF' |
'SSALF' |
'SSALR' |
'SSALS';

////////////VASI//////////

VASI_TYPE: 'PAPI2' |
'PAPI4' |
'PVASI' |
'TRICOLOR' |
'TVASI' |
'VASI21' |
'VASI22' |
'VASI23' |
'VASI31' |
'VASI32' |
'VASI33' |
'BALL' |
'APAP' |
'PANELS';





VASI_SPACING: UNSIGNED_INT DECIMAL_PART;

//////////////////////////////ILS///////////////////////

NAUTICAL_OR_METER: 'N' | 'M';

ILS_RANGE: UNSIGNED_INT NAUTICAL_OR_METER?;






//////////////////RUNWAY START////////////////
RUNWAY_START_TYPE: 'RUNWAY';




//////////////////////////////////////////////////////////////
//////////////////FATIA///////////////////////////////////////
//////////////////////////////////////////////////////////////

///////////////MARKER/////////////////





IDENT_VALUE: STRING0_TO5;


///////////////Waypoint/////////////////

WAYPOINT_TYPE_VALUES:  'NAMED' |
'UNNAMED' |
'VOR' |
'NDB' |
'OFF_ROUTE' |
'IAF' |
'FAF' ;




/////////////////////HELIPAD/////////////


HELIPAD_TYPE: 'NONE' |
'CIRCLE' |
'H' |
'MEDICAL' |
'SQUARE';



///////////////GEOPOL/////////////////


GEOPOL_TYPE:    'COASTLINE' |
'BOUNDARY' |
'DASHED_BOUNDARY' ;


///////////////SCENERY OBJECT/////////



SCENERY_OBJECT_IMAGE_COMPLEXITY: 'VERY_SPARSE' |
'SPARSE' |
'NORMAL' |
'DENSE' |
'VERY_DENSE';


//////////////////////////FUEL////////////////////

FUEL_TYPE: '73' |
'87' |
'100' |
'130' |
'145' |
'MOGAS' |
'JET' |
'JETA' |
'JETA1' |
'JETAP' |
'JETB' |
'JET4' |
'JET5' |
'UNKNOWN';

FUEL_AVAILABILITY: 'YES' |
'NO' |
'UNKNOWN' |
'PRIOR_REQUEST';


/////////////////////////////////FUEL TRIGGER /////////////////

TRIGGER__TYPE: 'REFUEL_REPAIR' |
'WEATHER';

///////////////////TRIGGER WEATHER DATA////////////

TRIGGER_WEATHER_DATA_TYPE: 'THERMAL' |
'NONDIRECTIONAL_TURBULENCE' |
'DIRECTIONAL_TURBULENCE' |
'RIDGE_LIFT';


APPROACH_TYPE : 'GPS' |
                'ILS' |
                'LDA'|
                'LOCALIZER'|
                'LOCALIZER_BACKCOURSE'|
                'NDB'|
                'NDBDME'|
                'RNAV'|
                'SDF'|
                'VOR'|
                'VORDME';

YES_NO: 'YES' | 'NO';

DIGIT: ('0'..'A');

PERCENTAGE: ( '1'.'0' | '0'.'0'('1'..'9') | '0'.('1'..'9')('0'..'9')?);

PERCENTAGE_0: PERCENTAGE | '0.0';


LATTITUDE_VALUES:  (  ('-' | '+')?   (('0'..'8')?('0'..'9')   |  '90')'.'('0'..'9')*  )
| (    ('-' | '+')?   (('0'..'8')?('0'..'9')   |  '90') '-'  ('-' | '+')?('0'..'9')+ '-'  ('-' | '+')? ('0'..'9')+ );


LONGITTUDE_VALUES:  (  ('-' | '+')?   (   ('1'('0'..'7')('0'..'9'))  |  (('0'..'9')?('0'..'9'))   |  '180')'.'('0'..'9')*  )
| (   ('-' | '+')?   (   ('1'('0'..'7')('0'..'9'))  |  (('0'..'9')?('0'..'9'))   |  '180') '-'  ('-' | '+')?('0'..'9')+ '-'  ('-' | '+')? ('0'..'9')+ );

HEADING_VALUES: (   ('3'('0'..'5')('0'..'9')) |  (('0'..'2')?('0'..'9')?('0'..'9'))   |  '360') DECIMAL_PART?;


MAGVAR_VALUES: ('-' | '+')? (   ('3'('0'..'5')('0'..'9'))  |  (('0'..'2')?('0'..'9')?('0'..'9'))   |  '360');

TAXIWAY_PARKING_TEEOFFSET: (('0'..'4')?('0'..'9')'.'('0'..'9') | '50.0');

TAXIWAY_PATH_NUMBER_RUNWAY: ( '0'('0'..'9') | (  (('0'..'2')?('0'..'9')) | '3'('0'..'6')) );

VASI_PITCH: (('0'..'9')|'10') DECIMAL_PART;

WAYPOINT_IDENT_VALUES: ('A'..'Z') ('A'..'Z') ('A'..'Z') ('A'..'Z') ('A'..'Z') ;

REGION: ('A'..'Z')|('0'..'9') ('A'..'Z')|('0'..'9') ;

ILS_IDENT: (('a'..'z') | ('A'..'Z') | ('0'..'9'))STRING0_TO4;

SCENERY_OBJECT_ID: '{'DIGIT+ '-'DIGIT+ '-' DIGIT+ '-' DIGIT+ '-' DIGIT+ '}';

DECIMAL_PART: '.'('0'..'9')+;

INTEGER_0_TO_255: (  ( ('0'..'1')?('0'..'9')?('0'..'9'))
 | ('2'(('0'..'4')('0'..'9'))
  | ( '5'('0'..'5'))));

INTEGER_0_TO_3999: ('0'..'3')?('0'..'9')('0'..'9')?('0'..'9');

UNSIGNED_INT: ('0'..'9')+;

INT: ('-' | '+')?('0'..'9')+;

FLOAT: ('-' | '+')?('0'..'9')+'.'('0'..'9')+;


STRING48: STRING4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4; //12*4 = 48

STRING0_TO_8: STRING0_TO4 STRING0_TO4;

STRING0_TO5: (('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?;

STRING0_TO4: (('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?;

STRING4: (('a'..'z') | ('A'..'Z') | ('0'..'9'))  (('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?;

ALL_STRING: .*;


////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

region: REGION EQUALS STRING48;
city: CITY EQUALS STRING48;
country: COUNTRY EQUALS STRING48;
state: STATE EQUALS STRING48;
name: NAME EQUALS STRING48;
magvar: MAGVAR EQUALS MAGVAR_VALUES;
ident: IDENT EQUALS STRING4;
index: INDEX EQUALS INTEGER_0_TO_3999;
biasX: BIAS_X EQUALS FLOAT;
biasY: BIAS_Y EQUALS FLOAT;
biasZ: BIAS_Z EQUALS FLOAT;
heading: HEADING EQUALS HEADING_VALUES;
lattitude: LAT EQUALS LATTITUDE_VALUES;
longitude: LON EQUALS LONGITTUDE_VALUES;
altitude: ALT EQUALS ALTITUDE_VALUES;
airportTestRadius: AIRPORT_TEST_RADIUS EQUALS TRAFFICSCALLAR;
taxiwaypointType: TYPE EQUALS TAXIWAYPOINT_TYPE;
orientation:ORIENTATION EQUALS TAXIWAYPOINT_ORIENTATION_VALUES;
radius:RADIUS EQUALS FLOAT;
taxiwayparkingType:TYPE EQUALS TAXIWAY_PARKING_TYPE;
taxiwayparkingName:NAME EQUALS TAXIWAY_PARKING_NAME;
taxiwayparkingNumber:NUMBER EQUALS INTEGER_0_TO_3999;
airlineCodes: AIRLINE_CODES EQUALS ALL_STRING;
teeOffSet1:TEE_OFFSET_1 EQUALS TAXIWAY_PARKING_TEEOFFSET;
teeOffSet2:TEE_OFFSET_2 EQUALS TAXIWAY_PARKING_TEEOFFSET;
teeOffSet3:TEE_OFFSET_3 EQUALS TAXIWAY_PARKING_TEEOFFSET;
teeOffSet4:TEE_OFFSET_4 EQUALS TAXIWAY_PARKING_TEEOFFSET;
taxiwayPathType:TYPE EQUALS TAXIWAY_PATH_TYPE;
taxiwayPathStart:START EQUALS INTEGER_0_TO_255;
taxiwayPathEnd:END EQUALS INTEGER_0_TO_255;
width:WIDTH EQUALS FLOAT;
weightLimit:WEIGHT_LIMIT EQUALS INTEGER_0_TO_255;
surface:SURFACE EQUALS TAXIWAY_PATH_SURFACE;
drawSurface:DRAW_SURFACE EQUALS BOOLEAN;
drawDetail:DRAW_SURFACE EQUALS BOOLEAN;
centerLine:CENTER_LINE EQUALS BOOLEAN;
centerLineLighted:CENTER_LINE_LIGHTED EQUALS BOOLEAN;
leftEdge:LEFT_EDGE EQUALS BOOLEAN;
leftEdgeLighted:LEFT_EDGE_LIGHTED EQUALS TAXIWAY_PATH_EDGE;
rightEdge:RIGHT_EDGE EQUALS BOOLEAN;
rightEdgeLighted:RIGHT_EDGE_LIGHTED EQUALS TAXIWAY_PATH_EDGE;
taxiwayPathNumber:NUMBER EQUALS (TAXIWAY_PATH_NUMBER_RUNWAY | TAXIWAY_PATH_NUMBER_NOT_RUNWAY);
designator:DESIGNATOR EQUALS TAXIWAY_PATH_NUMBER_DESIGNATOR;
taxiwayPathName:NAME EQUALS INTEGER_0_TO_255;
taxiwayNameString:NAME EQUALS STRING0_TO_8;
taxiwayIndex:INDEX EQUALS INTEGER_0_TO_255;
fuelType:TYPE EQUALS FUEL_TYPE;
availability:AVAILABILITY EQUALS FUEL_AVAILABILITY;
trafficScallar: TRAFFICSCALAR EQUALS PERCENTAGE;
frequency: FREQUENCY EQUALS FLOAT;
end: END EQUALS PRIMARY_OR_SECONDARY_END;
ident_ils: IDENT EQUALS STRING0_TO5;
pitch: PITCH EQUALS HEADING_VALUES;
range: RANGE EQUALS TRAFFICSCALLAR;
image_complexety: IMAGE_COMPLEXITY EQUALS SCENERY_OBJECT_IMAGE_COMPLEXITY;


//
length: LENGTH EQUALS FLOAT METERS_OR_FEET;
number: NUMBER EQUALS (TAXIWAY_PATH_NUMBER_RUNWAY | TAXIWAY_PATH_NUMBER_NOT_RUNWAY);
primaryDesignator: PRIMARY_DESIGNATOR EQUALS TAXIWAY_PATH_NUMBER_DESIGNATOR ;
secondaryDesignator: SECONDARY_DESIGNATOR EQUALS TAXIWAY_PATH_NUMBER_DESIGNATOR ;
patternAltitude : PATTERN_ALTITUDE EQUALS FLOAT METERS_OR_FEET;
primaryTakeoff : PRIMARY_TAKE_OFF EQUALS (BOOLEAN | YES_NO);
primaryLanding  : PRIMARY_LANDING EQUALS BOOLEAN;
primaryPattern : PRIMARY_PATTERN EQUALS LEFT_RIGHT;
secondaryTakeoff : SECONDARY_TAKE_OFF EQUALS BOOLEAN;
secondaryLanding : SECONDARY_LANDING EQUALS BOOLEAN;
secondaryPattern : SECONDARY_PATTERN EQUALS LEFT_RIGHT;
primaryMarkingBias : PRIMARY_MARKING_BIAS EQUALS TRAFFICSCALLAR;
secondaryMarkingBias : SECONDARY_MARKING_BIAS EQUALS TRAFFICSCALLAR;

//Markings
alternateThreshold : ALTERNATE_THRESHOLD EQUALS BOOLEAN;
alternateTouchdown : ALTERNATE_TOUCHDOWN EQUALS BOOLEAN;
alternateFixedDistance : ALTERNATE_FIXED_DISTANCE EQUALS BOOLEAN;
alternatePrecision : ALTERNATE_PRECISION EQUALS BOOLEAN;
leadingZeroIdent : LEADING_ZERO_IDENT EQUALS BOOLEAN;
noThresholdEndArrows : NO_THRESHOLD_END_ARROWS EQUALS BOOLEAN;
edges : EDGES EQUALS BOOLEAN;
threshold : THRESHOLD EQUALS BOOLEAN;
fixed : FIXED_DISTANCE EQUALS BOOLEAN;
touchdown : TOUCHDOWN EQUALS BOOLEAN;
dashes : DASHES EQUALS BOOLEAN;
ident_Marking : IDENT EQUALS BOOLEAN ;
precision : PRECISION EQUALS BOOLEAN;
edgePavement : EDGE_PAVEMENT EQUALS BOOLEAN;
singleEnd : SINGLE_END EQUALS BOOLEAN;
primaryClosed : PRIMARY_CLOSED EQUALS BOOLEAN;
secondaryClosed : SECONDARY_CLOSED EQUALS BOOLEAN;
primaryStol : PRIMARY_STOL EQUALS BOOLEAN;
secondaryStol : SECONDARY_STOL EQUALS BOOLEAN;
backCourse: BACK_COURSE EQUALS BOOLEAN;

//Lights
center: CENTER EQUALS LIGHTS_VALUES;
edge: EDGE EQUALS LIGHTS_VALUES;
centerRed: CENTER_RED EQUALS BOOLEAN;

// ApproachLights
system: SYSTEM EQUALS APPROACH_LIGHTS_SYSTEM;
strobes: STROBES EQUALS UNSIGNED_INT;
reil: REIL EQUALS BOOLEAN;
endLights: END_LIGHTS EQUALS BOOLEAN;

//VASI
vasiType:TYPE EQUALS VASI_TYPE;
side: SIDE EQUALS LEFT_RIGHT;
spacing: SPACING EQUALS FLOAT METERS_OR_FEET?;

//RUNWAYSTART
runway_type: TYPE EQUALS RUNWAY_START_TYPE;
start_type: TYPE EQUALS RUNWAY_START_TYPE;


//HELIPAD
helipad_type: TYPE EQUALS HELIPAD_TYPE;
closed: CLOSED EQUALS BOOLEAN;
transparent: TRANSPARENT EQUALS BOOLEAN;
red: RED EQUALS INTEGER_0_TO_255;
green: GREEN EQUALS INTEGER_0_TO_255;
blue: BLUE EQUALS INTEGER_0_TO_255;


//APPROACH
approach_runway: RUNWAY EQUALS (TAXIWAY_PATH_NUMBER_RUNWAY | TAXIWAY_PATH_NUMBER_NOT_RUNWAY);
approach_type: TYPE EQUALS APPROACH_TYPE;


////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////                                                        ////
////                                                        ////
////                       SINTAX                           ////
////                                                        ////
////                                                        ////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

airport: AIRPORT_OPEN region? country? state? city? name? lattitude longitude altitude magvar? ident airportTestRadius trafficScallar TAG_CLOSE
            taxiwayPoint+
            taxiwayParking+
            taxiwayName+
            taxiwayPath+
            tower*
            services*
            runway*
            runway_alias*
            helipad*
            runway_start*
          AIRPORT_CLOSE;  //EXPRESSOES: falta airportTestRadius e  TRAFFICSCALAR


 vertex: VERTEX_OPEN (biasX biasZ |longitude lattitude) SIMPLE_TAG_CLOSE;

 triggerWeatherData: TRIGGER_WEATHER_DATA_OPEN TYPE EQUALS TRIGGER_WEATHER_DATA_TYPE heading SCALAR EQUALS PERCENTAGE_0 SIMPLE_TAG_CLOSE;

 trigger: TRIGGER_OPEN TYPE EQUALS TRIGGER__TYPE TRIGGER_HEIGHT EQUALS UNSIGNED_INT DECIMAL_PART TAG_CLOSE fuel* vertex* triggerWeatherData* TRIGGER_CLOSE;

 services: SERVICES_OPEN TAG_CLOSE fuel* SERVICES_CLOSE;

 helipad: HELIPAD_OPEN lattitude longitude altitude surface heading length? width helipad_type closed? transparent? red? green? blue? SIMPLE_TAG_CLOSE;

 glide_slope: GLIDE_SLOPE_OPEN lattitude longitude altitude pitch range SIMPLE_TAG_CLOSE;

 visual_model: VISUAL_MODEL_OPEN heading image_complexety NAME EQUALS SCENERY_OBJECT_ID TAG_CLOSE biasX biasY biasZ VISUAL_MODEL_CLOSE;

 dme: DME_OPEN lattitude longitude altitude range SIMPLE_TAG_CLOSE;

taxiwayPoint:TAXIWAY_POINT_OPEN index taxiwaypointType orientation? lattitude longitude biasX biasZ SIMPLE_TAG_CLOSE;

taxiwayParking: TAXIWAY_PARKING_OPEN index lattitude longitude biasX biasZ heading radius taxiwayparkingType taxiwayparkingName taxiwayparkingNumber airlineCodes teeOffSet1? teeOffSet2? teeOffSet3? teeOffSet4? SIMPLE_TAG_CLOSE;

taxiwayPath: TAXIWAY_PATH_OPEN taxiwayPathType taxiwayPathStart taxiwayPathEnd width weightLimit surface drawSurface drawDetail centerLine centerLineLighted leftEdge leftEdgeLighted rightEdge rightEdgeLighted taxiwayPathNumber designator taxiwayPathName TAXIWAY_PATH_NUMBER_RUNWAY;

taxiwayName:TAXI_NAME_OPEN taxiwayIndex taxiwayName SIMPLE_TAG_CLOSE;

tower:TOWER_OPEN lattitude longitude altitude SIMPLE_TAG_CLOSE;

fuel:FUEL_OPEN fuelType availability SIMPLE_TAG_CLOSE;

markings: MARKINGS_OPEN alternateThreshold alternateTouchdown alternateFixedDistance alternatePrecision leadingZeroIdent noThresholdEndArrows edges threshold fixed touchdown dashes ident_Marking precision edgePavement singleEnd primaryClosed secondaryClosed primaryStol secondaryStol SIMPLE_TAG_CLOSE;

lights: LIGHTS_OPEN center edge centerRed SIMPLE_TAG_CLOSE;

offsetThreshold: OFFSET_THRESHOLD end length width? surface? SIMPLE_TAG_CLOSE;

blastPad: BLAST_PAD end length width? surface? SIMPLE_TAG_CLOSE;

overrun: OVERRUN end length width? surface? SIMPLE_TAG_CLOSE;

approachLights: APPROACH_LIGHTS_OPEN end system? strobes? reil? touchdown? endLights? SIMPLE_TAG_CLOSE;

vasi: VASI_OPEN end vasiType side biasX biasZ spacing pitch TAG_CLOSE;

ils: ILS_OPEN lattitude longitude altitude heading frequency range? ident_ils width? name? backCourse? TAG_CLOSE glide_slope* dme* visual_model* ILS_CLOSE;

runway: RUNWAY_OPEN lattitude longitude altitude surface heading length width designator? primaryDesignator secondaryDesignator patternAltitude? primaryLanding? primaryPattern? secondaryTakeoff? secondaryTakeoff? secondaryLanding? secondaryPattern? primaryMarkingBias secondaryMarkingBias TAG_CLOSE markings? lights? offsetThreshold? blastPad? RUNWAY_CLOSE;

runway_start: RUNWAY_START_OPEN runway_type? lattitude longitude altitude heading number? designator? SIMPLE_TAG_CLOSE;

runway_alias: RUNWAY_ALIAS_OPEN number designator SIMPLE_TAG_CLOSE;

fsdata: '<FSData' (ALL_STRING | airport)* '</FSData>';