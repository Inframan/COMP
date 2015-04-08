/**
 * Define a grammar called Hello
 */
grammar AirportReader;
xmsVersion  : '<?xml version="1.0" encoding="ISO-8859-1"?>' fsdata EOF;
/*<FSData
   Version
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xsi:noNamespaceSchemaLocation="bglcomp.xsd">'   
   Airports   
   '</FSData>'*/        // match keyword hello followed by an identifier





fsdata : '<FSData'
   Version
   Xmls
   'xsi:noNamespaceSchemaLocation="bglcomp.xsd">'
   unFiltered
   '</FSData>'
   ;
   
unFiltered: ; 
   

Version: 'version=' [\"9.0\"] ;

Xmls:  'xmlns:xsi='[\"]'http://www.w3.org/2001/XMLSchema-instance'[\"] ;

Algarism : [0-9] ;     //match algarisms

Airports : [a-z]+ ;           

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

