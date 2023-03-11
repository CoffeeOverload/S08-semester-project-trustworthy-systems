package dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dsl.services.TemperatureSensorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemperatureSensorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'device'", "'batchsize'", "'batch'", "'size'", "'maxsensor'", "'maxsensors'", "'max'", "'sensor'", "'sensors'", "'samplerate'", "'sample'", "'rate'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTemperatureSensorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTemperatureSensorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTemperatureSensorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTemperatureSensor.g"; }



     	private TemperatureSensorGrammarAccess grammarAccess;

        public InternalTemperatureSensorParser(TokenStream input, TemperatureSensorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Device";
       	}

       	@Override
       	protected TemperatureSensorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDevice"
    // InternalTemperatureSensor.g:64:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalTemperatureSensor.g:64:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalTemperatureSensor.g:65:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalTemperatureSensor.g:71:1: ruleDevice returns [EObject current=null] : (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+ {...}?) ) ) ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_batchSize_3_0 = null;

        EObject lv_maxSensor_4_0 = null;

        EObject lv_sampleRate_5_0 = null;



        	enterRule();

        try {
            // InternalTemperatureSensor.g:77:2: ( (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+ {...}?) ) ) ) )
            // InternalTemperatureSensor.g:78:2: (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+ {...}?) ) ) )
            {
            // InternalTemperatureSensor.g:78:2: (otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+ {...}?) ) ) )
            // InternalTemperatureSensor.g:79:3: otherlv_0= 'device' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+ {...}?) ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeviceAccess().getDeviceKeyword_0());
            		
            // InternalTemperatureSensor.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalTemperatureSensor.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalTemperatureSensor.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalTemperatureSensor.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeviceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalTemperatureSensor.g:101:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+ {...}?) ) )
            // InternalTemperatureSensor.g:102:4: ( ( ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+ {...}?) )
            {
            // InternalTemperatureSensor.g:102:4: ( ( ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+ {...}?) )
            // InternalTemperatureSensor.g:103:5: ( ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDeviceAccess().getUnorderedGroup_2());
            				
            // InternalTemperatureSensor.g:106:5: ( ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+ {...}?)
            // InternalTemperatureSensor.g:107:6: ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+ {...}?
            {
            // InternalTemperatureSensor.g:107:6: ( ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( LA1_0 >= 12 && LA1_0 <= 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 >= 15 && LA1_0 <= 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 >= 20 && LA1_0 <= 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 2) ) {
                    alt1=3;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTemperatureSensor.g:108:4: ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) )
            	    {
            	    // InternalTemperatureSensor.g:108:4: ({...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) ) )
            	    // InternalTemperatureSensor.g:109:5: {...}? => ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDevice", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalTemperatureSensor.g:109:103: ( ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) ) )
            	    // InternalTemperatureSensor.g:110:6: ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalTemperatureSensor.g:113:9: ({...}? => ( (lv_batchSize_3_0= ruleBatchSize ) ) )
            	    // InternalTemperatureSensor.g:113:10: {...}? => ( (lv_batchSize_3_0= ruleBatchSize ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDevice", "true");
            	    }
            	    // InternalTemperatureSensor.g:113:19: ( (lv_batchSize_3_0= ruleBatchSize ) )
            	    // InternalTemperatureSensor.g:113:20: (lv_batchSize_3_0= ruleBatchSize )
            	    {
            	    // InternalTemperatureSensor.g:113:20: (lv_batchSize_3_0= ruleBatchSize )
            	    // InternalTemperatureSensor.g:114:10: lv_batchSize_3_0= ruleBatchSize
            	    {

            	    										newCompositeNode(grammarAccess.getDeviceAccess().getBatchSizeBatchSizeParserRuleCall_2_0_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_batchSize_3_0=ruleBatchSize();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDeviceRule());
            	    										}
            	    										set(
            	    											current,
            	    											"batchSize",
            	    											lv_batchSize_3_0,
            	    											"dsl.TemperatureSensor.BatchSize");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeviceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalTemperatureSensor.g:136:4: ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) )
            	    {
            	    // InternalTemperatureSensor.g:136:4: ({...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) ) )
            	    // InternalTemperatureSensor.g:137:5: {...}? => ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDevice", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalTemperatureSensor.g:137:103: ( ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) ) )
            	    // InternalTemperatureSensor.g:138:6: ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalTemperatureSensor.g:141:9: ({...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) ) )
            	    // InternalTemperatureSensor.g:141:10: {...}? => ( (lv_maxSensor_4_0= ruleMaxSensor ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDevice", "true");
            	    }
            	    // InternalTemperatureSensor.g:141:19: ( (lv_maxSensor_4_0= ruleMaxSensor ) )
            	    // InternalTemperatureSensor.g:141:20: (lv_maxSensor_4_0= ruleMaxSensor )
            	    {
            	    // InternalTemperatureSensor.g:141:20: (lv_maxSensor_4_0= ruleMaxSensor )
            	    // InternalTemperatureSensor.g:142:10: lv_maxSensor_4_0= ruleMaxSensor
            	    {

            	    										newCompositeNode(grammarAccess.getDeviceAccess().getMaxSensorMaxSensorParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_maxSensor_4_0=ruleMaxSensor();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDeviceRule());
            	    										}
            	    										set(
            	    											current,
            	    											"maxSensor",
            	    											lv_maxSensor_4_0,
            	    											"dsl.TemperatureSensor.MaxSensor");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeviceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalTemperatureSensor.g:164:4: ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) )
            	    {
            	    // InternalTemperatureSensor.g:164:4: ({...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) ) )
            	    // InternalTemperatureSensor.g:165:5: {...}? => ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDevice", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalTemperatureSensor.g:165:103: ( ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) ) )
            	    // InternalTemperatureSensor.g:166:6: ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalTemperatureSensor.g:169:9: ({...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) ) )
            	    // InternalTemperatureSensor.g:169:10: {...}? => ( (lv_sampleRate_5_0= ruleSampleRate ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDevice", "true");
            	    }
            	    // InternalTemperatureSensor.g:169:19: ( (lv_sampleRate_5_0= ruleSampleRate ) )
            	    // InternalTemperatureSensor.g:169:20: (lv_sampleRate_5_0= ruleSampleRate )
            	    {
            	    // InternalTemperatureSensor.g:169:20: (lv_sampleRate_5_0= ruleSampleRate )
            	    // InternalTemperatureSensor.g:170:10: lv_sampleRate_5_0= ruleSampleRate
            	    {

            	    										newCompositeNode(grammarAccess.getDeviceAccess().getSampleRateSampleRateParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_sampleRate_5_0=ruleSampleRate();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getDeviceRule());
            	    										}
            	    										set(
            	    											current,
            	    											"sampleRate",
            	    											lv_sampleRate_5_0,
            	    											"dsl.TemperatureSensor.SampleRate");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeviceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDeviceAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleDevice", "getUnorderedGroupHelper().canLeave(grammarAccess.getDeviceAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDeviceAccess().getUnorderedGroup_2());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleBatchSize"
    // InternalTemperatureSensor.g:204:1: entryRuleBatchSize returns [EObject current=null] : iv_ruleBatchSize= ruleBatchSize EOF ;
    public final EObject entryRuleBatchSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBatchSize = null;


        try {
            // InternalTemperatureSensor.g:204:50: (iv_ruleBatchSize= ruleBatchSize EOF )
            // InternalTemperatureSensor.g:205:2: iv_ruleBatchSize= ruleBatchSize EOF
            {
             newCompositeNode(grammarAccess.getBatchSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBatchSize=ruleBatchSize();

            state._fsp--;

             current =iv_ruleBatchSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBatchSize"


    // $ANTLR start "ruleBatchSize"
    // InternalTemperatureSensor.g:211:1: ruleBatchSize returns [EObject current=null] : ( (otherlv_0= 'batchsize' | (otherlv_1= 'batch' otherlv_2= 'size' ) ) ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleBatchSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalTemperatureSensor.g:217:2: ( ( (otherlv_0= 'batchsize' | (otherlv_1= 'batch' otherlv_2= 'size' ) ) ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalTemperatureSensor.g:218:2: ( (otherlv_0= 'batchsize' | (otherlv_1= 'batch' otherlv_2= 'size' ) ) ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalTemperatureSensor.g:218:2: ( (otherlv_0= 'batchsize' | (otherlv_1= 'batch' otherlv_2= 'size' ) ) ( (lv_value_3_0= RULE_INT ) ) )
            // InternalTemperatureSensor.g:219:3: (otherlv_0= 'batchsize' | (otherlv_1= 'batch' otherlv_2= 'size' ) ) ( (lv_value_3_0= RULE_INT ) )
            {
            // InternalTemperatureSensor.g:219:3: (otherlv_0= 'batchsize' | (otherlv_1= 'batch' otherlv_2= 'size' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTemperatureSensor.g:220:4: otherlv_0= 'batchsize'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getBatchSizeAccess().getBatchsizeKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTemperatureSensor.g:225:4: (otherlv_1= 'batch' otherlv_2= 'size' )
                    {
                    // InternalTemperatureSensor.g:225:4: (otherlv_1= 'batch' otherlv_2= 'size' )
                    // InternalTemperatureSensor.g:226:5: otherlv_1= 'batch' otherlv_2= 'size'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_7); 

                    					newLeafNode(otherlv_1, grammarAccess.getBatchSizeAccess().getBatchKeyword_0_1_0());
                    				
                    otherlv_2=(Token)match(input,14,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getBatchSizeAccess().getSizeKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalTemperatureSensor.g:236:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalTemperatureSensor.g:237:4: (lv_value_3_0= RULE_INT )
            {
            // InternalTemperatureSensor.g:237:4: (lv_value_3_0= RULE_INT )
            // InternalTemperatureSensor.g:238:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getBatchSizeAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBatchSizeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBatchSize"


    // $ANTLR start "entryRuleMaxSensor"
    // InternalTemperatureSensor.g:258:1: entryRuleMaxSensor returns [EObject current=null] : iv_ruleMaxSensor= ruleMaxSensor EOF ;
    public final EObject entryRuleMaxSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxSensor = null;


        try {
            // InternalTemperatureSensor.g:258:50: (iv_ruleMaxSensor= ruleMaxSensor EOF )
            // InternalTemperatureSensor.g:259:2: iv_ruleMaxSensor= ruleMaxSensor EOF
            {
             newCompositeNode(grammarAccess.getMaxSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaxSensor=ruleMaxSensor();

            state._fsp--;

             current =iv_ruleMaxSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxSensor"


    // $ANTLR start "ruleMaxSensor"
    // InternalTemperatureSensor.g:265:1: ruleMaxSensor returns [EObject current=null] : ( ( (otherlv_0= 'maxsensor' | otherlv_1= 'maxsensors' ) | (otherlv_2= 'max' (otherlv_3= 'sensor' | otherlv_4= 'sensors' ) ) ) ( (lv_value_5_0= RULE_INT ) ) ) ;
    public final EObject ruleMaxSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;


        	enterRule();

        try {
            // InternalTemperatureSensor.g:271:2: ( ( ( (otherlv_0= 'maxsensor' | otherlv_1= 'maxsensors' ) | (otherlv_2= 'max' (otherlv_3= 'sensor' | otherlv_4= 'sensors' ) ) ) ( (lv_value_5_0= RULE_INT ) ) ) )
            // InternalTemperatureSensor.g:272:2: ( ( (otherlv_0= 'maxsensor' | otherlv_1= 'maxsensors' ) | (otherlv_2= 'max' (otherlv_3= 'sensor' | otherlv_4= 'sensors' ) ) ) ( (lv_value_5_0= RULE_INT ) ) )
            {
            // InternalTemperatureSensor.g:272:2: ( ( (otherlv_0= 'maxsensor' | otherlv_1= 'maxsensors' ) | (otherlv_2= 'max' (otherlv_3= 'sensor' | otherlv_4= 'sensors' ) ) ) ( (lv_value_5_0= RULE_INT ) ) )
            // InternalTemperatureSensor.g:273:3: ( (otherlv_0= 'maxsensor' | otherlv_1= 'maxsensors' ) | (otherlv_2= 'max' (otherlv_3= 'sensor' | otherlv_4= 'sensors' ) ) ) ( (lv_value_5_0= RULE_INT ) )
            {
            // InternalTemperatureSensor.g:273:3: ( (otherlv_0= 'maxsensor' | otherlv_1= 'maxsensors' ) | (otherlv_2= 'max' (otherlv_3= 'sensor' | otherlv_4= 'sensors' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTemperatureSensor.g:274:4: (otherlv_0= 'maxsensor' | otherlv_1= 'maxsensors' )
                    {
                    // InternalTemperatureSensor.g:274:4: (otherlv_0= 'maxsensor' | otherlv_1= 'maxsensors' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==15) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==16) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalTemperatureSensor.g:275:5: otherlv_0= 'maxsensor'
                            {
                            otherlv_0=(Token)match(input,15,FOLLOW_6); 

                            					newLeafNode(otherlv_0, grammarAccess.getMaxSensorAccess().getMaxsensorKeyword_0_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTemperatureSensor.g:280:5: otherlv_1= 'maxsensors'
                            {
                            otherlv_1=(Token)match(input,16,FOLLOW_6); 

                            					newLeafNode(otherlv_1, grammarAccess.getMaxSensorAccess().getMaxsensorsKeyword_0_0_1());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalTemperatureSensor.g:286:4: (otherlv_2= 'max' (otherlv_3= 'sensor' | otherlv_4= 'sensors' ) )
                    {
                    // InternalTemperatureSensor.g:286:4: (otherlv_2= 'max' (otherlv_3= 'sensor' | otherlv_4= 'sensors' ) )
                    // InternalTemperatureSensor.g:287:5: otherlv_2= 'max' (otherlv_3= 'sensor' | otherlv_4= 'sensors' )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_8); 

                    					newLeafNode(otherlv_2, grammarAccess.getMaxSensorAccess().getMaxKeyword_0_1_0());
                    				
                    // InternalTemperatureSensor.g:291:5: (otherlv_3= 'sensor' | otherlv_4= 'sensors' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==18) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==19) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalTemperatureSensor.g:292:6: otherlv_3= 'sensor'
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_6); 

                            						newLeafNode(otherlv_3, grammarAccess.getMaxSensorAccess().getSensorKeyword_0_1_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalTemperatureSensor.g:297:6: otherlv_4= 'sensors'
                            {
                            otherlv_4=(Token)match(input,19,FOLLOW_6); 

                            						newLeafNode(otherlv_4, grammarAccess.getMaxSensorAccess().getSensorsKeyword_0_1_1_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // InternalTemperatureSensor.g:304:3: ( (lv_value_5_0= RULE_INT ) )
            // InternalTemperatureSensor.g:305:4: (lv_value_5_0= RULE_INT )
            {
            // InternalTemperatureSensor.g:305:4: (lv_value_5_0= RULE_INT )
            // InternalTemperatureSensor.g:306:5: lv_value_5_0= RULE_INT
            {
            lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_5_0, grammarAccess.getMaxSensorAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaxSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaxSensor"


    // $ANTLR start "entryRuleSampleRate"
    // InternalTemperatureSensor.g:326:1: entryRuleSampleRate returns [EObject current=null] : iv_ruleSampleRate= ruleSampleRate EOF ;
    public final EObject entryRuleSampleRate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampleRate = null;


        try {
            // InternalTemperatureSensor.g:326:51: (iv_ruleSampleRate= ruleSampleRate EOF )
            // InternalTemperatureSensor.g:327:2: iv_ruleSampleRate= ruleSampleRate EOF
            {
             newCompositeNode(grammarAccess.getSampleRateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSampleRate=ruleSampleRate();

            state._fsp--;

             current =iv_ruleSampleRate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSampleRate"


    // $ANTLR start "ruleSampleRate"
    // InternalTemperatureSensor.g:333:1: ruleSampleRate returns [EObject current=null] : ( (otherlv_0= 'samplerate' | (otherlv_1= 'sample' otherlv_2= 'rate' ) ) ( (lv_value_3_0= RULE_INT ) ) ) ;
    public final EObject ruleSampleRate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalTemperatureSensor.g:339:2: ( ( (otherlv_0= 'samplerate' | (otherlv_1= 'sample' otherlv_2= 'rate' ) ) ( (lv_value_3_0= RULE_INT ) ) ) )
            // InternalTemperatureSensor.g:340:2: ( (otherlv_0= 'samplerate' | (otherlv_1= 'sample' otherlv_2= 'rate' ) ) ( (lv_value_3_0= RULE_INT ) ) )
            {
            // InternalTemperatureSensor.g:340:2: ( (otherlv_0= 'samplerate' | (otherlv_1= 'sample' otherlv_2= 'rate' ) ) ( (lv_value_3_0= RULE_INT ) ) )
            // InternalTemperatureSensor.g:341:3: (otherlv_0= 'samplerate' | (otherlv_1= 'sample' otherlv_2= 'rate' ) ) ( (lv_value_3_0= RULE_INT ) )
            {
            // InternalTemperatureSensor.g:341:3: (otherlv_0= 'samplerate' | (otherlv_1= 'sample' otherlv_2= 'rate' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTemperatureSensor.g:342:4: otherlv_0= 'samplerate'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getSampleRateAccess().getSamplerateKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalTemperatureSensor.g:347:4: (otherlv_1= 'sample' otherlv_2= 'rate' )
                    {
                    // InternalTemperatureSensor.g:347:4: (otherlv_1= 'sample' otherlv_2= 'rate' )
                    // InternalTemperatureSensor.g:348:5: otherlv_1= 'sample' otherlv_2= 'rate'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_9); 

                    					newLeafNode(otherlv_1, grammarAccess.getSampleRateAccess().getSampleKeyword_0_1_0());
                    				
                    otherlv_2=(Token)match(input,22,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getSampleRateAccess().getRateKeyword_0_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalTemperatureSensor.g:358:3: ( (lv_value_3_0= RULE_INT ) )
            // InternalTemperatureSensor.g:359:4: (lv_value_3_0= RULE_INT )
            {
            // InternalTemperatureSensor.g:359:4: (lv_value_3_0= RULE_INT )
            // InternalTemperatureSensor.g:360:5: lv_value_3_0= RULE_INT
            {
            lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getSampleRateAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSampleRateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSampleRate"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000033B000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000033B002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});

}
