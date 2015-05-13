grammar Airport_Parser;

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

EQUALS: '=' ;

SIMPLE_TAG_CLOSE: '/>' ;

TAG_CLOSE: '>' ;

YES_NO: 'YES' | 'NO';

AIRPORT_OPEN:  '<Airport' {ignoreWord=false;} ;

AIRPORT_CLOSE: '</Airport>' {ignoreWord=true;} ;

REGION: 'region' ;

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

ALTITUDE_IS_AGL: 'altitudeIsAgl' ;

BANK: 'bank' ;

IMAGE_COMPLEXITY: 'imageComplexity' ;

LIBRARY_OBJECT_OPEN: '<LibraryObject' ;

SCALE: 'scale' ;

VERTEX_OPEN: '<Vertex' ;

LABEL: 'label' ;

STATE: 'state' ;

SIZE: 'size' ;

JUSTIFICATION: 'justification' ;

PROFILE: 'profile' ;

RUNWAY: 'runway' ;

SUFFIX: 'suffix' ;

GPS_OVERLAY: 'gpsOverlay' ;

MISSED_ALTITUDE: 'missedAltitude' ;

MAGNETIC_COURSE: 'magneticCourse' ;

DISTANCE: 'distance' ;

TIME: 'time' ;

ALTITUDE_MINIMUM: 'altitudeMinimum' ;

SCALAR: 'scalar' ;

TRIGGER_HEIGHT: 'triggerHeight' ;


////////////////////////////***********************************REGULAR EXPRESSIONS *************************/////////////////////////////////////////////////////////////////////////////

TAXIWAYPOINT_ORIENTATION_VALUES: 'FORWARD' | 'REVERSE';

TAXIWAYPOINT_TYPE: 'NORMAL' | 'HOLD_SHORT' |  'ILS_HOLD_SHORT' |  'HOLD_SHORT_NO_DRAW' | 'ILS_HOLD_SHORT_NO_DRAW';



TAXIWAY_PARKING_TYPE: 'NONE' |                      
                      'DOCK_GA' |
                      'FUEL' |                      
                      'GATE_HEAVY' |
                      'GATE_MEDIUM' |                      
                      'GATE_SMALL' |
                      'RAMP_CARGO' |                      
                      'RAMP_GA' |
                      'RAMP_GA_LARGE' |                      
                      'RAMP_GA_MEDIUM' |
                      'RAMP_GA_SMALL' |                      
                      'RAMP_MIL_CARGO' |
                      'RAMP_MIL_COMBAT' |                      
                      'VEHICLE';


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


TAXIWAY_PATH_TYPE:  'RUNWAY' |
                    'PARKING' |
                    'TAXI' |
                    'PATH' |
                    'CLOSED' |
                    'VEHICLE';

BOOLEAN: 'TRUE' | 'FALSE';

TAXIWAY_PATH_EDGE:  'NONE' |
                    'SOLID' |
                    'DASHED' |
                    'SOLID_DASHED';


DIRECTION:  'EAST'|
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

/////////////RUNWAY/////////////////

SURFACE_VALUES:  'ASPHALT' |
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


RUNWAY_NUMBER: FLOAT | DIRECTION;


////////////////////LIGHTS////////////
LIGHTS_VALUES:  'NONE' |
                'LOW' |
                'MEDIUM' |
                'HIGH';


///////////////OFFSET THREASHHOLD AND BLAST PAD AND OVERRUN///////////////


PRIMARY_OR_SECONDARY_END: 'PRIMARY' |
'SECONDARY';


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

VASI_TYPE:  'PAPI2' |
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


/////////////////////HELIPAD/////////////


HELIPAD_TYPE: 'NONE' |
'CIRCLE' |
'H' |
'MEDICAL' |
'SQUARE';

///////////////GEOPOL/////////////////


SCENERY_OBJECT_IMAGE_COMPLEXITY: 'VERY_SPARSE' |
                                 'SPARSE' |
                                 'NORMAL' |
                                 'DENSE' |
                                 'VERY_DENSE';

GEOPOL_TYPE:    'COASTLINE' |
'BOUNDARY' |
'DASHED_BOUNDARY' ;

FUEL_AVAILABILITY:  YES_NO | 'UNKNOWN' | 'PRIOR_REQUEST';


FLOAT: ('-' | '+')?  ('0'..'9')+ ('.' ('0'..'9')+)? ;

FUEL_TYPE: FLOAT |
           'MOGAS'|
           'JET'|
           'JETA'|
           'JETA1'|
           'JETAP'|
           'JETB'|
           'JET4'|
           'JET5'|
           'UNKNOWN';

ALTITUDE_VALUES: FLOAT MESURE?;

MESURE: ('M' | 'F' | 'N');

STRING: (('a'..'z') | ('A'..'Z') | ('0'..'9')) (('a'..'z') | ('A'..'Z') | ('0'..'9') | ' ' )*;

ALL_STRING: ( STRING | '-' | '{' | '}' | ',' )+ ;



////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

region: REGION EQUALS STRING;
city: CITY EQUALS STRING;
country: COUNTRY EQUALS STRING;
state: STATE EQUALS STRING;
name: NAME EQUALS STRING;
instanceId: INSTANCE_ID EQUALS ALL_STRING;
magvar: MAGVAR EQUALS FLOAT;
ident: IDENT EQUALS STRING;
index: INDEX EQUALS FLOAT;
biasX: BIAS_X EQUALS FLOAT;
biasY: BIAS_Y EQUALS FLOAT;
biasZ: BIAS_Z EQUALS FLOAT;
heading: HEADING EQUALS FLOAT;
lattitude: LAT EQUALS ALL_STRING;
longitude: LON EQUALS FLOAT;
altitude: ALT EQUALS ALTITUDE_VALUES;
airportTestRadius: AIRPORT_TEST_RADIUS EQUALS FLOAT MESURE;
taxiwaypointType: TYPE EQUALS TAXIWAYPOINT_TYPE;
orientation:ORIENTATION EQUALS TAXIWAYPOINT_ORIENTATION_VALUES;
radius:RADIUS EQUALS FLOAT;
taxiwayparkingType:TYPE EQUALS TAXIWAY_PARKING_TYPE;
taxiwayparkingName:NAME EQUALS TAXIWAY_PARKING_NAME;
taxiwayparkingNumber:NUMBER EQUALS FLOAT;
airlineCodes: AIRLINE_CODES EQUALS ALL_STRING;
teeOffSet1:TEE_OFFSET_1 EQUALS FLOAT;
teeOffSet2:TEE_OFFSET_2 EQUALS FLOAT;
teeOffSet3:TEE_OFFSET_3 EQUALS FLOAT;
teeOffSet4:TEE_OFFSET_4 EQUALS FLOAT;
taxiwayPathType:TYPE EQUALS TAXIWAY_PATH_TYPE;
taxiwayPathStart:START EQUALS FLOAT;
taxiwayPathEnd:END EQUALS FLOAT;
width:WIDTH EQUALS ALTITUDE_VALUES;
weightLimit:WEIGHT_LIMIT EQUALS FLOAT;
surface:SURFACE EQUALS SURFACE_VALUES;
drawSurface:DRAW_SURFACE EQUALS BOOLEAN;
drawDetail:DRAW_SURFACE EQUALS BOOLEAN;
centerLine:CENTER_LINE EQUALS BOOLEAN;
centerLineLighted:CENTER_LINE_LIGHTED EQUALS BOOLEAN;
leftEdge:LEFT_EDGE EQUALS BOOLEAN;
leftEdgeLighted:LEFT_EDGE_LIGHTED EQUALS TAXIWAY_PATH_EDGE;
rightEdge:RIGHT_EDGE EQUALS BOOLEAN;
rightEdgeLighted:RIGHT_EDGE_LIGHTED EQUALS TAXIWAY_PATH_EDGE;
taxiwayPathNumber:NUMBER EQUALS (FLOAT | DIRECTION);
designator:DESIGNATOR EQUALS TAXIWAY_PATH_NUMBER_DESIGNATOR;
taxiwayPathName:NAME EQUALS FLOAT;
taxiwayNameString:NAME EQUALS STRING;
taxiwayIndex:INDEX EQUALS FLOAT;
availability:AVAILABILITY EQUALS FUEL_AVAILABILITY;
trafficScallar: TRAFFICSCALAR EQUALS FLOAT;
frequency: FREQUENCY EQUALS FLOAT;
end: END EQUALS PRIMARY_OR_SECONDARY_END;
ident_ils: IDENT EQUALS STRING;
pitch: PITCH EQUALS FLOAT;
range: RANGE EQUALS FLOAT MESURE;
image_complexety: IMAGE_COMPLEXITY EQUALS SCENERY_OBJECT_IMAGE_COMPLEXITY;
fuel_type: TYPE EQUALS FUEL_TYPE;

//
length: LENGTH EQUALS FLOAT MESURE;
number: NUMBER EQUALS (FLOAT | DIRECTION);
primaryDesignator: PRIMARY_DESIGNATOR EQUALS TAXIWAY_PATH_NUMBER_DESIGNATOR ;
secondaryDesignator: SECONDARY_DESIGNATOR EQUALS TAXIWAY_PATH_NUMBER_DESIGNATOR ;
patternAltitude : PATTERN_ALTITUDE EQUALS ALTITUDE_VALUES;
primaryTakeoff : PRIMARY_TAKE_OFF EQUALS (BOOLEAN | YES_NO);
primaryLanding  : PRIMARY_LANDING EQUALS BOOLEAN;
primaryPattern : PRIMARY_PATTERN EQUALS LEFT_RIGHT;
secondaryTakeoff : SECONDARY_TAKE_OFF EQUALS BOOLEAN;
secondaryLanding : SECONDARY_LANDING EQUALS BOOLEAN;
secondaryPattern : SECONDARY_PATTERN EQUALS LEFT_RIGHT;
primaryMarkingBias : PRIMARY_MARKING_BIAS EQUALS ALTITUDE_VALUES;
secondaryMarkingBias : SECONDARY_MARKING_BIAS EQUALS ALTITUDE_VALUES;

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
strobes: STROBES EQUALS FLOAT;
reil: REIL EQUALS BOOLEAN;
endLights: END_LIGHTS EQUALS BOOLEAN;

//VASI
vasiType:TYPE EQUALS VASI_TYPE;
side: SIDE EQUALS LEFT_RIGHT;
spacing: SPACING EQUALS FLOAT MESURE?;

//RUNWAYSTART
runway_type: TYPE EQUALS TAXIWAY_PATH_TYPE;

//HELIPAD
helipad_type: TYPE EQUALS HELIPAD_TYPE;
closed: CLOSED EQUALS BOOLEAN;
transparent: TRANSPARENT EQUALS BOOLEAN;
red: RED EQUALS FLOAT;
green: GREEN EQUALS FLOAT;
blue: BLUE EQUALS FLOAT;


//APPROACH
approach_runway: RUNWAY EQUALS (FLOAT | DIRECTION);

scalar: SCALAR EQUALS FLOAT;


////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////                                                        ////
////                                                        ////
////                       SINTAX                           ////
////                                                        ////
////                                                        ////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

 vertex: VERTEX_OPEN (biasX biasZ |longitude lattitude) SIMPLE_TAG_CLOSE;

 services: SERVICES_OPEN TAG_CLOSE fuel* SERVICES_CLOSE;

 helipad: HELIPAD_OPEN lattitude longitude altitude surface heading length? width helipad_type closed? transparent? red? green? blue? SIMPLE_TAG_CLOSE;

 glide_slope: GLIDE_SLOPE_OPEN lattitude longitude altitude pitch range SIMPLE_TAG_CLOSE;

 dme: DME_OPEN lattitude longitude altitude range SIMPLE_TAG_CLOSE;

taxiwayPoint:TAXIWAY_POINT_OPEN index taxiwaypointType orientation? lattitude longitude biasX biasZ SIMPLE_TAG_CLOSE;

taxiwayParking: TAXIWAY_PARKING_OPEN index lattitude longitude biasX biasZ heading radius taxiwayparkingType taxiwayparkingName taxiwayparkingNumber airlineCodes teeOffSet1? teeOffSet2? teeOffSet3? teeOffSet4? SIMPLE_TAG_CLOSE;

taxiwayPath: TAXIWAY_PATH_OPEN taxiwayPathType taxiwayPathStart taxiwayPathEnd width weightLimit surface drawSurface drawDetail centerLine centerLineLighted leftEdge leftEdgeLighted rightEdge rightEdgeLighted taxiwayPathNumber designator taxiwayPathName FLOAT;

taxiwayName:TAXI_NAME_OPEN taxiwayIndex taxiwayName SIMPLE_TAG_CLOSE;

tower:TOWER_OPEN lattitude longitude altitude SIMPLE_TAG_CLOSE;

markings: MARKINGS_OPEN alternateThreshold alternateTouchdown alternateFixedDistance alternatePrecision leadingZeroIdent noThresholdEndArrows edges threshold fixed touchdown dashes ident_Marking precision edgePavement singleEnd primaryClosed secondaryClosed primaryStol secondaryStol SIMPLE_TAG_CLOSE;

lights: LIGHTS_OPEN center edge centerRed SIMPLE_TAG_CLOSE;

offsetThreshold: OFFSET_THRESHOLD end length width? surface? SIMPLE_TAG_CLOSE;

blastPad: BLAST_PAD end length width? surface? SIMPLE_TAG_CLOSE;

overrun: OVERRUN end length width? surface? SIMPLE_TAG_CLOSE;

approachLights: APPROACH_LIGHTS_OPEN end system? strobes? reil? touchdown? endLights? SIMPLE_TAG_CLOSE;

vasi: VASI_OPEN end vasiType side biasX biasZ spacing pitch SIMPLE_TAG_CLOSE;

visual_model: VISUAL_MODEL_OPEN heading? image_complexety? name instanceId SIMPLE_TAG_CLOSE;

fuel: FUEL_OPEN fuel_type availability SIMPLE_TAG_CLOSE;

ils: ILS_OPEN lattitude longitude altitude heading frequency range? ident_ils width? name? backCourse? TAG_CLOSE glide_slope* dme* visual_model* ILS_CLOSE;

runway: RUNWAY_OPEN lattitude longitude altitude surface heading length width number (designator | primaryDesignator  secondaryDesignator)?
			  patternAltitude?
			  primaryTakeoff?  
			  primaryLanding? 
			  primaryPattern? 
			  secondaryTakeoff? 
			  secondaryLanding? 
			  secondaryPattern? 
			  primaryMarkingBias? 
			  secondaryMarkingBias?		
	 TAG_CLOSE markings? lights? offsetThreshold? blastPad? vasi* RUNWAY_CLOSE;

runway_start: RUNWAY_START_OPEN runway_type? lattitude longitude altitude heading number? designator? SIMPLE_TAG_CLOSE;

runway_alias: RUNWAY_ALIAS_OPEN number designator SIMPLE_TAG_CLOSE;

airport: AIRPORT_OPEN region? country? state? city? name? lattitude longitude altitude magvar? (ident | airportTestRadius |trafficScallar)* TAG_CLOSE
         (   taxiwayPoint+ 
        |    taxiwayParking+
        |    taxiwayName+
        |    taxiwayPath+
        |    tower*
        |    services*
        |    runway*
        |    runway_alias*
        |    helipad*
        |   runway_start* )+
          AIRPORT_CLOSE;  //EXPRESSOES: falta airportTestRadius e  TRAFFICSCALAR

fsdata: '<FSData' (ALL_STRING | airport)* '</FSData>';