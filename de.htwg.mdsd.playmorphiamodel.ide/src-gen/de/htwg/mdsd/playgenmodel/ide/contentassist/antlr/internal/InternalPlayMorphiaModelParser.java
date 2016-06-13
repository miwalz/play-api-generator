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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'morphiamodel'", "':'", "'datatype'", "'import'", "'.*'", "'.'", "'many'", "'embedded'"
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
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( (LA1_0==11||LA1_0==14||(LA1_0>=16 && LA1_0<=17)) ) {
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


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalPlayMorphiaModel.g:78:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:79:1: ( rulePackageDeclaration EOF )
            // InternalPlayMorphiaModel.g:80:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalPlayMorphiaModel.g:87:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:91:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalPlayMorphiaModel.g:92:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalPlayMorphiaModel.g:92:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalPlayMorphiaModel.g:93:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalPlayMorphiaModel.g:94:3: ( rule__PackageDeclaration__Group__0 )
            // InternalPlayMorphiaModel.g:94:4: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalPlayMorphiaModel.g:103:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:104:1: ( ruleAbstractElement EOF )
            // InternalPlayMorphiaModel.g:105:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalPlayMorphiaModel.g:112:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:116:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalPlayMorphiaModel.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalPlayMorphiaModel.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalPlayMorphiaModel.g:118:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalPlayMorphiaModel.g:119:3: ( rule__AbstractElement__Alternatives )
            // InternalPlayMorphiaModel.g:119:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleMorphiaModel"
    // InternalPlayMorphiaModel.g:128:1: entryRuleMorphiaModel : ruleMorphiaModel EOF ;
    public final void entryRuleMorphiaModel() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:129:1: ( ruleMorphiaModel EOF )
            // InternalPlayMorphiaModel.g:130:1: ruleMorphiaModel EOF
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
    // InternalPlayMorphiaModel.g:137:1: ruleMorphiaModel : ( ( rule__MorphiaModel__Group__0 ) ) ;
    public final void ruleMorphiaModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:141:2: ( ( ( rule__MorphiaModel__Group__0 ) ) )
            // InternalPlayMorphiaModel.g:142:2: ( ( rule__MorphiaModel__Group__0 ) )
            {
            // InternalPlayMorphiaModel.g:142:2: ( ( rule__MorphiaModel__Group__0 ) )
            // InternalPlayMorphiaModel.g:143:3: ( rule__MorphiaModel__Group__0 )
            {
             before(grammarAccess.getMorphiaModelAccess().getGroup()); 
            // InternalPlayMorphiaModel.g:144:3: ( rule__MorphiaModel__Group__0 )
            // InternalPlayMorphiaModel.g:144:4: rule__MorphiaModel__Group__0
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
    // InternalPlayMorphiaModel.g:153:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:154:1: ( ruleAttribute EOF )
            // InternalPlayMorphiaModel.g:155:1: ruleAttribute EOF
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
    // InternalPlayMorphiaModel.g:162:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:166:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalPlayMorphiaModel.g:167:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalPlayMorphiaModel.g:167:2: ( ( rule__Attribute__Group__0 ) )
            // InternalPlayMorphiaModel.g:168:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalPlayMorphiaModel.g:169:3: ( rule__Attribute__Group__0 )
            // InternalPlayMorphiaModel.g:169:4: rule__Attribute__Group__0
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
    // InternalPlayMorphiaModel.g:178:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:179:1: ( ruleType EOF )
            // InternalPlayMorphiaModel.g:180:1: ruleType EOF
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
    // InternalPlayMorphiaModel.g:187:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:191:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalPlayMorphiaModel.g:192:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalPlayMorphiaModel.g:192:2: ( ( rule__Type__Alternatives ) )
            // InternalPlayMorphiaModel.g:193:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalPlayMorphiaModel.g:194:3: ( rule__Type__Alternatives )
            // InternalPlayMorphiaModel.g:194:4: rule__Type__Alternatives
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
    // InternalPlayMorphiaModel.g:203:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:204:1: ( ruleDataType EOF )
            // InternalPlayMorphiaModel.g:205:1: ruleDataType EOF
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
    // InternalPlayMorphiaModel.g:212:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:216:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalPlayMorphiaModel.g:217:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalPlayMorphiaModel.g:217:2: ( ( rule__DataType__Group__0 ) )
            // InternalPlayMorphiaModel.g:218:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalPlayMorphiaModel.g:219:3: ( rule__DataType__Group__0 )
            // InternalPlayMorphiaModel.g:219:4: rule__DataType__Group__0
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


    // $ANTLR start "entryRuleImport"
    // InternalPlayMorphiaModel.g:228:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:229:1: ( ruleImport EOF )
            // InternalPlayMorphiaModel.g:230:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalPlayMorphiaModel.g:237:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:241:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalPlayMorphiaModel.g:242:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalPlayMorphiaModel.g:242:2: ( ( rule__Import__Group__0 ) )
            // InternalPlayMorphiaModel.g:243:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalPlayMorphiaModel.g:244:3: ( rule__Import__Group__0 )
            // InternalPlayMorphiaModel.g:244:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalPlayMorphiaModel.g:253:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:254:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalPlayMorphiaModel.g:255:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalPlayMorphiaModel.g:262:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:266:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalPlayMorphiaModel.g:267:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalPlayMorphiaModel.g:267:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalPlayMorphiaModel.g:268:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalPlayMorphiaModel.g:269:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalPlayMorphiaModel.g:269:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalPlayMorphiaModel.g:278:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalPlayMorphiaModel.g:279:1: ( ruleQualifiedName EOF )
            // InternalPlayMorphiaModel.g:280:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalPlayMorphiaModel.g:287:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:291:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalPlayMorphiaModel.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalPlayMorphiaModel.g:292:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalPlayMorphiaModel.g:293:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalPlayMorphiaModel.g:294:3: ( rule__QualifiedName__Group__0 )
            // InternalPlayMorphiaModel.g:294:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalPlayMorphiaModel.g:302:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:306:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 14:
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPlayMorphiaModel.g:307:2: ( rulePackageDeclaration )
                    {
                    // InternalPlayMorphiaModel.g:307:2: ( rulePackageDeclaration )
                    // InternalPlayMorphiaModel.g:308:3: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPlayMorphiaModel.g:313:2: ( ruleType )
                    {
                    // InternalPlayMorphiaModel.g:313:2: ( ruleType )
                    // InternalPlayMorphiaModel.g:314:3: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPlayMorphiaModel.g:319:2: ( ruleImport )
                    {
                    // InternalPlayMorphiaModel.g:319:2: ( ruleImport )
                    // InternalPlayMorphiaModel.g:320:3: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalPlayMorphiaModel.g:329:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleMorphiaModel ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:333:1: ( ( ruleDataType ) | ( ruleMorphiaModel ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPlayMorphiaModel.g:334:2: ( ruleDataType )
                    {
                    // InternalPlayMorphiaModel.g:334:2: ( ruleDataType )
                    // InternalPlayMorphiaModel.g:335:3: ruleDataType
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
                    // InternalPlayMorphiaModel.g:340:2: ( ruleMorphiaModel )
                    {
                    // InternalPlayMorphiaModel.g:340:2: ( ruleMorphiaModel )
                    // InternalPlayMorphiaModel.g:341:3: ruleMorphiaModel
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


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // InternalPlayMorphiaModel.g:350:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:354:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalPlayMorphiaModel.g:355:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1();

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
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // InternalPlayMorphiaModel.g:362:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:366:1: ( ( 'package' ) )
            // InternalPlayMorphiaModel.g:367:1: ( 'package' )
            {
            // InternalPlayMorphiaModel.g:367:1: ( 'package' )
            // InternalPlayMorphiaModel.g:368:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // InternalPlayMorphiaModel.g:377:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:381:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalPlayMorphiaModel.g:382:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__2();

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
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // InternalPlayMorphiaModel.g:389:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:393:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalPlayMorphiaModel.g:394:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalPlayMorphiaModel.g:394:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalPlayMorphiaModel.g:395:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalPlayMorphiaModel.g:396:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalPlayMorphiaModel.g:396:3: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // InternalPlayMorphiaModel.g:404:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:408:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalPlayMorphiaModel.g:409:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__3();

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
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // InternalPlayMorphiaModel.g:416:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:420:1: ( ( '{' ) )
            // InternalPlayMorphiaModel.g:421:1: ( '{' )
            {
            // InternalPlayMorphiaModel.g:421:1: ( '{' )
            // InternalPlayMorphiaModel.g:422:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // InternalPlayMorphiaModel.g:431:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:435:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalPlayMorphiaModel.g:436:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4();

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
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // InternalPlayMorphiaModel.g:443:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:447:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalPlayMorphiaModel.g:448:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalPlayMorphiaModel.g:448:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalPlayMorphiaModel.g:449:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalPlayMorphiaModel.g:450:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11||LA4_0==14||(LA4_0>=16 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPlayMorphiaModel.g:450:3: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // InternalPlayMorphiaModel.g:458:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:462:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalPlayMorphiaModel.g:463:2: rule__PackageDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // InternalPlayMorphiaModel.g:469:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:473:1: ( ( '}' ) )
            // InternalPlayMorphiaModel.g:474:1: ( '}' )
            {
            // InternalPlayMorphiaModel.g:474:1: ( '}' )
            // InternalPlayMorphiaModel.g:475:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__MorphiaModel__Group__0"
    // InternalPlayMorphiaModel.g:485:1: rule__MorphiaModel__Group__0 : rule__MorphiaModel__Group__0__Impl rule__MorphiaModel__Group__1 ;
    public final void rule__MorphiaModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:489:1: ( rule__MorphiaModel__Group__0__Impl rule__MorphiaModel__Group__1 )
            // InternalPlayMorphiaModel.g:490:2: rule__MorphiaModel__Group__0__Impl rule__MorphiaModel__Group__1
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
    // InternalPlayMorphiaModel.g:497:1: rule__MorphiaModel__Group__0__Impl : ( 'morphiamodel' ) ;
    public final void rule__MorphiaModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:501:1: ( ( 'morphiamodel' ) )
            // InternalPlayMorphiaModel.g:502:1: ( 'morphiamodel' )
            {
            // InternalPlayMorphiaModel.g:502:1: ( 'morphiamodel' )
            // InternalPlayMorphiaModel.g:503:2: 'morphiamodel'
            {
             before(grammarAccess.getMorphiaModelAccess().getMorphiamodelKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalPlayMorphiaModel.g:512:1: rule__MorphiaModel__Group__1 : rule__MorphiaModel__Group__1__Impl rule__MorphiaModel__Group__2 ;
    public final void rule__MorphiaModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:516:1: ( rule__MorphiaModel__Group__1__Impl rule__MorphiaModel__Group__2 )
            // InternalPlayMorphiaModel.g:517:2: rule__MorphiaModel__Group__1__Impl rule__MorphiaModel__Group__2
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
    // InternalPlayMorphiaModel.g:524:1: rule__MorphiaModel__Group__1__Impl : ( ( rule__MorphiaModel__NameAssignment_1 ) ) ;
    public final void rule__MorphiaModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:528:1: ( ( ( rule__MorphiaModel__NameAssignment_1 ) ) )
            // InternalPlayMorphiaModel.g:529:1: ( ( rule__MorphiaModel__NameAssignment_1 ) )
            {
            // InternalPlayMorphiaModel.g:529:1: ( ( rule__MorphiaModel__NameAssignment_1 ) )
            // InternalPlayMorphiaModel.g:530:2: ( rule__MorphiaModel__NameAssignment_1 )
            {
             before(grammarAccess.getMorphiaModelAccess().getNameAssignment_1()); 
            // InternalPlayMorphiaModel.g:531:2: ( rule__MorphiaModel__NameAssignment_1 )
            // InternalPlayMorphiaModel.g:531:3: rule__MorphiaModel__NameAssignment_1
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
    // InternalPlayMorphiaModel.g:539:1: rule__MorphiaModel__Group__2 : rule__MorphiaModel__Group__2__Impl rule__MorphiaModel__Group__3 ;
    public final void rule__MorphiaModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:543:1: ( rule__MorphiaModel__Group__2__Impl rule__MorphiaModel__Group__3 )
            // InternalPlayMorphiaModel.g:544:2: rule__MorphiaModel__Group__2__Impl rule__MorphiaModel__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalPlayMorphiaModel.g:551:1: rule__MorphiaModel__Group__2__Impl : ( '{' ) ;
    public final void rule__MorphiaModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:555:1: ( ( '{' ) )
            // InternalPlayMorphiaModel.g:556:1: ( '{' )
            {
            // InternalPlayMorphiaModel.g:556:1: ( '{' )
            // InternalPlayMorphiaModel.g:557:2: '{'
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
    // InternalPlayMorphiaModel.g:566:1: rule__MorphiaModel__Group__3 : rule__MorphiaModel__Group__3__Impl rule__MorphiaModel__Group__4 ;
    public final void rule__MorphiaModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:570:1: ( rule__MorphiaModel__Group__3__Impl rule__MorphiaModel__Group__4 )
            // InternalPlayMorphiaModel.g:571:2: rule__MorphiaModel__Group__3__Impl rule__MorphiaModel__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalPlayMorphiaModel.g:578:1: rule__MorphiaModel__Group__3__Impl : ( ( rule__MorphiaModel__ImportsAssignment_3 )* ) ;
    public final void rule__MorphiaModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:582:1: ( ( ( rule__MorphiaModel__ImportsAssignment_3 )* ) )
            // InternalPlayMorphiaModel.g:583:1: ( ( rule__MorphiaModel__ImportsAssignment_3 )* )
            {
            // InternalPlayMorphiaModel.g:583:1: ( ( rule__MorphiaModel__ImportsAssignment_3 )* )
            // InternalPlayMorphiaModel.g:584:2: ( rule__MorphiaModel__ImportsAssignment_3 )*
            {
             before(grammarAccess.getMorphiaModelAccess().getImportsAssignment_3()); 
            // InternalPlayMorphiaModel.g:585:2: ( rule__MorphiaModel__ImportsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPlayMorphiaModel.g:585:3: rule__MorphiaModel__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MorphiaModel__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMorphiaModelAccess().getImportsAssignment_3()); 

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
    // InternalPlayMorphiaModel.g:593:1: rule__MorphiaModel__Group__4 : rule__MorphiaModel__Group__4__Impl rule__MorphiaModel__Group__5 ;
    public final void rule__MorphiaModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:597:1: ( rule__MorphiaModel__Group__4__Impl rule__MorphiaModel__Group__5 )
            // InternalPlayMorphiaModel.g:598:2: rule__MorphiaModel__Group__4__Impl rule__MorphiaModel__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MorphiaModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MorphiaModel__Group__5();

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
    // InternalPlayMorphiaModel.g:605:1: rule__MorphiaModel__Group__4__Impl : ( ( rule__MorphiaModel__AttributesAssignment_4 )* ) ;
    public final void rule__MorphiaModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:609:1: ( ( ( rule__MorphiaModel__AttributesAssignment_4 )* ) )
            // InternalPlayMorphiaModel.g:610:1: ( ( rule__MorphiaModel__AttributesAssignment_4 )* )
            {
            // InternalPlayMorphiaModel.g:610:1: ( ( rule__MorphiaModel__AttributesAssignment_4 )* )
            // InternalPlayMorphiaModel.g:611:2: ( rule__MorphiaModel__AttributesAssignment_4 )*
            {
             before(grammarAccess.getMorphiaModelAccess().getAttributesAssignment_4()); 
            // InternalPlayMorphiaModel.g:612:2: ( rule__MorphiaModel__AttributesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPlayMorphiaModel.g:612:3: rule__MorphiaModel__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MorphiaModel__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMorphiaModelAccess().getAttributesAssignment_4()); 

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


    // $ANTLR start "rule__MorphiaModel__Group__5"
    // InternalPlayMorphiaModel.g:620:1: rule__MorphiaModel__Group__5 : rule__MorphiaModel__Group__5__Impl ;
    public final void rule__MorphiaModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:624:1: ( rule__MorphiaModel__Group__5__Impl )
            // InternalPlayMorphiaModel.g:625:2: rule__MorphiaModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MorphiaModel__Group__5__Impl();

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
    // $ANTLR end "rule__MorphiaModel__Group__5"


    // $ANTLR start "rule__MorphiaModel__Group__5__Impl"
    // InternalPlayMorphiaModel.g:631:1: rule__MorphiaModel__Group__5__Impl : ( '}' ) ;
    public final void rule__MorphiaModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:635:1: ( ( '}' ) )
            // InternalPlayMorphiaModel.g:636:1: ( '}' )
            {
            // InternalPlayMorphiaModel.g:636:1: ( '}' )
            // InternalPlayMorphiaModel.g:637:2: '}'
            {
             before(grammarAccess.getMorphiaModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMorphiaModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__MorphiaModel__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalPlayMorphiaModel.g:647:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:651:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalPlayMorphiaModel.g:652:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalPlayMorphiaModel.g:659:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__Group_0__0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:663:1: ( ( ( rule__Attribute__Group_0__0 )? ) )
            // InternalPlayMorphiaModel.g:664:1: ( ( rule__Attribute__Group_0__0 )? )
            {
            // InternalPlayMorphiaModel.g:664:1: ( ( rule__Attribute__Group_0__0 )? )
            // InternalPlayMorphiaModel.g:665:2: ( rule__Attribute__Group_0__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_0()); 
            // InternalPlayMorphiaModel.g:666:2: ( rule__Attribute__Group_0__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPlayMorphiaModel.g:666:3: rule__Attribute__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_0()); 

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
    // InternalPlayMorphiaModel.g:674:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:678:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalPlayMorphiaModel.g:679:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalPlayMorphiaModel.g:686:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:690:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalPlayMorphiaModel.g:691:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalPlayMorphiaModel.g:691:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalPlayMorphiaModel.g:692:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalPlayMorphiaModel.g:693:2: ( rule__Attribute__NameAssignment_1 )
            // InternalPlayMorphiaModel.g:693:3: rule__Attribute__NameAssignment_1
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
    // InternalPlayMorphiaModel.g:701:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:705:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalPlayMorphiaModel.g:706:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalPlayMorphiaModel.g:713:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:717:1: ( ( ':' ) )
            // InternalPlayMorphiaModel.g:718:1: ( ':' )
            {
            // InternalPlayMorphiaModel.g:718:1: ( ':' )
            // InternalPlayMorphiaModel.g:719:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
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
    // InternalPlayMorphiaModel.g:728:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:732:1: ( rule__Attribute__Group__3__Impl )
            // InternalPlayMorphiaModel.g:733:2: rule__Attribute__Group__3__Impl
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
    // InternalPlayMorphiaModel.g:739:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:743:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalPlayMorphiaModel.g:744:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalPlayMorphiaModel.g:744:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalPlayMorphiaModel.g:745:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalPlayMorphiaModel.g:746:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalPlayMorphiaModel.g:746:3: rule__Attribute__TypeAssignment_3
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


    // $ANTLR start "rule__Attribute__Group_0__0"
    // InternalPlayMorphiaModel.g:755:1: rule__Attribute__Group_0__0 : rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1 ;
    public final void rule__Attribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:759:1: ( rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1 )
            // InternalPlayMorphiaModel.g:760:2: rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Attribute__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_0__1();

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
    // $ANTLR end "rule__Attribute__Group_0__0"


    // $ANTLR start "rule__Attribute__Group_0__0__Impl"
    // InternalPlayMorphiaModel.g:767:1: rule__Attribute__Group_0__0__Impl : ( ( rule__Attribute__ManyAssignment_0_0 ) ) ;
    public final void rule__Attribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:771:1: ( ( ( rule__Attribute__ManyAssignment_0_0 ) ) )
            // InternalPlayMorphiaModel.g:772:1: ( ( rule__Attribute__ManyAssignment_0_0 ) )
            {
            // InternalPlayMorphiaModel.g:772:1: ( ( rule__Attribute__ManyAssignment_0_0 ) )
            // InternalPlayMorphiaModel.g:773:2: ( rule__Attribute__ManyAssignment_0_0 )
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_0_0()); 
            // InternalPlayMorphiaModel.g:774:2: ( rule__Attribute__ManyAssignment_0_0 )
            // InternalPlayMorphiaModel.g:774:3: rule__Attribute__ManyAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ManyAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getManyAssignment_0_0()); 

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
    // $ANTLR end "rule__Attribute__Group_0__0__Impl"


    // $ANTLR start "rule__Attribute__Group_0__1"
    // InternalPlayMorphiaModel.g:782:1: rule__Attribute__Group_0__1 : rule__Attribute__Group_0__1__Impl ;
    public final void rule__Attribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:786:1: ( rule__Attribute__Group_0__1__Impl )
            // InternalPlayMorphiaModel.g:787:2: rule__Attribute__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_0__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_0__1"


    // $ANTLR start "rule__Attribute__Group_0__1__Impl"
    // InternalPlayMorphiaModel.g:793:1: rule__Attribute__Group_0__1__Impl : ( ( rule__Attribute__EmbeddedAssignment_0_1 )? ) ;
    public final void rule__Attribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:797:1: ( ( ( rule__Attribute__EmbeddedAssignment_0_1 )? ) )
            // InternalPlayMorphiaModel.g:798:1: ( ( rule__Attribute__EmbeddedAssignment_0_1 )? )
            {
            // InternalPlayMorphiaModel.g:798:1: ( ( rule__Attribute__EmbeddedAssignment_0_1 )? )
            // InternalPlayMorphiaModel.g:799:2: ( rule__Attribute__EmbeddedAssignment_0_1 )?
            {
             before(grammarAccess.getAttributeAccess().getEmbeddedAssignment_0_1()); 
            // InternalPlayMorphiaModel.g:800:2: ( rule__Attribute__EmbeddedAssignment_0_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPlayMorphiaModel.g:800:3: rule__Attribute__EmbeddedAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__EmbeddedAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getEmbeddedAssignment_0_1()); 

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
    // $ANTLR end "rule__Attribute__Group_0__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalPlayMorphiaModel.g:809:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:813:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalPlayMorphiaModel.g:814:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
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
    // InternalPlayMorphiaModel.g:821:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:825:1: ( ( 'datatype' ) )
            // InternalPlayMorphiaModel.g:826:1: ( 'datatype' )
            {
            // InternalPlayMorphiaModel.g:826:1: ( 'datatype' )
            // InternalPlayMorphiaModel.g:827:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalPlayMorphiaModel.g:836:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:840:1: ( rule__DataType__Group__1__Impl )
            // InternalPlayMorphiaModel.g:841:2: rule__DataType__Group__1__Impl
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
    // InternalPlayMorphiaModel.g:847:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:851:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalPlayMorphiaModel.g:852:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalPlayMorphiaModel.g:852:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalPlayMorphiaModel.g:853:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalPlayMorphiaModel.g:854:2: ( rule__DataType__NameAssignment_1 )
            // InternalPlayMorphiaModel.g:854:3: rule__DataType__NameAssignment_1
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


    // $ANTLR start "rule__Import__Group__0"
    // InternalPlayMorphiaModel.g:863:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:867:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalPlayMorphiaModel.g:868:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalPlayMorphiaModel.g:875:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:879:1: ( ( 'import' ) )
            // InternalPlayMorphiaModel.g:880:1: ( 'import' )
            {
            // InternalPlayMorphiaModel.g:880:1: ( 'import' )
            // InternalPlayMorphiaModel.g:881:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalPlayMorphiaModel.g:890:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:894:1: ( rule__Import__Group__1__Impl )
            // InternalPlayMorphiaModel.g:895:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalPlayMorphiaModel.g:901:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:905:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalPlayMorphiaModel.g:906:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalPlayMorphiaModel.g:906:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalPlayMorphiaModel.g:907:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalPlayMorphiaModel.g:908:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalPlayMorphiaModel.g:908:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalPlayMorphiaModel.g:917:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:921:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalPlayMorphiaModel.g:922:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalPlayMorphiaModel.g:929:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:933:1: ( ( ruleQualifiedName ) )
            // InternalPlayMorphiaModel.g:934:1: ( ruleQualifiedName )
            {
            // InternalPlayMorphiaModel.g:934:1: ( ruleQualifiedName )
            // InternalPlayMorphiaModel.g:935:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalPlayMorphiaModel.g:944:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:948:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalPlayMorphiaModel.g:949:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalPlayMorphiaModel.g:955:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:959:1: ( ( ( '.*' )? ) )
            // InternalPlayMorphiaModel.g:960:1: ( ( '.*' )? )
            {
            // InternalPlayMorphiaModel.g:960:1: ( ( '.*' )? )
            // InternalPlayMorphiaModel.g:961:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalPlayMorphiaModel.g:962:2: ( '.*' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPlayMorphiaModel.g:962:3: '.*'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalPlayMorphiaModel.g:971:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:975:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalPlayMorphiaModel.g:976:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalPlayMorphiaModel.g:983:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:987:1: ( ( RULE_ID ) )
            // InternalPlayMorphiaModel.g:988:1: ( RULE_ID )
            {
            // InternalPlayMorphiaModel.g:988:1: ( RULE_ID )
            // InternalPlayMorphiaModel.g:989:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalPlayMorphiaModel.g:998:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1002:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalPlayMorphiaModel.g:1003:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalPlayMorphiaModel.g:1009:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1013:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalPlayMorphiaModel.g:1014:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalPlayMorphiaModel.g:1014:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalPlayMorphiaModel.g:1015:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalPlayMorphiaModel.g:1016:2: ( rule__QualifiedName__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPlayMorphiaModel.g:1016:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalPlayMorphiaModel.g:1025:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1029:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalPlayMorphiaModel.g:1030:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalPlayMorphiaModel.g:1037:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1041:1: ( ( '.' ) )
            // InternalPlayMorphiaModel.g:1042:1: ( '.' )
            {
            // InternalPlayMorphiaModel.g:1042:1: ( '.' )
            // InternalPlayMorphiaModel.g:1043:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalPlayMorphiaModel.g:1052:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1056:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalPlayMorphiaModel.g:1057:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalPlayMorphiaModel.g:1063:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1067:1: ( ( RULE_ID ) )
            // InternalPlayMorphiaModel.g:1068:1: ( RULE_ID )
            {
            // InternalPlayMorphiaModel.g:1068:1: ( RULE_ID )
            // InternalPlayMorphiaModel.g:1069:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalPlayMorphiaModel.g:1079:1: rule__Domainmodel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1083:1: ( ( ruleAbstractElement ) )
            // InternalPlayMorphiaModel.g:1084:2: ( ruleAbstractElement )
            {
            // InternalPlayMorphiaModel.g:1084:2: ( ruleAbstractElement )
            // InternalPlayMorphiaModel.g:1085:3: ruleAbstractElement
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 

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


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // InternalPlayMorphiaModel.g:1094:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1098:1: ( ( ruleQualifiedName ) )
            // InternalPlayMorphiaModel.g:1099:2: ( ruleQualifiedName )
            {
            // InternalPlayMorphiaModel.g:1099:2: ( ruleQualifiedName )
            // InternalPlayMorphiaModel.g:1100:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_3"
    // InternalPlayMorphiaModel.g:1109:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1113:1: ( ( ruleAbstractElement ) )
            // InternalPlayMorphiaModel.g:1114:2: ( ruleAbstractElement )
            {
            // InternalPlayMorphiaModel.g:1114:2: ( ruleAbstractElement )
            // InternalPlayMorphiaModel.g:1115:3: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__MorphiaModel__NameAssignment_1"
    // InternalPlayMorphiaModel.g:1124:1: rule__MorphiaModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MorphiaModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1128:1: ( ( RULE_ID ) )
            // InternalPlayMorphiaModel.g:1129:2: ( RULE_ID )
            {
            // InternalPlayMorphiaModel.g:1129:2: ( RULE_ID )
            // InternalPlayMorphiaModel.g:1130:3: RULE_ID
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


    // $ANTLR start "rule__MorphiaModel__ImportsAssignment_3"
    // InternalPlayMorphiaModel.g:1139:1: rule__MorphiaModel__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__MorphiaModel__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1143:1: ( ( ruleImport ) )
            // InternalPlayMorphiaModel.g:1144:2: ( ruleImport )
            {
            // InternalPlayMorphiaModel.g:1144:2: ( ruleImport )
            // InternalPlayMorphiaModel.g:1145:3: ruleImport
            {
             before(grammarAccess.getMorphiaModelAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getMorphiaModelAccess().getImportsImportParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MorphiaModel__ImportsAssignment_3"


    // $ANTLR start "rule__MorphiaModel__AttributesAssignment_4"
    // InternalPlayMorphiaModel.g:1154:1: rule__MorphiaModel__AttributesAssignment_4 : ( ruleAttribute ) ;
    public final void rule__MorphiaModel__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1158:1: ( ( ruleAttribute ) )
            // InternalPlayMorphiaModel.g:1159:2: ( ruleAttribute )
            {
            // InternalPlayMorphiaModel.g:1159:2: ( ruleAttribute )
            // InternalPlayMorphiaModel.g:1160:3: ruleAttribute
            {
             before(grammarAccess.getMorphiaModelAccess().getAttributesAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMorphiaModelAccess().getAttributesAttributeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__MorphiaModel__AttributesAssignment_4"


    // $ANTLR start "rule__Attribute__ManyAssignment_0_0"
    // InternalPlayMorphiaModel.g:1169:1: rule__Attribute__ManyAssignment_0_0 : ( ( 'many' ) ) ;
    public final void rule__Attribute__ManyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1173:1: ( ( ( 'many' ) ) )
            // InternalPlayMorphiaModel.g:1174:2: ( ( 'many' ) )
            {
            // InternalPlayMorphiaModel.g:1174:2: ( ( 'many' ) )
            // InternalPlayMorphiaModel.g:1175:3: ( 'many' )
            {
             before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0_0()); 
            // InternalPlayMorphiaModel.g:1176:3: ( 'many' )
            // InternalPlayMorphiaModel.g:1177:4: 'many'
            {
             before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0_0()); 

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
    // $ANTLR end "rule__Attribute__ManyAssignment_0_0"


    // $ANTLR start "rule__Attribute__EmbeddedAssignment_0_1"
    // InternalPlayMorphiaModel.g:1188:1: rule__Attribute__EmbeddedAssignment_0_1 : ( ( 'embedded' ) ) ;
    public final void rule__Attribute__EmbeddedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1192:1: ( ( ( 'embedded' ) ) )
            // InternalPlayMorphiaModel.g:1193:2: ( ( 'embedded' ) )
            {
            // InternalPlayMorphiaModel.g:1193:2: ( ( 'embedded' ) )
            // InternalPlayMorphiaModel.g:1194:3: ( 'embedded' )
            {
             before(grammarAccess.getAttributeAccess().getEmbeddedEmbeddedKeyword_0_1_0()); 
            // InternalPlayMorphiaModel.g:1195:3: ( 'embedded' )
            // InternalPlayMorphiaModel.g:1196:4: 'embedded'
            {
             before(grammarAccess.getAttributeAccess().getEmbeddedEmbeddedKeyword_0_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getEmbeddedEmbeddedKeyword_0_1_0()); 

            }

             after(grammarAccess.getAttributeAccess().getEmbeddedEmbeddedKeyword_0_1_0()); 

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
    // $ANTLR end "rule__Attribute__EmbeddedAssignment_0_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalPlayMorphiaModel.g:1207:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1211:1: ( ( RULE_ID ) )
            // InternalPlayMorphiaModel.g:1212:2: ( RULE_ID )
            {
            // InternalPlayMorphiaModel.g:1212:2: ( RULE_ID )
            // InternalPlayMorphiaModel.g:1213:3: RULE_ID
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
    // InternalPlayMorphiaModel.g:1222:1: rule__Attribute__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1226:1: ( ( ( RULE_ID ) ) )
            // InternalPlayMorphiaModel.g:1227:2: ( ( RULE_ID ) )
            {
            // InternalPlayMorphiaModel.g:1227:2: ( ( RULE_ID ) )
            // InternalPlayMorphiaModel.g:1228:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeCrossReference_3_0()); 
            // InternalPlayMorphiaModel.g:1229:3: ( RULE_ID )
            // InternalPlayMorphiaModel.g:1230:4: RULE_ID
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
    // InternalPlayMorphiaModel.g:1241:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1245:1: ( ( RULE_ID ) )
            // InternalPlayMorphiaModel.g:1246:2: ( RULE_ID )
            {
            // InternalPlayMorphiaModel.g:1246:2: ( RULE_ID )
            // InternalPlayMorphiaModel.g:1247:3: RULE_ID
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


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalPlayMorphiaModel.g:1256:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlayMorphiaModel.g:1260:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalPlayMorphiaModel.g:1261:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalPlayMorphiaModel.g:1261:2: ( ruleQualifiedNameWithWildcard )
            // InternalPlayMorphiaModel.g:1262:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000034802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000036800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000136810L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});

}