// Generated from E:/IntellijWorkspace/XML2SDL/src\Airport_Parser.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Airport_ParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Airport_ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#fsdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFsdata(@NotNull Airport_ParserParser.FsdataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#region}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegion(@NotNull Airport_ParserParser.RegionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#city}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCity(@NotNull Airport_ParserParser.CityContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#country}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCountry(@NotNull Airport_ParserParser.CountryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(@NotNull Airport_ParserParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull Airport_ParserParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#magvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMagvar(@NotNull Airport_ParserParser.MagvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(@NotNull Airport_ParserParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(@NotNull Airport_ParserParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#biasX}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiasX(@NotNull Airport_ParserParser.BiasXContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#biasY}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiasY(@NotNull Airport_ParserParser.BiasYContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#biasZ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBiasZ(@NotNull Airport_ParserParser.BiasZContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeading(@NotNull Airport_ParserParser.HeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#lattitude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLattitude(@NotNull Airport_ParserParser.LattitudeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#longitude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongitude(@NotNull Airport_ParserParser.LongitudeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#altitude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltitude(@NotNull Airport_ParserParser.AltitudeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#airportTestRadius}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAirportTestRadius(@NotNull Airport_ParserParser.AirportTestRadiusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwaypointType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwaypointType(@NotNull Airport_ParserParser.TaxiwaypointTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#orientation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrientation(@NotNull Airport_ParserParser.OrientationContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#radius}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRadius(@NotNull Airport_ParserParser.RadiusContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayparkingType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayparkingType(@NotNull Airport_ParserParser.TaxiwayparkingTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayparkingName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayparkingName(@NotNull Airport_ParserParser.TaxiwayparkingNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayparkingNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayparkingNumber(@NotNull Airport_ParserParser.TaxiwayparkingNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#airlineCodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAirlineCodes(@NotNull Airport_ParserParser.AirlineCodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#teeOffSet1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTeeOffSet1(@NotNull Airport_ParserParser.TeeOffSet1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#teeOffSet2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTeeOffSet2(@NotNull Airport_ParserParser.TeeOffSet2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#teeOffSet3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTeeOffSet3(@NotNull Airport_ParserParser.TeeOffSet3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#teeOffSet4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTeeOffSet4(@NotNull Airport_ParserParser.TeeOffSet4Context ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayPathType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayPathType(@NotNull Airport_ParserParser.TaxiwayPathTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayPathStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayPathStart(@NotNull Airport_ParserParser.TaxiwayPathStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayPathEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayPathEnd(@NotNull Airport_ParserParser.TaxiwayPathEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(@NotNull Airport_ParserParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#weightLimit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightLimit(@NotNull Airport_ParserParser.WeightLimitContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#surface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSurface(@NotNull Airport_ParserParser.SurfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#drawSurface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawSurface(@NotNull Airport_ParserParser.DrawSurfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#drawDetail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrawDetail(@NotNull Airport_ParserParser.DrawDetailContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#centerLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenterLine(@NotNull Airport_ParserParser.CenterLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#centerLineLighted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenterLineLighted(@NotNull Airport_ParserParser.CenterLineLightedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#leftEdge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftEdge(@NotNull Airport_ParserParser.LeftEdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#leftEdgeLighted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftEdgeLighted(@NotNull Airport_ParserParser.LeftEdgeLightedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#rightEdge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightEdge(@NotNull Airport_ParserParser.RightEdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#rightEdgeLighted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightEdgeLighted(@NotNull Airport_ParserParser.RightEdgeLightedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayPathNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayPathNumber(@NotNull Airport_ParserParser.TaxiwayPathNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(@NotNull Airport_ParserParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayPathName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayPathName(@NotNull Airport_ParserParser.TaxiwayPathNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayNameString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayNameString(@NotNull Airport_ParserParser.TaxiwayNameStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayIndex(@NotNull Airport_ParserParser.TaxiwayIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#fuelType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuelType(@NotNull Airport_ParserParser.FuelTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#availability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvailability(@NotNull Airport_ParserParser.AvailabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#trafficScallar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrafficScallar(@NotNull Airport_ParserParser.TrafficScallarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#frequency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrequency(@NotNull Airport_ParserParser.FrequencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(@NotNull Airport_ParserParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#ident_ils}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_ils(@NotNull Airport_ParserParser.Ident_ilsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#pitch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPitch(@NotNull Airport_ParserParser.PitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(@NotNull Airport_ParserParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#image_complexety}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage_complexety(@NotNull Airport_ParserParser.Image_complexetyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(@NotNull Airport_ParserParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull Airport_ParserParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#primaryDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryDesignator(@NotNull Airport_ParserParser.PrimaryDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#secondaryDesignator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryDesignator(@NotNull Airport_ParserParser.SecondaryDesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#patternAltitude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternAltitude(@NotNull Airport_ParserParser.PatternAltitudeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#primaryTakeoff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryTakeoff(@NotNull Airport_ParserParser.PrimaryTakeoffContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#primaryLanding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryLanding(@NotNull Airport_ParserParser.PrimaryLandingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#primaryPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryPattern(@NotNull Airport_ParserParser.PrimaryPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#secondaryTakeoff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryTakeoff(@NotNull Airport_ParserParser.SecondaryTakeoffContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#secondaryLanding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryLanding(@NotNull Airport_ParserParser.SecondaryLandingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#secondaryPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryPattern(@NotNull Airport_ParserParser.SecondaryPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#primaryMarkingBias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryMarkingBias(@NotNull Airport_ParserParser.PrimaryMarkingBiasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#secondaryMarkingBias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryMarkingBias(@NotNull Airport_ParserParser.SecondaryMarkingBiasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#alternateThreshold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternateThreshold(@NotNull Airport_ParserParser.AlternateThresholdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#alternateTouchdown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternateTouchdown(@NotNull Airport_ParserParser.AlternateTouchdownContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#alternateFixedDistance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternateFixedDistance(@NotNull Airport_ParserParser.AlternateFixedDistanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#alternatePrecision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternatePrecision(@NotNull Airport_ParserParser.AlternatePrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#leadingZeroIdent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeadingZeroIdent(@NotNull Airport_ParserParser.LeadingZeroIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#noThresholdEndArrows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoThresholdEndArrows(@NotNull Airport_ParserParser.NoThresholdEndArrowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#edges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdges(@NotNull Airport_ParserParser.EdgesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#threshold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreshold(@NotNull Airport_ParserParser.ThresholdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#fixed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixed(@NotNull Airport_ParserParser.FixedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#touchdown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTouchdown(@NotNull Airport_ParserParser.TouchdownContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#dashes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDashes(@NotNull Airport_ParserParser.DashesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#ident_Marking}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent_Marking(@NotNull Airport_ParserParser.Ident_MarkingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(@NotNull Airport_ParserParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#edgePavement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdgePavement(@NotNull Airport_ParserParser.EdgePavementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#singleEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEnd(@NotNull Airport_ParserParser.SingleEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#primaryClosed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryClosed(@NotNull Airport_ParserParser.PrimaryClosedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#secondaryClosed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryClosed(@NotNull Airport_ParserParser.SecondaryClosedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#primaryStol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryStol(@NotNull Airport_ParserParser.PrimaryStolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#secondaryStol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondaryStol(@NotNull Airport_ParserParser.SecondaryStolContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#backCourse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackCourse(@NotNull Airport_ParserParser.BackCourseContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#center}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter(@NotNull Airport_ParserParser.CenterContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#edge}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge(@NotNull Airport_ParserParser.EdgeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#centerRed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenterRed(@NotNull Airport_ParserParser.CenterRedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#system}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem(@NotNull Airport_ParserParser.SystemContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#strobes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrobes(@NotNull Airport_ParserParser.StrobesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#reil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReil(@NotNull Airport_ParserParser.ReilContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#endLights}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndLights(@NotNull Airport_ParserParser.EndLightsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#vasiType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVasiType(@NotNull Airport_ParserParser.VasiTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#side}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSide(@NotNull Airport_ParserParser.SideContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#spacing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpacing(@NotNull Airport_ParserParser.SpacingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#runway_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunway_type(@NotNull Airport_ParserParser.Runway_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#start_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_type(@NotNull Airport_ParserParser.Start_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#helipad_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelipad_type(@NotNull Airport_ParserParser.Helipad_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#closed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosed(@NotNull Airport_ParserParser.ClosedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#transparent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransparent(@NotNull Airport_ParserParser.TransparentContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#red}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRed(@NotNull Airport_ParserParser.RedContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#green}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreen(@NotNull Airport_ParserParser.GreenContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#blue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlue(@NotNull Airport_ParserParser.BlueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#approach_runway}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApproach_runway(@NotNull Airport_ParserParser.Approach_runwayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#approach_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApproach_type(@NotNull Airport_ParserParser.Approach_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#airport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAirport(@NotNull Airport_ParserParser.AirportContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#vertex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertex(@NotNull Airport_ParserParser.VertexContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#triggerWeatherData}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerWeatherData(@NotNull Airport_ParserParser.TriggerWeatherDataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger(@NotNull Airport_ParserParser.TriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#services}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServices(@NotNull Airport_ParserParser.ServicesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#helipad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelipad(@NotNull Airport_ParserParser.HelipadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#glide_slope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlide_slope(@NotNull Airport_ParserParser.Glide_slopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#visual_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisual_model(@NotNull Airport_ParserParser.Visual_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#dme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDme(@NotNull Airport_ParserParser.DmeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayPoint(@NotNull Airport_ParserParser.TaxiwayPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayParking}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayParking(@NotNull Airport_ParserParser.TaxiwayParkingContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayPath(@NotNull Airport_ParserParser.TaxiwayPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#taxiwayName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaxiwayName(@NotNull Airport_ParserParser.TaxiwayNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#tower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTower(@NotNull Airport_ParserParser.TowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#fuel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuel(@NotNull Airport_ParserParser.FuelContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#markings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarkings(@NotNull Airport_ParserParser.MarkingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#lights}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLights(@NotNull Airport_ParserParser.LightsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#offsetThreshold}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetThreshold(@NotNull Airport_ParserParser.OffsetThresholdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#blastPad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlastPad(@NotNull Airport_ParserParser.BlastPadContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#overrun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverrun(@NotNull Airport_ParserParser.OverrunContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#approachLights}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApproachLights(@NotNull Airport_ParserParser.ApproachLightsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#vasi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVasi(@NotNull Airport_ParserParser.VasiContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#ils}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIls(@NotNull Airport_ParserParser.IlsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#runway}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunway(@NotNull Airport_ParserParser.RunwayContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#runway_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunway_start(@NotNull Airport_ParserParser.Runway_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link Airport_ParserParser#runway_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunway_alias(@NotNull Airport_ParserParser.Runway_aliasContext ctx);
}