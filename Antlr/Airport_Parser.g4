grammar Airport_Parser;



//Skydiving
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

APPROACH: ('<Approach' .*? '>' .*? '</Approach>')->skip;
APRONS: ('<Aprons>' .*? '</Aprons>')->skip;
JETWAY: ('<Jetway>' .*? '<Jetway>')->skip;
APRON_EDGE_LIGHTS: ('<ApronEdgeLights>' .*? '</ApronEdgeLights>')->skip;
START_NODE: ('<Start' .*? '/>')->skip;
COM: ('<Com' .*? '/>')->skip;
DELETE_AIRPORT: ('<DeleteAirport' .*? '>' .*? '</DeleteAirport>')->skip;
BLAST_FENCE: ('<BlastFence' .*? '>' .*? '</BlastFence>')->skip;
TAXIWAY_SIGN: ('<TaxiwaySign' .*? '/>')->skip;
BOUNDARY_FENCE: ('<BoundaryFence' .*? '>' .*? '</BoundaryFence>')->skip;
WAY_POINT: ('<Waypoint' .*? '>' .*? '</Waypoint>')->skip;
NDB: ('<Ndb' .*? '/>')->skip;
COMMENTS: ('<!--' .*? '-->')->skip;
XML_SPEC: ('<?xml' .*? '?>')->skip;
SCENERY_OBJECT: ('<SceneryObject' .*? '</SceneryObject>')->skip;
MARKER: ('<Marker' .*? '/>')->skip;
FSDATA_OPEN: ('<FSData' .*? '>')->skip;
FSDATA_CLOSE: ('</FSData>')->skip;


EQUALS: '=' ;

SIMPLE_TAG_CLOSE: '/>' ;

TAG_CLOSE: '>' ;

AIRPORT_OPEN:  '<Airport';

AIRPORT_CLOSE: '</Airport>';

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

START: 'start';

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


VALUE: '\"' (('a'..'z') | ('A'..'Z') | ('0'..'9') | '.' | '-' | '+' | '{' | '}' | ',' | ' ' | '/' | '_')* '\"';

////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////

region: REGION EQUALS VALUE;
city: CITY EQUALS VALUE;
country: COUNTRY EQUALS VALUE;
state: STATE EQUALS VALUE;
name: NAME EQUALS VALUE;
instanceId: INSTANCE_ID EQUALS VALUE;
magvar: MAGVAR EQUALS VALUE;
ident: IDENT EQUALS VALUE;
index: INDEX EQUALS VALUE;
biasX: BIAS_X EQUALS VALUE;
biasY: BIAS_Y EQUALS VALUE;
biasZ: BIAS_Z EQUALS VALUE;
heading: HEADING EQUALS VALUE;
lattitude: LAT EQUALS VALUE;
longitude: LON EQUALS VALUE;
altitude: ALT EQUALS VALUE;
airportTestRadius: AIRPORT_TEST_RADIUS EQUALS VALUE;
taxiwaypointType: TYPE EQUALS VALUE;
orientation:ORIENTATION EQUALS VALUE;
radius:RADIUS EQUALS VALUE;
taxiwayparkingType:TYPE EQUALS VALUE;
taxiwayparkingName:NAME EQUALS VALUE;
taxiwayparkingNumber:NUMBER EQUALS VALUE;
push_back: PUSH_BACK EQUALS VALUE;
airlineCodes: AIRLINE_CODES EQUALS VALUE;
teeOffSet1:TEE_OFFSET_1 EQUALS VALUE;
teeOffSet2:TEE_OFFSET_2 EQUALS VALUE;
teeOffSet3:TEE_OFFSET_3 EQUALS VALUE;
teeOffSet4:TEE_OFFSET_4 EQUALS VALUE;
taxiwayPathType:TYPE EQUALS VALUE;
taxiwayPathStart:START EQUALS VALUE;
taxiwayPathEnd:END EQUALS VALUE;
width:WIDTH EQUALS VALUE;
weightLimit:WEIGHT_LIMIT EQUALS VALUE;
surface:SURFACE EQUALS VALUE;
drawSurface:DRAW_SURFACE EQUALS VALUE;
drawDetail:DRAW_DETAIL EQUALS VALUE;
centerLine:CENTER_LINE EQUALS VALUE;
centerLineLighted:CENTER_LINE_LIGHTED EQUALS VALUE;
leftEdge:LEFT_EDGE EQUALS VALUE;
leftEdgeLighted:LEFT_EDGE_LIGHTED EQUALS VALUE;
rightEdge:RIGHT_EDGE EQUALS VALUE;
rightEdgeLighted:RIGHT_EDGE_LIGHTED EQUALS VALUE;
taxiwayPathNumber:NUMBER EQUALS VALUE;
designator:DESIGNATOR EQUALS VALUE;
taxiwayPathName:NAME EQUALS VALUE;
taxiwayNameString:NAME EQUALS VALUE;
taxiwayIndex:INDEX EQUALS VALUE;
availability:AVAILABILITY EQUALS VALUE;
trafficScallar: TRAFFICSCALAR EQUALS VALUE;
frequency: FREQUENCY EQUALS VALUE;
end: END EQUALS VALUE;
ident_ils: IDENT EQUALS VALUE;
pitch: PITCH EQUALS VALUE;
range: RANGE EQUALS VALUE;
image_complexety: IMAGE_COMPLEXITY EQUALS VALUE;
fuel_type: TYPE EQUALS VALUE;

//
length: LENGTH EQUALS VALUE;
number: NUMBER EQUALS VALUE;
primaryDesignator: PRIMARY_DESIGNATOR EQUALS VALUE ;
secondaryDesignator: SECONDARY_DESIGNATOR EQUALS VALUE ;
patternAltitude : PATTERN_ALTITUDE EQUALS VALUE;
primaryTakeoff : PRIMARY_TAKE_OFF EQUALS VALUE;
primaryLanding  : PRIMARY_LANDING EQUALS VALUE;
primaryPattern : PRIMARY_PATTERN EQUALS VALUE;
secondaryTakeoff : SECONDARY_TAKE_OFF EQUALS VALUE;
secondaryLanding : SECONDARY_LANDING EQUALS VALUE;
secondaryPattern : SECONDARY_PATTERN EQUALS VALUE;
primaryMarkingBias : PRIMARY_MARKING_BIAS EQUALS VALUE;
secondaryMarkingBias : SECONDARY_MARKING_BIAS EQUALS VALUE;

//Markings
alternateThreshold : ALTERNATE_THRESHOLD EQUALS VALUE;
alternateTouchdown : ALTERNATE_TOUCHDOWN EQUALS VALUE;
alternateFixedDistance : ALTERNATE_FIXED_DISTANCE EQUALS VALUE;
alternatePrecision : ALTERNATE_PRECISION EQUALS VALUE;
leadingZeroIdent : LEADING_ZERO_IDENT EQUALS VALUE;
noThresholdEndArrows : NO_THRESHOLD_END_ARROWS EQUALS VALUE;
edges : EDGES EQUALS VALUE;
threshold : THRESHOLD EQUALS VALUE;
fixed : FIXED_DISTANCE EQUALS VALUE;
touchdown : TOUCHDOWN EQUALS VALUE;
dashes : DASHES EQUALS VALUE;
ident_Marking : IDENT EQUALS VALUE ;
precision : PRECISION EQUALS VALUE;
edgePavement : EDGE_PAVEMENT EQUALS VALUE;
singleEnd : SINGLE_END EQUALS VALUE;
primaryClosed : PRIMARY_CLOSED EQUALS VALUE;
secondaryClosed : SECONDARY_CLOSED EQUALS VALUE;
primaryStol : PRIMARY_STOL EQUALS VALUE;
secondaryStol : SECONDARY_STOL EQUALS VALUE;
backCourse: BACK_COURSE EQUALS VALUE;

//Lights
center: CENTER EQUALS VALUE;
edge: EDGE EQUALS VALUE;
centerRed: CENTER_RED EQUALS VALUE;

// ApproachLights
system: SYSTEM EQUALS VALUE;
strobes: STROBES EQUALS VALUE;
reil: REIL EQUALS VALUE;
endLights: END_LIGHTS EQUALS VALUE;

//VASI
vasiType:TYPE EQUALS VALUE;
side: SIDE EQUALS VALUE;
spacing: SPACING EQUALS VALUE;

//RUNWAYSTART
runway_type: TYPE EQUALS VALUE;

//HELIPAD
helipad_type: TYPE EQUALS VALUE;
closed: CLOSED EQUALS VALUE;
transparent: TRANSPARENT EQUALS VALUE;
red: RED EQUALS VALUE;
green: GREEN EQUALS VALUE;
blue: BLUE EQUALS VALUE;


//APPROACH
approach_runway: RUNWAY EQUALS VALUE;

scalar: SCALAR EQUALS VALUE;


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

taxiwayPoint:TAXIWAY_POINT_OPEN index taxiwaypointType orientation? lattitude longitude biasX* biasZ* SIMPLE_TAG_CLOSE;

taxiwayParking: TAXIWAY_PARKING_OPEN index lattitude longitude biasX? biasZ? heading radius
    taxiwayparkingType taxiwayparkingName taxiwayparkingNumber push_back airlineCodes? teeOffSet1? teeOffSet2? teeOffSet3? teeOffSet4? SIMPLE_TAG_CLOSE;

taxiwayPath: TAXIWAY_PATH_OPEN taxiwayPathType taxiwayPathStart taxiwayPathEnd width weightLimit drawSurface
    drawDetail surface taxiwayPathName?  centerLine? centerLineLighted? taxiwayPathNumber?   designator? leftEdge? leftEdgeLighted? rightEdge? rightEdgeLighted? SIMPLE_TAG_CLOSE;

taxiwayName:TAXI_NAME_OPEN taxiwayIndex taxiwayNameString? SIMPLE_TAG_CLOSE;

tower: (TOWER_OPEN lattitude longitude altitude SIMPLE_TAG_CLOSE|  TOWER_OPEN lattitude longitude altitude TAG_CLOSE TOWER_CLOSE ) ;

markings: MARKINGS_OPEN alternateThreshold alternateTouchdown alternateFixedDistance alternatePrecision leadingZeroIdent noThresholdEndArrows edges threshold fixed touchdown dashes ident_Marking precision edgePavement singleEnd primaryClosed secondaryClosed primaryStol secondaryStol SIMPLE_TAG_CLOSE;

lights: LIGHTS_OPEN center edge centerRed SIMPLE_TAG_CLOSE;

offsetThreshold: OFFSET_THRESHOLD end length width? surface? SIMPLE_TAG_CLOSE;

blastPad: BLAST_PAD end length width? surface? SIMPLE_TAG_CLOSE;

overrun: OVERRUN end length width? surface? SIMPLE_TAG_CLOSE;

approachLights: APPROACH_LIGHTS_OPEN end system? strobes? reil? touchdown? endLights? SIMPLE_TAG_CLOSE;

vasi: VASI_OPEN end vasiType side biasX biasZ spacing pitch SIMPLE_TAG_CLOSE;

visual_model: VISUAL_MODEL_OPEN heading? image_complexety? name instanceId SIMPLE_TAG_CLOSE;

fuel: FUEL_OPEN fuel_type availability SIMPLE_TAG_CLOSE;

ils: ILS_OPEN lattitude longitude altitude heading frequency end range? magvar ident_ils width? name? backCourse? TAG_CLOSE glide_slope* dme* visual_model* ILS_CLOSE;

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
	 TAG_CLOSE markings? lights?  offsetThreshold* blastPad* overrun? approachLights* vasi* ils* RUNWAY_CLOSE;

runway_start: RUNWAY_START_OPEN runway_type? lattitude longitude altitude heading number? designator? SIMPLE_TAG_CLOSE;

runway_alias: RUNWAY_ALIAS_OPEN number designator SIMPLE_TAG_CLOSE;

taxinodes: taxiwayPoint+ taxiwayParking+ taxiwayName+ taxiwayPath+;

airport: AIRPORT_OPEN region? country? state? city? name? lattitude longitude altitude magvar? trafficScallar airportTestRadius ident    TAG_CLOSE

            (  tower
               | services
               | runway
               | runway_alias
               | helipad
               | runway_start
               |taxinodes
            )*
          AIRPORT_CLOSE;

airports: airport+ EOF;