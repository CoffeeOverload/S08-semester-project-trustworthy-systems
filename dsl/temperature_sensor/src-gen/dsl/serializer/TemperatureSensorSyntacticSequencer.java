/*
 * generated by Xtext 2.30.0
 */
package dsl.serializer;

import com.google.inject.Inject;
import dsl.services.TemperatureSensorGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class TemperatureSensorSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TemperatureSensorGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BatchSize_BatchsizeKeyword_0_0_or___BatchKeyword_0_1_0_SizeKeyword_0_1_1__;
	protected AbstractElementAlias match_MaxSensor_MaxsensorKeyword_0_0_0_or_MaxsensorsKeyword_0_0_1_or___MaxKeyword_0_1_0___SensorKeyword_0_1_1_0_or_SensorsKeyword_0_1_1_1____;
	protected AbstractElementAlias match_SampleRate_SamplerateKeyword_0_0_or___SampleKeyword_0_1_0_RateKeyword_0_1_1__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TemperatureSensorGrammarAccess) access;
		match_BatchSize_BatchsizeKeyword_0_0_or___BatchKeyword_0_1_0_SizeKeyword_0_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getBatchSizeAccess().getBatchKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getBatchSizeAccess().getSizeKeyword_0_1_1())), new TokenAlias(false, false, grammarAccess.getBatchSizeAccess().getBatchsizeKeyword_0_0()));
		match_MaxSensor_MaxsensorKeyword_0_0_0_or_MaxsensorsKeyword_0_0_1_or___MaxKeyword_0_1_0___SensorKeyword_0_1_1_0_or_SensorsKeyword_0_1_1_1____ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMaxSensorAccess().getMaxKeyword_0_1_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMaxSensorAccess().getSensorKeyword_0_1_1_0()), new TokenAlias(false, false, grammarAccess.getMaxSensorAccess().getSensorsKeyword_0_1_1_1()))), new TokenAlias(false, false, grammarAccess.getMaxSensorAccess().getMaxsensorKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getMaxSensorAccess().getMaxsensorsKeyword_0_0_1()));
		match_SampleRate_SamplerateKeyword_0_0_or___SampleKeyword_0_1_0_RateKeyword_0_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSampleRateAccess().getSampleKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getSampleRateAccess().getRateKeyword_0_1_1())), new TokenAlias(false, false, grammarAccess.getSampleRateAccess().getSamplerateKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_BatchSize_BatchsizeKeyword_0_0_or___BatchKeyword_0_1_0_SizeKeyword_0_1_1__.equals(syntax))
				emit_BatchSize_BatchsizeKeyword_0_0_or___BatchKeyword_0_1_0_SizeKeyword_0_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MaxSensor_MaxsensorKeyword_0_0_0_or_MaxsensorsKeyword_0_0_1_or___MaxKeyword_0_1_0___SensorKeyword_0_1_1_0_or_SensorsKeyword_0_1_1_1____.equals(syntax))
				emit_MaxSensor_MaxsensorKeyword_0_0_0_or_MaxsensorsKeyword_0_0_1_or___MaxKeyword_0_1_0___SensorKeyword_0_1_1_0_or_SensorsKeyword_0_1_1_1____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SampleRate_SamplerateKeyword_0_0_or___SampleKeyword_0_1_0_RateKeyword_0_1_1__.equals(syntax))
				emit_SampleRate_SamplerateKeyword_0_0_or___SampleKeyword_0_1_0_RateKeyword_0_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'batchsize' | ('batch' 'size')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) value=INT
	 
	 * </pre>
	 */
	protected void emit_BatchSize_BatchsizeKeyword_0_0_or___BatchKeyword_0_1_0_SizeKeyword_0_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'maxsensor' | 'maxsensors' | ('max' ('sensor' | 'sensors'))
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) value=INT
	 
	 * </pre>
	 */
	protected void emit_MaxSensor_MaxsensorKeyword_0_0_0_or_MaxsensorsKeyword_0_0_1_or___MaxKeyword_0_1_0___SensorKeyword_0_1_1_0_or_SensorsKeyword_0_1_1_1____(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'samplerate' | ('sample' 'rate')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) value=INT
	 
	 * </pre>
	 */
	protected void emit_SampleRate_SamplerateKeyword_0_0_or___SampleKeyword_0_1_0_RateKeyword_0_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
