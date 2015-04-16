lexer grammar AirportReader;


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

PATTERN_ALTITUDE: 'patternAltitude' ;

PRIMARY_TAKE_OFF: 'primaryTakeoff' ;

PRIMARY_LANDING: 'primaryLanding' ;

PRIMARY_PATTERN: 'primaryPattern' ;

SECONDARY_TAKE_OFF: 'secondaryTakeoff' ;

SECONDARY_LANDING: 'secondaryLanding' ;

SECONDARY_PATTERN: 'secondaryPattern' ;

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

END: 'end' ;

VASI_OPEN: '<Vasi' ;

SIDE: 'side' ;

BIAS_X: 'biasX' ;

BIAS_Z: 'biasZ' ;

SPACING: 'spacing' ;

PITCH: 'pitch' ;

START_OPEN: '<Start' ;

COM_OPEN: '<Com' ;

FREQUENCY: 'frequency';

APPROACH_LIGHTS_OPEN: '<ApproachLights' ;

SYSTEM: 'system' ;

STROBES: 'strobes' ;

REIL: 'reil' ;

END_LIGHTS: 'endLights' ;

ILS_OPEN: '<Ils' ;

RANGE: 'range' ;

BACK_COURSE: 'backCourse' ;

GLIDE_SLOPE: '<GlideSlope' ;

DME_OPEN: '<Dme' ;

ILS_CLOSE: '</Ils>' ;

TAXIWAY_POINT_OPEN: '<TaxiwayPoint' ;

INDEX: 'index' ;

ORIENTATION: 'orientation' ;

TAXIWAY_PARKING_OPEN: '<TaxiwayParking' ;

RADIUS: 'radius' ;

TEE_OFFSET_1: 'teeOffset1' ;

PUSH_BACK: 'pushBack' ;

TAXI_NAME_OPEN: '<TaxiName' ;

TAXIWAY_PATH: '<TaxiwayPath' ;

START: 'start' ;

WEIGHT_LIMIT: 'weightLimit' ;

DRAW_SURFACE: 'drawSurface' ;

DRAW_DETAIL: 'drawDetail' ;

LEFT_EDGE: 'leftEdge' ;

RIGHT_EDGE: 'rightEdge' ;

CENTER_LINE: 'centerLine' ;

LEFT_EDGE_LIGHTED: 'leftEdgeLighted' ;

RIGHT_EDGE_LIGHTED: 'rightEdgeLighted' ;

JETWAY_OPEN: '<Jetway' ;

JETWAY_CLOSE: '</Jetway>' ;

GATE_NAME: 'gateName' ;

PARKING_NUMBER: 'parkingNumber' ;

SCENERY_OBJECT_OPEN: '<SceneryObject' ;

SCENERY_OBJECT_CLOSE: '</SceneryObject>' ;

ALTITUDE_IS_AGL: 'altitudeIsAgl' ;

BANK: 'bank' ;

IMAGE_COMPLEXITY: 'imageComplexity' ;

LIBRARY_OBJECT_OPEN: '<LibraryObject' ;

SCALE: 'scale' ;

APRONS_OPEN: '<Aprons>' ;

APRONS_CLOSE: '</Aprons>' ;

APRON_OPEN: '<Apron' ;

APRON_OPEN: '</Apron>' ;

VERTEX_OPEN: '<Vertex' ;

APRON_EDGE_LIGHTS_OPEN: '<ApronEdgeLights>' ;

EDGE_LIGHTS_OPEN: '<EdgeLights>' ;

EDGE_LIGHTS_CLOSE: '</EdgeLights>' ;

TAXIWAY_SIGN_OPEN: '<TaxiwaySign' ;

LABEL: 'label' ;

SIZE: 'size' ;

JUSTIFICATION: 'justification' ;

BOUNDARY_FENCE_OPEN: '<BoundaryFence' ;

PROFILE: 'profile' ;

BOUNDARY_FENCE_CLOSE: '</BoundaryFence>' ;

APPROACH_OPEN: '<Approach' ;

RUNWAY: 'runway' ;

SUFFIX: 'suffix' ;

GPS_OVERLAY: 'gpsOverlay' ;

FIX_TYPE: 'fixType' ;

FIX_REGION: 'fixRegion' ;

FIX_IDENT: 'fixIdent' ;

ALTITUDE: 'altitude' ;

MISSED_ALTITUDE: 'missedAltitude' ;

APPROACH_LEGS_OPEN: '<ApproachLegs>' ;

APPROACH_LEGS_CLOSE: '</ApproachLegs>' ;

LEG_OPEN: '<Leg' ;

RECOMMENDED_TYPE: 'recommendedType' ;

RECOMMENDED_REGION: 'recomendedRegion' ;

RECOMMENDED_IDENT: 'recomendedIdent' ;

THETA: 'theta' ;

RHO: 'rho' ;

ALTITUDE_DESCRIPTOR: 'altitudeDescriptor' ;

ALTITUDE1: 'altitude1' ;

FLY_OVER: 'flyOver' ;

MAGNETIC_COURSE: 'magneticCourse' ;

DISTANCE: 'distance' ;

TIME: 'time' ;

MISSED_APPROACH_LEGS_OPEN: '<MissedApproachLegs>' ;

MISSED_APPROACH_LEGS_CLOSE: '</MissedApproachLegs>' ;

TRANSITION_OPEN: '<Transition' ;

TRANSITION_TYPE: 'transitionType' ;

TRANSITION_LEGS_OPEN: '<TransitionLegs>' ;

TRANSITION_LEGS_CLOSE: '</TransitionLegs>' ;

WAYPOINT_OPEN: '<Waypoint' ;

WAYPOINT_TYPE: 'waypointType' ;

WAYPOINT_REGION: 'waypointRegion' ;

WAYPOINT_IDENT: 'waypointIdent';

WAYPOINT_CLOSE: '</Waypoint>' ;

LATTITUDE_VALUES:  (  ('-' | '+')?   (('0'..'8')?('0'..'9')   |  '90')'.'('0'..'9')*  )
| (    ('-' | '+')?   (('0'..'8')?('0'..'9')   |  '90') '-'  ('-' | '+')?('0'..'9')+ '-'  ('-' | '+')? ('0'..'9')+ );


LONGITTUDE_VALUES:  (  ('-' | '+')?   (   ('1'('0'..'7')('0'..'9'))  |  (('0'..'9')?('0'..'9'))   |  '180')'.'('0'..'9')*  )
| (   ('-' | '+')?   (   ('1'('0'..'7')('0'..'9'))  |  (('0'..'9')?('0'..'9'))   |  '180') '-'  ('-' | '+')?('0'..'9')+ '-'  ('-' | '+')? ('0'..'9')+ );

PERCENTAGE: ( '1'.'0' | '0'.'0'('1'..'9') | '0'.('1'..'9')('0'..'9')?);

FLOAT: ('-' | '+')?('0'..'9')+'.'('0'..'9')+;

INT: ('0'..'9')+;

ALTITUDE_VALUES: FLOAT( 'M' | 'F')?;

STRING4: (('a'..'z') | ('A'..'Z') | ('0'..'9'))  (('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?;

STRING0_TO4: (('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?(('a'..'z') | ('A'..'Z') | ('0'..'9'))?;

STRING48: STRING4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4 STRING0_TO4; //12*4 = 48

MAGVAR_VALUES: ('-' | '+')? (   ('3'('0'..'5')('0'..'9'))  |  (('0'..'2')?('0'..'9')?('0'..'9'))   |  '360');

TAXIWAYPOINT_ORIENTATION_VALUES: 'FORWARD' | 'REVERSE';

TAXIWAYPOINT_TYPE: 'NORMAL' | 'HOLD_SHORT' |  'ILS_HOLD_SHORT' |  'HOLD_SHORT_NO_DRAW' | 'ILS_HOLD_SHORT_NO_DRAW';

INTEGER_0_TO_3999: ('0'..'3')?('0'..'9')('0'..'9')?('0'..'9');



WS: [ \t\r\n]+ -> skip ;
//
//xmsVersion  : '<?xml version="1.0" encoding="ISO-8859-1"?>' fsdata EOF;
///*<FSData
//   Version
//   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//   xsi:noNamespaceSchemaLocation="bglcomp.xsd">'   
//   Airports   
//   '</FSData>'*/        // match keyword hello followed by an identifier
//
//
//fsdata : '<FSData'
//   Version
//   Xmls
//   'xsi:noNamespaceSchemaLocation="bglcomp.xsd">'
//   unFiltered
//   '</FSData>'
//   ;
//   
//unFiltered: SceneryObject | Airports | Marker | unFiltered + unFiltered ;    
//
//   
//
//   
//Marker: [0-9];
//
//
//SceneryObject: '<SceneryObject' [.*] '</SceneryObject>' -> skip;
//
//Version: 'version=' [\"9.0\"] ;
//
//Xmls:  'xmlns:xsi='[\"]'http://www.w3.org/2001/XMLSchema-instance'[\"] ;
//
//Algarism : [0-9] ;     //match algarisms
//
//Airports : [a-z]+ ;           
//
//WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
//
