package de.htwg.mdsd.playgenmodel.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.htwg.mdsd.playgenmodel.services.PlayMorphiaModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlayMorphiaModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'morphiamodel'", "'{'", "'}'", "'many'", "':'", "'datatype'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalPlayMorphiaModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlayMorphiaModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlayMorphiaModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPlayMorphiaModel.g"; }



     	private PlayMorphiaModelGrammarAccess grammarAccess;

        public InternalPlayMorphiaModelParser(TokenStream input, PlayMorphiaModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected PlayMorphiaModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalPlayMorphiaModel.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalPlayMorphiaModel.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalPlayMorphiaModel.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalPlayMorphiaModel.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleType ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalPlayMorphiaModel.g:77:2: ( ( (lv_elements_0_0= ruleType ) )* )
            // InternalPlayMorphiaModel.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            {
            // InternalPlayMorphiaModel.g:78:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPlayMorphiaModel.g:79:3: (lv_elements_0_0= ruleType )
            	    {
            	    // InternalPlayMorphiaModel.g:79:3: (lv_elements_0_0= ruleType )
            	    // InternalPlayMorphiaModel.g:80:4: lv_elements_0_0= ruleType
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"de.htwg.mdsd.playgenmodel.PlayMorphiaModel.Type");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleMorphiaModel"
    // InternalPlayMorphiaModel.g:100:1: entryRuleMorphiaModel returns [EObject current=null] : iv_ruleMorphiaModel= ruleMorphiaModel EOF ;
    public final EObject entryRuleMorphiaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMorphiaModel = null;


        try {
            // InternalPlayMorphiaModel.g:100:53: (iv_ruleMorphiaModel= ruleMorphiaModel EOF )
            // InternalPlayMorphiaModel.g:101:2: iv_ruleMorphiaModel= ruleMorphiaModel EOF
            {
             newCompositeNode(grammarAccess.getMorphiaModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMorphiaModel=ruleMorphiaModel();

            state._fsp--;

             current =iv_ruleMorphiaModel; 
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
    // $ANTLR end "entryRuleMorphiaModel"


    // $ANTLR start "ruleMorphiaModel"
    // InternalPlayMorphiaModel.g:107:1: ruleMorphiaModel returns [EObject current=null] : (otherlv_0= 'morphiamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleMorphiaModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalPlayMorphiaModel.g:113:2: ( (otherlv_0= 'morphiamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalPlayMorphiaModel.g:114:2: (otherlv_0= 'morphiamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalPlayMorphiaModel.g:114:2: (otherlv_0= 'morphiamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalPlayMorphiaModel.g:115:3: otherlv_0= 'morphiamodel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMorphiaModelAccess().getMorphiamodelKeyword_0());
            		
            // InternalPlayMorphiaModel.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPlayMorphiaModel.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPlayMorphiaModel.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalPlayMorphiaModel.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMorphiaModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMorphiaModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMorphiaModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPlayMorphiaModel.g:141:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPlayMorphiaModel.g:142:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalPlayMorphiaModel.g:142:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalPlayMorphiaModel.g:143:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getMorphiaModelAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMorphiaModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"de.htwg.mdsd.playgenmodel.PlayMorphiaModel.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMorphiaModelAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMorphiaModel"


    // $ANTLR start "entryRuleAttribute"
    // InternalPlayMorphiaModel.g:168:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalPlayMorphiaModel.g:168:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalPlayMorphiaModel.g:169:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalPlayMorphiaModel.g:175:1: ruleAttribute returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPlayMorphiaModel.g:181:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalPlayMorphiaModel.g:182:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalPlayMorphiaModel.g:182:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalPlayMorphiaModel.g:183:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // InternalPlayMorphiaModel.g:183:3: ( (lv_many_0_0= 'many' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPlayMorphiaModel.g:184:4: (lv_many_0_0= 'many' )
                    {
                    // InternalPlayMorphiaModel.g:184:4: (lv_many_0_0= 'many' )
                    // InternalPlayMorphiaModel.g:185:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_4); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getAttributeAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalPlayMorphiaModel.g:197:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPlayMorphiaModel.g:198:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPlayMorphiaModel.g:198:4: (lv_name_1_0= RULE_ID )
            // InternalPlayMorphiaModel.g:199:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalPlayMorphiaModel.g:219:3: ( (otherlv_3= RULE_ID ) )
            // InternalPlayMorphiaModel.g:220:4: (otherlv_3= RULE_ID )
            {
            // InternalPlayMorphiaModel.g:220:4: (otherlv_3= RULE_ID )
            // InternalPlayMorphiaModel.g:221:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_3_0());
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalPlayMorphiaModel.g:236:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalPlayMorphiaModel.g:236:45: (iv_ruleType= ruleType EOF )
            // InternalPlayMorphiaModel.g:237:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalPlayMorphiaModel.g:243:1: ruleType returns [EObject current=null] : (this_DataType_0= ruleDataType | this_MorphiaModel_1= ruleMorphiaModel ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_MorphiaModel_1 = null;



        	enterRule();

        try {
            // InternalPlayMorphiaModel.g:249:2: ( (this_DataType_0= ruleDataType | this_MorphiaModel_1= ruleMorphiaModel ) )
            // InternalPlayMorphiaModel.g:250:2: (this_DataType_0= ruleDataType | this_MorphiaModel_1= ruleMorphiaModel )
            {
            // InternalPlayMorphiaModel.g:250:2: (this_DataType_0= ruleDataType | this_MorphiaModel_1= ruleMorphiaModel )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPlayMorphiaModel.g:251:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPlayMorphiaModel.g:260:3: this_MorphiaModel_1= ruleMorphiaModel
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getMorphiaModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MorphiaModel_1=ruleMorphiaModel();

                    state._fsp--;


                    			current = this_MorphiaModel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalPlayMorphiaModel.g:272:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalPlayMorphiaModel.g:272:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalPlayMorphiaModel.g:273:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalPlayMorphiaModel.g:279:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalPlayMorphiaModel.g:285:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPlayMorphiaModel.g:286:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPlayMorphiaModel.g:286:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalPlayMorphiaModel.g:287:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalPlayMorphiaModel.g:291:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPlayMorphiaModel.g:292:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPlayMorphiaModel.g:292:4: (lv_name_1_0= RULE_ID )
            // InternalPlayMorphiaModel.g:293:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});

}