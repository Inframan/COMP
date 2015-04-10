/**
 * Define a grammar called Hello
 */
grammar AirportReader;



@lexer::members {
  private boolean ignoreWord = true;
}


airports: data + EOF;

data: AirportIn + airporAttributeAnaliser + children + AirportOut; 

airporAttributeAnaliser: ;

children: ;


AirportIn:  '<Airport' {ignoreWord=false;} ;
  
AirportOut: '</Airport>' {ignoreWord=true;} ;

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
