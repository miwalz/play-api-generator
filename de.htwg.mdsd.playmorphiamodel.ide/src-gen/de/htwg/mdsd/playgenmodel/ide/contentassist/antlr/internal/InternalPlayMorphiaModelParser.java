package de.htwg.mdsd.playgenmodel.ide.contentassist.antlr.internal;

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
import de.htwg.mdsd.playgenmodel.services.PlayMorphiaModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlayMorphiaModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'morphiamodel'", "'{'", "'}'", "':'", "'datatype'", "'many'"
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

    	public void setGrammarAccess(PlayMorphiaModelGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalPlayMorphiaModel.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:54:1: ( ruleDomainmodel EOF )
            // InternalPlayMorphiaModel.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalPlayMorphiaModel.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalPlayMorphiaModel.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalPlayMorphiaModel.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalPlayMorphiaModel.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalPlayMorphiaModel.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPlayMorphiaModel.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleMorphiaModel"
    // InternalPlayMorphiaModel.g:78:1: entryRuleMorphiaModel : ruleMorphiaModel EOF ;
    public final void entryRuleMorphiaModel() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:79:1: ( ruleMorphiaModel EOF )
            // InternalPlayMorphiaModel.g:80:1: ruleMorphiaModel EOF
            {
             before(grammarAccess.getMorphiaModelRule()); 
            pushFollow(FOLLOW_1);
            ruleMorphiaModel();

            state._fsp--;

             after(grammarAccess.getMorphiaModelRule()); 
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
    // $ANTLR end "entryRuleMorphiaModel"


    // $ANTLR start "ruleMorphiaModel"
    // InternalPlayMorphiaModel.g:87:1: ruleMorphiaModel : ( ( rule__MorphiaModel__Group__0 ) ) ;
    public final void ruleMorphiaModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:91:2: ( ( ( rule__MorphiaModel__Group__0 ) ) )
            // InternalPlayMorphiaModel.g:92:2: ( ( rule__MorphiaModel__Group__0 ) )
            {
            // InternalPlayMorphiaModel.g:92:2: ( ( rule__MorphiaModel__Group__0 ) )
            // InternalPlayMorphiaModel.g:93:3: ( rule__MorphiaModel__Group__0 )
            {
             before(grammarAccess.getMorphiaModelAccess().getGroup()); 
            // InternalPlayMorphiaModel.g:94:3: ( rule__MorphiaModel__Group__0 )
            // InternalPlayMorphiaModel.g:94:4: rule__MorphiaModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MorphiaModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMorphiaModelAccess().getGroup()); 

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
    // $ANTLR end "ruleMorphiaModel"


    // $ANTLR start "entryRuleAttribute"
    // InternalPlayMorphiaModel.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:104:1: ( ruleAttribute EOF )
            // InternalPlayMorphiaModel.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalPlayMorphiaModel.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalPlayMorphiaModel.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalPlayMorphiaModel.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalPlayMorphiaModel.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalPlayMorphiaModel.g:119:3: ( rule__Attribute__Group__0 )
            // InternalPlayMorphiaModel.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalPlayMorphiaModel.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:129:1: ( ruleType EOF )
            // InternalPlayMorphiaModel.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalPlayMorphiaModel.g:137:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:141:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPlayMorphiaModel.g:142:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPlayMorphiaModel.g:142:2: ( ( rule__Type__Alternatives ) )
            // InternalPlayMorphiaModel.g:143:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalPlayMorphiaModel.g:144:3: ( rule__Type__Alternatives )
            // InternalPlayMorphiaModel.g:144:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalPlayMorphiaModel.g:153:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:154:1: ( ruleDataType EOF )
            // InternalPlayMorphiaModel.g:155:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalPlayMorphiaModel.g:162:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:166:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalPlayMorphiaModel.g:167:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalPlayMorphiaModel.g:167:2: ( ( rule__DataType__Group__0 ) )
            // InternalPlayMorphiaModel.g:168:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalPlayMorphiaModel.g:169:3: ( rule__DataType__Group__0 )
            // InternalPlayMorphiaModel.g:169:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalPlayMorphiaModel.g:177:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleMorphiaModel ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:181:1: ( ( ruleDataType ) | ( ruleMorphiaModel ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPlayMorphiaModel.g:182:2: ( ruleDataType )
                    {
                    // InternalPlayMorphiaModel.g:182:2: ( ruleDataType )
                    // InternalPlayMorphiaModel.g:183:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPlayMorphiaModel.g:188:2: ( ruleMorphiaModel )
                    {
                    // InternalPlayMorphiaModel.g:188:2: ( ruleMorphiaModel )
                    // InternalPlayMorphiaModel.g:189:3: ruleMorphiaModel
                    {
                     before(grammarAccess.getTypeAccess().getMorphiaModelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMorphiaModel();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMorphiaModelParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__MorphiaModel__Group__0"
    // InternalPlayMorphiaModel.g:198:1: rule__MorphiaModel__Group__0 : rule__MorphiaModel__Group__0__Impl rule__MorphiaModel__Group__1 ;
    public final void rule__MorphiaModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:202:1: ( rule__MorphiaModel__Group__0__Impl rule__MorphiaModel__Group__1 )
            // InternalPlayMorphiaModel.g:203:2: rule__MorphiaModel__Group__0__Impl rule__MorphiaModel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MorphiaModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MorphiaModel__Group__1();

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
    // $ANTLR end "rule__MorphiaModel__Group__0"


    // $ANTLR start "rule__MorphiaModel__Group__0__Impl"
    // InternalPlayMorphiaModel.g:210:1: rule__MorphiaModel__Group__0__Impl : ( 'morphiamodel' ) ;
    public final void rule__MorphiaModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:214:1: ( ( 'morphiamodel' ) )
            // InternalPlayMorphiaModel.g:215:1: ( 'morphiamodel' )
            {
            // InternalPlayMorphiaModel.g:215:1: ( 'morphiamodel' )
            // InternalPlayMorphiaModel.g:216:2: 'morphiamodel'
            {
             before(grammarAccess.getMorphiaModelAccess().getMorphiamodelKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMorphiaModelAccess().getMorphiamodelKeyword_0()); 

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
    // $ANTLR end "rule__MorphiaModel__Group__0__Impl"


    // $ANTLR start "rule__MorphiaModel__Group__1"
    // InternalPlayMorphiaModel.g:225:1: rule__MorphiaModel__Group__1 : rule__MorphiaModel__Group__1__Impl rule__MorphiaModel__Group__2 ;
    public final void rule__MorphiaModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:229:1: ( rule__MorphiaModel__Group__1__Impl rule__MorphiaModel__Group__2 )
            // InternalPlayMorphiaModel.g:230:2: rule__MorphiaModel__Group__1__Impl rule__MorphiaModel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MorphiaModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MorphiaModel__Group__2();

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
    // $ANTLR end "rule__MorphiaModel__Group__1"


    // $ANTLR start "rule__MorphiaModel__Group__1__Impl"
    // InternalPlayMorphiaModel.g:237:1: rule__MorphiaModel__Group__1__Impl : ( ( rule__MorphiaModel__NameAssignment_1 ) ) ;
    public final void rule__MorphiaModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:241:1: ( ( ( rule__MorphiaModel__NameAssignment_1 ) ) )
            // InternalPlayMorphiaModel.g:242:1: ( ( rule__MorphiaModel__NameAssignment_1 ) )
            {
            // InternalPlayMorphiaModel.g:242:1: ( ( rule__MorphiaModel__NameAssignment_1 ) )
            // InternalPlayMorphiaModel.g:243:2: ( rule__MorphiaModel__NameAssignment_1 )
            {
             before(grammarAccess.getMorphiaModelAccess().getNameAssignment_1()); 
            // InternalPlayMorphiaModel.g:244:2: ( rule__MorphiaModel__NameAssignment_1 )
            // InternalPlayMorphiaModel.g:244:3: rule__MorphiaModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MorphiaModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMorphiaModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MorphiaModel__Group__1__Impl"


    // $ANTLR start "rule__MorphiaModel__Group__2"
    // InternalPlayMorphiaModel.g:252:1: rule__MorphiaModel__Group__2 : rule__MorphiaModel__Group__2__Impl rule__MorphiaModel__Group__3 ;
    public final void rule__MorphiaModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:256:1: ( rule__MorphiaModel__Group__2__Impl rule__MorphiaModel__Group__3 )
            // InternalPlayMorphiaModel.g:257:2: rule__MorphiaModel__Group__2__Impl rule__MorphiaModel__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MorphiaModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MorphiaModel__Group__3();

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
    // $ANTLR end "rule__MorphiaModel__Group__2"


    // $ANTLR start "rule__MorphiaModel__Group__2__Impl"
    // InternalPlayMorphiaModel.g:264:1: rule__MorphiaModel__Group__2__Impl : ( '{' ) ;
    public final void rule__MorphiaModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:268:1: ( ( '{' ) )
            // InternalPlayMorphiaModel.g:269:1: ( '{' )
            {
            // InternalPlayMorphiaModel.g:269:1: ( '{' )
            // InternalPlayMorphiaModel.g:270:2: '{'
            {
             before(grammarAccess.getMorphiaModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMorphiaModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__MorphiaModel__Group__2__Impl"


    // $ANTLR start "rule__MorphiaModel__Group__3"
    // InternalPlayMorphiaModel.g:279:1: rule__MorphiaModel__Group__3 : rule__MorphiaModel__Group__3__Impl rule__MorphiaModel__Group__4 ;
    public final void rule__MorphiaModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:283:1: ( rule__MorphiaModel__Group__3__Impl rule__MorphiaModel__Group__4 )
            // InternalPlayMorphiaModel.g:284:2: rule__MorphiaModel__Group__3__Impl rule__MorphiaModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MorphiaModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MorphiaModel__Group__4();

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
    // $ANTLR end "rule__MorphiaModel__Group__3"


    // $ANTLR start "rule__MorphiaModel__Group__3__Impl"
    // InternalPlayMorphiaModel.g:291:1: rule__MorphiaModel__Group__3__Impl : ( ( rule__MorphiaModel__AttributesAssignment_3 )* ) ;
    public final void rule__MorphiaModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:295:1: ( ( ( rule__MorphiaModel__AttributesAssignment_3 )* ) )
            // InternalPlayMorphiaModel.g:296:1: ( ( rule__MorphiaModel__AttributesAssignment_3 )* )
            {
            // InternalPlayMorphiaModel.g:296:1: ( ( rule__MorphiaModel__AttributesAssignment_3 )* )
            // InternalPlayMorphiaModel.g:297:2: ( rule__MorphiaModel__AttributesAssignment_3 )*
            {
             before(grammarAccess.getMorphiaModelAccess().getAttributesAssignment_3()); 
            // InternalPlayMorphiaModel.g:298:2: ( rule__MorphiaModel__AttributesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPlayMorphiaModel.g:298:3: rule__MorphiaModel__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__MorphiaModel__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getMorphiaModelAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__MorphiaModel__Group__3__Impl"


    // $ANTLR start "rule__MorphiaModel__Group__4"
    // InternalPlayMorphiaModel.g:306:1: rule__MorphiaModel__Group__4 : rule__MorphiaModel__Group__4__Impl ;
    public final void rule__MorphiaModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:310:1: ( rule__MorphiaModel__Group__4__Impl )
            // InternalPlayMorphiaModel.g:311:2: rule__MorphiaModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MorphiaModel__Group__4__Impl();

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
    // $ANTLR end "rule__MorphiaModel__Group__4"


    // $ANTLR start "rule__MorphiaModel__Group__4__Impl"
    // InternalPlayMorphiaModel.g:317:1: rule__MorphiaModel__Group__4__Impl : ( '}' ) ;
    public final void rule__MorphiaModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:321:1: ( ( '}' ) )
            // InternalPlayMorphiaModel.g:322:1: ( '}' )
            {
            // InternalPlayMorphiaModel.g:322:1: ( '}' )
            // InternalPlayMorphiaModel.g:323:2: '}'
            {
             before(grammarAccess.getMorphiaModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMorphiaModelAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__MorphiaModel__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalPlayMorphiaModel.g:333:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:337:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalPlayMorphiaModel.g:338:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalPlayMorphiaModel.g:345:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__ManyAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:349:1: ( ( ( rule__Attribute__ManyAssignment_0 )? ) )
            // InternalPlayMorphiaModel.g:350:1: ( ( rule__Attribute__ManyAssignment_0 )? )
            {
            // InternalPlayMorphiaModel.g:350:1: ( ( rule__Attribute__ManyAssignment_0 )? )
            // InternalPlayMorphiaModel.g:351:2: ( rule__Attribute__ManyAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_0()); 
            // InternalPlayMorphiaModel.g:352:2: ( rule__Attribute__ManyAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPlayMorphiaModel.g:352:3: rule__Attribute__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalPlayMorphiaModel.g:360:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:364:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalPlayMorphiaModel.g:365:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalPlayMorphiaModel.g:372:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:376:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalPlayMorphiaModel.g:377:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalPlayMorphiaModel.g:377:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalPlayMorphiaModel.g:378:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalPlayMorphiaModel.g:379:2: ( rule__Attribute__NameAssignment_1 )
            // InternalPlayMorphiaModel.g:379:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalPlayMorphiaModel.g:387:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:391:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalPlayMorphiaModel.g:392:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalPlayMorphiaModel.g:399:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:403:1: ( ( ':' ) )
            // InternalPlayMorphiaModel.g:404:1: ( ':' )
            {
            // InternalPlayMorphiaModel.g:404:1: ( ':' )
            // InternalPlayMorphiaModel.g:405:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalPlayMorphiaModel.g:414:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:418:1: ( rule__Attribute__Group__3__Impl )
            // InternalPlayMorphiaModel.g:419:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalPlayMorphiaModel.g:425:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:429:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalPlayMorphiaModel.g:430:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalPlayMorphiaModel.g:430:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalPlayMorphiaModel.g:431:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalPlayMorphiaModel.g:432:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalPlayMorphiaModel.g:432:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalPlayMorphiaModel.g:441:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:445:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalPlayMorphiaModel.g:446:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalPlayMorphiaModel.g:453:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:457:1: ( ( 'datatype' ) )
            // InternalPlayMorphiaModel.g:458:1: ( 'datatype' )
            {
            // InternalPlayMorphiaModel.g:458:1: ( 'datatype' )
            // InternalPlayMorphiaModel.g:459:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

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
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalPlayMorphiaModel.g:468:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:472:1: ( rule__DataType__Group__1__Impl )
            // InternalPlayMorphiaModel.g:473:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalPlayMorphiaModel.g:479:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:483:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalPlayMorphiaModel.g:484:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalPlayMorphiaModel.g:484:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalPlayMorphiaModel.g:485:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalPlayMorphiaModel.g:486:2: ( rule__DataType__NameAssignment_1 )
            // InternalPlayMorphiaModel.g:486:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalPlayMorphiaModel.g:495:1: rule__Domainmodel__ElementsAssignment : ( ruleType ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:499:1: ( ( ruleType ) )
            // InternalPlayMorphiaModel.g:500:2: ( ruleType )
            {
            // InternalPlayMorphiaModel.g:500:2: ( ruleType )
            // InternalPlayMorphiaModel.g:501:3: ruleType
            {
             before(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsTypeParserRuleCall_0()); 

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
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__MorphiaModel__NameAssignment_1"
    // InternalPlayMorphiaModel.g:510:1: rule__MorphiaModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MorphiaModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:514:1: ( ( RULE_ID ) )
            // InternalPlayMorphiaModel.g:515:2: ( RULE_ID )
            {
            // InternalPlayMorphiaModel.g:515:2: ( RULE_ID )
            // InternalPlayMorphiaModel.g:516:3: RULE_ID
            {
             before(grammarAccess.getMorphiaModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMorphiaModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MorphiaModel__NameAssignment_1"


    // $ANTLR start "rule__MorphiaModel__AttributesAssignment_3"
    // InternalPlayMorphiaModel.g:525:1: rule__MorphiaModel__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__MorphiaModel__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:529:1: ( ( ruleAttribute ) )
            // InternalPlayMorphiaModel.g:530:2: ( ruleAttribute )
            {
            // InternalPlayMorphiaModel.g:530:2: ( ruleAttribute )
            // InternalPlayMorphiaModel.g:531:3: ruleAttribute
            {
             before(grammarAccess.getMorphiaModelAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMorphiaModelAccess().getAttributesAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MorphiaModel__AttributesAssignment_3"


    // $ANTLR start "rule__Attribute__ManyAssignment_0"
    // InternalPlayMorphiaModel.g:540:1: rule__Attribute__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Attribute__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:544:1: ( ( ( 'many' ) ) )
            // InternalPlayMorphiaModel.g:545:2: ( ( 'many' ) )
            {
            // InternalPlayMorphiaModel.g:545:2: ( ( 'many' ) )
            // InternalPlayMorphiaModel.g:546:3: ( 'many' )
            {
             before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 
            // InternalPlayMorphiaModel.g:547:3: ( 'many' )
            // InternalPlayMorphiaModel.g:548:4: 'many'
            {
             before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 

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
    // $ANTLR end "rule__Attribute__ManyAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalPlayMorphiaModel.g:559:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:563:1: ( ( RULE_ID ) )
            // InternalPlayMorphiaModel.g:564:2: ( RULE_ID )
            {
            // InternalPlayMorphiaModel.g:564:2: ( RULE_ID )
            // InternalPlayMorphiaModel.g:565:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalPlayMorphiaModel.g:574:1: rule__Attribute__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:578:1: ( ( ( RULE_ID ) ) )
            // InternalPlayMorphiaModel.g:579:2: ( ( RULE_ID ) )
            {
            // InternalPlayMorphiaModel.g:579:2: ( ( RULE_ID ) )
            // InternalPlayMorphiaModel.g:580:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_3_0()); 
            // InternalPlayMorphiaModel.g:581:3: ( RULE_ID )
            // InternalPlayMorphiaModel.g:582:4: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalPlayMorphiaModel.g:593:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:597:1: ( ( RULE_ID ) )
            // InternalPlayMorphiaModel.g:598:2: ( RULE_ID )
            {
            // InternalPlayMorphiaModel.g:598:2: ( RULE_ID )
            // InternalPlayMorphiaModel.g:599:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataType__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});

}