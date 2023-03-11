package dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dsl.services.TemperatureSensorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemperatureSensorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'batchsize'", "'maxsensor'", "'maxsensors'", "'sensor'", "'sensors'", "'samplerate'", "'device'", "'batch'", "'size'", "'max'", "'sample'", "'rate'"
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

    	public void setGrammarAccess(TemperatureSensorGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDevice"
    // InternalTemperatureSensor.g:53:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalTemperatureSensor.g:54:1: ( ruleDevice EOF )
            // InternalTemperatureSensor.g:55:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalTemperatureSensor.g:62:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:66:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalTemperatureSensor.g:67:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalTemperatureSensor.g:67:2: ( ( rule__Device__Group__0 ) )
            // InternalTemperatureSensor.g:68:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalTemperatureSensor.g:69:3: ( rule__Device__Group__0 )
            // InternalTemperatureSensor.g:69:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleBatchSize"
    // InternalTemperatureSensor.g:78:1: entryRuleBatchSize : ruleBatchSize EOF ;
    public final void entryRuleBatchSize() throws RecognitionException {
        try {
            // InternalTemperatureSensor.g:79:1: ( ruleBatchSize EOF )
            // InternalTemperatureSensor.g:80:1: ruleBatchSize EOF
            {
             before(grammarAccess.getBatchSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleBatchSize();

            state._fsp--;

             after(grammarAccess.getBatchSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBatchSize"


    // $ANTLR start "ruleBatchSize"
    // InternalTemperatureSensor.g:87:1: ruleBatchSize : ( ( rule__BatchSize__Group__0 ) ) ;
    public final void ruleBatchSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:91:2: ( ( ( rule__BatchSize__Group__0 ) ) )
            // InternalTemperatureSensor.g:92:2: ( ( rule__BatchSize__Group__0 ) )
            {
            // InternalTemperatureSensor.g:92:2: ( ( rule__BatchSize__Group__0 ) )
            // InternalTemperatureSensor.g:93:3: ( rule__BatchSize__Group__0 )
            {
             before(grammarAccess.getBatchSizeAccess().getGroup()); 
            // InternalTemperatureSensor.g:94:3: ( rule__BatchSize__Group__0 )
            // InternalTemperatureSensor.g:94:4: rule__BatchSize__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BatchSize__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBatchSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBatchSize"


    // $ANTLR start "entryRuleMaxSensor"
    // InternalTemperatureSensor.g:103:1: entryRuleMaxSensor : ruleMaxSensor EOF ;
    public final void entryRuleMaxSensor() throws RecognitionException {
        try {
            // InternalTemperatureSensor.g:104:1: ( ruleMaxSensor EOF )
            // InternalTemperatureSensor.g:105:1: ruleMaxSensor EOF
            {
             before(grammarAccess.getMaxSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleMaxSensor();

            state._fsp--;

             after(grammarAccess.getMaxSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaxSensor"


    // $ANTLR start "ruleMaxSensor"
    // InternalTemperatureSensor.g:112:1: ruleMaxSensor : ( ( rule__MaxSensor__Group__0 ) ) ;
    public final void ruleMaxSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:116:2: ( ( ( rule__MaxSensor__Group__0 ) ) )
            // InternalTemperatureSensor.g:117:2: ( ( rule__MaxSensor__Group__0 ) )
            {
            // InternalTemperatureSensor.g:117:2: ( ( rule__MaxSensor__Group__0 ) )
            // InternalTemperatureSensor.g:118:3: ( rule__MaxSensor__Group__0 )
            {
             before(grammarAccess.getMaxSensorAccess().getGroup()); 
            // InternalTemperatureSensor.g:119:3: ( rule__MaxSensor__Group__0 )
            // InternalTemperatureSensor.g:119:4: rule__MaxSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MaxSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMaxSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaxSensor"


    // $ANTLR start "entryRuleSampleRate"
    // InternalTemperatureSensor.g:128:1: entryRuleSampleRate : ruleSampleRate EOF ;
    public final void entryRuleSampleRate() throws RecognitionException {
        try {
            // InternalTemperatureSensor.g:129:1: ( ruleSampleRate EOF )
            // InternalTemperatureSensor.g:130:1: ruleSampleRate EOF
            {
             before(grammarAccess.getSampleRateRule()); 
            pushFollow(FOLLOW_1);
            ruleSampleRate();

            state._fsp--;

             after(grammarAccess.getSampleRateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSampleRate"


    // $ANTLR start "ruleSampleRate"
    // InternalTemperatureSensor.g:137:1: ruleSampleRate : ( ( rule__SampleRate__Group__0 ) ) ;
    public final void ruleSampleRate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:141:2: ( ( ( rule__SampleRate__Group__0 ) ) )
            // InternalTemperatureSensor.g:142:2: ( ( rule__SampleRate__Group__0 ) )
            {
            // InternalTemperatureSensor.g:142:2: ( ( rule__SampleRate__Group__0 ) )
            // InternalTemperatureSensor.g:143:3: ( rule__SampleRate__Group__0 )
            {
             before(grammarAccess.getSampleRateAccess().getGroup()); 
            // InternalTemperatureSensor.g:144:3: ( rule__SampleRate__Group__0 )
            // InternalTemperatureSensor.g:144:4: rule__SampleRate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SampleRate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSampleRateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSampleRate"


    // $ANTLR start "rule__BatchSize__Alternatives_0"
    // InternalTemperatureSensor.g:152:1: rule__BatchSize__Alternatives_0 : ( ( 'batchsize' ) | ( ( rule__BatchSize__Group_0_1__0 ) ) );
    public final void rule__BatchSize__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:156:1: ( ( 'batchsize' ) | ( ( rule__BatchSize__Group_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTemperatureSensor.g:157:2: ( 'batchsize' )
                    {
                    // InternalTemperatureSensor.g:157:2: ( 'batchsize' )
                    // InternalTemperatureSensor.g:158:3: 'batchsize'
                    {
                     before(grammarAccess.getBatchSizeAccess().getBatchsizeKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBatchSizeAccess().getBatchsizeKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemperatureSensor.g:163:2: ( ( rule__BatchSize__Group_0_1__0 ) )
                    {
                    // InternalTemperatureSensor.g:163:2: ( ( rule__BatchSize__Group_0_1__0 ) )
                    // InternalTemperatureSensor.g:164:3: ( rule__BatchSize__Group_0_1__0 )
                    {
                     before(grammarAccess.getBatchSizeAccess().getGroup_0_1()); 
                    // InternalTemperatureSensor.g:165:3: ( rule__BatchSize__Group_0_1__0 )
                    // InternalTemperatureSensor.g:165:4: rule__BatchSize__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BatchSize__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBatchSizeAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchSize__Alternatives_0"


    // $ANTLR start "rule__MaxSensor__Alternatives_0"
    // InternalTemperatureSensor.g:173:1: rule__MaxSensor__Alternatives_0 : ( ( ( rule__MaxSensor__Alternatives_0_0 ) ) | ( ( rule__MaxSensor__Group_0_1__0 ) ) );
    public final void rule__MaxSensor__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:177:1: ( ( ( rule__MaxSensor__Alternatives_0_0 ) ) | ( ( rule__MaxSensor__Group_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=13)) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTemperatureSensor.g:178:2: ( ( rule__MaxSensor__Alternatives_0_0 ) )
                    {
                    // InternalTemperatureSensor.g:178:2: ( ( rule__MaxSensor__Alternatives_0_0 ) )
                    // InternalTemperatureSensor.g:179:3: ( rule__MaxSensor__Alternatives_0_0 )
                    {
                     before(grammarAccess.getMaxSensorAccess().getAlternatives_0_0()); 
                    // InternalTemperatureSensor.g:180:3: ( rule__MaxSensor__Alternatives_0_0 )
                    // InternalTemperatureSensor.g:180:4: rule__MaxSensor__Alternatives_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxSensor__Alternatives_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMaxSensorAccess().getAlternatives_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemperatureSensor.g:184:2: ( ( rule__MaxSensor__Group_0_1__0 ) )
                    {
                    // InternalTemperatureSensor.g:184:2: ( ( rule__MaxSensor__Group_0_1__0 ) )
                    // InternalTemperatureSensor.g:185:3: ( rule__MaxSensor__Group_0_1__0 )
                    {
                     before(grammarAccess.getMaxSensorAccess().getGroup_0_1()); 
                    // InternalTemperatureSensor.g:186:3: ( rule__MaxSensor__Group_0_1__0 )
                    // InternalTemperatureSensor.g:186:4: rule__MaxSensor__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MaxSensor__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMaxSensorAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__Alternatives_0"


    // $ANTLR start "rule__MaxSensor__Alternatives_0_0"
    // InternalTemperatureSensor.g:194:1: rule__MaxSensor__Alternatives_0_0 : ( ( 'maxsensor' ) | ( 'maxsensors' ) );
    public final void rule__MaxSensor__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:198:1: ( ( 'maxsensor' ) | ( 'maxsensors' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTemperatureSensor.g:199:2: ( 'maxsensor' )
                    {
                    // InternalTemperatureSensor.g:199:2: ( 'maxsensor' )
                    // InternalTemperatureSensor.g:200:3: 'maxsensor'
                    {
                     before(grammarAccess.getMaxSensorAccess().getMaxsensorKeyword_0_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMaxSensorAccess().getMaxsensorKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemperatureSensor.g:205:2: ( 'maxsensors' )
                    {
                    // InternalTemperatureSensor.g:205:2: ( 'maxsensors' )
                    // InternalTemperatureSensor.g:206:3: 'maxsensors'
                    {
                     before(grammarAccess.getMaxSensorAccess().getMaxsensorsKeyword_0_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMaxSensorAccess().getMaxsensorsKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__Alternatives_0_0"


    // $ANTLR start "rule__MaxSensor__Alternatives_0_1_1"
    // InternalTemperatureSensor.g:215:1: rule__MaxSensor__Alternatives_0_1_1 : ( ( 'sensor' ) | ( 'sensors' ) );
    public final void rule__MaxSensor__Alternatives_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:219:1: ( ( 'sensor' ) | ( 'sensors' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTemperatureSensor.g:220:2: ( 'sensor' )
                    {
                    // InternalTemperatureSensor.g:220:2: ( 'sensor' )
                    // InternalTemperatureSensor.g:221:3: 'sensor'
                    {
                     before(grammarAccess.getMaxSensorAccess().getSensorKeyword_0_1_1_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMaxSensorAccess().getSensorKeyword_0_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemperatureSensor.g:226:2: ( 'sensors' )
                    {
                    // InternalTemperatureSensor.g:226:2: ( 'sensors' )
                    // InternalTemperatureSensor.g:227:3: 'sensors'
                    {
                     before(grammarAccess.getMaxSensorAccess().getSensorsKeyword_0_1_1_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getMaxSensorAccess().getSensorsKeyword_0_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__Alternatives_0_1_1"


    // $ANTLR start "rule__SampleRate__Alternatives_0"
    // InternalTemperatureSensor.g:236:1: rule__SampleRate__Alternatives_0 : ( ( 'samplerate' ) | ( ( rule__SampleRate__Group_0_1__0 ) ) );
    public final void rule__SampleRate__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:240:1: ( ( 'samplerate' ) | ( ( rule__SampleRate__Group_0_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTemperatureSensor.g:241:2: ( 'samplerate' )
                    {
                    // InternalTemperatureSensor.g:241:2: ( 'samplerate' )
                    // InternalTemperatureSensor.g:242:3: 'samplerate'
                    {
                     before(grammarAccess.getSampleRateAccess().getSamplerateKeyword_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getSampleRateAccess().getSamplerateKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTemperatureSensor.g:247:2: ( ( rule__SampleRate__Group_0_1__0 ) )
                    {
                    // InternalTemperatureSensor.g:247:2: ( ( rule__SampleRate__Group_0_1__0 ) )
                    // InternalTemperatureSensor.g:248:3: ( rule__SampleRate__Group_0_1__0 )
                    {
                     before(grammarAccess.getSampleRateAccess().getGroup_0_1()); 
                    // InternalTemperatureSensor.g:249:3: ( rule__SampleRate__Group_0_1__0 )
                    // InternalTemperatureSensor.g:249:4: rule__SampleRate__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SampleRate__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSampleRateAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampleRate__Alternatives_0"


    // $ANTLR start "rule__Device__Group__0"
    // InternalTemperatureSensor.g:257:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:261:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalTemperatureSensor.g:262:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalTemperatureSensor.g:269:1: rule__Device__Group__0__Impl : ( 'device' ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:273:1: ( ( 'device' ) )
            // InternalTemperatureSensor.g:274:1: ( 'device' )
            {
            // InternalTemperatureSensor.g:274:1: ( 'device' )
            // InternalTemperatureSensor.g:275:2: 'device'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDeviceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalTemperatureSensor.g:284:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:288:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalTemperatureSensor.g:289:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalTemperatureSensor.g:296:1: rule__Device__Group__1__Impl : ( ( rule__Device__NameAssignment_1 ) ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:300:1: ( ( ( rule__Device__NameAssignment_1 ) ) )
            // InternalTemperatureSensor.g:301:1: ( ( rule__Device__NameAssignment_1 ) )
            {
            // InternalTemperatureSensor.g:301:1: ( ( rule__Device__NameAssignment_1 ) )
            // InternalTemperatureSensor.g:302:2: ( rule__Device__NameAssignment_1 )
            {
             before(grammarAccess.getDeviceAccess().getNameAssignment_1()); 
            // InternalTemperatureSensor.g:303:2: ( rule__Device__NameAssignment_1 )
            // InternalTemperatureSensor.g:303:3: rule__Device__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // InternalTemperatureSensor.g:311:1: rule__Device__Group__2 : rule__Device__Group__2__Impl ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:315:1: ( rule__Device__Group__2__Impl )
            // InternalTemperatureSensor.g:316:2: rule__Device__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // InternalTemperatureSensor.g:322:1: rule__Device__Group__2__Impl : ( ( rule__Device__UnorderedGroup_2 ) ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:326:1: ( ( ( rule__Device__UnorderedGroup_2 ) ) )
            // InternalTemperatureSensor.g:327:1: ( ( rule__Device__UnorderedGroup_2 ) )
            {
            // InternalTemperatureSensor.g:327:1: ( ( rule__Device__UnorderedGroup_2 ) )
            // InternalTemperatureSensor.g:328:2: ( rule__Device__UnorderedGroup_2 )
            {
             before(grammarAccess.getDeviceAccess().getUnorderedGroup_2()); 
            // InternalTemperatureSensor.g:329:2: ( rule__Device__UnorderedGroup_2 )
            // InternalTemperatureSensor.g:329:3: rule__Device__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__Device__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__BatchSize__Group__0"
    // InternalTemperatureSensor.g:338:1: rule__BatchSize__Group__0 : rule__BatchSize__Group__0__Impl rule__BatchSize__Group__1 ;
    public final void rule__BatchSize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:342:1: ( rule__BatchSize__Group__0__Impl rule__BatchSize__Group__1 )
            // InternalTemperatureSensor.g:343:2: rule__BatchSize__Group__0__Impl rule__BatchSize__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BatchSize__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BatchSize__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchSize__Group__0"


    // $ANTLR start "rule__BatchSize__Group__0__Impl"
    // InternalTemperatureSensor.g:350:1: rule__BatchSize__Group__0__Impl : ( ( rule__BatchSize__Alternatives_0 ) ) ;
    public final void rule__BatchSize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:354:1: ( ( ( rule__BatchSize__Alternatives_0 ) ) )
            // InternalTemperatureSensor.g:355:1: ( ( rule__BatchSize__Alternatives_0 ) )
            {
            // InternalTemperatureSensor.g:355:1: ( ( rule__BatchSize__Alternatives_0 ) )
            // InternalTemperatureSensor.g:356:2: ( rule__BatchSize__Alternatives_0 )
            {
             before(grammarAccess.getBatchSizeAccess().getAlternatives_0()); 
            // InternalTemperatureSensor.g:357:2: ( rule__BatchSize__Alternatives_0 )
            // InternalTemperatureSensor.g:357:3: rule__BatchSize__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__BatchSize__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBatchSizeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchSize__Group__0__Impl"


    // $ANTLR start "rule__BatchSize__Group__1"
    // InternalTemperatureSensor.g:365:1: rule__BatchSize__Group__1 : rule__BatchSize__Group__1__Impl ;
    public final void rule__BatchSize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:369:1: ( rule__BatchSize__Group__1__Impl )
            // InternalTemperatureSensor.g:370:2: rule__BatchSize__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BatchSize__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchSize__Group__1"


    // $ANTLR start "rule__BatchSize__Group__1__Impl"
    // InternalTemperatureSensor.g:376:1: rule__BatchSize__Group__1__Impl : ( ( rule__BatchSize__ValueAssignment_1 ) ) ;
    public final void rule__BatchSize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:380:1: ( ( ( rule__BatchSize__ValueAssignment_1 ) ) )
            // InternalTemperatureSensor.g:381:1: ( ( rule__BatchSize__ValueAssignment_1 ) )
            {
            // InternalTemperatureSensor.g:381:1: ( ( rule__BatchSize__ValueAssignment_1 ) )
            // InternalTemperatureSensor.g:382:2: ( rule__BatchSize__ValueAssignment_1 )
            {
             before(grammarAccess.getBatchSizeAccess().getValueAssignment_1()); 
            // InternalTemperatureSensor.g:383:2: ( rule__BatchSize__ValueAssignment_1 )
            // InternalTemperatureSensor.g:383:3: rule__BatchSize__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BatchSize__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBatchSizeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchSize__Group__1__Impl"


    // $ANTLR start "rule__BatchSize__Group_0_1__0"
    // InternalTemperatureSensor.g:392:1: rule__BatchSize__Group_0_1__0 : rule__BatchSize__Group_0_1__0__Impl rule__BatchSize__Group_0_1__1 ;
    public final void rule__BatchSize__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:396:1: ( rule__BatchSize__Group_0_1__0__Impl rule__BatchSize__Group_0_1__1 )
            // InternalTemperatureSensor.g:397:2: rule__BatchSize__Group_0_1__0__Impl rule__BatchSize__Group_0_1__1
            {
            pushFollow(FOLLOW_6);
            rule__BatchSize__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BatchSize__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchSize__Group_0_1__0"


    // $ANTLR start "rule__BatchSize__Group_0_1__0__Impl"
    // InternalTemperatureSensor.g:404:1: rule__BatchSize__Group_0_1__0__Impl : ( 'batch' ) ;
    public final void rule__BatchSize__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:408:1: ( ( 'batch' ) )
            // InternalTemperatureSensor.g:409:1: ( 'batch' )
            {
            // InternalTemperatureSensor.g:409:1: ( 'batch' )
            // InternalTemperatureSensor.g:410:2: 'batch'
            {
             before(grammarAccess.getBatchSizeAccess().getBatchKeyword_0_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBatchSizeAccess().getBatchKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchSize__Group_0_1__0__Impl"


    // $ANTLR start "rule__BatchSize__Group_0_1__1"
    // InternalTemperatureSensor.g:419:1: rule__BatchSize__Group_0_1__1 : rule__BatchSize__Group_0_1__1__Impl ;
    public final void rule__BatchSize__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:423:1: ( rule__BatchSize__Group_0_1__1__Impl )
            // InternalTemperatureSensor.g:424:2: rule__BatchSize__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BatchSize__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchSize__Group_0_1__1"


    // $ANTLR start "rule__BatchSize__Group_0_1__1__Impl"
    // InternalTemperatureSensor.g:430:1: rule__BatchSize__Group_0_1__1__Impl : ( 'size' ) ;
    public final void rule__BatchSize__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:434:1: ( ( 'size' ) )
            // InternalTemperatureSensor.g:435:1: ( 'size' )
            {
            // InternalTemperatureSensor.g:435:1: ( 'size' )
            // InternalTemperatureSensor.g:436:2: 'size'
            {
             before(grammarAccess.getBatchSizeAccess().getSizeKeyword_0_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBatchSizeAccess().getSizeKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchSize__Group_0_1__1__Impl"


    // $ANTLR start "rule__MaxSensor__Group__0"
    // InternalTemperatureSensor.g:446:1: rule__MaxSensor__Group__0 : rule__MaxSensor__Group__0__Impl rule__MaxSensor__Group__1 ;
    public final void rule__MaxSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:450:1: ( rule__MaxSensor__Group__0__Impl rule__MaxSensor__Group__1 )
            // InternalTemperatureSensor.g:451:2: rule__MaxSensor__Group__0__Impl rule__MaxSensor__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MaxSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__Group__0"


    // $ANTLR start "rule__MaxSensor__Group__0__Impl"
    // InternalTemperatureSensor.g:458:1: rule__MaxSensor__Group__0__Impl : ( ( rule__MaxSensor__Alternatives_0 ) ) ;
    public final void rule__MaxSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:462:1: ( ( ( rule__MaxSensor__Alternatives_0 ) ) )
            // InternalTemperatureSensor.g:463:1: ( ( rule__MaxSensor__Alternatives_0 ) )
            {
            // InternalTemperatureSensor.g:463:1: ( ( rule__MaxSensor__Alternatives_0 ) )
            // InternalTemperatureSensor.g:464:2: ( rule__MaxSensor__Alternatives_0 )
            {
             before(grammarAccess.getMaxSensorAccess().getAlternatives_0()); 
            // InternalTemperatureSensor.g:465:2: ( rule__MaxSensor__Alternatives_0 )
            // InternalTemperatureSensor.g:465:3: rule__MaxSensor__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__MaxSensor__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMaxSensorAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__Group__0__Impl"


    // $ANTLR start "rule__MaxSensor__Group__1"
    // InternalTemperatureSensor.g:473:1: rule__MaxSensor__Group__1 : rule__MaxSensor__Group__1__Impl ;
    public final void rule__MaxSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:477:1: ( rule__MaxSensor__Group__1__Impl )
            // InternalTemperatureSensor.g:478:2: rule__MaxSensor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxSensor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__Group__1"


    // $ANTLR start "rule__MaxSensor__Group__1__Impl"
    // InternalTemperatureSensor.g:484:1: rule__MaxSensor__Group__1__Impl : ( ( rule__MaxSensor__ValueAssignment_1 ) ) ;
    public final void rule__MaxSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:488:1: ( ( ( rule__MaxSensor__ValueAssignment_1 ) ) )
            // InternalTemperatureSensor.g:489:1: ( ( rule__MaxSensor__ValueAssignment_1 ) )
            {
            // InternalTemperatureSensor.g:489:1: ( ( rule__MaxSensor__ValueAssignment_1 ) )
            // InternalTemperatureSensor.g:490:2: ( rule__MaxSensor__ValueAssignment_1 )
            {
             before(grammarAccess.getMaxSensorAccess().getValueAssignment_1()); 
            // InternalTemperatureSensor.g:491:2: ( rule__MaxSensor__ValueAssignment_1 )
            // InternalTemperatureSensor.g:491:3: rule__MaxSensor__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MaxSensor__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMaxSensorAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__Group__1__Impl"


    // $ANTLR start "rule__MaxSensor__Group_0_1__0"
    // InternalTemperatureSensor.g:500:1: rule__MaxSensor__Group_0_1__0 : rule__MaxSensor__Group_0_1__0__Impl rule__MaxSensor__Group_0_1__1 ;
    public final void rule__MaxSensor__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:504:1: ( rule__MaxSensor__Group_0_1__0__Impl rule__MaxSensor__Group_0_1__1 )
            // InternalTemperatureSensor.g:505:2: rule__MaxSensor__Group_0_1__0__Impl rule__MaxSensor__Group_0_1__1
            {
            pushFollow(FOLLOW_7);
            rule__MaxSensor__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MaxSensor__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__Group_0_1__0"


    // $ANTLR start "rule__MaxSensor__Group_0_1__0__Impl"
    // InternalTemperatureSensor.g:512:1: rule__MaxSensor__Group_0_1__0__Impl : ( 'max' ) ;
    public final void rule__MaxSensor__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:516:1: ( ( 'max' ) )
            // InternalTemperatureSensor.g:517:1: ( 'max' )
            {
            // InternalTemperatureSensor.g:517:1: ( 'max' )
            // InternalTemperatureSensor.g:518:2: 'max'
            {
             before(grammarAccess.getMaxSensorAccess().getMaxKeyword_0_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMaxSensorAccess().getMaxKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__Group_0_1__0__Impl"


    // $ANTLR start "rule__MaxSensor__Group_0_1__1"
    // InternalTemperatureSensor.g:527:1: rule__MaxSensor__Group_0_1__1 : rule__MaxSensor__Group_0_1__1__Impl ;
    public final void rule__MaxSensor__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:531:1: ( rule__MaxSensor__Group_0_1__1__Impl )
            // InternalTemperatureSensor.g:532:2: rule__MaxSensor__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MaxSensor__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__Group_0_1__1"


    // $ANTLR start "rule__MaxSensor__Group_0_1__1__Impl"
    // InternalTemperatureSensor.g:538:1: rule__MaxSensor__Group_0_1__1__Impl : ( ( rule__MaxSensor__Alternatives_0_1_1 ) ) ;
    public final void rule__MaxSensor__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:542:1: ( ( ( rule__MaxSensor__Alternatives_0_1_1 ) ) )
            // InternalTemperatureSensor.g:543:1: ( ( rule__MaxSensor__Alternatives_0_1_1 ) )
            {
            // InternalTemperatureSensor.g:543:1: ( ( rule__MaxSensor__Alternatives_0_1_1 ) )
            // InternalTemperatureSensor.g:544:2: ( rule__MaxSensor__Alternatives_0_1_1 )
            {
             before(grammarAccess.getMaxSensorAccess().getAlternatives_0_1_1()); 
            // InternalTemperatureSensor.g:545:2: ( rule__MaxSensor__Alternatives_0_1_1 )
            // InternalTemperatureSensor.g:545:3: rule__MaxSensor__Alternatives_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MaxSensor__Alternatives_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMaxSensorAccess().getAlternatives_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__Group_0_1__1__Impl"


    // $ANTLR start "rule__SampleRate__Group__0"
    // InternalTemperatureSensor.g:554:1: rule__SampleRate__Group__0 : rule__SampleRate__Group__0__Impl rule__SampleRate__Group__1 ;
    public final void rule__SampleRate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:558:1: ( rule__SampleRate__Group__0__Impl rule__SampleRate__Group__1 )
            // InternalTemperatureSensor.g:559:2: rule__SampleRate__Group__0__Impl rule__SampleRate__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SampleRate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SampleRate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampleRate__Group__0"


    // $ANTLR start "rule__SampleRate__Group__0__Impl"
    // InternalTemperatureSensor.g:566:1: rule__SampleRate__Group__0__Impl : ( ( rule__SampleRate__Alternatives_0 ) ) ;
    public final void rule__SampleRate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:570:1: ( ( ( rule__SampleRate__Alternatives_0 ) ) )
            // InternalTemperatureSensor.g:571:1: ( ( rule__SampleRate__Alternatives_0 ) )
            {
            // InternalTemperatureSensor.g:571:1: ( ( rule__SampleRate__Alternatives_0 ) )
            // InternalTemperatureSensor.g:572:2: ( rule__SampleRate__Alternatives_0 )
            {
             before(grammarAccess.getSampleRateAccess().getAlternatives_0()); 
            // InternalTemperatureSensor.g:573:2: ( rule__SampleRate__Alternatives_0 )
            // InternalTemperatureSensor.g:573:3: rule__SampleRate__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__SampleRate__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSampleRateAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampleRate__Group__0__Impl"


    // $ANTLR start "rule__SampleRate__Group__1"
    // InternalTemperatureSensor.g:581:1: rule__SampleRate__Group__1 : rule__SampleRate__Group__1__Impl ;
    public final void rule__SampleRate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:585:1: ( rule__SampleRate__Group__1__Impl )
            // InternalTemperatureSensor.g:586:2: rule__SampleRate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SampleRate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampleRate__Group__1"


    // $ANTLR start "rule__SampleRate__Group__1__Impl"
    // InternalTemperatureSensor.g:592:1: rule__SampleRate__Group__1__Impl : ( ( rule__SampleRate__ValueAssignment_1 ) ) ;
    public final void rule__SampleRate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:596:1: ( ( ( rule__SampleRate__ValueAssignment_1 ) ) )
            // InternalTemperatureSensor.g:597:1: ( ( rule__SampleRate__ValueAssignment_1 ) )
            {
            // InternalTemperatureSensor.g:597:1: ( ( rule__SampleRate__ValueAssignment_1 ) )
            // InternalTemperatureSensor.g:598:2: ( rule__SampleRate__ValueAssignment_1 )
            {
             before(grammarAccess.getSampleRateAccess().getValueAssignment_1()); 
            // InternalTemperatureSensor.g:599:2: ( rule__SampleRate__ValueAssignment_1 )
            // InternalTemperatureSensor.g:599:3: rule__SampleRate__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SampleRate__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSampleRateAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampleRate__Group__1__Impl"


    // $ANTLR start "rule__SampleRate__Group_0_1__0"
    // InternalTemperatureSensor.g:608:1: rule__SampleRate__Group_0_1__0 : rule__SampleRate__Group_0_1__0__Impl rule__SampleRate__Group_0_1__1 ;
    public final void rule__SampleRate__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:612:1: ( rule__SampleRate__Group_0_1__0__Impl rule__SampleRate__Group_0_1__1 )
            // InternalTemperatureSensor.g:613:2: rule__SampleRate__Group_0_1__0__Impl rule__SampleRate__Group_0_1__1
            {
            pushFollow(FOLLOW_8);
            rule__SampleRate__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SampleRate__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampleRate__Group_0_1__0"


    // $ANTLR start "rule__SampleRate__Group_0_1__0__Impl"
    // InternalTemperatureSensor.g:620:1: rule__SampleRate__Group_0_1__0__Impl : ( 'sample' ) ;
    public final void rule__SampleRate__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:624:1: ( ( 'sample' ) )
            // InternalTemperatureSensor.g:625:1: ( 'sample' )
            {
            // InternalTemperatureSensor.g:625:1: ( 'sample' )
            // InternalTemperatureSensor.g:626:2: 'sample'
            {
             before(grammarAccess.getSampleRateAccess().getSampleKeyword_0_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSampleRateAccess().getSampleKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampleRate__Group_0_1__0__Impl"


    // $ANTLR start "rule__SampleRate__Group_0_1__1"
    // InternalTemperatureSensor.g:635:1: rule__SampleRate__Group_0_1__1 : rule__SampleRate__Group_0_1__1__Impl ;
    public final void rule__SampleRate__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:639:1: ( rule__SampleRate__Group_0_1__1__Impl )
            // InternalTemperatureSensor.g:640:2: rule__SampleRate__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SampleRate__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampleRate__Group_0_1__1"


    // $ANTLR start "rule__SampleRate__Group_0_1__1__Impl"
    // InternalTemperatureSensor.g:646:1: rule__SampleRate__Group_0_1__1__Impl : ( 'rate' ) ;
    public final void rule__SampleRate__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:650:1: ( ( 'rate' ) )
            // InternalTemperatureSensor.g:651:1: ( 'rate' )
            {
            // InternalTemperatureSensor.g:651:1: ( 'rate' )
            // InternalTemperatureSensor.g:652:2: 'rate'
            {
             before(grammarAccess.getSampleRateAccess().getRateKeyword_0_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSampleRateAccess().getRateKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampleRate__Group_0_1__1__Impl"


    // $ANTLR start "rule__Device__UnorderedGroup_2"
    // InternalTemperatureSensor.g:662:1: rule__Device__UnorderedGroup_2 : rule__Device__UnorderedGroup_2__0 {...}?;
    public final void rule__Device__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDeviceAccess().getUnorderedGroup_2());
        	
        try {
            // InternalTemperatureSensor.g:667:1: ( rule__Device__UnorderedGroup_2__0 {...}?)
            // InternalTemperatureSensor.g:668:2: rule__Device__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Device__UnorderedGroup_2__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDeviceAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rule__Device__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getDeviceAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getDeviceAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__UnorderedGroup_2"


    // $ANTLR start "rule__Device__UnorderedGroup_2__Impl"
    // InternalTemperatureSensor.g:676:1: rule__Device__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Device__BatchSizeAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Device__MaxSensorAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Device__SampleRateAssignment_2_2 ) ) ) ) ) ;
    public final void rule__Device__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTemperatureSensor.g:681:1: ( ( ({...}? => ( ( ( rule__Device__BatchSizeAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Device__MaxSensorAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Device__SampleRateAssignment_2_2 ) ) ) ) ) )
            // InternalTemperatureSensor.g:682:3: ( ({...}? => ( ( ( rule__Device__BatchSizeAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Device__MaxSensorAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Device__SampleRateAssignment_2_2 ) ) ) ) )
            {
            // InternalTemperatureSensor.g:682:3: ( ({...}? => ( ( ( rule__Device__BatchSizeAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Device__MaxSensorAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__Device__SampleRateAssignment_2_2 ) ) ) ) )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( ( LA6_0 == 11 || LA6_0 == 18 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 0) ) {
                alt6=1;
            }
            else if ( ( LA6_0 >= 12 && LA6_0 <= 13 || LA6_0 == 20 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 1) ) {
                alt6=2;
            }
            else if ( ( LA6_0 == 16 || LA6_0 == 21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 2) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTemperatureSensor.g:683:3: ({...}? => ( ( ( rule__Device__BatchSizeAssignment_2_0 ) ) ) )
                    {
                    // InternalTemperatureSensor.g:683:3: ({...}? => ( ( ( rule__Device__BatchSizeAssignment_2_0 ) ) ) )
                    // InternalTemperatureSensor.g:684:4: {...}? => ( ( ( rule__Device__BatchSizeAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Device__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalTemperatureSensor.g:684:102: ( ( ( rule__Device__BatchSizeAssignment_2_0 ) ) )
                    // InternalTemperatureSensor.g:685:5: ( ( rule__Device__BatchSizeAssignment_2_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTemperatureSensor.g:691:5: ( ( rule__Device__BatchSizeAssignment_2_0 ) )
                    // InternalTemperatureSensor.g:692:6: ( rule__Device__BatchSizeAssignment_2_0 )
                    {
                     before(grammarAccess.getDeviceAccess().getBatchSizeAssignment_2_0()); 
                    // InternalTemperatureSensor.g:693:6: ( rule__Device__BatchSizeAssignment_2_0 )
                    // InternalTemperatureSensor.g:693:7: rule__Device__BatchSizeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__BatchSizeAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeviceAccess().getBatchSizeAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemperatureSensor.g:698:3: ({...}? => ( ( ( rule__Device__MaxSensorAssignment_2_1 ) ) ) )
                    {
                    // InternalTemperatureSensor.g:698:3: ({...}? => ( ( ( rule__Device__MaxSensorAssignment_2_1 ) ) ) )
                    // InternalTemperatureSensor.g:699:4: {...}? => ( ( ( rule__Device__MaxSensorAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Device__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalTemperatureSensor.g:699:102: ( ( ( rule__Device__MaxSensorAssignment_2_1 ) ) )
                    // InternalTemperatureSensor.g:700:5: ( ( rule__Device__MaxSensorAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTemperatureSensor.g:706:5: ( ( rule__Device__MaxSensorAssignment_2_1 ) )
                    // InternalTemperatureSensor.g:707:6: ( rule__Device__MaxSensorAssignment_2_1 )
                    {
                     before(grammarAccess.getDeviceAccess().getMaxSensorAssignment_2_1()); 
                    // InternalTemperatureSensor.g:708:6: ( rule__Device__MaxSensorAssignment_2_1 )
                    // InternalTemperatureSensor.g:708:7: rule__Device__MaxSensorAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__MaxSensorAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeviceAccess().getMaxSensorAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTemperatureSensor.g:713:3: ({...}? => ( ( ( rule__Device__SampleRateAssignment_2_2 ) ) ) )
                    {
                    // InternalTemperatureSensor.g:713:3: ({...}? => ( ( ( rule__Device__SampleRateAssignment_2_2 ) ) ) )
                    // InternalTemperatureSensor.g:714:4: {...}? => ( ( ( rule__Device__SampleRateAssignment_2_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Device__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalTemperatureSensor.g:714:102: ( ( ( rule__Device__SampleRateAssignment_2_2 ) ) )
                    // InternalTemperatureSensor.g:715:5: ( ( rule__Device__SampleRateAssignment_2_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 2);
                    				

                    					selected = true;
                    				
                    // InternalTemperatureSensor.g:721:5: ( ( rule__Device__SampleRateAssignment_2_2 ) )
                    // InternalTemperatureSensor.g:722:6: ( rule__Device__SampleRateAssignment_2_2 )
                    {
                     before(grammarAccess.getDeviceAccess().getSampleRateAssignment_2_2()); 
                    // InternalTemperatureSensor.g:723:6: ( rule__Device__SampleRateAssignment_2_2 )
                    // InternalTemperatureSensor.g:723:7: rule__Device__SampleRateAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__SampleRateAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeviceAccess().getSampleRateAssignment_2_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDeviceAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Device__UnorderedGroup_2__0"
    // InternalTemperatureSensor.g:736:1: rule__Device__UnorderedGroup_2__0 : rule__Device__UnorderedGroup_2__Impl ( rule__Device__UnorderedGroup_2__1 )? ;
    public final void rule__Device__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:740:1: ( rule__Device__UnorderedGroup_2__Impl ( rule__Device__UnorderedGroup_2__1 )? )
            // InternalTemperatureSensor.g:741:2: rule__Device__UnorderedGroup_2__Impl ( rule__Device__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_9);
            rule__Device__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalTemperatureSensor.g:742:2: ( rule__Device__UnorderedGroup_2__1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ( LA7_0 == 11 || LA7_0 == 18 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 0) ) {
                alt7=1;
            }
            else if ( ( LA7_0 >= 12 && LA7_0 <= 13 || LA7_0 == 20 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 1) ) {
                alt7=1;
            }
            else if ( ( LA7_0 == 16 || LA7_0 == 21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 2) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTemperatureSensor.g:742:2: rule__Device__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__UnorderedGroup_2__0"


    // $ANTLR start "rule__Device__UnorderedGroup_2__1"
    // InternalTemperatureSensor.g:748:1: rule__Device__UnorderedGroup_2__1 : rule__Device__UnorderedGroup_2__Impl ( rule__Device__UnorderedGroup_2__2 )? ;
    public final void rule__Device__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:752:1: ( rule__Device__UnorderedGroup_2__Impl ( rule__Device__UnorderedGroup_2__2 )? )
            // InternalTemperatureSensor.g:753:2: rule__Device__UnorderedGroup_2__Impl ( rule__Device__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_9);
            rule__Device__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalTemperatureSensor.g:754:2: ( rule__Device__UnorderedGroup_2__2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ( LA8_0 == 11 || LA8_0 == 18 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 0) ) {
                alt8=1;
            }
            else if ( ( LA8_0 >= 12 && LA8_0 <= 13 || LA8_0 == 20 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 1) ) {
                alt8=1;
            }
            else if ( ( LA8_0 == 16 || LA8_0 == 21 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDeviceAccess().getUnorderedGroup_2(), 2) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTemperatureSensor.g:754:2: rule__Device__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__UnorderedGroup_2__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__UnorderedGroup_2__1"


    // $ANTLR start "rule__Device__UnorderedGroup_2__2"
    // InternalTemperatureSensor.g:760:1: rule__Device__UnorderedGroup_2__2 : rule__Device__UnorderedGroup_2__Impl ;
    public final void rule__Device__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:764:1: ( rule__Device__UnorderedGroup_2__Impl )
            // InternalTemperatureSensor.g:765:2: rule__Device__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__UnorderedGroup_2__2"


    // $ANTLR start "rule__Device__NameAssignment_1"
    // InternalTemperatureSensor.g:772:1: rule__Device__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Device__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:776:1: ( ( RULE_ID ) )
            // InternalTemperatureSensor.g:777:2: ( RULE_ID )
            {
            // InternalTemperatureSensor.g:777:2: ( RULE_ID )
            // InternalTemperatureSensor.g:778:3: RULE_ID
            {
             before(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__NameAssignment_1"


    // $ANTLR start "rule__Device__BatchSizeAssignment_2_0"
    // InternalTemperatureSensor.g:787:1: rule__Device__BatchSizeAssignment_2_0 : ( ruleBatchSize ) ;
    public final void rule__Device__BatchSizeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:791:1: ( ( ruleBatchSize ) )
            // InternalTemperatureSensor.g:792:2: ( ruleBatchSize )
            {
            // InternalTemperatureSensor.g:792:2: ( ruleBatchSize )
            // InternalTemperatureSensor.g:793:3: ruleBatchSize
            {
             before(grammarAccess.getDeviceAccess().getBatchSizeBatchSizeParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBatchSize();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getBatchSizeBatchSizeParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__BatchSizeAssignment_2_0"


    // $ANTLR start "rule__Device__MaxSensorAssignment_2_1"
    // InternalTemperatureSensor.g:802:1: rule__Device__MaxSensorAssignment_2_1 : ( ruleMaxSensor ) ;
    public final void rule__Device__MaxSensorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:806:1: ( ( ruleMaxSensor ) )
            // InternalTemperatureSensor.g:807:2: ( ruleMaxSensor )
            {
            // InternalTemperatureSensor.g:807:2: ( ruleMaxSensor )
            // InternalTemperatureSensor.g:808:3: ruleMaxSensor
            {
             before(grammarAccess.getDeviceAccess().getMaxSensorMaxSensorParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMaxSensor();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getMaxSensorMaxSensorParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__MaxSensorAssignment_2_1"


    // $ANTLR start "rule__Device__SampleRateAssignment_2_2"
    // InternalTemperatureSensor.g:817:1: rule__Device__SampleRateAssignment_2_2 : ( ruleSampleRate ) ;
    public final void rule__Device__SampleRateAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:821:1: ( ( ruleSampleRate ) )
            // InternalTemperatureSensor.g:822:2: ( ruleSampleRate )
            {
            // InternalTemperatureSensor.g:822:2: ( ruleSampleRate )
            // InternalTemperatureSensor.g:823:3: ruleSampleRate
            {
             before(grammarAccess.getDeviceAccess().getSampleRateSampleRateParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSampleRate();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getSampleRateSampleRateParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__SampleRateAssignment_2_2"


    // $ANTLR start "rule__BatchSize__ValueAssignment_1"
    // InternalTemperatureSensor.g:832:1: rule__BatchSize__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__BatchSize__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:836:1: ( ( RULE_INT ) )
            // InternalTemperatureSensor.g:837:2: ( RULE_INT )
            {
            // InternalTemperatureSensor.g:837:2: ( RULE_INT )
            // InternalTemperatureSensor.g:838:3: RULE_INT
            {
             before(grammarAccess.getBatchSizeAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBatchSizeAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BatchSize__ValueAssignment_1"


    // $ANTLR start "rule__MaxSensor__ValueAssignment_1"
    // InternalTemperatureSensor.g:847:1: rule__MaxSensor__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__MaxSensor__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:851:1: ( ( RULE_INT ) )
            // InternalTemperatureSensor.g:852:2: ( RULE_INT )
            {
            // InternalTemperatureSensor.g:852:2: ( RULE_INT )
            // InternalTemperatureSensor.g:853:3: RULE_INT
            {
             before(grammarAccess.getMaxSensorAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMaxSensorAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxSensor__ValueAssignment_1"


    // $ANTLR start "rule__SampleRate__ValueAssignment_1"
    // InternalTemperatureSensor.g:862:1: rule__SampleRate__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SampleRate__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTemperatureSensor.g:866:1: ( ( RULE_INT ) )
            // InternalTemperatureSensor.g:867:2: ( RULE_INT )
            {
            // InternalTemperatureSensor.g:867:2: ( RULE_INT )
            // InternalTemperatureSensor.g:868:3: RULE_INT
            {
             before(grammarAccess.getSampleRateAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSampleRateAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SampleRate__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000353800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000353802L});

}
