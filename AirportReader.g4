lexer grammar AirportReader;


//airports: data + EOF;
/*
data: AIRPORT_OPEN + airporAttributeAnaliser + children + AIRPORT_CLOSE;

airporAttributeAnaliser: ;

children: ;
*/


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

SERVICES_OPEN: '<Services>' ;

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


//linha 473


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
