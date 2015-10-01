package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INFORMATIONAL'", "'SUCCESS'", "'REDIRECTION'", "'CLIENT_ERROR'", "'SERVER_ERROR'", "'primitiveType'", "'dataModel'", "'{'", "'}'", "'extends'", "'restModel'", "'mappingModel'", "'('", "'<=>'", "')'", "':'", "'Resource'", "'create'", "'throws'", "'return'", "'find'", "'update'", "','", "'delete'", "'Service'", "'DAO'", "'many'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_INTEGER=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDomainModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:1: ( ruleDomainModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel61);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel68); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:1: ruleDomainModel : ( ( rule__DomainModel__Group__0 ) ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:2: ( ( ( rule__DomainModel__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__DomainModel__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:1: ( ( rule__DomainModel__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:1: ( rule__DomainModel__Group__0 )
            {
             before(grammarAccess.getDomainModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( rule__DomainModel__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: rule__DomainModel__Group__0
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__0_in_ruleDomainModel94);
            rule__DomainModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getGroup()); 

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:1: ( ruleType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType121);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType128); 

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
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType154);
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


    // $ANTLR start "entryRuleRestAPI"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:1: entryRuleRestAPI : ruleRestAPI EOF ;
    public final void entryRuleRestAPI() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:1: ( ruleRestAPI EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: ruleRestAPI EOF
            {
             before(grammarAccess.getRestAPIRule()); 
            pushFollow(FOLLOW_ruleRestAPI_in_entryRuleRestAPI181);
            ruleRestAPI();

            state._fsp--;

             after(grammarAccess.getRestAPIRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestAPI188); 

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
    // $ANTLR end "entryRuleRestAPI"


    // $ANTLR start "ruleRestAPI"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:1: ruleRestAPI : ( ( rule__RestAPI__Group__0 ) ) ;
    public final void ruleRestAPI() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:2: ( ( ( rule__RestAPI__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__RestAPI__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:1: ( ( rule__RestAPI__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:1: ( rule__RestAPI__Group__0 )
            {
             before(grammarAccess.getRestAPIAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( rule__RestAPI__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: rule__RestAPI__Group__0
            {
            pushFollow(FOLLOW_rule__RestAPI__Group__0_in_ruleRestAPI214);
            rule__RestAPI__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestAPIAccess().getGroup()); 

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
    // $ANTLR end "ruleRestAPI"


    // $ANTLR start "entryRulePrimitiveType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:1: ( rulePrimitiveType EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType241);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType248); 

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:153:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:157:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:158:1: ( ( rule__PrimitiveType__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:159:1: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( rule__PrimitiveType__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: rule__PrimitiveType__Group__0
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group__0_in_rulePrimitiveType274);
            rule__PrimitiveType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getGroup()); 

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleDataModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:173:1: ( ruleDataModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel301);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getDataModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel308); 

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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:181:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:185:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__DataModel__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:1: ( ( rule__DataModel__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:187:1: ( rule__DataModel__Group__0 )
            {
             before(grammarAccess.getDataModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( rule__DataModel__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: rule__DataModel__Group__0
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0_in_ruleDataModel334);
            rule__DataModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getGroup()); 

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
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleRestModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:1: entryRuleRestModel : ruleRestModel EOF ;
    public final void entryRuleRestModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:201:1: ( ruleRestModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: ruleRestModel EOF
            {
             before(grammarAccess.getRestModelRule()); 
            pushFollow(FOLLOW_ruleRestModel_in_entryRuleRestModel361);
            ruleRestModel();

            state._fsp--;

             after(grammarAccess.getRestModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestModel368); 

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
    // $ANTLR end "entryRuleRestModel"


    // $ANTLR start "ruleRestModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:209:1: ruleRestModel : ( ( rule__RestModel__Group__0 ) ) ;
    public final void ruleRestModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:213:2: ( ( ( rule__RestModel__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__RestModel__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:1: ( ( rule__RestModel__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:215:1: ( rule__RestModel__Group__0 )
            {
             before(grammarAccess.getRestModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( rule__RestModel__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: rule__RestModel__Group__0
            {
            pushFollow(FOLLOW_rule__RestModel__Group__0_in_ruleRestModel394);
            rule__RestModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestModelAccess().getGroup()); 

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
    // $ANTLR end "ruleRestModel"


    // $ANTLR start "entryRuleMappingModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:228:1: entryRuleMappingModel : ruleMappingModel EOF ;
    public final void entryRuleMappingModel() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:229:1: ( ruleMappingModel EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: ruleMappingModel EOF
            {
             before(grammarAccess.getMappingModelRule()); 
            pushFollow(FOLLOW_ruleMappingModel_in_entryRuleMappingModel421);
            ruleMappingModel();

            state._fsp--;

             after(grammarAccess.getMappingModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingModel428); 

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
    // $ANTLR end "entryRuleMappingModel"


    // $ANTLR start "ruleMappingModel"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:237:1: ruleMappingModel : ( ( rule__MappingModel__Group__0 ) ) ;
    public final void ruleMappingModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:241:2: ( ( ( rule__MappingModel__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__MappingModel__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:242:1: ( ( rule__MappingModel__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:243:1: ( rule__MappingModel__Group__0 )
            {
             before(grammarAccess.getMappingModelAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( rule__MappingModel__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: rule__MappingModel__Group__0
            {
            pushFollow(FOLLOW_rule__MappingModel__Group__0_in_ruleMappingModel454);
            rule__MappingModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getGroup()); 

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
    // $ANTLR end "ruleMappingModel"


    // $ANTLR start "entryRuleTransformation"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:256:1: entryRuleTransformation : ruleTransformation EOF ;
    public final void entryRuleTransformation() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:257:1: ( ruleTransformation EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: ruleTransformation EOF
            {
             before(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_ruleTransformation_in_entryRuleTransformation481);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getTransformationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformation488); 

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
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:265:1: ruleTransformation : ( ( rule__Transformation__Group__0 ) ) ;
    public final void ruleTransformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:269:2: ( ( ( rule__Transformation__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Transformation__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:270:1: ( ( rule__Transformation__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:271:1: ( rule__Transformation__Group__0 )
            {
             before(grammarAccess.getTransformationAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( rule__Transformation__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: rule__Transformation__Group__0
            {
            pushFollow(FOLLOW_rule__Transformation__Group__0_in_ruleTransformation514);
            rule__Transformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getGroup()); 

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
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleFeature"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:284:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:285:1: ( ruleFeature EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature541);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature548); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:293:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:297:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:298:1: ( ( rule__Feature__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:299:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( rule__Feature__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature574);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleResource"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:312:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:313:1: ( ruleResource EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource601);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource608); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:321:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:325:2: ( ( ( rule__Resource__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Resource__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:326:1: ( ( rule__Resource__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:327:1: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( rule__Resource__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_rule__Resource__Group__0_in_ruleResource634);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleService"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:340:1: entryRuleService : ruleService EOF ;
    public final void entryRuleService() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:341:1: ( ruleService EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: ruleService EOF
            {
             before(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService661);
            ruleService();

            state._fsp--;

             after(grammarAccess.getServiceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService668); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:349:1: ruleService : ( ( rule__Service__Group__0 ) ) ;
    public final void ruleService() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:353:2: ( ( ( rule__Service__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Service__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:354:1: ( ( rule__Service__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:355:1: ( rule__Service__Group__0 )
            {
             before(grammarAccess.getServiceAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( rule__Service__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: rule__Service__Group__0
            {
            pushFollow(FOLLOW_rule__Service__Group__0_in_ruleService694);
            rule__Service__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleDataAccessObject"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:368:1: entryRuleDataAccessObject : ruleDataAccessObject EOF ;
    public final void entryRuleDataAccessObject() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:369:1: ( ruleDataAccessObject EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: ruleDataAccessObject EOF
            {
             before(grammarAccess.getDataAccessObjectRule()); 
            pushFollow(FOLLOW_ruleDataAccessObject_in_entryRuleDataAccessObject721);
            ruleDataAccessObject();

            state._fsp--;

             after(grammarAccess.getDataAccessObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAccessObject728); 

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
    // $ANTLR end "entryRuleDataAccessObject"


    // $ANTLR start "ruleDataAccessObject"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:377:1: ruleDataAccessObject : ( ( rule__DataAccessObject__Group__0 ) ) ;
    public final void ruleDataAccessObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:381:2: ( ( ( rule__DataAccessObject__Group__0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__DataAccessObject__Group__0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:382:1: ( ( rule__DataAccessObject__Group__0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:383:1: ( rule__DataAccessObject__Group__0 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getGroup()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( rule__DataAccessObject__Group__0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: rule__DataAccessObject__Group__0
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__0_in_ruleDataAccessObject754);
            rule__DataAccessObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleDataAccessObject"


    // $ANTLR start "entryRuleRestException"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:396:1: entryRuleRestException : ruleRestException EOF ;
    public final void entryRuleRestException() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:397:1: ( ruleRestException EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: ruleRestException EOF
            {
             before(grammarAccess.getRestExceptionRule()); 
            pushFollow(FOLLOW_ruleRestException_in_entryRuleRestException781);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getRestExceptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestException788); 

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
    // $ANTLR end "entryRuleRestException"


    // $ANTLR start "ruleRestException"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:405:1: ruleRestException : ( ( rule__RestException__StatusCodeAssignment ) ) ;
    public final void ruleRestException() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:409:2: ( ( ( rule__RestException__StatusCodeAssignment ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__RestException__StatusCodeAssignment ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:410:1: ( ( rule__RestException__StatusCodeAssignment ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:411:1: ( rule__RestException__StatusCodeAssignment )
            {
             before(grammarAccess.getRestExceptionAccess().getStatusCodeAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( rule__RestException__StatusCodeAssignment )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: rule__RestException__StatusCodeAssignment
            {
            pushFollow(FOLLOW_rule__RestException__StatusCodeAssignment_in_ruleRestException814);
            rule__RestException__StatusCodeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRestExceptionAccess().getStatusCodeAssignment()); 

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
    // $ANTLR end "ruleRestException"


    // $ANTLR start "entryRuleJavaMethod"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:424:1: entryRuleJavaMethod : ruleJavaMethod EOF ;
    public final void entryRuleJavaMethod() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:425:1: ( ruleJavaMethod EOF )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: ruleJavaMethod EOF
            {
             before(grammarAccess.getJavaMethodRule()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_entryRuleJavaMethod841);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getJavaMethodRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaMethod848); 

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
    // $ANTLR end "entryRuleJavaMethod"


    // $ANTLR start "ruleJavaMethod"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:433:1: ruleJavaMethod : ( ( rule__JavaMethod__CodeAssignment ) ) ;
    public final void ruleJavaMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:437:2: ( ( ( rule__JavaMethod__CodeAssignment ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__JavaMethod__CodeAssignment ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:438:1: ( ( rule__JavaMethod__CodeAssignment ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:439:1: ( rule__JavaMethod__CodeAssignment )
            {
             before(grammarAccess.getJavaMethodAccess().getCodeAssignment()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( rule__JavaMethod__CodeAssignment )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: rule__JavaMethod__CodeAssignment
            {
            pushFollow(FOLLOW_rule__JavaMethod__CodeAssignment_in_ruleJavaMethod874);
            rule__JavaMethod__CodeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJavaMethodAccess().getCodeAssignment()); 

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
    // $ANTLR end "ruleJavaMethod"


    // $ANTLR start "ruleRestStatusCode"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:453:1: ruleRestStatusCode : ( ( rule__RestStatusCode__Alternatives ) ) ;
    public final void ruleRestStatusCode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ( ( ( rule__RestStatusCode__Alternatives ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:458:1: ( ( rule__RestStatusCode__Alternatives ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:458:1: ( ( rule__RestStatusCode__Alternatives ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:459:1: ( rule__RestStatusCode__Alternatives )
            {
             before(grammarAccess.getRestStatusCodeAccess().getAlternatives()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:460:1: ( rule__RestStatusCode__Alternatives )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:460:2: rule__RestStatusCode__Alternatives
            {
            pushFollow(FOLLOW_rule__RestStatusCode__Alternatives_in_ruleRestStatusCode911);
            rule__RestStatusCode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRestStatusCodeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRestStatusCode"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:471:1: rule__Type__Alternatives : ( ( rulePrimitiveType ) | ( ruleDataModel ) | ( ruleRestModel ) | ( ruleMappingModel ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:475:1: ( ( rulePrimitiveType ) | ( ruleDataModel ) | ( ruleRestModel ) | ( ruleMappingModel ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:476:1: ( rulePrimitiveType )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:476:1: ( rulePrimitiveType )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:477:1: rulePrimitiveType
                    {
                     before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives946);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:6: ( ruleDataModel )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:482:6: ( ruleDataModel )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ruleDataModel
                    {
                     before(grammarAccess.getTypeAccess().getDataModelParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDataModel_in_rule__Type__Alternatives963);
                    ruleDataModel();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataModelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:488:6: ( ruleRestModel )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:488:6: ( ruleRestModel )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:489:1: ruleRestModel
                    {
                     before(grammarAccess.getTypeAccess().getRestModelParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRestModel_in_rule__Type__Alternatives980);
                    ruleRestModel();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRestModelParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:6: ( ruleMappingModel )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:494:6: ( ruleMappingModel )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:495:1: ruleMappingModel
                    {
                     before(grammarAccess.getTypeAccess().getMappingModelParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleMappingModel_in_rule__Type__Alternatives997);
                    ruleMappingModel();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMappingModelParserRuleCall_3()); 

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


    // $ANTLR start "rule__RestStatusCode__Alternatives"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:505:1: rule__RestStatusCode__Alternatives : ( ( ( 'INFORMATIONAL' ) ) | ( ( 'SUCCESS' ) ) | ( ( 'REDIRECTION' ) ) | ( ( 'CLIENT_ERROR' ) ) | ( ( 'SERVER_ERROR' ) ) );
    public final void rule__RestStatusCode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:509:1: ( ( ( 'INFORMATIONAL' ) ) | ( ( 'SUCCESS' ) ) | ( ( 'REDIRECTION' ) ) | ( ( 'CLIENT_ERROR' ) ) | ( ( 'SERVER_ERROR' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ( ( 'INFORMATIONAL' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: ( ( 'INFORMATIONAL' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ( 'INFORMATIONAL' )
                    {
                     before(grammarAccess.getRestStatusCodeAccess().getINFORMATIONALEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:512:1: ( 'INFORMATIONAL' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:512:3: 'INFORMATIONAL'
                    {
                    match(input,12,FOLLOW_12_in_rule__RestStatusCode__Alternatives1030); 

                    }

                     after(grammarAccess.getRestStatusCodeAccess().getINFORMATIONALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:6: ( ( 'SUCCESS' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:517:6: ( ( 'SUCCESS' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:518:1: ( 'SUCCESS' )
                    {
                     before(grammarAccess.getRestStatusCodeAccess().getSUCCESSEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:519:1: ( 'SUCCESS' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:519:3: 'SUCCESS'
                    {
                    match(input,13,FOLLOW_13_in_rule__RestStatusCode__Alternatives1051); 

                    }

                     after(grammarAccess.getRestStatusCodeAccess().getSUCCESSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:6: ( ( 'REDIRECTION' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:6: ( ( 'REDIRECTION' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( 'REDIRECTION' )
                    {
                     before(grammarAccess.getRestStatusCodeAccess().getREDIRECTIONEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( 'REDIRECTION' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:3: 'REDIRECTION'
                    {
                    match(input,14,FOLLOW_14_in_rule__RestStatusCode__Alternatives1072); 

                    }

                     after(grammarAccess.getRestStatusCodeAccess().getREDIRECTIONEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:531:6: ( ( 'CLIENT_ERROR' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:531:6: ( ( 'CLIENT_ERROR' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:532:1: ( 'CLIENT_ERROR' )
                    {
                     before(grammarAccess.getRestStatusCodeAccess().getCLIENT_ERROREnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:533:1: ( 'CLIENT_ERROR' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:533:3: 'CLIENT_ERROR'
                    {
                    match(input,15,FOLLOW_15_in_rule__RestStatusCode__Alternatives1093); 

                    }

                     after(grammarAccess.getRestStatusCodeAccess().getCLIENT_ERROREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:6: ( ( 'SERVER_ERROR' ) )
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:538:6: ( ( 'SERVER_ERROR' ) )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ( 'SERVER_ERROR' )
                    {
                     before(grammarAccess.getRestStatusCodeAccess().getSERVER_ERROREnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:540:1: ( 'SERVER_ERROR' )
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:540:3: 'SERVER_ERROR'
                    {
                    match(input,16,FOLLOW_16_in_rule__RestStatusCode__Alternatives1114); 

                    }

                     after(grammarAccess.getRestStatusCodeAccess().getSERVER_ERROREnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__RestStatusCode__Alternatives"


    // $ANTLR start "rule__DomainModel__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: rule__DomainModel__Group__0 : rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 ;
    public final void rule__DomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:556:1: ( rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:557:2: rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__0__Impl_in_rule__DomainModel__Group__01147);
            rule__DomainModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DomainModel__Group__1_in_rule__DomainModel__Group__01150);
            rule__DomainModel__Group__1();

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
    // $ANTLR end "rule__DomainModel__Group__0"


    // $ANTLR start "rule__DomainModel__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: rule__DomainModel__Group__0__Impl : ( ( rule__DomainModel__ElementsAssignment_0 )* ) ;
    public final void rule__DomainModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: ( ( ( rule__DomainModel__ElementsAssignment_0 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( ( rule__DomainModel__ElementsAssignment_0 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:569:1: ( ( rule__DomainModel__ElementsAssignment_0 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( rule__DomainModel__ElementsAssignment_0 )*
            {
             before(grammarAccess.getDomainModelAccess().getElementsAssignment_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: ( rule__DomainModel__ElementsAssignment_0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=18)||(LA3_0>=22 && LA3_0<=23)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:2: rule__DomainModel__ElementsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__ElementsAssignment_0_in_rule__DomainModel__Group__0__Impl1177);
            	    rule__DomainModel__ElementsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getElementsAssignment_0()); 

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
    // $ANTLR end "rule__DomainModel__Group__0__Impl"


    // $ANTLR start "rule__DomainModel__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: rule__DomainModel__Group__1 : rule__DomainModel__Group__1__Impl ;
    public final void rule__DomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: ( rule__DomainModel__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:586:2: rule__DomainModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainModel__Group__1__Impl_in_rule__DomainModel__Group__11208);
            rule__DomainModel__Group__1__Impl();

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
    // $ANTLR end "rule__DomainModel__Group__1"


    // $ANTLR start "rule__DomainModel__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: rule__DomainModel__Group__1__Impl : ( ( rule__DomainModel__ApisAssignment_1 )* ) ;
    public final void rule__DomainModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ( ( ( rule__DomainModel__ApisAssignment_1 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__DomainModel__ApisAssignment_1 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__DomainModel__ApisAssignment_1 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ( rule__DomainModel__ApisAssignment_1 )*
            {
             before(grammarAccess.getDomainModelAccess().getApisAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( rule__DomainModel__ApisAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:2: rule__DomainModel__ApisAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__DomainModel__ApisAssignment_1_in_rule__DomainModel__Group__1__Impl1235);
            	    rule__DomainModel__ApisAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getApisAssignment_1()); 

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
    // $ANTLR end "rule__DomainModel__Group__1__Impl"


    // $ANTLR start "rule__RestAPI__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:613:1: rule__RestAPI__Group__0 : rule__RestAPI__Group__0__Impl rule__RestAPI__Group__1 ;
    public final void rule__RestAPI__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:617:1: ( rule__RestAPI__Group__0__Impl rule__RestAPI__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:618:2: rule__RestAPI__Group__0__Impl rule__RestAPI__Group__1
            {
            pushFollow(FOLLOW_rule__RestAPI__Group__0__Impl_in_rule__RestAPI__Group__01270);
            rule__RestAPI__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestAPI__Group__1_in_rule__RestAPI__Group__01273);
            rule__RestAPI__Group__1();

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
    // $ANTLR end "rule__RestAPI__Group__0"


    // $ANTLR start "rule__RestAPI__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: rule__RestAPI__Group__0__Impl : ( ( rule__RestAPI__ResourceAssignment_0 ) ) ;
    public final void rule__RestAPI__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:1: ( ( ( rule__RestAPI__ResourceAssignment_0 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ( ( rule__RestAPI__ResourceAssignment_0 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:630:1: ( ( rule__RestAPI__ResourceAssignment_0 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ( rule__RestAPI__ResourceAssignment_0 )
            {
             before(grammarAccess.getRestAPIAccess().getResourceAssignment_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( rule__RestAPI__ResourceAssignment_0 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:2: rule__RestAPI__ResourceAssignment_0
            {
            pushFollow(FOLLOW_rule__RestAPI__ResourceAssignment_0_in_rule__RestAPI__Group__0__Impl1300);
            rule__RestAPI__ResourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRestAPIAccess().getResourceAssignment_0()); 

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
    // $ANTLR end "rule__RestAPI__Group__0__Impl"


    // $ANTLR start "rule__RestAPI__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:642:1: rule__RestAPI__Group__1 : rule__RestAPI__Group__1__Impl rule__RestAPI__Group__2 ;
    public final void rule__RestAPI__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( rule__RestAPI__Group__1__Impl rule__RestAPI__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:2: rule__RestAPI__Group__1__Impl rule__RestAPI__Group__2
            {
            pushFollow(FOLLOW_rule__RestAPI__Group__1__Impl_in_rule__RestAPI__Group__11330);
            rule__RestAPI__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestAPI__Group__2_in_rule__RestAPI__Group__11333);
            rule__RestAPI__Group__2();

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
    // $ANTLR end "rule__RestAPI__Group__1"


    // $ANTLR start "rule__RestAPI__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:654:1: rule__RestAPI__Group__1__Impl : ( ( rule__RestAPI__ServiceAssignment_1 )* ) ;
    public final void rule__RestAPI__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:658:1: ( ( ( rule__RestAPI__ServiceAssignment_1 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ( ( rule__RestAPI__ServiceAssignment_1 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ( ( rule__RestAPI__ServiceAssignment_1 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:660:1: ( rule__RestAPI__ServiceAssignment_1 )*
            {
             before(grammarAccess.getRestAPIAccess().getServiceAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:661:1: ( rule__RestAPI__ServiceAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==36) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:661:2: rule__RestAPI__ServiceAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__RestAPI__ServiceAssignment_1_in_rule__RestAPI__Group__1__Impl1360);
            	    rule__RestAPI__ServiceAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRestAPIAccess().getServiceAssignment_1()); 

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
    // $ANTLR end "rule__RestAPI__Group__1__Impl"


    // $ANTLR start "rule__RestAPI__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: rule__RestAPI__Group__2 : rule__RestAPI__Group__2__Impl ;
    public final void rule__RestAPI__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:1: ( rule__RestAPI__Group__2__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:2: rule__RestAPI__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RestAPI__Group__2__Impl_in_rule__RestAPI__Group__21391);
            rule__RestAPI__Group__2__Impl();

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
    // $ANTLR end "rule__RestAPI__Group__2"


    // $ANTLR start "rule__RestAPI__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:682:1: rule__RestAPI__Group__2__Impl : ( ( rule__RestAPI__DaoAssignment_2 )* ) ;
    public final void rule__RestAPI__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: ( ( ( rule__RestAPI__DaoAssignment_2 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( ( rule__RestAPI__DaoAssignment_2 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:687:1: ( ( rule__RestAPI__DaoAssignment_2 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: ( rule__RestAPI__DaoAssignment_2 )*
            {
             before(grammarAccess.getRestAPIAccess().getDaoAssignment_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:689:1: ( rule__RestAPI__DaoAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==37) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:689:2: rule__RestAPI__DaoAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__RestAPI__DaoAssignment_2_in_rule__RestAPI__Group__2__Impl1418);
            	    rule__RestAPI__DaoAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRestAPIAccess().getDaoAssignment_2()); 

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
    // $ANTLR end "rule__RestAPI__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:705:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:709:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:710:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group__0__Impl_in_rule__PrimitiveType__Group__01455);
            rule__PrimitiveType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrimitiveType__Group__1_in_rule__PrimitiveType__Group__01458);
            rule__PrimitiveType__Group__1();

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
    // $ANTLR end "rule__PrimitiveType__Group__0"


    // $ANTLR start "rule__PrimitiveType__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:717:1: rule__PrimitiveType__Group__0__Impl : ( 'primitiveType' ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( ( 'primitiveType' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: ( 'primitiveType' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: ( 'primitiveType' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:1: 'primitiveType'
            {
             before(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__PrimitiveType__Group__0__Impl1486); 
             after(grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeKeyword_0()); 

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
    // $ANTLR end "rule__PrimitiveType__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: ( rule__PrimitiveType__Group__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:2: rule__PrimitiveType__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PrimitiveType__Group__1__Impl_in_rule__PrimitiveType__Group__11517);
            rule__PrimitiveType__Group__1__Impl();

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
    // $ANTLR end "rule__PrimitiveType__Group__1"


    // $ANTLR start "rule__PrimitiveType__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: ( ( ( rule__PrimitiveType__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:752:1: ( ( rule__PrimitiveType__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:752:1: ( ( rule__PrimitiveType__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:753:1: ( rule__PrimitiveType__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( rule__PrimitiveType__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:754:2: rule__PrimitiveType__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PrimitiveType__NameAssignment_1_in_rule__PrimitiveType__Group__1__Impl1544);
            rule__PrimitiveType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PrimitiveType__Group__1__Impl"


    // $ANTLR start "rule__DataModel__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01578);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01581);
            rule__DataModel__Group__1();

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
    // $ANTLR end "rule__DataModel__Group__0"


    // $ANTLR start "rule__DataModel__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: rule__DataModel__Group__0__Impl : ( 'dataModel' ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: ( ( 'dataModel' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: ( 'dataModel' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:785:1: ( 'dataModel' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: 'dataModel'
            {
             before(grammarAccess.getDataModelAccess().getDataModelKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__DataModel__Group__0__Impl1609); 
             after(grammarAccess.getDataModelAccess().getDataModelKeyword_0()); 

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
    // $ANTLR end "rule__DataModel__Group__0__Impl"


    // $ANTLR start "rule__DataModel__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:803:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:804:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__11640);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__11643);
            rule__DataModel__Group__2();

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
    // $ANTLR end "rule__DataModel__Group__1"


    // $ANTLR start "rule__DataModel__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__NameAssignment_1 ) ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:815:1: ( ( ( rule__DataModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: ( ( rule__DataModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: ( ( rule__DataModel__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:817:1: ( rule__DataModel__NameAssignment_1 )
            {
             before(grammarAccess.getDataModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( rule__DataModel__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:818:2: rule__DataModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataModel__NameAssignment_1_in_rule__DataModel__Group__1__Impl1670);
            rule__DataModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataModel__Group__1__Impl"


    // $ANTLR start "rule__DataModel__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__21700);
            rule__DataModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__21703);
            rule__DataModel__Group__3();

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
    // $ANTLR end "rule__DataModel__Group__2"


    // $ANTLR start "rule__DataModel__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: rule__DataModel__Group__2__Impl : ( ( rule__DataModel__Group_2__0 )? ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: ( ( ( rule__DataModel__Group_2__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: ( ( rule__DataModel__Group_2__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: ( ( rule__DataModel__Group_2__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:846:1: ( rule__DataModel__Group_2__0 )?
            {
             before(grammarAccess.getDataModelAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: ( rule__DataModel__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:2: rule__DataModel__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DataModel__Group_2__0_in_rule__DataModel__Group__2__Impl1730);
                    rule__DataModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataModelAccess().getGroup_2()); 

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
    // $ANTLR end "rule__DataModel__Group__2__Impl"


    // $ANTLR start "rule__DataModel__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:862:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__31761);
            rule__DataModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__31764);
            rule__DataModel__Group__4();

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
    // $ANTLR end "rule__DataModel__Group__3"


    // $ANTLR start "rule__DataModel__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:869:1: rule__DataModel__Group__3__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__DataModel__Group__3__Impl1792); 
             after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__DataModel__Group__3__Impl"


    // $ANTLR start "rule__DataModel__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:888:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl rule__DataModel__Group__5 ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: ( rule__DataModel__Group__4__Impl rule__DataModel__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:2: rule__DataModel__Group__4__Impl rule__DataModel__Group__5
            {
            pushFollow(FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__41823);
            rule__DataModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__41826);
            rule__DataModel__Group__5();

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
    // $ANTLR end "rule__DataModel__Group__4"


    // $ANTLR start "rule__DataModel__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: rule__DataModel__Group__4__Impl : ( ( rule__DataModel__FeaturesAssignment_4 )* ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: ( ( ( rule__DataModel__FeaturesAssignment_4 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: ( ( rule__DataModel__FeaturesAssignment_4 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:905:1: ( ( rule__DataModel__FeaturesAssignment_4 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: ( rule__DataModel__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getDataModelAccess().getFeaturesAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:907:1: ( rule__DataModel__FeaturesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==38) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:907:2: rule__DataModel__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__DataModel__FeaturesAssignment_4_in_rule__DataModel__Group__4__Impl1853);
            	    rule__DataModel__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getFeaturesAssignment_4()); 

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
    // $ANTLR end "rule__DataModel__Group__4__Impl"


    // $ANTLR start "rule__DataModel__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:917:1: rule__DataModel__Group__5 : rule__DataModel__Group__5__Impl ;
    public final void rule__DataModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:921:1: ( rule__DataModel__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:2: rule__DataModel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__51884);
            rule__DataModel__Group__5__Impl();

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
    // $ANTLR end "rule__DataModel__Group__5"


    // $ANTLR start "rule__DataModel__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: rule__DataModel__Group__5__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__DataModel__Group__5__Impl1912); 
             after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__DataModel__Group__5__Impl"


    // $ANTLR start "rule__DataModel__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:959:1: rule__DataModel__Group_2__0 : rule__DataModel__Group_2__0__Impl rule__DataModel__Group_2__1 ;
    public final void rule__DataModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:963:1: ( rule__DataModel__Group_2__0__Impl rule__DataModel__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:964:2: rule__DataModel__Group_2__0__Impl rule__DataModel__Group_2__1
            {
            pushFollow(FOLLOW_rule__DataModel__Group_2__0__Impl_in_rule__DataModel__Group_2__01955);
            rule__DataModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataModel__Group_2__1_in_rule__DataModel__Group_2__01958);
            rule__DataModel__Group_2__1();

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
    // $ANTLR end "rule__DataModel__Group_2__0"


    // $ANTLR start "rule__DataModel__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: rule__DataModel__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__DataModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:975:1: ( ( 'extends' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:1: ( 'extends' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:1: ( 'extends' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: 'extends'
            {
             before(grammarAccess.getDataModelAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__DataModel__Group_2__0__Impl1986); 
             after(grammarAccess.getDataModelAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__DataModel__Group_2__0__Impl"


    // $ANTLR start "rule__DataModel__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: rule__DataModel__Group_2__1 : rule__DataModel__Group_2__1__Impl ;
    public final void rule__DataModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: ( rule__DataModel__Group_2__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:2: rule__DataModel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DataModel__Group_2__1__Impl_in_rule__DataModel__Group_2__12017);
            rule__DataModel__Group_2__1__Impl();

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
    // $ANTLR end "rule__DataModel__Group_2__1"


    // $ANTLR start "rule__DataModel__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: rule__DataModel__Group_2__1__Impl : ( ( rule__DataModel__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__DataModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1005:1: ( ( ( rule__DataModel__SuperTypeAssignment_2_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: ( ( rule__DataModel__SuperTypeAssignment_2_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: ( ( rule__DataModel__SuperTypeAssignment_2_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( rule__DataModel__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getDataModelAccess().getSuperTypeAssignment_2_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( rule__DataModel__SuperTypeAssignment_2_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:2: rule__DataModel__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DataModel__SuperTypeAssignment_2_1_in_rule__DataModel__Group_2__1__Impl2044);
            rule__DataModel__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getSuperTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__DataModel__Group_2__1__Impl"


    // $ANTLR start "rule__RestModel__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: rule__RestModel__Group__0 : rule__RestModel__Group__0__Impl rule__RestModel__Group__1 ;
    public final void rule__RestModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( rule__RestModel__Group__0__Impl rule__RestModel__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:2: rule__RestModel__Group__0__Impl rule__RestModel__Group__1
            {
            pushFollow(FOLLOW_rule__RestModel__Group__0__Impl_in_rule__RestModel__Group__02078);
            rule__RestModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestModel__Group__1_in_rule__RestModel__Group__02081);
            rule__RestModel__Group__1();

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
    // $ANTLR end "rule__RestModel__Group__0"


    // $ANTLR start "rule__RestModel__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1034:1: rule__RestModel__Group__0__Impl : ( 'restModel' ) ;
    public final void rule__RestModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( ( 'restModel' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( 'restModel' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( 'restModel' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: 'restModel'
            {
             before(grammarAccess.getRestModelAccess().getRestModelKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__RestModel__Group__0__Impl2109); 
             after(grammarAccess.getRestModelAccess().getRestModelKeyword_0()); 

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
    // $ANTLR end "rule__RestModel__Group__0__Impl"


    // $ANTLR start "rule__RestModel__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:1: rule__RestModel__Group__1 : rule__RestModel__Group__1__Impl rule__RestModel__Group__2 ;
    public final void rule__RestModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:1: ( rule__RestModel__Group__1__Impl rule__RestModel__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1058:2: rule__RestModel__Group__1__Impl rule__RestModel__Group__2
            {
            pushFollow(FOLLOW_rule__RestModel__Group__1__Impl_in_rule__RestModel__Group__12140);
            rule__RestModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestModel__Group__2_in_rule__RestModel__Group__12143);
            rule__RestModel__Group__2();

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
    // $ANTLR end "rule__RestModel__Group__1"


    // $ANTLR start "rule__RestModel__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1065:1: rule__RestModel__Group__1__Impl : ( ( rule__RestModel__NameAssignment_1 ) ) ;
    public final void rule__RestModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( ( ( rule__RestModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ( ( rule__RestModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ( ( rule__RestModel__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:1: ( rule__RestModel__NameAssignment_1 )
            {
             before(grammarAccess.getRestModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:1: ( rule__RestModel__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1072:2: rule__RestModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RestModel__NameAssignment_1_in_rule__RestModel__Group__1__Impl2170);
            rule__RestModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRestModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RestModel__Group__1__Impl"


    // $ANTLR start "rule__RestModel__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: rule__RestModel__Group__2 : rule__RestModel__Group__2__Impl rule__RestModel__Group__3 ;
    public final void rule__RestModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:1: ( rule__RestModel__Group__2__Impl rule__RestModel__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1087:2: rule__RestModel__Group__2__Impl rule__RestModel__Group__3
            {
            pushFollow(FOLLOW_rule__RestModel__Group__2__Impl_in_rule__RestModel__Group__22200);
            rule__RestModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestModel__Group__3_in_rule__RestModel__Group__22203);
            rule__RestModel__Group__3();

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
    // $ANTLR end "rule__RestModel__Group__2"


    // $ANTLR start "rule__RestModel__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1094:1: rule__RestModel__Group__2__Impl : ( ( rule__RestModel__Group_2__0 )? ) ;
    public final void rule__RestModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ( ( ( rule__RestModel__Group_2__0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: ( ( rule__RestModel__Group_2__0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: ( ( rule__RestModel__Group_2__0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:1: ( rule__RestModel__Group_2__0 )?
            {
             before(grammarAccess.getRestModelAccess().getGroup_2()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:1: ( rule__RestModel__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:2: rule__RestModel__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__RestModel__Group_2__0_in_rule__RestModel__Group__2__Impl2230);
                    rule__RestModel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestModelAccess().getGroup_2()); 

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
    // $ANTLR end "rule__RestModel__Group__2__Impl"


    // $ANTLR start "rule__RestModel__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: rule__RestModel__Group__3 : rule__RestModel__Group__3__Impl rule__RestModel__Group__4 ;
    public final void rule__RestModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:1: ( rule__RestModel__Group__3__Impl rule__RestModel__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:2: rule__RestModel__Group__3__Impl rule__RestModel__Group__4
            {
            pushFollow(FOLLOW_rule__RestModel__Group__3__Impl_in_rule__RestModel__Group__32261);
            rule__RestModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestModel__Group__4_in_rule__RestModel__Group__32264);
            rule__RestModel__Group__4();

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
    // $ANTLR end "rule__RestModel__Group__3"


    // $ANTLR start "rule__RestModel__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:1: rule__RestModel__Group__3__Impl : ( '{' ) ;
    public final void rule__RestModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: '{'
            {
             before(grammarAccess.getRestModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_19_in_rule__RestModel__Group__3__Impl2292); 
             after(grammarAccess.getRestModelAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__RestModel__Group__3__Impl"


    // $ANTLR start "rule__RestModel__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: rule__RestModel__Group__4 : rule__RestModel__Group__4__Impl rule__RestModel__Group__5 ;
    public final void rule__RestModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( rule__RestModel__Group__4__Impl rule__RestModel__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:2: rule__RestModel__Group__4__Impl rule__RestModel__Group__5
            {
            pushFollow(FOLLOW_rule__RestModel__Group__4__Impl_in_rule__RestModel__Group__42323);
            rule__RestModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestModel__Group__5_in_rule__RestModel__Group__42326);
            rule__RestModel__Group__5();

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
    // $ANTLR end "rule__RestModel__Group__4"


    // $ANTLR start "rule__RestModel__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:1: rule__RestModel__Group__4__Impl : ( ( rule__RestModel__FeaturesAssignment_4 )* ) ;
    public final void rule__RestModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ( ( ( rule__RestModel__FeaturesAssignment_4 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( ( rule__RestModel__FeaturesAssignment_4 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( ( rule__RestModel__FeaturesAssignment_4 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: ( rule__RestModel__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getRestModelAccess().getFeaturesAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:1: ( rule__RestModel__FeaturesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==38) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1161:2: rule__RestModel__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__RestModel__FeaturesAssignment_4_in_rule__RestModel__Group__4__Impl2353);
            	    rule__RestModel__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRestModelAccess().getFeaturesAssignment_4()); 

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
    // $ANTLR end "rule__RestModel__Group__4__Impl"


    // $ANTLR start "rule__RestModel__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: rule__RestModel__Group__5 : rule__RestModel__Group__5__Impl ;
    public final void rule__RestModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1175:1: ( rule__RestModel__Group__5__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1176:2: rule__RestModel__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__RestModel__Group__5__Impl_in_rule__RestModel__Group__52384);
            rule__RestModel__Group__5__Impl();

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
    // $ANTLR end "rule__RestModel__Group__5"


    // $ANTLR start "rule__RestModel__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: rule__RestModel__Group__5__Impl : ( '}' ) ;
    public final void rule__RestModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1186:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: '}'
            {
             before(grammarAccess.getRestModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__RestModel__Group__5__Impl2412); 
             after(grammarAccess.getRestModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__RestModel__Group__5__Impl"


    // $ANTLR start "rule__RestModel__Group_2__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: rule__RestModel__Group_2__0 : rule__RestModel__Group_2__0__Impl rule__RestModel__Group_2__1 ;
    public final void rule__RestModel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: ( rule__RestModel__Group_2__0__Impl rule__RestModel__Group_2__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:2: rule__RestModel__Group_2__0__Impl rule__RestModel__Group_2__1
            {
            pushFollow(FOLLOW_rule__RestModel__Group_2__0__Impl_in_rule__RestModel__Group_2__02455);
            rule__RestModel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RestModel__Group_2__1_in_rule__RestModel__Group_2__02458);
            rule__RestModel__Group_2__1();

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
    // $ANTLR end "rule__RestModel__Group_2__0"


    // $ANTLR start "rule__RestModel__Group_2__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:1: rule__RestModel__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__RestModel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( ( 'extends' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( 'extends' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( 'extends' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: 'extends'
            {
             before(grammarAccess.getRestModelAccess().getExtendsKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__RestModel__Group_2__0__Impl2486); 
             after(grammarAccess.getRestModelAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__RestModel__Group_2__0__Impl"


    // $ANTLR start "rule__RestModel__Group_2__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: rule__RestModel__Group_2__1 : rule__RestModel__Group_2__1__Impl ;
    public final void rule__RestModel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: ( rule__RestModel__Group_2__1__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:2: rule__RestModel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RestModel__Group_2__1__Impl_in_rule__RestModel__Group_2__12517);
            rule__RestModel__Group_2__1__Impl();

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
    // $ANTLR end "rule__RestModel__Group_2__1"


    // $ANTLR start "rule__RestModel__Group_2__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1255:1: rule__RestModel__Group_2__1__Impl : ( ( rule__RestModel__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__RestModel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( ( ( rule__RestModel__SuperTypeAssignment_2_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( ( rule__RestModel__SuperTypeAssignment_2_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( ( rule__RestModel__SuperTypeAssignment_2_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: ( rule__RestModel__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getRestModelAccess().getSuperTypeAssignment_2_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: ( rule__RestModel__SuperTypeAssignment_2_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:2: rule__RestModel__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RestModel__SuperTypeAssignment_2_1_in_rule__RestModel__Group_2__1__Impl2544);
            rule__RestModel__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRestModelAccess().getSuperTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__RestModel__Group_2__1__Impl"


    // $ANTLR start "rule__MappingModel__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:1: rule__MappingModel__Group__0 : rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1 ;
    public final void rule__MappingModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: ( rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:2: rule__MappingModel__Group__0__Impl rule__MappingModel__Group__1
            {
            pushFollow(FOLLOW_rule__MappingModel__Group__0__Impl_in_rule__MappingModel__Group__02578);
            rule__MappingModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModel__Group__1_in_rule__MappingModel__Group__02581);
            rule__MappingModel__Group__1();

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
    // $ANTLR end "rule__MappingModel__Group__0"


    // $ANTLR start "rule__MappingModel__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: rule__MappingModel__Group__0__Impl : ( 'mappingModel' ) ;
    public final void rule__MappingModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1292:1: ( ( 'mappingModel' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( 'mappingModel' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1293:1: ( 'mappingModel' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: 'mappingModel'
            {
             before(grammarAccess.getMappingModelAccess().getMappingModelKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__MappingModel__Group__0__Impl2609); 
             after(grammarAccess.getMappingModelAccess().getMappingModelKeyword_0()); 

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
    // $ANTLR end "rule__MappingModel__Group__0__Impl"


    // $ANTLR start "rule__MappingModel__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:1: rule__MappingModel__Group__1 : rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2 ;
    public final void rule__MappingModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:1: ( rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:2: rule__MappingModel__Group__1__Impl rule__MappingModel__Group__2
            {
            pushFollow(FOLLOW_rule__MappingModel__Group__1__Impl_in_rule__MappingModel__Group__12640);
            rule__MappingModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModel__Group__2_in_rule__MappingModel__Group__12643);
            rule__MappingModel__Group__2();

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
    // $ANTLR end "rule__MappingModel__Group__1"


    // $ANTLR start "rule__MappingModel__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: rule__MappingModel__Group__1__Impl : ( ( rule__MappingModel__NameAssignment_1 ) ) ;
    public final void rule__MappingModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1323:1: ( ( ( rule__MappingModel__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:1: ( ( rule__MappingModel__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1324:1: ( ( rule__MappingModel__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: ( rule__MappingModel__NameAssignment_1 )
            {
             before(grammarAccess.getMappingModelAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:1: ( rule__MappingModel__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1326:2: rule__MappingModel__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__MappingModel__NameAssignment_1_in_rule__MappingModel__Group__1__Impl2670);
            rule__MappingModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MappingModel__Group__1__Impl"


    // $ANTLR start "rule__MappingModel__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: rule__MappingModel__Group__2 : rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3 ;
    public final void rule__MappingModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:2: rule__MappingModel__Group__2__Impl rule__MappingModel__Group__3
            {
            pushFollow(FOLLOW_rule__MappingModel__Group__2__Impl_in_rule__MappingModel__Group__22700);
            rule__MappingModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModel__Group__3_in_rule__MappingModel__Group__22703);
            rule__MappingModel__Group__3();

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
    // $ANTLR end "rule__MappingModel__Group__2"


    // $ANTLR start "rule__MappingModel__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: rule__MappingModel__Group__2__Impl : ( '{' ) ;
    public final void rule__MappingModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: '{'
            {
             before(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_19_in_rule__MappingModel__Group__2__Impl2731); 
             after(grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__MappingModel__Group__2__Impl"


    // $ANTLR start "rule__MappingModel__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:1: rule__MappingModel__Group__3 : rule__MappingModel__Group__3__Impl rule__MappingModel__Group__4 ;
    public final void rule__MappingModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( rule__MappingModel__Group__3__Impl rule__MappingModel__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1372:2: rule__MappingModel__Group__3__Impl rule__MappingModel__Group__4
            {
            pushFollow(FOLLOW_rule__MappingModel__Group__3__Impl_in_rule__MappingModel__Group__32762);
            rule__MappingModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MappingModel__Group__4_in_rule__MappingModel__Group__32765);
            rule__MappingModel__Group__4();

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
    // $ANTLR end "rule__MappingModel__Group__3"


    // $ANTLR start "rule__MappingModel__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: rule__MappingModel__Group__3__Impl : ( ( rule__MappingModel__TransformationAssignment_3 )* ) ;
    public final void rule__MappingModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: ( ( ( rule__MappingModel__TransformationAssignment_3 )* ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1384:1: ( ( rule__MappingModel__TransformationAssignment_3 )* )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1384:1: ( ( rule__MappingModel__TransformationAssignment_3 )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:1: ( rule__MappingModel__TransformationAssignment_3 )*
            {
             before(grammarAccess.getMappingModelAccess().getTransformationAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: ( rule__MappingModel__TransformationAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:2: rule__MappingModel__TransformationAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__MappingModel__TransformationAssignment_3_in_rule__MappingModel__Group__3__Impl2792);
            	    rule__MappingModel__TransformationAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMappingModelAccess().getTransformationAssignment_3()); 

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
    // $ANTLR end "rule__MappingModel__Group__3__Impl"


    // $ANTLR start "rule__MappingModel__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: rule__MappingModel__Group__4 : rule__MappingModel__Group__4__Impl ;
    public final void rule__MappingModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1400:1: ( rule__MappingModel__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:2: rule__MappingModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MappingModel__Group__4__Impl_in_rule__MappingModel__Group__42823);
            rule__MappingModel__Group__4__Impl();

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
    // $ANTLR end "rule__MappingModel__Group__4"


    // $ANTLR start "rule__MappingModel__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1407:1: rule__MappingModel__Group__4__Impl : ( '}' ) ;
    public final void rule__MappingModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1413:1: '}'
            {
             before(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__MappingModel__Group__4__Impl2851); 
             after(grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__MappingModel__Group__4__Impl"


    // $ANTLR start "rule__Transformation__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: rule__Transformation__Group__0 : rule__Transformation__Group__0__Impl rule__Transformation__Group__1 ;
    public final void rule__Transformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1440:1: ( rule__Transformation__Group__0__Impl rule__Transformation__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:2: rule__Transformation__Group__0__Impl rule__Transformation__Group__1
            {
            pushFollow(FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__02892);
            rule__Transformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__02895);
            rule__Transformation__Group__1();

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
    // $ANTLR end "rule__Transformation__Group__0"


    // $ANTLR start "rule__Transformation__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:1: rule__Transformation__Group__0__Impl : ( '(' ) ;
    public final void rule__Transformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1453:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: '('
            {
             before(grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Transformation__Group__0__Impl2923); 
             after(grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Transformation__Group__0__Impl"


    // $ANTLR start "rule__Transformation__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1467:1: rule__Transformation__Group__1 : rule__Transformation__Group__1__Impl rule__Transformation__Group__2 ;
    public final void rule__Transformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( rule__Transformation__Group__1__Impl rule__Transformation__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:2: rule__Transformation__Group__1__Impl rule__Transformation__Group__2
            {
            pushFollow(FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__12954);
            rule__Transformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__12957);
            rule__Transformation__Group__2();

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
    // $ANTLR end "rule__Transformation__Group__1"


    // $ANTLR start "rule__Transformation__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: rule__Transformation__Group__1__Impl : ( ( rule__Transformation__DataModelAssignment_1 ) ) ;
    public final void rule__Transformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: ( ( ( rule__Transformation__DataModelAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( ( rule__Transformation__DataModelAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1484:1: ( ( rule__Transformation__DataModelAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: ( rule__Transformation__DataModelAssignment_1 )
            {
             before(grammarAccess.getTransformationAccess().getDataModelAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:1: ( rule__Transformation__DataModelAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1486:2: rule__Transformation__DataModelAssignment_1
            {
            pushFollow(FOLLOW_rule__Transformation__DataModelAssignment_1_in_rule__Transformation__Group__1__Impl2984);
            rule__Transformation__DataModelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getDataModelAssignment_1()); 

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
    // $ANTLR end "rule__Transformation__Group__1__Impl"


    // $ANTLR start "rule__Transformation__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: rule__Transformation__Group__2 : rule__Transformation__Group__2__Impl rule__Transformation__Group__3 ;
    public final void rule__Transformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ( rule__Transformation__Group__2__Impl rule__Transformation__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:2: rule__Transformation__Group__2__Impl rule__Transformation__Group__3
            {
            pushFollow(FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__23014);
            rule__Transformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__23017);
            rule__Transformation__Group__3();

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
    // $ANTLR end "rule__Transformation__Group__2"


    // $ANTLR start "rule__Transformation__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: rule__Transformation__Group__2__Impl : ( '<=>' ) ;
    public final void rule__Transformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1512:1: ( ( '<=>' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: ( '<=>' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1513:1: ( '<=>' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: '<=>'
            {
             before(grammarAccess.getTransformationAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_2()); 
            match(input,25,FOLLOW_25_in_rule__Transformation__Group__2__Impl3045); 
             after(grammarAccess.getTransformationAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Transformation__Group__2__Impl"


    // $ANTLR start "rule__Transformation__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:1: rule__Transformation__Group__3 : rule__Transformation__Group__3__Impl rule__Transformation__Group__4 ;
    public final void rule__Transformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: ( rule__Transformation__Group__3__Impl rule__Transformation__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:2: rule__Transformation__Group__3__Impl rule__Transformation__Group__4
            {
            pushFollow(FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__33076);
            rule__Transformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__33079);
            rule__Transformation__Group__4();

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
    // $ANTLR end "rule__Transformation__Group__3"


    // $ANTLR start "rule__Transformation__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: rule__Transformation__Group__3__Impl : ( ( rule__Transformation__RestModelAssignment_3 ) ) ;
    public final void rule__Transformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1543:1: ( ( ( rule__Transformation__RestModelAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: ( ( rule__Transformation__RestModelAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: ( ( rule__Transformation__RestModelAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1545:1: ( rule__Transformation__RestModelAssignment_3 )
            {
             before(grammarAccess.getTransformationAccess().getRestModelAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( rule__Transformation__RestModelAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:2: rule__Transformation__RestModelAssignment_3
            {
            pushFollow(FOLLOW_rule__Transformation__RestModelAssignment_3_in_rule__Transformation__Group__3__Impl3106);
            rule__Transformation__RestModelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransformationAccess().getRestModelAssignment_3()); 

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
    // $ANTLR end "rule__Transformation__Group__3__Impl"


    // $ANTLR start "rule__Transformation__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: rule__Transformation__Group__4 : rule__Transformation__Group__4__Impl ;
    public final void rule__Transformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: ( rule__Transformation__Group__4__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:2: rule__Transformation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__43136);
            rule__Transformation__Group__4__Impl();

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
    // $ANTLR end "rule__Transformation__Group__4"


    // $ANTLR start "rule__Transformation__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: rule__Transformation__Group__4__Impl : ( ')' ) ;
    public final void rule__Transformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1572:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1572:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1573:1: ')'
            {
             before(grammarAccess.getTransformationAccess().getRightParenthesisKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Transformation__Group__4__Impl3164); 
             after(grammarAccess.getTransformationAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Transformation__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1601:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__03205);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__03208);
            rule__Feature__Group__1();

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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( rule__Feature__ManyAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:2: rule__Feature__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Feature__ManyAssignment_0_in_rule__Feature__Group__0__Impl3235);
                    rule__Feature__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getManyAssignment_0()); 

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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1629:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__13266);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__13269);
            rule__Feature__Group__2();

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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1637:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1641:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( ( rule__Feature__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( rule__Feature__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:2: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl3296);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1654:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1658:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__23326);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__23329);
            rule__Feature__Group__3();

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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1670:1: ( ( ':' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: ( ':' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:1: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__Feature__Group__2__Impl3357); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1689:1: ( rule__Feature__Group__3__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1690:2: rule__Feature__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__33388);
            rule__Feature__Group__3__Impl();

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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1696:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ( rule__Feature__TypeAssignment_3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:2: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl3415);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1721:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__03453);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__03456);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:1: rule__Resource__Group__0__Impl : ( 'Resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( ( 'Resource' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( 'Resource' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( 'Resource' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: 'Resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Resource__Group__0__Impl3484); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

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
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1752:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__13515);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__13518);
            rule__Resource__Group__2();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1770:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: ( rule__Resource__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl3545);
            rule__Resource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__23575);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__23578);
            rule__Resource__Group__3();

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
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: rule__Resource__Group__2__Impl : ( 'create' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:1: ( ( 'create' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( 'create' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( 'create' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: 'create'
            {
             before(grammarAccess.getResourceAccess().getCreateKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Resource__Group__2__Impl3606); 
             after(grammarAccess.getResourceAccess().getCreateKeyword_2()); 

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
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__33637);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__4_in_rule__Resource__Group__33640);
            rule__Resource__Group__4();

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
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: rule__Resource__Group__3__Impl : ( '(' ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: '('
            {
             before(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Resource__Group__3__Impl3668); 
             after(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
            {
            pushFollow(FOLLOW_rule__Resource__Group__4__Impl_in_rule__Resource__Group__43699);
            rule__Resource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__5_in_rule__Resource__Group__43702);
            rule__Resource__Group__5();

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
    // $ANTLR end "rule__Resource__Group__4"


    // $ANTLR start "rule__Resource__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: rule__Resource__Group__4__Impl : ( ( rule__Resource__CreateRestModelAssignment_4 ) ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( ( rule__Resource__CreateRestModelAssignment_4 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( ( rule__Resource__CreateRestModelAssignment_4 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( ( rule__Resource__CreateRestModelAssignment_4 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: ( rule__Resource__CreateRestModelAssignment_4 )
            {
             before(grammarAccess.getResourceAccess().getCreateRestModelAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1862:1: ( rule__Resource__CreateRestModelAssignment_4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1862:2: rule__Resource__CreateRestModelAssignment_4
            {
            pushFollow(FOLLOW_rule__Resource__CreateRestModelAssignment_4_in_rule__Resource__Group__4__Impl3729);
            rule__Resource__CreateRestModelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getCreateRestModelAssignment_4()); 

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
    // $ANTLR end "rule__Resource__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl rule__Resource__Group__6 ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:1: ( rule__Resource__Group__5__Impl rule__Resource__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:2: rule__Resource__Group__5__Impl rule__Resource__Group__6
            {
            pushFollow(FOLLOW_rule__Resource__Group__5__Impl_in_rule__Resource__Group__53759);
            rule__Resource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__6_in_rule__Resource__Group__53762);
            rule__Resource__Group__6();

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
    // $ANTLR end "rule__Resource__Group__5"


    // $ANTLR start "rule__Resource__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:1: rule__Resource__Group__5__Impl : ( ')' ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1888:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:1: ')'
            {
             before(grammarAccess.getResourceAccess().getRightParenthesisKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Resource__Group__5__Impl3790); 
             after(grammarAccess.getResourceAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Resource__Group__5__Impl"


    // $ANTLR start "rule__Resource__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1903:1: rule__Resource__Group__6 : rule__Resource__Group__6__Impl rule__Resource__Group__7 ;
    public final void rule__Resource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1907:1: ( rule__Resource__Group__6__Impl rule__Resource__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1908:2: rule__Resource__Group__6__Impl rule__Resource__Group__7
            {
            pushFollow(FOLLOW_rule__Resource__Group__6__Impl_in_rule__Resource__Group__63821);
            rule__Resource__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__7_in_rule__Resource__Group__63824);
            rule__Resource__Group__7();

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
    // $ANTLR end "rule__Resource__Group__6"


    // $ANTLR start "rule__Resource__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: rule__Resource__Group__6__Impl : ( 'throws' ) ;
    public final void rule__Resource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: 'throws'
            {
             before(grammarAccess.getResourceAccess().getThrowsKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__Resource__Group__6__Impl3852); 
             after(grammarAccess.getResourceAccess().getThrowsKeyword_6()); 

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
    // $ANTLR end "rule__Resource__Group__6__Impl"


    // $ANTLR start "rule__Resource__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:1: rule__Resource__Group__7 : rule__Resource__Group__7__Impl rule__Resource__Group__8 ;
    public final void rule__Resource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: ( rule__Resource__Group__7__Impl rule__Resource__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1939:2: rule__Resource__Group__7__Impl rule__Resource__Group__8
            {
            pushFollow(FOLLOW_rule__Resource__Group__7__Impl_in_rule__Resource__Group__73883);
            rule__Resource__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__8_in_rule__Resource__Group__73886);
            rule__Resource__Group__8();

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
    // $ANTLR end "rule__Resource__Group__7"


    // $ANTLR start "rule__Resource__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1946:1: rule__Resource__Group__7__Impl : ( ( rule__Resource__Exception1Assignment_7 ) ) ;
    public final void rule__Resource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: ( ( ( rule__Resource__Exception1Assignment_7 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1951:1: ( ( rule__Resource__Exception1Assignment_7 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1951:1: ( ( rule__Resource__Exception1Assignment_7 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: ( rule__Resource__Exception1Assignment_7 )
            {
             before(grammarAccess.getResourceAccess().getException1Assignment_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( rule__Resource__Exception1Assignment_7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:2: rule__Resource__Exception1Assignment_7
            {
            pushFollow(FOLLOW_rule__Resource__Exception1Assignment_7_in_rule__Resource__Group__7__Impl3913);
            rule__Resource__Exception1Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getException1Assignment_7()); 

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
    // $ANTLR end "rule__Resource__Group__7__Impl"


    // $ANTLR start "rule__Resource__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:1: rule__Resource__Group__8 : rule__Resource__Group__8__Impl rule__Resource__Group__9 ;
    public final void rule__Resource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: ( rule__Resource__Group__8__Impl rule__Resource__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:2: rule__Resource__Group__8__Impl rule__Resource__Group__9
            {
            pushFollow(FOLLOW_rule__Resource__Group__8__Impl_in_rule__Resource__Group__83943);
            rule__Resource__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__9_in_rule__Resource__Group__83946);
            rule__Resource__Group__9();

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
    // $ANTLR end "rule__Resource__Group__8"


    // $ANTLR start "rule__Resource__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1975:1: rule__Resource__Group__8__Impl : ( '{' ) ;
    public final void rule__Resource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1981:1: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__Resource__Group__8__Impl3974); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Resource__Group__8__Impl"


    // $ANTLR start "rule__Resource__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1994:1: rule__Resource__Group__9 : rule__Resource__Group__9__Impl rule__Resource__Group__10 ;
    public final void rule__Resource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1998:1: ( rule__Resource__Group__9__Impl rule__Resource__Group__10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:2: rule__Resource__Group__9__Impl rule__Resource__Group__10
            {
            pushFollow(FOLLOW_rule__Resource__Group__9__Impl_in_rule__Resource__Group__94005);
            rule__Resource__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__10_in_rule__Resource__Group__94008);
            rule__Resource__Group__10();

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
    // $ANTLR end "rule__Resource__Group__9"


    // $ANTLR start "rule__Resource__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:1: rule__Resource__Group__9__Impl : ( ( rule__Resource__CreateMethodAssignment_9 ) ) ;
    public final void rule__Resource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ( ( ( rule__Resource__CreateMethodAssignment_9 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ( ( rule__Resource__CreateMethodAssignment_9 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ( ( rule__Resource__CreateMethodAssignment_9 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( rule__Resource__CreateMethodAssignment_9 )
            {
             before(grammarAccess.getResourceAccess().getCreateMethodAssignment_9()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ( rule__Resource__CreateMethodAssignment_9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:2: rule__Resource__CreateMethodAssignment_9
            {
            pushFollow(FOLLOW_rule__Resource__CreateMethodAssignment_9_in_rule__Resource__Group__9__Impl4035);
            rule__Resource__CreateMethodAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getCreateMethodAssignment_9()); 

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
    // $ANTLR end "rule__Resource__Group__9__Impl"


    // $ANTLR start "rule__Resource__Group__10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: rule__Resource__Group__10 : rule__Resource__Group__10__Impl rule__Resource__Group__11 ;
    public final void rule__Resource__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( rule__Resource__Group__10__Impl rule__Resource__Group__11 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:2: rule__Resource__Group__10__Impl rule__Resource__Group__11
            {
            pushFollow(FOLLOW_rule__Resource__Group__10__Impl_in_rule__Resource__Group__104065);
            rule__Resource__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__11_in_rule__Resource__Group__104068);
            rule__Resource__Group__11();

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
    // $ANTLR end "rule__Resource__Group__10"


    // $ANTLR start "rule__Resource__Group__10__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: rule__Resource__Group__10__Impl : ( 'return' ) ;
    public final void rule__Resource__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( ( 'return' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( 'return' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( 'return' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: 'return'
            {
             before(grammarAccess.getResourceAccess().getReturnKeyword_10()); 
            match(input,31,FOLLOW_31_in_rule__Resource__Group__10__Impl4096); 
             after(grammarAccess.getResourceAccess().getReturnKeyword_10()); 

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
    // $ANTLR end "rule__Resource__Group__10__Impl"


    // $ANTLR start "rule__Resource__Group__11"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2054:1: rule__Resource__Group__11 : rule__Resource__Group__11__Impl rule__Resource__Group__12 ;
    public final void rule__Resource__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ( rule__Resource__Group__11__Impl rule__Resource__Group__12 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:2: rule__Resource__Group__11__Impl rule__Resource__Group__12
            {
            pushFollow(FOLLOW_rule__Resource__Group__11__Impl_in_rule__Resource__Group__114127);
            rule__Resource__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__12_in_rule__Resource__Group__114130);
            rule__Resource__Group__12();

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
    // $ANTLR end "rule__Resource__Group__11"


    // $ANTLR start "rule__Resource__Group__11__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2066:1: rule__Resource__Group__11__Impl : ( ( rule__Resource__CreatedRestModelAssignment_11 ) ) ;
    public final void rule__Resource__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: ( ( ( rule__Resource__CreatedRestModelAssignment_11 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: ( ( rule__Resource__CreatedRestModelAssignment_11 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: ( ( rule__Resource__CreatedRestModelAssignment_11 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2072:1: ( rule__Resource__CreatedRestModelAssignment_11 )
            {
             before(grammarAccess.getResourceAccess().getCreatedRestModelAssignment_11()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:1: ( rule__Resource__CreatedRestModelAssignment_11 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2073:2: rule__Resource__CreatedRestModelAssignment_11
            {
            pushFollow(FOLLOW_rule__Resource__CreatedRestModelAssignment_11_in_rule__Resource__Group__11__Impl4157);
            rule__Resource__CreatedRestModelAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getCreatedRestModelAssignment_11()); 

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
    // $ANTLR end "rule__Resource__Group__11__Impl"


    // $ANTLR start "rule__Resource__Group__12"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:1: rule__Resource__Group__12 : rule__Resource__Group__12__Impl rule__Resource__Group__13 ;
    public final void rule__Resource__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ( rule__Resource__Group__12__Impl rule__Resource__Group__13 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:2: rule__Resource__Group__12__Impl rule__Resource__Group__13
            {
            pushFollow(FOLLOW_rule__Resource__Group__12__Impl_in_rule__Resource__Group__124187);
            rule__Resource__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__13_in_rule__Resource__Group__124190);
            rule__Resource__Group__13();

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
    // $ANTLR end "rule__Resource__Group__12"


    // $ANTLR start "rule__Resource__Group__12__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: rule__Resource__Group__12__Impl : ( '}' ) ;
    public final void rule__Resource__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2101:1: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_12()); 
            match(input,20,FOLLOW_20_in_rule__Resource__Group__12__Impl4218); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Resource__Group__12__Impl"


    // $ANTLR start "rule__Resource__Group__13"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2114:1: rule__Resource__Group__13 : rule__Resource__Group__13__Impl rule__Resource__Group__14 ;
    public final void rule__Resource__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2118:1: ( rule__Resource__Group__13__Impl rule__Resource__Group__14 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2119:2: rule__Resource__Group__13__Impl rule__Resource__Group__14
            {
            pushFollow(FOLLOW_rule__Resource__Group__13__Impl_in_rule__Resource__Group__134249);
            rule__Resource__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__14_in_rule__Resource__Group__134252);
            rule__Resource__Group__14();

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
    // $ANTLR end "rule__Resource__Group__13"


    // $ANTLR start "rule__Resource__Group__13__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2126:1: rule__Resource__Group__13__Impl : ( 'find' ) ;
    public final void rule__Resource__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:1: ( ( 'find' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: ( 'find' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: ( 'find' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:1: 'find'
            {
             before(grammarAccess.getResourceAccess().getFindKeyword_13()); 
            match(input,32,FOLLOW_32_in_rule__Resource__Group__13__Impl4280); 
             after(grammarAccess.getResourceAccess().getFindKeyword_13()); 

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
    // $ANTLR end "rule__Resource__Group__13__Impl"


    // $ANTLR start "rule__Resource__Group__14"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: rule__Resource__Group__14 : rule__Resource__Group__14__Impl rule__Resource__Group__15 ;
    public final void rule__Resource__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2149:1: ( rule__Resource__Group__14__Impl rule__Resource__Group__15 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:2: rule__Resource__Group__14__Impl rule__Resource__Group__15
            {
            pushFollow(FOLLOW_rule__Resource__Group__14__Impl_in_rule__Resource__Group__144311);
            rule__Resource__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__15_in_rule__Resource__Group__144314);
            rule__Resource__Group__15();

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
    // $ANTLR end "rule__Resource__Group__14"


    // $ANTLR start "rule__Resource__Group__14__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2157:1: rule__Resource__Group__14__Impl : ( '(' ) ;
    public final void rule__Resource__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2163:1: '('
            {
             before(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_14()); 
            match(input,24,FOLLOW_24_in_rule__Resource__Group__14__Impl4342); 
             after(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_14()); 

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
    // $ANTLR end "rule__Resource__Group__14__Impl"


    // $ANTLR start "rule__Resource__Group__15"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2176:1: rule__Resource__Group__15 : rule__Resource__Group__15__Impl rule__Resource__Group__16 ;
    public final void rule__Resource__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: ( rule__Resource__Group__15__Impl rule__Resource__Group__16 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:2: rule__Resource__Group__15__Impl rule__Resource__Group__16
            {
            pushFollow(FOLLOW_rule__Resource__Group__15__Impl_in_rule__Resource__Group__154373);
            rule__Resource__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__16_in_rule__Resource__Group__154376);
            rule__Resource__Group__16();

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
    // $ANTLR end "rule__Resource__Group__15"


    // $ANTLR start "rule__Resource__Group__15__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: rule__Resource__Group__15__Impl : ( ( rule__Resource__FindbyAssignment_15 ) ) ;
    public final void rule__Resource__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: ( ( ( rule__Resource__FindbyAssignment_15 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ( rule__Resource__FindbyAssignment_15 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ( rule__Resource__FindbyAssignment_15 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( rule__Resource__FindbyAssignment_15 )
            {
             before(grammarAccess.getResourceAccess().getFindbyAssignment_15()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:1: ( rule__Resource__FindbyAssignment_15 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:2: rule__Resource__FindbyAssignment_15
            {
            pushFollow(FOLLOW_rule__Resource__FindbyAssignment_15_in_rule__Resource__Group__15__Impl4403);
            rule__Resource__FindbyAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getFindbyAssignment_15()); 

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
    // $ANTLR end "rule__Resource__Group__15__Impl"


    // $ANTLR start "rule__Resource__Group__16"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: rule__Resource__Group__16 : rule__Resource__Group__16__Impl rule__Resource__Group__17 ;
    public final void rule__Resource__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( rule__Resource__Group__16__Impl rule__Resource__Group__17 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:2: rule__Resource__Group__16__Impl rule__Resource__Group__17
            {
            pushFollow(FOLLOW_rule__Resource__Group__16__Impl_in_rule__Resource__Group__164433);
            rule__Resource__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__17_in_rule__Resource__Group__164436);
            rule__Resource__Group__17();

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
    // $ANTLR end "rule__Resource__Group__16"


    // $ANTLR start "rule__Resource__Group__16__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: rule__Resource__Group__16__Impl : ( ')' ) ;
    public final void rule__Resource__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ')'
            {
             before(grammarAccess.getResourceAccess().getRightParenthesisKeyword_16()); 
            match(input,26,FOLLOW_26_in_rule__Resource__Group__16__Impl4464); 
             after(grammarAccess.getResourceAccess().getRightParenthesisKeyword_16()); 

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
    // $ANTLR end "rule__Resource__Group__16__Impl"


    // $ANTLR start "rule__Resource__Group__17"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: rule__Resource__Group__17 : rule__Resource__Group__17__Impl rule__Resource__Group__18 ;
    public final void rule__Resource__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: ( rule__Resource__Group__17__Impl rule__Resource__Group__18 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:2: rule__Resource__Group__17__Impl rule__Resource__Group__18
            {
            pushFollow(FOLLOW_rule__Resource__Group__17__Impl_in_rule__Resource__Group__174495);
            rule__Resource__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__18_in_rule__Resource__Group__174498);
            rule__Resource__Group__18();

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
    // $ANTLR end "rule__Resource__Group__17"


    // $ANTLR start "rule__Resource__Group__17__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: rule__Resource__Group__17__Impl : ( 'throws' ) ;
    public final void rule__Resource__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: 'throws'
            {
             before(grammarAccess.getResourceAccess().getThrowsKeyword_17()); 
            match(input,30,FOLLOW_30_in_rule__Resource__Group__17__Impl4526); 
             after(grammarAccess.getResourceAccess().getThrowsKeyword_17()); 

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
    // $ANTLR end "rule__Resource__Group__17__Impl"


    // $ANTLR start "rule__Resource__Group__18"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: rule__Resource__Group__18 : rule__Resource__Group__18__Impl rule__Resource__Group__19 ;
    public final void rule__Resource__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2271:1: ( rule__Resource__Group__18__Impl rule__Resource__Group__19 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2272:2: rule__Resource__Group__18__Impl rule__Resource__Group__19
            {
            pushFollow(FOLLOW_rule__Resource__Group__18__Impl_in_rule__Resource__Group__184557);
            rule__Resource__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__19_in_rule__Resource__Group__184560);
            rule__Resource__Group__19();

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
    // $ANTLR end "rule__Resource__Group__18"


    // $ANTLR start "rule__Resource__Group__18__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: rule__Resource__Group__18__Impl : ( ( rule__Resource__Exception2Assignment_18 ) ) ;
    public final void rule__Resource__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: ( ( ( rule__Resource__Exception2Assignment_18 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:1: ( ( rule__Resource__Exception2Assignment_18 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:1: ( ( rule__Resource__Exception2Assignment_18 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2285:1: ( rule__Resource__Exception2Assignment_18 )
            {
             before(grammarAccess.getResourceAccess().getException2Assignment_18()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2286:1: ( rule__Resource__Exception2Assignment_18 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2286:2: rule__Resource__Exception2Assignment_18
            {
            pushFollow(FOLLOW_rule__Resource__Exception2Assignment_18_in_rule__Resource__Group__18__Impl4587);
            rule__Resource__Exception2Assignment_18();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getException2Assignment_18()); 

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
    // $ANTLR end "rule__Resource__Group__18__Impl"


    // $ANTLR start "rule__Resource__Group__19"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: rule__Resource__Group__19 : rule__Resource__Group__19__Impl rule__Resource__Group__20 ;
    public final void rule__Resource__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: ( rule__Resource__Group__19__Impl rule__Resource__Group__20 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:2: rule__Resource__Group__19__Impl rule__Resource__Group__20
            {
            pushFollow(FOLLOW_rule__Resource__Group__19__Impl_in_rule__Resource__Group__194617);
            rule__Resource__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__20_in_rule__Resource__Group__194620);
            rule__Resource__Group__20();

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
    // $ANTLR end "rule__Resource__Group__19"


    // $ANTLR start "rule__Resource__Group__19__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: rule__Resource__Group__19__Impl : ( '{' ) ;
    public final void rule__Resource__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2314:1: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_19()); 
            match(input,19,FOLLOW_19_in_rule__Resource__Group__19__Impl4648); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_19()); 

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
    // $ANTLR end "rule__Resource__Group__19__Impl"


    // $ANTLR start "rule__Resource__Group__20"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2327:1: rule__Resource__Group__20 : rule__Resource__Group__20__Impl rule__Resource__Group__21 ;
    public final void rule__Resource__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( rule__Resource__Group__20__Impl rule__Resource__Group__21 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:2: rule__Resource__Group__20__Impl rule__Resource__Group__21
            {
            pushFollow(FOLLOW_rule__Resource__Group__20__Impl_in_rule__Resource__Group__204679);
            rule__Resource__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__21_in_rule__Resource__Group__204682);
            rule__Resource__Group__21();

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
    // $ANTLR end "rule__Resource__Group__20"


    // $ANTLR start "rule__Resource__Group__20__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: rule__Resource__Group__20__Impl : ( ( rule__Resource__FindMethodAssignment_20 ) ) ;
    public final void rule__Resource__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( ( ( rule__Resource__FindMethodAssignment_20 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: ( ( rule__Resource__FindMethodAssignment_20 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: ( ( rule__Resource__FindMethodAssignment_20 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2345:1: ( rule__Resource__FindMethodAssignment_20 )
            {
             before(grammarAccess.getResourceAccess().getFindMethodAssignment_20()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: ( rule__Resource__FindMethodAssignment_20 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:2: rule__Resource__FindMethodAssignment_20
            {
            pushFollow(FOLLOW_rule__Resource__FindMethodAssignment_20_in_rule__Resource__Group__20__Impl4709);
            rule__Resource__FindMethodAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getFindMethodAssignment_20()); 

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
    // $ANTLR end "rule__Resource__Group__20__Impl"


    // $ANTLR start "rule__Resource__Group__21"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:1: rule__Resource__Group__21 : rule__Resource__Group__21__Impl rule__Resource__Group__22 ;
    public final void rule__Resource__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:1: ( rule__Resource__Group__21__Impl rule__Resource__Group__22 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:2: rule__Resource__Group__21__Impl rule__Resource__Group__22
            {
            pushFollow(FOLLOW_rule__Resource__Group__21__Impl_in_rule__Resource__Group__214739);
            rule__Resource__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__22_in_rule__Resource__Group__214742);
            rule__Resource__Group__22();

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
    // $ANTLR end "rule__Resource__Group__21"


    // $ANTLR start "rule__Resource__Group__21__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: rule__Resource__Group__21__Impl : ( 'return' ) ;
    public final void rule__Resource__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( ( 'return' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:1: ( 'return' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:1: ( 'return' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2374:1: 'return'
            {
             before(grammarAccess.getResourceAccess().getReturnKeyword_21()); 
            match(input,31,FOLLOW_31_in_rule__Resource__Group__21__Impl4770); 
             after(grammarAccess.getResourceAccess().getReturnKeyword_21()); 

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
    // $ANTLR end "rule__Resource__Group__21__Impl"


    // $ANTLR start "rule__Resource__Group__22"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:1: rule__Resource__Group__22 : rule__Resource__Group__22__Impl rule__Resource__Group__23 ;
    public final void rule__Resource__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:1: ( rule__Resource__Group__22__Impl rule__Resource__Group__23 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:2: rule__Resource__Group__22__Impl rule__Resource__Group__23
            {
            pushFollow(FOLLOW_rule__Resource__Group__22__Impl_in_rule__Resource__Group__224801);
            rule__Resource__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__23_in_rule__Resource__Group__224804);
            rule__Resource__Group__23();

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
    // $ANTLR end "rule__Resource__Group__22"


    // $ANTLR start "rule__Resource__Group__22__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:1: rule__Resource__Group__22__Impl : ( ( rule__Resource__FoundRestModelAssignment_22 ) ) ;
    public final void rule__Resource__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2403:1: ( ( ( rule__Resource__FoundRestModelAssignment_22 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ( ( rule__Resource__FoundRestModelAssignment_22 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: ( ( rule__Resource__FoundRestModelAssignment_22 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: ( rule__Resource__FoundRestModelAssignment_22 )
            {
             before(grammarAccess.getResourceAccess().getFoundRestModelAssignment_22()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( rule__Resource__FoundRestModelAssignment_22 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:2: rule__Resource__FoundRestModelAssignment_22
            {
            pushFollow(FOLLOW_rule__Resource__FoundRestModelAssignment_22_in_rule__Resource__Group__22__Impl4831);
            rule__Resource__FoundRestModelAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getFoundRestModelAssignment_22()); 

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
    // $ANTLR end "rule__Resource__Group__22__Impl"


    // $ANTLR start "rule__Resource__Group__23"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: rule__Resource__Group__23 : rule__Resource__Group__23__Impl rule__Resource__Group__24 ;
    public final void rule__Resource__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: ( rule__Resource__Group__23__Impl rule__Resource__Group__24 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:2: rule__Resource__Group__23__Impl rule__Resource__Group__24
            {
            pushFollow(FOLLOW_rule__Resource__Group__23__Impl_in_rule__Resource__Group__234861);
            rule__Resource__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__24_in_rule__Resource__Group__234864);
            rule__Resource__Group__24();

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
    // $ANTLR end "rule__Resource__Group__23"


    // $ANTLR start "rule__Resource__Group__23__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2428:1: rule__Resource__Group__23__Impl : ( '}' ) ;
    public final void rule__Resource__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2432:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:1: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_23()); 
            match(input,20,FOLLOW_20_in_rule__Resource__Group__23__Impl4892); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_23()); 

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
    // $ANTLR end "rule__Resource__Group__23__Impl"


    // $ANTLR start "rule__Resource__Group__24"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: rule__Resource__Group__24 : rule__Resource__Group__24__Impl rule__Resource__Group__25 ;
    public final void rule__Resource__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: ( rule__Resource__Group__24__Impl rule__Resource__Group__25 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:2: rule__Resource__Group__24__Impl rule__Resource__Group__25
            {
            pushFollow(FOLLOW_rule__Resource__Group__24__Impl_in_rule__Resource__Group__244923);
            rule__Resource__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__25_in_rule__Resource__Group__244926);
            rule__Resource__Group__25();

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
    // $ANTLR end "rule__Resource__Group__24"


    // $ANTLR start "rule__Resource__Group__24__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2459:1: rule__Resource__Group__24__Impl : ( 'update' ) ;
    public final void rule__Resource__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2463:1: ( ( 'update' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ( 'update' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ( 'update' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: 'update'
            {
             before(grammarAccess.getResourceAccess().getUpdateKeyword_24()); 
            match(input,33,FOLLOW_33_in_rule__Resource__Group__24__Impl4954); 
             after(grammarAccess.getResourceAccess().getUpdateKeyword_24()); 

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
    // $ANTLR end "rule__Resource__Group__24__Impl"


    // $ANTLR start "rule__Resource__Group__25"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: rule__Resource__Group__25 : rule__Resource__Group__25__Impl rule__Resource__Group__26 ;
    public final void rule__Resource__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( rule__Resource__Group__25__Impl rule__Resource__Group__26 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:2: rule__Resource__Group__25__Impl rule__Resource__Group__26
            {
            pushFollow(FOLLOW_rule__Resource__Group__25__Impl_in_rule__Resource__Group__254985);
            rule__Resource__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__26_in_rule__Resource__Group__254988);
            rule__Resource__Group__26();

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
    // $ANTLR end "rule__Resource__Group__25"


    // $ANTLR start "rule__Resource__Group__25__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: rule__Resource__Group__25__Impl : ( '(' ) ;
    public final void rule__Resource__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:1: '('
            {
             before(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_25()); 
            match(input,24,FOLLOW_24_in_rule__Resource__Group__25__Impl5016); 
             after(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_25()); 

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
    // $ANTLR end "rule__Resource__Group__25__Impl"


    // $ANTLR start "rule__Resource__Group__26"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:1: rule__Resource__Group__26 : rule__Resource__Group__26__Impl rule__Resource__Group__27 ;
    public final void rule__Resource__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:1: ( rule__Resource__Group__26__Impl rule__Resource__Group__27 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2514:2: rule__Resource__Group__26__Impl rule__Resource__Group__27
            {
            pushFollow(FOLLOW_rule__Resource__Group__26__Impl_in_rule__Resource__Group__265047);
            rule__Resource__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__27_in_rule__Resource__Group__265050);
            rule__Resource__Group__27();

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
    // $ANTLR end "rule__Resource__Group__26"


    // $ANTLR start "rule__Resource__Group__26__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:1: rule__Resource__Group__26__Impl : ( ( rule__Resource__UpdatebyAssignment_26 ) ) ;
    public final void rule__Resource__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: ( ( ( rule__Resource__UpdatebyAssignment_26 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( ( rule__Resource__UpdatebyAssignment_26 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( ( rule__Resource__UpdatebyAssignment_26 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2527:1: ( rule__Resource__UpdatebyAssignment_26 )
            {
             before(grammarAccess.getResourceAccess().getUpdatebyAssignment_26()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2528:1: ( rule__Resource__UpdatebyAssignment_26 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2528:2: rule__Resource__UpdatebyAssignment_26
            {
            pushFollow(FOLLOW_rule__Resource__UpdatebyAssignment_26_in_rule__Resource__Group__26__Impl5077);
            rule__Resource__UpdatebyAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getUpdatebyAssignment_26()); 

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
    // $ANTLR end "rule__Resource__Group__26__Impl"


    // $ANTLR start "rule__Resource__Group__27"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: rule__Resource__Group__27 : rule__Resource__Group__27__Impl rule__Resource__Group__28 ;
    public final void rule__Resource__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:1: ( rule__Resource__Group__27__Impl rule__Resource__Group__28 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:2: rule__Resource__Group__27__Impl rule__Resource__Group__28
            {
            pushFollow(FOLLOW_rule__Resource__Group__27__Impl_in_rule__Resource__Group__275107);
            rule__Resource__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__28_in_rule__Resource__Group__275110);
            rule__Resource__Group__28();

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
    // $ANTLR end "rule__Resource__Group__27"


    // $ANTLR start "rule__Resource__Group__27__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: rule__Resource__Group__27__Impl : ( ',' ) ;
    public final void rule__Resource__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:1: ','
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_27()); 
            match(input,34,FOLLOW_34_in_rule__Resource__Group__27__Impl5138); 
             after(grammarAccess.getResourceAccess().getCommaKeyword_27()); 

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
    // $ANTLR end "rule__Resource__Group__27__Impl"


    // $ANTLR start "rule__Resource__Group__28"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:1: rule__Resource__Group__28 : rule__Resource__Group__28__Impl rule__Resource__Group__29 ;
    public final void rule__Resource__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2573:1: ( rule__Resource__Group__28__Impl rule__Resource__Group__29 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2574:2: rule__Resource__Group__28__Impl rule__Resource__Group__29
            {
            pushFollow(FOLLOW_rule__Resource__Group__28__Impl_in_rule__Resource__Group__285169);
            rule__Resource__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__29_in_rule__Resource__Group__285172);
            rule__Resource__Group__29();

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
    // $ANTLR end "rule__Resource__Group__28"


    // $ANTLR start "rule__Resource__Group__28__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:1: rule__Resource__Group__28__Impl : ( ( rule__Resource__UpdateRestModelAssignment_28 ) ) ;
    public final void rule__Resource__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: ( ( ( rule__Resource__UpdateRestModelAssignment_28 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: ( ( rule__Resource__UpdateRestModelAssignment_28 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: ( ( rule__Resource__UpdateRestModelAssignment_28 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2587:1: ( rule__Resource__UpdateRestModelAssignment_28 )
            {
             before(grammarAccess.getResourceAccess().getUpdateRestModelAssignment_28()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2588:1: ( rule__Resource__UpdateRestModelAssignment_28 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2588:2: rule__Resource__UpdateRestModelAssignment_28
            {
            pushFollow(FOLLOW_rule__Resource__UpdateRestModelAssignment_28_in_rule__Resource__Group__28__Impl5199);
            rule__Resource__UpdateRestModelAssignment_28();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getUpdateRestModelAssignment_28()); 

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
    // $ANTLR end "rule__Resource__Group__28__Impl"


    // $ANTLR start "rule__Resource__Group__29"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: rule__Resource__Group__29 : rule__Resource__Group__29__Impl rule__Resource__Group__30 ;
    public final void rule__Resource__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: ( rule__Resource__Group__29__Impl rule__Resource__Group__30 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:2: rule__Resource__Group__29__Impl rule__Resource__Group__30
            {
            pushFollow(FOLLOW_rule__Resource__Group__29__Impl_in_rule__Resource__Group__295229);
            rule__Resource__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__30_in_rule__Resource__Group__295232);
            rule__Resource__Group__30();

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
    // $ANTLR end "rule__Resource__Group__29"


    // $ANTLR start "rule__Resource__Group__29__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:1: rule__Resource__Group__29__Impl : ( ')' ) ;
    public final void rule__Resource__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:1: ')'
            {
             before(grammarAccess.getResourceAccess().getRightParenthesisKeyword_29()); 
            match(input,26,FOLLOW_26_in_rule__Resource__Group__29__Impl5260); 
             after(grammarAccess.getResourceAccess().getRightParenthesisKeyword_29()); 

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
    // $ANTLR end "rule__Resource__Group__29__Impl"


    // $ANTLR start "rule__Resource__Group__30"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: rule__Resource__Group__30 : rule__Resource__Group__30__Impl rule__Resource__Group__31 ;
    public final void rule__Resource__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:1: ( rule__Resource__Group__30__Impl rule__Resource__Group__31 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:2: rule__Resource__Group__30__Impl rule__Resource__Group__31
            {
            pushFollow(FOLLOW_rule__Resource__Group__30__Impl_in_rule__Resource__Group__305291);
            rule__Resource__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__31_in_rule__Resource__Group__305294);
            rule__Resource__Group__31();

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
    // $ANTLR end "rule__Resource__Group__30"


    // $ANTLR start "rule__Resource__Group__30__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: rule__Resource__Group__30__Impl : ( 'throws' ) ;
    public final void rule__Resource__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: 'throws'
            {
             before(grammarAccess.getResourceAccess().getThrowsKeyword_30()); 
            match(input,30,FOLLOW_30_in_rule__Resource__Group__30__Impl5322); 
             after(grammarAccess.getResourceAccess().getThrowsKeyword_30()); 

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
    // $ANTLR end "rule__Resource__Group__30__Impl"


    // $ANTLR start "rule__Resource__Group__31"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2660:1: rule__Resource__Group__31 : rule__Resource__Group__31__Impl rule__Resource__Group__32 ;
    public final void rule__Resource__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: ( rule__Resource__Group__31__Impl rule__Resource__Group__32 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:2: rule__Resource__Group__31__Impl rule__Resource__Group__32
            {
            pushFollow(FOLLOW_rule__Resource__Group__31__Impl_in_rule__Resource__Group__315353);
            rule__Resource__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__32_in_rule__Resource__Group__315356);
            rule__Resource__Group__32();

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
    // $ANTLR end "rule__Resource__Group__31"


    // $ANTLR start "rule__Resource__Group__31__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: rule__Resource__Group__31__Impl : ( ( rule__Resource__Exception3Assignment_31 ) ) ;
    public final void rule__Resource__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2676:1: ( ( ( rule__Resource__Exception3Assignment_31 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: ( ( rule__Resource__Exception3Assignment_31 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: ( ( rule__Resource__Exception3Assignment_31 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2678:1: ( rule__Resource__Exception3Assignment_31 )
            {
             before(grammarAccess.getResourceAccess().getException3Assignment_31()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2679:1: ( rule__Resource__Exception3Assignment_31 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2679:2: rule__Resource__Exception3Assignment_31
            {
            pushFollow(FOLLOW_rule__Resource__Exception3Assignment_31_in_rule__Resource__Group__31__Impl5383);
            rule__Resource__Exception3Assignment_31();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getException3Assignment_31()); 

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
    // $ANTLR end "rule__Resource__Group__31__Impl"


    // $ANTLR start "rule__Resource__Group__32"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:1: rule__Resource__Group__32 : rule__Resource__Group__32__Impl rule__Resource__Group__33 ;
    public final void rule__Resource__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: ( rule__Resource__Group__32__Impl rule__Resource__Group__33 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:2: rule__Resource__Group__32__Impl rule__Resource__Group__33
            {
            pushFollow(FOLLOW_rule__Resource__Group__32__Impl_in_rule__Resource__Group__325413);
            rule__Resource__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__33_in_rule__Resource__Group__325416);
            rule__Resource__Group__33();

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
    // $ANTLR end "rule__Resource__Group__32"


    // $ANTLR start "rule__Resource__Group__32__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:1: rule__Resource__Group__32__Impl : ( '{' ) ;
    public final void rule__Resource__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2706:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2706:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:1: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_32()); 
            match(input,19,FOLLOW_19_in_rule__Resource__Group__32__Impl5444); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_32()); 

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
    // $ANTLR end "rule__Resource__Group__32__Impl"


    // $ANTLR start "rule__Resource__Group__33"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:1: rule__Resource__Group__33 : rule__Resource__Group__33__Impl rule__Resource__Group__34 ;
    public final void rule__Resource__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:1: ( rule__Resource__Group__33__Impl rule__Resource__Group__34 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:2: rule__Resource__Group__33__Impl rule__Resource__Group__34
            {
            pushFollow(FOLLOW_rule__Resource__Group__33__Impl_in_rule__Resource__Group__335475);
            rule__Resource__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__34_in_rule__Resource__Group__335478);
            rule__Resource__Group__34();

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
    // $ANTLR end "rule__Resource__Group__33"


    // $ANTLR start "rule__Resource__Group__33__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: rule__Resource__Group__33__Impl : ( ( rule__Resource__UpdateMethodAssignment_33 ) ) ;
    public final void rule__Resource__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2736:1: ( ( ( rule__Resource__UpdateMethodAssignment_33 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2737:1: ( ( rule__Resource__UpdateMethodAssignment_33 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2737:1: ( ( rule__Resource__UpdateMethodAssignment_33 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:1: ( rule__Resource__UpdateMethodAssignment_33 )
            {
             before(grammarAccess.getResourceAccess().getUpdateMethodAssignment_33()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:1: ( rule__Resource__UpdateMethodAssignment_33 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2739:2: rule__Resource__UpdateMethodAssignment_33
            {
            pushFollow(FOLLOW_rule__Resource__UpdateMethodAssignment_33_in_rule__Resource__Group__33__Impl5505);
            rule__Resource__UpdateMethodAssignment_33();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getUpdateMethodAssignment_33()); 

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
    // $ANTLR end "rule__Resource__Group__33__Impl"


    // $ANTLR start "rule__Resource__Group__34"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:1: rule__Resource__Group__34 : rule__Resource__Group__34__Impl rule__Resource__Group__35 ;
    public final void rule__Resource__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2753:1: ( rule__Resource__Group__34__Impl rule__Resource__Group__35 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:2: rule__Resource__Group__34__Impl rule__Resource__Group__35
            {
            pushFollow(FOLLOW_rule__Resource__Group__34__Impl_in_rule__Resource__Group__345535);
            rule__Resource__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__35_in_rule__Resource__Group__345538);
            rule__Resource__Group__35();

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
    // $ANTLR end "rule__Resource__Group__34"


    // $ANTLR start "rule__Resource__Group__34__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: rule__Resource__Group__34__Impl : ( 'return' ) ;
    public final void rule__Resource__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:1: ( ( 'return' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2766:1: ( 'return' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2766:1: ( 'return' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2767:1: 'return'
            {
             before(grammarAccess.getResourceAccess().getReturnKeyword_34()); 
            match(input,31,FOLLOW_31_in_rule__Resource__Group__34__Impl5566); 
             after(grammarAccess.getResourceAccess().getReturnKeyword_34()); 

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
    // $ANTLR end "rule__Resource__Group__34__Impl"


    // $ANTLR start "rule__Resource__Group__35"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:1: rule__Resource__Group__35 : rule__Resource__Group__35__Impl rule__Resource__Group__36 ;
    public final void rule__Resource__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( rule__Resource__Group__35__Impl rule__Resource__Group__36 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:2: rule__Resource__Group__35__Impl rule__Resource__Group__36
            {
            pushFollow(FOLLOW_rule__Resource__Group__35__Impl_in_rule__Resource__Group__355597);
            rule__Resource__Group__35__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__36_in_rule__Resource__Group__355600);
            rule__Resource__Group__36();

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
    // $ANTLR end "rule__Resource__Group__35"


    // $ANTLR start "rule__Resource__Group__35__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: rule__Resource__Group__35__Impl : ( ( rule__Resource__UpdatedRestModelAssignment_35 ) ) ;
    public final void rule__Resource__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2796:1: ( ( ( rule__Resource__UpdatedRestModelAssignment_35 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:1: ( ( rule__Resource__UpdatedRestModelAssignment_35 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:1: ( ( rule__Resource__UpdatedRestModelAssignment_35 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: ( rule__Resource__UpdatedRestModelAssignment_35 )
            {
             before(grammarAccess.getResourceAccess().getUpdatedRestModelAssignment_35()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: ( rule__Resource__UpdatedRestModelAssignment_35 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:2: rule__Resource__UpdatedRestModelAssignment_35
            {
            pushFollow(FOLLOW_rule__Resource__UpdatedRestModelAssignment_35_in_rule__Resource__Group__35__Impl5627);
            rule__Resource__UpdatedRestModelAssignment_35();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getUpdatedRestModelAssignment_35()); 

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
    // $ANTLR end "rule__Resource__Group__35__Impl"


    // $ANTLR start "rule__Resource__Group__36"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:1: rule__Resource__Group__36 : rule__Resource__Group__36__Impl rule__Resource__Group__37 ;
    public final void rule__Resource__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2813:1: ( rule__Resource__Group__36__Impl rule__Resource__Group__37 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:2: rule__Resource__Group__36__Impl rule__Resource__Group__37
            {
            pushFollow(FOLLOW_rule__Resource__Group__36__Impl_in_rule__Resource__Group__365657);
            rule__Resource__Group__36__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__37_in_rule__Resource__Group__365660);
            rule__Resource__Group__37();

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
    // $ANTLR end "rule__Resource__Group__36"


    // $ANTLR start "rule__Resource__Group__36__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: rule__Resource__Group__36__Impl : ( '}' ) ;
    public final void rule__Resource__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2825:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2826:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2826:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:1: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_36()); 
            match(input,20,FOLLOW_20_in_rule__Resource__Group__36__Impl5688); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_36()); 

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
    // $ANTLR end "rule__Resource__Group__36__Impl"


    // $ANTLR start "rule__Resource__Group__37"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2840:1: rule__Resource__Group__37 : rule__Resource__Group__37__Impl rule__Resource__Group__38 ;
    public final void rule__Resource__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2844:1: ( rule__Resource__Group__37__Impl rule__Resource__Group__38 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:2: rule__Resource__Group__37__Impl rule__Resource__Group__38
            {
            pushFollow(FOLLOW_rule__Resource__Group__37__Impl_in_rule__Resource__Group__375719);
            rule__Resource__Group__37__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__38_in_rule__Resource__Group__375722);
            rule__Resource__Group__38();

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
    // $ANTLR end "rule__Resource__Group__37"


    // $ANTLR start "rule__Resource__Group__37__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2852:1: rule__Resource__Group__37__Impl : ( 'delete' ) ;
    public final void rule__Resource__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2856:1: ( ( 'delete' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2857:1: ( 'delete' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2857:1: ( 'delete' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: 'delete'
            {
             before(grammarAccess.getResourceAccess().getDeleteKeyword_37()); 
            match(input,35,FOLLOW_35_in_rule__Resource__Group__37__Impl5750); 
             after(grammarAccess.getResourceAccess().getDeleteKeyword_37()); 

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
    // $ANTLR end "rule__Resource__Group__37__Impl"


    // $ANTLR start "rule__Resource__Group__38"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:1: rule__Resource__Group__38 : rule__Resource__Group__38__Impl rule__Resource__Group__39 ;
    public final void rule__Resource__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: ( rule__Resource__Group__38__Impl rule__Resource__Group__39 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:2: rule__Resource__Group__38__Impl rule__Resource__Group__39
            {
            pushFollow(FOLLOW_rule__Resource__Group__38__Impl_in_rule__Resource__Group__385781);
            rule__Resource__Group__38__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__39_in_rule__Resource__Group__385784);
            rule__Resource__Group__39();

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
    // $ANTLR end "rule__Resource__Group__38"


    // $ANTLR start "rule__Resource__Group__38__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: rule__Resource__Group__38__Impl : ( '(' ) ;
    public final void rule__Resource__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2889:1: '('
            {
             before(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_38()); 
            match(input,24,FOLLOW_24_in_rule__Resource__Group__38__Impl5812); 
             after(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_38()); 

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
    // $ANTLR end "rule__Resource__Group__38__Impl"


    // $ANTLR start "rule__Resource__Group__39"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2902:1: rule__Resource__Group__39 : rule__Resource__Group__39__Impl rule__Resource__Group__40 ;
    public final void rule__Resource__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2906:1: ( rule__Resource__Group__39__Impl rule__Resource__Group__40 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2907:2: rule__Resource__Group__39__Impl rule__Resource__Group__40
            {
            pushFollow(FOLLOW_rule__Resource__Group__39__Impl_in_rule__Resource__Group__395843);
            rule__Resource__Group__39__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__40_in_rule__Resource__Group__395846);
            rule__Resource__Group__40();

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
    // $ANTLR end "rule__Resource__Group__39"


    // $ANTLR start "rule__Resource__Group__39__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: rule__Resource__Group__39__Impl : ( ( rule__Resource__DeletebyAssignment_39 ) ) ;
    public final void rule__Resource__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: ( ( ( rule__Resource__DeletebyAssignment_39 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2919:1: ( ( rule__Resource__DeletebyAssignment_39 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2919:1: ( ( rule__Resource__DeletebyAssignment_39 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2920:1: ( rule__Resource__DeletebyAssignment_39 )
            {
             before(grammarAccess.getResourceAccess().getDeletebyAssignment_39()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:1: ( rule__Resource__DeletebyAssignment_39 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2921:2: rule__Resource__DeletebyAssignment_39
            {
            pushFollow(FOLLOW_rule__Resource__DeletebyAssignment_39_in_rule__Resource__Group__39__Impl5873);
            rule__Resource__DeletebyAssignment_39();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getDeletebyAssignment_39()); 

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
    // $ANTLR end "rule__Resource__Group__39__Impl"


    // $ANTLR start "rule__Resource__Group__40"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2931:1: rule__Resource__Group__40 : rule__Resource__Group__40__Impl rule__Resource__Group__41 ;
    public final void rule__Resource__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2935:1: ( rule__Resource__Group__40__Impl rule__Resource__Group__41 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2936:2: rule__Resource__Group__40__Impl rule__Resource__Group__41
            {
            pushFollow(FOLLOW_rule__Resource__Group__40__Impl_in_rule__Resource__Group__405903);
            rule__Resource__Group__40__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__41_in_rule__Resource__Group__405906);
            rule__Resource__Group__41();

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
    // $ANTLR end "rule__Resource__Group__40"


    // $ANTLR start "rule__Resource__Group__40__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: rule__Resource__Group__40__Impl : ( ')' ) ;
    public final void rule__Resource__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2947:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: ')'
            {
             before(grammarAccess.getResourceAccess().getRightParenthesisKeyword_40()); 
            match(input,26,FOLLOW_26_in_rule__Resource__Group__40__Impl5934); 
             after(grammarAccess.getResourceAccess().getRightParenthesisKeyword_40()); 

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
    // $ANTLR end "rule__Resource__Group__40__Impl"


    // $ANTLR start "rule__Resource__Group__41"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2962:1: rule__Resource__Group__41 : rule__Resource__Group__41__Impl rule__Resource__Group__42 ;
    public final void rule__Resource__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: ( rule__Resource__Group__41__Impl rule__Resource__Group__42 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2967:2: rule__Resource__Group__41__Impl rule__Resource__Group__42
            {
            pushFollow(FOLLOW_rule__Resource__Group__41__Impl_in_rule__Resource__Group__415965);
            rule__Resource__Group__41__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__42_in_rule__Resource__Group__415968);
            rule__Resource__Group__42();

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
    // $ANTLR end "rule__Resource__Group__41"


    // $ANTLR start "rule__Resource__Group__41__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:1: rule__Resource__Group__41__Impl : ( 'throws' ) ;
    public final void rule__Resource__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2980:1: 'throws'
            {
             before(grammarAccess.getResourceAccess().getThrowsKeyword_41()); 
            match(input,30,FOLLOW_30_in_rule__Resource__Group__41__Impl5996); 
             after(grammarAccess.getResourceAccess().getThrowsKeyword_41()); 

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
    // $ANTLR end "rule__Resource__Group__41__Impl"


    // $ANTLR start "rule__Resource__Group__42"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2993:1: rule__Resource__Group__42 : rule__Resource__Group__42__Impl rule__Resource__Group__43 ;
    public final void rule__Resource__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:1: ( rule__Resource__Group__42__Impl rule__Resource__Group__43 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2998:2: rule__Resource__Group__42__Impl rule__Resource__Group__43
            {
            pushFollow(FOLLOW_rule__Resource__Group__42__Impl_in_rule__Resource__Group__426027);
            rule__Resource__Group__42__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__43_in_rule__Resource__Group__426030);
            rule__Resource__Group__43();

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
    // $ANTLR end "rule__Resource__Group__42"


    // $ANTLR start "rule__Resource__Group__42__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:1: rule__Resource__Group__42__Impl : ( ( rule__Resource__Exception4Assignment_42 ) ) ;
    public final void rule__Resource__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( ( ( rule__Resource__Exception4Assignment_42 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: ( ( rule__Resource__Exception4Assignment_42 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: ( ( rule__Resource__Exception4Assignment_42 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: ( rule__Resource__Exception4Assignment_42 )
            {
             before(grammarAccess.getResourceAccess().getException4Assignment_42()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: ( rule__Resource__Exception4Assignment_42 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:2: rule__Resource__Exception4Assignment_42
            {
            pushFollow(FOLLOW_rule__Resource__Exception4Assignment_42_in_rule__Resource__Group__42__Impl6057);
            rule__Resource__Exception4Assignment_42();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getException4Assignment_42()); 

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
    // $ANTLR end "rule__Resource__Group__42__Impl"


    // $ANTLR start "rule__Resource__Group__43"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3022:1: rule__Resource__Group__43 : rule__Resource__Group__43__Impl rule__Resource__Group__44 ;
    public final void rule__Resource__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3026:1: ( rule__Resource__Group__43__Impl rule__Resource__Group__44 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3027:2: rule__Resource__Group__43__Impl rule__Resource__Group__44
            {
            pushFollow(FOLLOW_rule__Resource__Group__43__Impl_in_rule__Resource__Group__436087);
            rule__Resource__Group__43__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__44_in_rule__Resource__Group__436090);
            rule__Resource__Group__44();

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
    // $ANTLR end "rule__Resource__Group__43"


    // $ANTLR start "rule__Resource__Group__43__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: rule__Resource__Group__43__Impl : ( '{' ) ;
    public final void rule__Resource__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_43()); 
            match(input,19,FOLLOW_19_in_rule__Resource__Group__43__Impl6118); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_43()); 

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
    // $ANTLR end "rule__Resource__Group__43__Impl"


    // $ANTLR start "rule__Resource__Group__44"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: rule__Resource__Group__44 : rule__Resource__Group__44__Impl rule__Resource__Group__45 ;
    public final void rule__Resource__Group__44() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: ( rule__Resource__Group__44__Impl rule__Resource__Group__45 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3058:2: rule__Resource__Group__44__Impl rule__Resource__Group__45
            {
            pushFollow(FOLLOW_rule__Resource__Group__44__Impl_in_rule__Resource__Group__446149);
            rule__Resource__Group__44__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__45_in_rule__Resource__Group__446152);
            rule__Resource__Group__45();

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
    // $ANTLR end "rule__Resource__Group__44"


    // $ANTLR start "rule__Resource__Group__44__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3065:1: rule__Resource__Group__44__Impl : ( ( rule__Resource__DeleteMethodAssignment_44 ) ) ;
    public final void rule__Resource__Group__44__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: ( ( ( rule__Resource__DeleteMethodAssignment_44 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: ( ( rule__Resource__DeleteMethodAssignment_44 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: ( ( rule__Resource__DeleteMethodAssignment_44 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:1: ( rule__Resource__DeleteMethodAssignment_44 )
            {
             before(grammarAccess.getResourceAccess().getDeleteMethodAssignment_44()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:1: ( rule__Resource__DeleteMethodAssignment_44 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:2: rule__Resource__DeleteMethodAssignment_44
            {
            pushFollow(FOLLOW_rule__Resource__DeleteMethodAssignment_44_in_rule__Resource__Group__44__Impl6179);
            rule__Resource__DeleteMethodAssignment_44();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getDeleteMethodAssignment_44()); 

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
    // $ANTLR end "rule__Resource__Group__44__Impl"


    // $ANTLR start "rule__Resource__Group__45"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: rule__Resource__Group__45 : rule__Resource__Group__45__Impl ;
    public final void rule__Resource__Group__45() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: ( rule__Resource__Group__45__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:2: rule__Resource__Group__45__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group__45__Impl_in_rule__Resource__Group__456209);
            rule__Resource__Group__45__Impl();

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
    // $ANTLR end "rule__Resource__Group__45"


    // $ANTLR start "rule__Resource__Group__45__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3093:1: rule__Resource__Group__45__Impl : ( '}' ) ;
    public final void rule__Resource__Group__45__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3097:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_45()); 
            match(input,20,FOLLOW_20_in_rule__Resource__Group__45__Impl6237); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_45()); 

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
    // $ANTLR end "rule__Resource__Group__45__Impl"


    // $ANTLR start "rule__Service__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3204:1: rule__Service__Group__0 : rule__Service__Group__0__Impl rule__Service__Group__1 ;
    public final void rule__Service__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ( rule__Service__Group__0__Impl rule__Service__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:2: rule__Service__Group__0__Impl rule__Service__Group__1
            {
            pushFollow(FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06360);
            rule__Service__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06363);
            rule__Service__Group__1();

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
    // $ANTLR end "rule__Service__Group__0"


    // $ANTLR start "rule__Service__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: rule__Service__Group__0__Impl : ( 'Service' ) ;
    public final void rule__Service__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( ( 'Service' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( 'Service' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( 'Service' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: 'Service'
            {
             before(grammarAccess.getServiceAccess().getServiceKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__Service__Group__0__Impl6391); 
             after(grammarAccess.getServiceAccess().getServiceKeyword_0()); 

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
    // $ANTLR end "rule__Service__Group__0__Impl"


    // $ANTLR start "rule__Service__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: rule__Service__Group__1 : rule__Service__Group__1__Impl rule__Service__Group__2 ;
    public final void rule__Service__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3239:1: ( rule__Service__Group__1__Impl rule__Service__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:2: rule__Service__Group__1__Impl rule__Service__Group__2
            {
            pushFollow(FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16422);
            rule__Service__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16425);
            rule__Service__Group__2();

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
    // $ANTLR end "rule__Service__Group__1"


    // $ANTLR start "rule__Service__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:1: rule__Service__Group__1__Impl : ( ( rule__Service__NameAssignment_1 ) ) ;
    public final void rule__Service__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: ( ( ( rule__Service__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: ( ( rule__Service__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: ( ( rule__Service__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3253:1: ( rule__Service__NameAssignment_1 )
            {
             before(grammarAccess.getServiceAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:1: ( rule__Service__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3254:2: rule__Service__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl6452);
            rule__Service__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Service__Group__1__Impl"


    // $ANTLR start "rule__Service__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: rule__Service__Group__2 : rule__Service__Group__2__Impl rule__Service__Group__3 ;
    public final void rule__Service__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3268:1: ( rule__Service__Group__2__Impl rule__Service__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:2: rule__Service__Group__2__Impl rule__Service__Group__3
            {
            pushFollow(FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26482);
            rule__Service__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26485);
            rule__Service__Group__3();

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
    // $ANTLR end "rule__Service__Group__2"


    // $ANTLR start "rule__Service__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: rule__Service__Group__2__Impl : ( 'create' ) ;
    public final void rule__Service__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( ( 'create' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ( 'create' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ( 'create' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3282:1: 'create'
            {
             before(grammarAccess.getServiceAccess().getCreateKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Service__Group__2__Impl6513); 
             after(grammarAccess.getServiceAccess().getCreateKeyword_2()); 

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
    // $ANTLR end "rule__Service__Group__2__Impl"


    // $ANTLR start "rule__Service__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3295:1: rule__Service__Group__3 : rule__Service__Group__3__Impl rule__Service__Group__4 ;
    public final void rule__Service__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3299:1: ( rule__Service__Group__3__Impl rule__Service__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3300:2: rule__Service__Group__3__Impl rule__Service__Group__4
            {
            pushFollow(FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36544);
            rule__Service__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36547);
            rule__Service__Group__4();

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
    // $ANTLR end "rule__Service__Group__3"


    // $ANTLR start "rule__Service__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3307:1: rule__Service__Group__3__Impl : ( '(' ) ;
    public final void rule__Service__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3311:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3312:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3313:1: '('
            {
             before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Service__Group__3__Impl6575); 
             after(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Service__Group__3__Impl"


    // $ANTLR start "rule__Service__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:1: rule__Service__Group__4 : rule__Service__Group__4__Impl rule__Service__Group__5 ;
    public final void rule__Service__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: ( rule__Service__Group__4__Impl rule__Service__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3331:2: rule__Service__Group__4__Impl rule__Service__Group__5
            {
            pushFollow(FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46606);
            rule__Service__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46609);
            rule__Service__Group__5();

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
    // $ANTLR end "rule__Service__Group__4"


    // $ANTLR start "rule__Service__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: rule__Service__Group__4__Impl : ( ( rule__Service__CreateDataModelAssignment_4 ) ) ;
    public final void rule__Service__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3342:1: ( ( ( rule__Service__CreateDataModelAssignment_4 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3343:1: ( ( rule__Service__CreateDataModelAssignment_4 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3343:1: ( ( rule__Service__CreateDataModelAssignment_4 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3344:1: ( rule__Service__CreateDataModelAssignment_4 )
            {
             before(grammarAccess.getServiceAccess().getCreateDataModelAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: ( rule__Service__CreateDataModelAssignment_4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:2: rule__Service__CreateDataModelAssignment_4
            {
            pushFollow(FOLLOW_rule__Service__CreateDataModelAssignment_4_in_rule__Service__Group__4__Impl6636);
            rule__Service__CreateDataModelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCreateDataModelAssignment_4()); 

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
    // $ANTLR end "rule__Service__Group__4__Impl"


    // $ANTLR start "rule__Service__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: rule__Service__Group__5 : rule__Service__Group__5__Impl rule__Service__Group__6 ;
    public final void rule__Service__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: ( rule__Service__Group__5__Impl rule__Service__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3360:2: rule__Service__Group__5__Impl rule__Service__Group__6
            {
            pushFollow(FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__56666);
            rule__Service__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__6_in_rule__Service__Group__56669);
            rule__Service__Group__6();

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
    // $ANTLR end "rule__Service__Group__5"


    // $ANTLR start "rule__Service__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: rule__Service__Group__5__Impl : ( ')' ) ;
    public final void rule__Service__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3373:1: ')'
            {
             before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__Service__Group__5__Impl6697); 
             after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__Service__Group__5__Impl"


    // $ANTLR start "rule__Service__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: rule__Service__Group__6 : rule__Service__Group__6__Impl rule__Service__Group__7 ;
    public final void rule__Service__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: ( rule__Service__Group__6__Impl rule__Service__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:2: rule__Service__Group__6__Impl rule__Service__Group__7
            {
            pushFollow(FOLLOW_rule__Service__Group__6__Impl_in_rule__Service__Group__66728);
            rule__Service__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__7_in_rule__Service__Group__66731);
            rule__Service__Group__7();

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
    // $ANTLR end "rule__Service__Group__6"


    // $ANTLR start "rule__Service__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3398:1: rule__Service__Group__6__Impl : ( 'throws' ) ;
    public final void rule__Service__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3402:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3404:1: 'throws'
            {
             before(grammarAccess.getServiceAccess().getThrowsKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__Service__Group__6__Impl6759); 
             after(grammarAccess.getServiceAccess().getThrowsKeyword_6()); 

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
    // $ANTLR end "rule__Service__Group__6__Impl"


    // $ANTLR start "rule__Service__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: rule__Service__Group__7 : rule__Service__Group__7__Impl rule__Service__Group__8 ;
    public final void rule__Service__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3421:1: ( rule__Service__Group__7__Impl rule__Service__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:2: rule__Service__Group__7__Impl rule__Service__Group__8
            {
            pushFollow(FOLLOW_rule__Service__Group__7__Impl_in_rule__Service__Group__76790);
            rule__Service__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__8_in_rule__Service__Group__76793);
            rule__Service__Group__8();

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
    // $ANTLR end "rule__Service__Group__7"


    // $ANTLR start "rule__Service__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3429:1: rule__Service__Group__7__Impl : ( ( rule__Service__Exception1Assignment_7 ) ) ;
    public final void rule__Service__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3433:1: ( ( ( rule__Service__Exception1Assignment_7 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: ( ( rule__Service__Exception1Assignment_7 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: ( ( rule__Service__Exception1Assignment_7 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3435:1: ( rule__Service__Exception1Assignment_7 )
            {
             before(grammarAccess.getServiceAccess().getException1Assignment_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:1: ( rule__Service__Exception1Assignment_7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:2: rule__Service__Exception1Assignment_7
            {
            pushFollow(FOLLOW_rule__Service__Exception1Assignment_7_in_rule__Service__Group__7__Impl6820);
            rule__Service__Exception1Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getException1Assignment_7()); 

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
    // $ANTLR end "rule__Service__Group__7__Impl"


    // $ANTLR start "rule__Service__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: rule__Service__Group__8 : rule__Service__Group__8__Impl rule__Service__Group__9 ;
    public final void rule__Service__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: ( rule__Service__Group__8__Impl rule__Service__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:2: rule__Service__Group__8__Impl rule__Service__Group__9
            {
            pushFollow(FOLLOW_rule__Service__Group__8__Impl_in_rule__Service__Group__86850);
            rule__Service__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__9_in_rule__Service__Group__86853);
            rule__Service__Group__9();

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
    // $ANTLR end "rule__Service__Group__8"


    // $ANTLR start "rule__Service__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3458:1: rule__Service__Group__8__Impl : ( '{' ) ;
    public final void rule__Service__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3463:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3463:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3464:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__Service__Group__8__Impl6881); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Service__Group__8__Impl"


    // $ANTLR start "rule__Service__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: rule__Service__Group__9 : rule__Service__Group__9__Impl rule__Service__Group__10 ;
    public final void rule__Service__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: ( rule__Service__Group__9__Impl rule__Service__Group__10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:2: rule__Service__Group__9__Impl rule__Service__Group__10
            {
            pushFollow(FOLLOW_rule__Service__Group__9__Impl_in_rule__Service__Group__96912);
            rule__Service__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__10_in_rule__Service__Group__96915);
            rule__Service__Group__10();

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
    // $ANTLR end "rule__Service__Group__9"


    // $ANTLR start "rule__Service__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3489:1: rule__Service__Group__9__Impl : ( ( rule__Service__CreateMethodAssignment_9 ) ) ;
    public final void rule__Service__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3493:1: ( ( ( rule__Service__CreateMethodAssignment_9 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: ( ( rule__Service__CreateMethodAssignment_9 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: ( ( rule__Service__CreateMethodAssignment_9 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3495:1: ( rule__Service__CreateMethodAssignment_9 )
            {
             before(grammarAccess.getServiceAccess().getCreateMethodAssignment_9()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3496:1: ( rule__Service__CreateMethodAssignment_9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3496:2: rule__Service__CreateMethodAssignment_9
            {
            pushFollow(FOLLOW_rule__Service__CreateMethodAssignment_9_in_rule__Service__Group__9__Impl6942);
            rule__Service__CreateMethodAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCreateMethodAssignment_9()); 

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
    // $ANTLR end "rule__Service__Group__9__Impl"


    // $ANTLR start "rule__Service__Group__10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: rule__Service__Group__10 : rule__Service__Group__10__Impl rule__Service__Group__11 ;
    public final void rule__Service__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( rule__Service__Group__10__Impl rule__Service__Group__11 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:2: rule__Service__Group__10__Impl rule__Service__Group__11
            {
            pushFollow(FOLLOW_rule__Service__Group__10__Impl_in_rule__Service__Group__106972);
            rule__Service__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__11_in_rule__Service__Group__106975);
            rule__Service__Group__11();

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
    // $ANTLR end "rule__Service__Group__10"


    // $ANTLR start "rule__Service__Group__10__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3518:1: rule__Service__Group__10__Impl : ( 'return' ) ;
    public final void rule__Service__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:1: ( ( 'return' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: ( 'return' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: ( 'return' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3524:1: 'return'
            {
             before(grammarAccess.getServiceAccess().getReturnKeyword_10()); 
            match(input,31,FOLLOW_31_in_rule__Service__Group__10__Impl7003); 
             after(grammarAccess.getServiceAccess().getReturnKeyword_10()); 

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
    // $ANTLR end "rule__Service__Group__10__Impl"


    // $ANTLR start "rule__Service__Group__11"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: rule__Service__Group__11 : rule__Service__Group__11__Impl rule__Service__Group__12 ;
    public final void rule__Service__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: ( rule__Service__Group__11__Impl rule__Service__Group__12 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:2: rule__Service__Group__11__Impl rule__Service__Group__12
            {
            pushFollow(FOLLOW_rule__Service__Group__11__Impl_in_rule__Service__Group__117034);
            rule__Service__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__12_in_rule__Service__Group__117037);
            rule__Service__Group__12();

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
    // $ANTLR end "rule__Service__Group__11"


    // $ANTLR start "rule__Service__Group__11__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3549:1: rule__Service__Group__11__Impl : ( ( rule__Service__CreatedDataModelAssignment_11 ) ) ;
    public final void rule__Service__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3553:1: ( ( ( rule__Service__CreatedDataModelAssignment_11 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:1: ( ( rule__Service__CreatedDataModelAssignment_11 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:1: ( ( rule__Service__CreatedDataModelAssignment_11 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: ( rule__Service__CreatedDataModelAssignment_11 )
            {
             before(grammarAccess.getServiceAccess().getCreatedDataModelAssignment_11()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:1: ( rule__Service__CreatedDataModelAssignment_11 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:2: rule__Service__CreatedDataModelAssignment_11
            {
            pushFollow(FOLLOW_rule__Service__CreatedDataModelAssignment_11_in_rule__Service__Group__11__Impl7064);
            rule__Service__CreatedDataModelAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getCreatedDataModelAssignment_11()); 

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
    // $ANTLR end "rule__Service__Group__11__Impl"


    // $ANTLR start "rule__Service__Group__12"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: rule__Service__Group__12 : rule__Service__Group__12__Impl rule__Service__Group__13 ;
    public final void rule__Service__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: ( rule__Service__Group__12__Impl rule__Service__Group__13 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:2: rule__Service__Group__12__Impl rule__Service__Group__13
            {
            pushFollow(FOLLOW_rule__Service__Group__12__Impl_in_rule__Service__Group__127094);
            rule__Service__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__13_in_rule__Service__Group__127097);
            rule__Service__Group__13();

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
    // $ANTLR end "rule__Service__Group__12"


    // $ANTLR start "rule__Service__Group__12__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3578:1: rule__Service__Group__12__Impl : ( '}' ) ;
    public final void rule__Service__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3582:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_12()); 
            match(input,20,FOLLOW_20_in_rule__Service__Group__12__Impl7125); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Service__Group__12__Impl"


    // $ANTLR start "rule__Service__Group__13"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: rule__Service__Group__13 : rule__Service__Group__13__Impl rule__Service__Group__14 ;
    public final void rule__Service__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( rule__Service__Group__13__Impl rule__Service__Group__14 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:2: rule__Service__Group__13__Impl rule__Service__Group__14
            {
            pushFollow(FOLLOW_rule__Service__Group__13__Impl_in_rule__Service__Group__137156);
            rule__Service__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__14_in_rule__Service__Group__137159);
            rule__Service__Group__14();

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
    // $ANTLR end "rule__Service__Group__13"


    // $ANTLR start "rule__Service__Group__13__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3609:1: rule__Service__Group__13__Impl : ( 'find' ) ;
    public final void rule__Service__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3613:1: ( ( 'find' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3614:1: ( 'find' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3614:1: ( 'find' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3615:1: 'find'
            {
             before(grammarAccess.getServiceAccess().getFindKeyword_13()); 
            match(input,32,FOLLOW_32_in_rule__Service__Group__13__Impl7187); 
             after(grammarAccess.getServiceAccess().getFindKeyword_13()); 

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
    // $ANTLR end "rule__Service__Group__13__Impl"


    // $ANTLR start "rule__Service__Group__14"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: rule__Service__Group__14 : rule__Service__Group__14__Impl rule__Service__Group__15 ;
    public final void rule__Service__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ( rule__Service__Group__14__Impl rule__Service__Group__15 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:2: rule__Service__Group__14__Impl rule__Service__Group__15
            {
            pushFollow(FOLLOW_rule__Service__Group__14__Impl_in_rule__Service__Group__147218);
            rule__Service__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__15_in_rule__Service__Group__147221);
            rule__Service__Group__15();

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
    // $ANTLR end "rule__Service__Group__14"


    // $ANTLR start "rule__Service__Group__14__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3640:1: rule__Service__Group__14__Impl : ( '(' ) ;
    public final void rule__Service__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:1: '('
            {
             before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_14()); 
            match(input,24,FOLLOW_24_in_rule__Service__Group__14__Impl7249); 
             after(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_14()); 

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
    // $ANTLR end "rule__Service__Group__14__Impl"


    // $ANTLR start "rule__Service__Group__15"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3659:1: rule__Service__Group__15 : rule__Service__Group__15__Impl rule__Service__Group__16 ;
    public final void rule__Service__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: ( rule__Service__Group__15__Impl rule__Service__Group__16 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:2: rule__Service__Group__15__Impl rule__Service__Group__16
            {
            pushFollow(FOLLOW_rule__Service__Group__15__Impl_in_rule__Service__Group__157280);
            rule__Service__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__16_in_rule__Service__Group__157283);
            rule__Service__Group__16();

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
    // $ANTLR end "rule__Service__Group__15"


    // $ANTLR start "rule__Service__Group__15__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3671:1: rule__Service__Group__15__Impl : ( ( rule__Service__FindbyAssignment_15 ) ) ;
    public final void rule__Service__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3675:1: ( ( ( rule__Service__FindbyAssignment_15 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: ( ( rule__Service__FindbyAssignment_15 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: ( ( rule__Service__FindbyAssignment_15 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( rule__Service__FindbyAssignment_15 )
            {
             before(grammarAccess.getServiceAccess().getFindbyAssignment_15()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( rule__Service__FindbyAssignment_15 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:2: rule__Service__FindbyAssignment_15
            {
            pushFollow(FOLLOW_rule__Service__FindbyAssignment_15_in_rule__Service__Group__15__Impl7310);
            rule__Service__FindbyAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getFindbyAssignment_15()); 

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
    // $ANTLR end "rule__Service__Group__15__Impl"


    // $ANTLR start "rule__Service__Group__16"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: rule__Service__Group__16 : rule__Service__Group__16__Impl rule__Service__Group__17 ;
    public final void rule__Service__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3692:1: ( rule__Service__Group__16__Impl rule__Service__Group__17 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:2: rule__Service__Group__16__Impl rule__Service__Group__17
            {
            pushFollow(FOLLOW_rule__Service__Group__16__Impl_in_rule__Service__Group__167340);
            rule__Service__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__17_in_rule__Service__Group__167343);
            rule__Service__Group__17();

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
    // $ANTLR end "rule__Service__Group__16"


    // $ANTLR start "rule__Service__Group__16__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3700:1: rule__Service__Group__16__Impl : ( ')' ) ;
    public final void rule__Service__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3704:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: ')'
            {
             before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_16()); 
            match(input,26,FOLLOW_26_in_rule__Service__Group__16__Impl7371); 
             after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_16()); 

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
    // $ANTLR end "rule__Service__Group__16__Impl"


    // $ANTLR start "rule__Service__Group__17"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3719:1: rule__Service__Group__17 : rule__Service__Group__17__Impl rule__Service__Group__18 ;
    public final void rule__Service__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: ( rule__Service__Group__17__Impl rule__Service__Group__18 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:2: rule__Service__Group__17__Impl rule__Service__Group__18
            {
            pushFollow(FOLLOW_rule__Service__Group__17__Impl_in_rule__Service__Group__177402);
            rule__Service__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__18_in_rule__Service__Group__177405);
            rule__Service__Group__18();

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
    // $ANTLR end "rule__Service__Group__17"


    // $ANTLR start "rule__Service__Group__17__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3731:1: rule__Service__Group__17__Impl : ( 'throws' ) ;
    public final void rule__Service__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: 'throws'
            {
             before(grammarAccess.getServiceAccess().getThrowsKeyword_17()); 
            match(input,30,FOLLOW_30_in_rule__Service__Group__17__Impl7433); 
             after(grammarAccess.getServiceAccess().getThrowsKeyword_17()); 

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
    // $ANTLR end "rule__Service__Group__17__Impl"


    // $ANTLR start "rule__Service__Group__18"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3750:1: rule__Service__Group__18 : rule__Service__Group__18__Impl rule__Service__Group__19 ;
    public final void rule__Service__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: ( rule__Service__Group__18__Impl rule__Service__Group__19 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:2: rule__Service__Group__18__Impl rule__Service__Group__19
            {
            pushFollow(FOLLOW_rule__Service__Group__18__Impl_in_rule__Service__Group__187464);
            rule__Service__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__19_in_rule__Service__Group__187467);
            rule__Service__Group__19();

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
    // $ANTLR end "rule__Service__Group__18"


    // $ANTLR start "rule__Service__Group__18__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3762:1: rule__Service__Group__18__Impl : ( ( rule__Service__Exception2Assignment_18 ) ) ;
    public final void rule__Service__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: ( ( ( rule__Service__Exception2Assignment_18 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: ( ( rule__Service__Exception2Assignment_18 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: ( ( rule__Service__Exception2Assignment_18 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( rule__Service__Exception2Assignment_18 )
            {
             before(grammarAccess.getServiceAccess().getException2Assignment_18()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:1: ( rule__Service__Exception2Assignment_18 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:2: rule__Service__Exception2Assignment_18
            {
            pushFollow(FOLLOW_rule__Service__Exception2Assignment_18_in_rule__Service__Group__18__Impl7494);
            rule__Service__Exception2Assignment_18();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getException2Assignment_18()); 

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
    // $ANTLR end "rule__Service__Group__18__Impl"


    // $ANTLR start "rule__Service__Group__19"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3779:1: rule__Service__Group__19 : rule__Service__Group__19__Impl rule__Service__Group__20 ;
    public final void rule__Service__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( rule__Service__Group__19__Impl rule__Service__Group__20 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:2: rule__Service__Group__19__Impl rule__Service__Group__20
            {
            pushFollow(FOLLOW_rule__Service__Group__19__Impl_in_rule__Service__Group__197524);
            rule__Service__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__20_in_rule__Service__Group__197527);
            rule__Service__Group__20();

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
    // $ANTLR end "rule__Service__Group__19"


    // $ANTLR start "rule__Service__Group__19__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:1: rule__Service__Group__19__Impl : ( '{' ) ;
    public final void rule__Service__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3797:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_19()); 
            match(input,19,FOLLOW_19_in_rule__Service__Group__19__Impl7555); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_19()); 

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
    // $ANTLR end "rule__Service__Group__19__Impl"


    // $ANTLR start "rule__Service__Group__20"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3810:1: rule__Service__Group__20 : rule__Service__Group__20__Impl rule__Service__Group__21 ;
    public final void rule__Service__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3814:1: ( rule__Service__Group__20__Impl rule__Service__Group__21 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:2: rule__Service__Group__20__Impl rule__Service__Group__21
            {
            pushFollow(FOLLOW_rule__Service__Group__20__Impl_in_rule__Service__Group__207586);
            rule__Service__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__21_in_rule__Service__Group__207589);
            rule__Service__Group__21();

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
    // $ANTLR end "rule__Service__Group__20"


    // $ANTLR start "rule__Service__Group__20__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:1: rule__Service__Group__20__Impl : ( ( rule__Service__FindMethodAssignment_20 ) ) ;
    public final void rule__Service__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3826:1: ( ( ( rule__Service__FindMethodAssignment_20 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:1: ( ( rule__Service__FindMethodAssignment_20 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:1: ( ( rule__Service__FindMethodAssignment_20 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3828:1: ( rule__Service__FindMethodAssignment_20 )
            {
             before(grammarAccess.getServiceAccess().getFindMethodAssignment_20()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:1: ( rule__Service__FindMethodAssignment_20 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:2: rule__Service__FindMethodAssignment_20
            {
            pushFollow(FOLLOW_rule__Service__FindMethodAssignment_20_in_rule__Service__Group__20__Impl7616);
            rule__Service__FindMethodAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getFindMethodAssignment_20()); 

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
    // $ANTLR end "rule__Service__Group__20__Impl"


    // $ANTLR start "rule__Service__Group__21"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: rule__Service__Group__21 : rule__Service__Group__21__Impl rule__Service__Group__22 ;
    public final void rule__Service__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3843:1: ( rule__Service__Group__21__Impl rule__Service__Group__22 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3844:2: rule__Service__Group__21__Impl rule__Service__Group__22
            {
            pushFollow(FOLLOW_rule__Service__Group__21__Impl_in_rule__Service__Group__217646);
            rule__Service__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__22_in_rule__Service__Group__217649);
            rule__Service__Group__22();

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
    // $ANTLR end "rule__Service__Group__21"


    // $ANTLR start "rule__Service__Group__21__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:1: rule__Service__Group__21__Impl : ( 'return' ) ;
    public final void rule__Service__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3855:1: ( ( 'return' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:1: ( 'return' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:1: ( 'return' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3857:1: 'return'
            {
             before(grammarAccess.getServiceAccess().getReturnKeyword_21()); 
            match(input,31,FOLLOW_31_in_rule__Service__Group__21__Impl7677); 
             after(grammarAccess.getServiceAccess().getReturnKeyword_21()); 

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
    // $ANTLR end "rule__Service__Group__21__Impl"


    // $ANTLR start "rule__Service__Group__22"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3870:1: rule__Service__Group__22 : rule__Service__Group__22__Impl rule__Service__Group__23 ;
    public final void rule__Service__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3874:1: ( rule__Service__Group__22__Impl rule__Service__Group__23 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3875:2: rule__Service__Group__22__Impl rule__Service__Group__23
            {
            pushFollow(FOLLOW_rule__Service__Group__22__Impl_in_rule__Service__Group__227708);
            rule__Service__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__23_in_rule__Service__Group__227711);
            rule__Service__Group__23();

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
    // $ANTLR end "rule__Service__Group__22"


    // $ANTLR start "rule__Service__Group__22__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:1: rule__Service__Group__22__Impl : ( ( rule__Service__FoundDataModelAssignment_22 ) ) ;
    public final void rule__Service__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3886:1: ( ( ( rule__Service__FoundDataModelAssignment_22 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3887:1: ( ( rule__Service__FoundDataModelAssignment_22 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3887:1: ( ( rule__Service__FoundDataModelAssignment_22 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3888:1: ( rule__Service__FoundDataModelAssignment_22 )
            {
             before(grammarAccess.getServiceAccess().getFoundDataModelAssignment_22()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: ( rule__Service__FoundDataModelAssignment_22 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:2: rule__Service__FoundDataModelAssignment_22
            {
            pushFollow(FOLLOW_rule__Service__FoundDataModelAssignment_22_in_rule__Service__Group__22__Impl7738);
            rule__Service__FoundDataModelAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getFoundDataModelAssignment_22()); 

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
    // $ANTLR end "rule__Service__Group__22__Impl"


    // $ANTLR start "rule__Service__Group__23"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3899:1: rule__Service__Group__23 : rule__Service__Group__23__Impl rule__Service__Group__24 ;
    public final void rule__Service__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:1: ( rule__Service__Group__23__Impl rule__Service__Group__24 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3904:2: rule__Service__Group__23__Impl rule__Service__Group__24
            {
            pushFollow(FOLLOW_rule__Service__Group__23__Impl_in_rule__Service__Group__237768);
            rule__Service__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__24_in_rule__Service__Group__237771);
            rule__Service__Group__24();

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
    // $ANTLR end "rule__Service__Group__23"


    // $ANTLR start "rule__Service__Group__23__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:1: rule__Service__Group__23__Impl : ( '}' ) ;
    public final void rule__Service__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3915:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3916:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3916:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_23()); 
            match(input,20,FOLLOW_20_in_rule__Service__Group__23__Impl7799); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_23()); 

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
    // $ANTLR end "rule__Service__Group__23__Impl"


    // $ANTLR start "rule__Service__Group__24"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3930:1: rule__Service__Group__24 : rule__Service__Group__24__Impl rule__Service__Group__25 ;
    public final void rule__Service__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( rule__Service__Group__24__Impl rule__Service__Group__25 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:2: rule__Service__Group__24__Impl rule__Service__Group__25
            {
            pushFollow(FOLLOW_rule__Service__Group__24__Impl_in_rule__Service__Group__247830);
            rule__Service__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__25_in_rule__Service__Group__247833);
            rule__Service__Group__25();

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
    // $ANTLR end "rule__Service__Group__24"


    // $ANTLR start "rule__Service__Group__24__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:1: rule__Service__Group__24__Impl : ( 'update' ) ;
    public final void rule__Service__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:1: ( ( 'update' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3947:1: ( 'update' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3947:1: ( 'update' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:1: 'update'
            {
             before(grammarAccess.getServiceAccess().getUpdateKeyword_24()); 
            match(input,33,FOLLOW_33_in_rule__Service__Group__24__Impl7861); 
             after(grammarAccess.getServiceAccess().getUpdateKeyword_24()); 

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
    // $ANTLR end "rule__Service__Group__24__Impl"


    // $ANTLR start "rule__Service__Group__25"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3961:1: rule__Service__Group__25 : rule__Service__Group__25__Impl rule__Service__Group__26 ;
    public final void rule__Service__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: ( rule__Service__Group__25__Impl rule__Service__Group__26 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:2: rule__Service__Group__25__Impl rule__Service__Group__26
            {
            pushFollow(FOLLOW_rule__Service__Group__25__Impl_in_rule__Service__Group__257892);
            rule__Service__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__26_in_rule__Service__Group__257895);
            rule__Service__Group__26();

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
    // $ANTLR end "rule__Service__Group__25"


    // $ANTLR start "rule__Service__Group__25__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: rule__Service__Group__25__Impl : ( '(' ) ;
    public final void rule__Service__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3979:1: '('
            {
             before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_25()); 
            match(input,24,FOLLOW_24_in_rule__Service__Group__25__Impl7923); 
             after(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_25()); 

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
    // $ANTLR end "rule__Service__Group__25__Impl"


    // $ANTLR start "rule__Service__Group__26"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3992:1: rule__Service__Group__26 : rule__Service__Group__26__Impl rule__Service__Group__27 ;
    public final void rule__Service__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3996:1: ( rule__Service__Group__26__Impl rule__Service__Group__27 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3997:2: rule__Service__Group__26__Impl rule__Service__Group__27
            {
            pushFollow(FOLLOW_rule__Service__Group__26__Impl_in_rule__Service__Group__267954);
            rule__Service__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__27_in_rule__Service__Group__267957);
            rule__Service__Group__27();

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
    // $ANTLR end "rule__Service__Group__26"


    // $ANTLR start "rule__Service__Group__26__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4004:1: rule__Service__Group__26__Impl : ( ( rule__Service__UpdatebyAssignment_26 ) ) ;
    public final void rule__Service__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:1: ( ( ( rule__Service__UpdatebyAssignment_26 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4009:1: ( ( rule__Service__UpdatebyAssignment_26 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4009:1: ( ( rule__Service__UpdatebyAssignment_26 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4010:1: ( rule__Service__UpdatebyAssignment_26 )
            {
             before(grammarAccess.getServiceAccess().getUpdatebyAssignment_26()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:1: ( rule__Service__UpdatebyAssignment_26 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:2: rule__Service__UpdatebyAssignment_26
            {
            pushFollow(FOLLOW_rule__Service__UpdatebyAssignment_26_in_rule__Service__Group__26__Impl7984);
            rule__Service__UpdatebyAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getUpdatebyAssignment_26()); 

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
    // $ANTLR end "rule__Service__Group__26__Impl"


    // $ANTLR start "rule__Service__Group__27"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: rule__Service__Group__27 : rule__Service__Group__27__Impl rule__Service__Group__28 ;
    public final void rule__Service__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:1: ( rule__Service__Group__27__Impl rule__Service__Group__28 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:2: rule__Service__Group__27__Impl rule__Service__Group__28
            {
            pushFollow(FOLLOW_rule__Service__Group__27__Impl_in_rule__Service__Group__278014);
            rule__Service__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__28_in_rule__Service__Group__278017);
            rule__Service__Group__28();

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
    // $ANTLR end "rule__Service__Group__27"


    // $ANTLR start "rule__Service__Group__27__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4033:1: rule__Service__Group__27__Impl : ( ',' ) ;
    public final void rule__Service__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4038:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4038:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4039:1: ','
            {
             before(grammarAccess.getServiceAccess().getCommaKeyword_27()); 
            match(input,34,FOLLOW_34_in_rule__Service__Group__27__Impl8045); 
             after(grammarAccess.getServiceAccess().getCommaKeyword_27()); 

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
    // $ANTLR end "rule__Service__Group__27__Impl"


    // $ANTLR start "rule__Service__Group__28"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:1: rule__Service__Group__28 : rule__Service__Group__28__Impl rule__Service__Group__29 ;
    public final void rule__Service__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4056:1: ( rule__Service__Group__28__Impl rule__Service__Group__29 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4057:2: rule__Service__Group__28__Impl rule__Service__Group__29
            {
            pushFollow(FOLLOW_rule__Service__Group__28__Impl_in_rule__Service__Group__288076);
            rule__Service__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__29_in_rule__Service__Group__288079);
            rule__Service__Group__29();

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
    // $ANTLR end "rule__Service__Group__28"


    // $ANTLR start "rule__Service__Group__28__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4064:1: rule__Service__Group__28__Impl : ( ( rule__Service__UpdateDataModelAssignment_28 ) ) ;
    public final void rule__Service__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:1: ( ( ( rule__Service__UpdateDataModelAssignment_28 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4069:1: ( ( rule__Service__UpdateDataModelAssignment_28 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4069:1: ( ( rule__Service__UpdateDataModelAssignment_28 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4070:1: ( rule__Service__UpdateDataModelAssignment_28 )
            {
             before(grammarAccess.getServiceAccess().getUpdateDataModelAssignment_28()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:1: ( rule__Service__UpdateDataModelAssignment_28 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4071:2: rule__Service__UpdateDataModelAssignment_28
            {
            pushFollow(FOLLOW_rule__Service__UpdateDataModelAssignment_28_in_rule__Service__Group__28__Impl8106);
            rule__Service__UpdateDataModelAssignment_28();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getUpdateDataModelAssignment_28()); 

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
    // $ANTLR end "rule__Service__Group__28__Impl"


    // $ANTLR start "rule__Service__Group__29"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4081:1: rule__Service__Group__29 : rule__Service__Group__29__Impl rule__Service__Group__30 ;
    public final void rule__Service__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: ( rule__Service__Group__29__Impl rule__Service__Group__30 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4086:2: rule__Service__Group__29__Impl rule__Service__Group__30
            {
            pushFollow(FOLLOW_rule__Service__Group__29__Impl_in_rule__Service__Group__298136);
            rule__Service__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__30_in_rule__Service__Group__298139);
            rule__Service__Group__30();

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
    // $ANTLR end "rule__Service__Group__29"


    // $ANTLR start "rule__Service__Group__29__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4093:1: rule__Service__Group__29__Impl : ( ')' ) ;
    public final void rule__Service__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4098:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4098:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4099:1: ')'
            {
             before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_29()); 
            match(input,26,FOLLOW_26_in_rule__Service__Group__29__Impl8167); 
             after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_29()); 

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
    // $ANTLR end "rule__Service__Group__29__Impl"


    // $ANTLR start "rule__Service__Group__30"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4112:1: rule__Service__Group__30 : rule__Service__Group__30__Impl rule__Service__Group__31 ;
    public final void rule__Service__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: ( rule__Service__Group__30__Impl rule__Service__Group__31 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4117:2: rule__Service__Group__30__Impl rule__Service__Group__31
            {
            pushFollow(FOLLOW_rule__Service__Group__30__Impl_in_rule__Service__Group__308198);
            rule__Service__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__31_in_rule__Service__Group__308201);
            rule__Service__Group__31();

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
    // $ANTLR end "rule__Service__Group__30"


    // $ANTLR start "rule__Service__Group__30__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:1: rule__Service__Group__30__Impl : ( 'throws' ) ;
    public final void rule__Service__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4128:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4129:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4129:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4130:1: 'throws'
            {
             before(grammarAccess.getServiceAccess().getThrowsKeyword_30()); 
            match(input,30,FOLLOW_30_in_rule__Service__Group__30__Impl8229); 
             after(grammarAccess.getServiceAccess().getThrowsKeyword_30()); 

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
    // $ANTLR end "rule__Service__Group__30__Impl"


    // $ANTLR start "rule__Service__Group__31"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4143:1: rule__Service__Group__31 : rule__Service__Group__31__Impl rule__Service__Group__32 ;
    public final void rule__Service__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4147:1: ( rule__Service__Group__31__Impl rule__Service__Group__32 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4148:2: rule__Service__Group__31__Impl rule__Service__Group__32
            {
            pushFollow(FOLLOW_rule__Service__Group__31__Impl_in_rule__Service__Group__318260);
            rule__Service__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__32_in_rule__Service__Group__318263);
            rule__Service__Group__32();

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
    // $ANTLR end "rule__Service__Group__31"


    // $ANTLR start "rule__Service__Group__31__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:1: rule__Service__Group__31__Impl : ( ( rule__Service__Exception3Assignment_31 ) ) ;
    public final void rule__Service__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4159:1: ( ( ( rule__Service__Exception3Assignment_31 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:1: ( ( rule__Service__Exception3Assignment_31 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:1: ( ( rule__Service__Exception3Assignment_31 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: ( rule__Service__Exception3Assignment_31 )
            {
             before(grammarAccess.getServiceAccess().getException3Assignment_31()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4162:1: ( rule__Service__Exception3Assignment_31 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4162:2: rule__Service__Exception3Assignment_31
            {
            pushFollow(FOLLOW_rule__Service__Exception3Assignment_31_in_rule__Service__Group__31__Impl8290);
            rule__Service__Exception3Assignment_31();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getException3Assignment_31()); 

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
    // $ANTLR end "rule__Service__Group__31__Impl"


    // $ANTLR start "rule__Service__Group__32"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4172:1: rule__Service__Group__32 : rule__Service__Group__32__Impl rule__Service__Group__33 ;
    public final void rule__Service__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:1: ( rule__Service__Group__32__Impl rule__Service__Group__33 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4177:2: rule__Service__Group__32__Impl rule__Service__Group__33
            {
            pushFollow(FOLLOW_rule__Service__Group__32__Impl_in_rule__Service__Group__328320);
            rule__Service__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__33_in_rule__Service__Group__328323);
            rule__Service__Group__33();

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
    // $ANTLR end "rule__Service__Group__32"


    // $ANTLR start "rule__Service__Group__32__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4184:1: rule__Service__Group__32__Impl : ( '{' ) ;
    public final void rule__Service__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4188:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4190:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_32()); 
            match(input,19,FOLLOW_19_in_rule__Service__Group__32__Impl8351); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_32()); 

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
    // $ANTLR end "rule__Service__Group__32__Impl"


    // $ANTLR start "rule__Service__Group__33"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4203:1: rule__Service__Group__33 : rule__Service__Group__33__Impl rule__Service__Group__34 ;
    public final void rule__Service__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:1: ( rule__Service__Group__33__Impl rule__Service__Group__34 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:2: rule__Service__Group__33__Impl rule__Service__Group__34
            {
            pushFollow(FOLLOW_rule__Service__Group__33__Impl_in_rule__Service__Group__338382);
            rule__Service__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__34_in_rule__Service__Group__338385);
            rule__Service__Group__34();

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
    // $ANTLR end "rule__Service__Group__33"


    // $ANTLR start "rule__Service__Group__33__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4215:1: rule__Service__Group__33__Impl : ( ( rule__Service__UpdateMethodAssignment_33 ) ) ;
    public final void rule__Service__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4219:1: ( ( ( rule__Service__UpdateMethodAssignment_33 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4220:1: ( ( rule__Service__UpdateMethodAssignment_33 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4220:1: ( ( rule__Service__UpdateMethodAssignment_33 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: ( rule__Service__UpdateMethodAssignment_33 )
            {
             before(grammarAccess.getServiceAccess().getUpdateMethodAssignment_33()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4222:1: ( rule__Service__UpdateMethodAssignment_33 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4222:2: rule__Service__UpdateMethodAssignment_33
            {
            pushFollow(FOLLOW_rule__Service__UpdateMethodAssignment_33_in_rule__Service__Group__33__Impl8412);
            rule__Service__UpdateMethodAssignment_33();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getUpdateMethodAssignment_33()); 

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
    // $ANTLR end "rule__Service__Group__33__Impl"


    // $ANTLR start "rule__Service__Group__34"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4232:1: rule__Service__Group__34 : rule__Service__Group__34__Impl rule__Service__Group__35 ;
    public final void rule__Service__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4236:1: ( rule__Service__Group__34__Impl rule__Service__Group__35 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4237:2: rule__Service__Group__34__Impl rule__Service__Group__35
            {
            pushFollow(FOLLOW_rule__Service__Group__34__Impl_in_rule__Service__Group__348442);
            rule__Service__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__35_in_rule__Service__Group__348445);
            rule__Service__Group__35();

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
    // $ANTLR end "rule__Service__Group__34"


    // $ANTLR start "rule__Service__Group__34__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: rule__Service__Group__34__Impl : ( 'return' ) ;
    public final void rule__Service__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4248:1: ( ( 'return' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4249:1: ( 'return' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4249:1: ( 'return' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4250:1: 'return'
            {
             before(grammarAccess.getServiceAccess().getReturnKeyword_34()); 
            match(input,31,FOLLOW_31_in_rule__Service__Group__34__Impl8473); 
             after(grammarAccess.getServiceAccess().getReturnKeyword_34()); 

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
    // $ANTLR end "rule__Service__Group__34__Impl"


    // $ANTLR start "rule__Service__Group__35"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4263:1: rule__Service__Group__35 : rule__Service__Group__35__Impl rule__Service__Group__36 ;
    public final void rule__Service__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:1: ( rule__Service__Group__35__Impl rule__Service__Group__36 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:2: rule__Service__Group__35__Impl rule__Service__Group__36
            {
            pushFollow(FOLLOW_rule__Service__Group__35__Impl_in_rule__Service__Group__358504);
            rule__Service__Group__35__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__36_in_rule__Service__Group__358507);
            rule__Service__Group__36();

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
    // $ANTLR end "rule__Service__Group__35"


    // $ANTLR start "rule__Service__Group__35__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4275:1: rule__Service__Group__35__Impl : ( ( rule__Service__UpdatedDataModelAssignment_35 ) ) ;
    public final void rule__Service__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4279:1: ( ( ( rule__Service__UpdatedDataModelAssignment_35 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4280:1: ( ( rule__Service__UpdatedDataModelAssignment_35 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4280:1: ( ( rule__Service__UpdatedDataModelAssignment_35 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: ( rule__Service__UpdatedDataModelAssignment_35 )
            {
             before(grammarAccess.getServiceAccess().getUpdatedDataModelAssignment_35()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: ( rule__Service__UpdatedDataModelAssignment_35 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:2: rule__Service__UpdatedDataModelAssignment_35
            {
            pushFollow(FOLLOW_rule__Service__UpdatedDataModelAssignment_35_in_rule__Service__Group__35__Impl8534);
            rule__Service__UpdatedDataModelAssignment_35();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getUpdatedDataModelAssignment_35()); 

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
    // $ANTLR end "rule__Service__Group__35__Impl"


    // $ANTLR start "rule__Service__Group__36"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4292:1: rule__Service__Group__36 : rule__Service__Group__36__Impl rule__Service__Group__37 ;
    public final void rule__Service__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: ( rule__Service__Group__36__Impl rule__Service__Group__37 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:2: rule__Service__Group__36__Impl rule__Service__Group__37
            {
            pushFollow(FOLLOW_rule__Service__Group__36__Impl_in_rule__Service__Group__368564);
            rule__Service__Group__36__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__37_in_rule__Service__Group__368567);
            rule__Service__Group__37();

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
    // $ANTLR end "rule__Service__Group__36"


    // $ANTLR start "rule__Service__Group__36__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4304:1: rule__Service__Group__36__Impl : ( '}' ) ;
    public final void rule__Service__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4308:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4309:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4309:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4310:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_36()); 
            match(input,20,FOLLOW_20_in_rule__Service__Group__36__Impl8595); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_36()); 

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
    // $ANTLR end "rule__Service__Group__36__Impl"


    // $ANTLR start "rule__Service__Group__37"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4323:1: rule__Service__Group__37 : rule__Service__Group__37__Impl rule__Service__Group__38 ;
    public final void rule__Service__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4327:1: ( rule__Service__Group__37__Impl rule__Service__Group__38 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:2: rule__Service__Group__37__Impl rule__Service__Group__38
            {
            pushFollow(FOLLOW_rule__Service__Group__37__Impl_in_rule__Service__Group__378626);
            rule__Service__Group__37__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__38_in_rule__Service__Group__378629);
            rule__Service__Group__38();

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
    // $ANTLR end "rule__Service__Group__37"


    // $ANTLR start "rule__Service__Group__37__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4335:1: rule__Service__Group__37__Impl : ( 'delete' ) ;
    public final void rule__Service__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4339:1: ( ( 'delete' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: ( 'delete' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: ( 'delete' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:1: 'delete'
            {
             before(grammarAccess.getServiceAccess().getDeleteKeyword_37()); 
            match(input,35,FOLLOW_35_in_rule__Service__Group__37__Impl8657); 
             after(grammarAccess.getServiceAccess().getDeleteKeyword_37()); 

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
    // $ANTLR end "rule__Service__Group__37__Impl"


    // $ANTLR start "rule__Service__Group__38"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4354:1: rule__Service__Group__38 : rule__Service__Group__38__Impl rule__Service__Group__39 ;
    public final void rule__Service__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( rule__Service__Group__38__Impl rule__Service__Group__39 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:2: rule__Service__Group__38__Impl rule__Service__Group__39
            {
            pushFollow(FOLLOW_rule__Service__Group__38__Impl_in_rule__Service__Group__388688);
            rule__Service__Group__38__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__39_in_rule__Service__Group__388691);
            rule__Service__Group__39();

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
    // $ANTLR end "rule__Service__Group__38"


    // $ANTLR start "rule__Service__Group__38__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4366:1: rule__Service__Group__38__Impl : ( '(' ) ;
    public final void rule__Service__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4372:1: '('
            {
             before(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_38()); 
            match(input,24,FOLLOW_24_in_rule__Service__Group__38__Impl8719); 
             after(grammarAccess.getServiceAccess().getLeftParenthesisKeyword_38()); 

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
    // $ANTLR end "rule__Service__Group__38__Impl"


    // $ANTLR start "rule__Service__Group__39"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: rule__Service__Group__39 : rule__Service__Group__39__Impl rule__Service__Group__40 ;
    public final void rule__Service__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4389:1: ( rule__Service__Group__39__Impl rule__Service__Group__40 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4390:2: rule__Service__Group__39__Impl rule__Service__Group__40
            {
            pushFollow(FOLLOW_rule__Service__Group__39__Impl_in_rule__Service__Group__398750);
            rule__Service__Group__39__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__40_in_rule__Service__Group__398753);
            rule__Service__Group__40();

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
    // $ANTLR end "rule__Service__Group__39"


    // $ANTLR start "rule__Service__Group__39__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4397:1: rule__Service__Group__39__Impl : ( ( rule__Service__DeletebyAssignment_39 ) ) ;
    public final void rule__Service__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: ( ( ( rule__Service__DeletebyAssignment_39 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4402:1: ( ( rule__Service__DeletebyAssignment_39 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4402:1: ( ( rule__Service__DeletebyAssignment_39 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4403:1: ( rule__Service__DeletebyAssignment_39 )
            {
             before(grammarAccess.getServiceAccess().getDeletebyAssignment_39()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:1: ( rule__Service__DeletebyAssignment_39 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:2: rule__Service__DeletebyAssignment_39
            {
            pushFollow(FOLLOW_rule__Service__DeletebyAssignment_39_in_rule__Service__Group__39__Impl8780);
            rule__Service__DeletebyAssignment_39();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getDeletebyAssignment_39()); 

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
    // $ANTLR end "rule__Service__Group__39__Impl"


    // $ANTLR start "rule__Service__Group__40"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4414:1: rule__Service__Group__40 : rule__Service__Group__40__Impl rule__Service__Group__41 ;
    public final void rule__Service__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:1: ( rule__Service__Group__40__Impl rule__Service__Group__41 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4419:2: rule__Service__Group__40__Impl rule__Service__Group__41
            {
            pushFollow(FOLLOW_rule__Service__Group__40__Impl_in_rule__Service__Group__408810);
            rule__Service__Group__40__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__41_in_rule__Service__Group__408813);
            rule__Service__Group__41();

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
    // $ANTLR end "rule__Service__Group__40"


    // $ANTLR start "rule__Service__Group__40__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4426:1: rule__Service__Group__40__Impl : ( ')' ) ;
    public final void rule__Service__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4431:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4432:1: ')'
            {
             before(grammarAccess.getServiceAccess().getRightParenthesisKeyword_40()); 
            match(input,26,FOLLOW_26_in_rule__Service__Group__40__Impl8841); 
             after(grammarAccess.getServiceAccess().getRightParenthesisKeyword_40()); 

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
    // $ANTLR end "rule__Service__Group__40__Impl"


    // $ANTLR start "rule__Service__Group__41"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4445:1: rule__Service__Group__41 : rule__Service__Group__41__Impl rule__Service__Group__42 ;
    public final void rule__Service__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4449:1: ( rule__Service__Group__41__Impl rule__Service__Group__42 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4450:2: rule__Service__Group__41__Impl rule__Service__Group__42
            {
            pushFollow(FOLLOW_rule__Service__Group__41__Impl_in_rule__Service__Group__418872);
            rule__Service__Group__41__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__42_in_rule__Service__Group__418875);
            rule__Service__Group__42();

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
    // $ANTLR end "rule__Service__Group__41"


    // $ANTLR start "rule__Service__Group__41__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4457:1: rule__Service__Group__41__Impl : ( 'throws' ) ;
    public final void rule__Service__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4461:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4462:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4462:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4463:1: 'throws'
            {
             before(grammarAccess.getServiceAccess().getThrowsKeyword_41()); 
            match(input,30,FOLLOW_30_in_rule__Service__Group__41__Impl8903); 
             after(grammarAccess.getServiceAccess().getThrowsKeyword_41()); 

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
    // $ANTLR end "rule__Service__Group__41__Impl"


    // $ANTLR start "rule__Service__Group__42"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4476:1: rule__Service__Group__42 : rule__Service__Group__42__Impl rule__Service__Group__43 ;
    public final void rule__Service__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4480:1: ( rule__Service__Group__42__Impl rule__Service__Group__43 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4481:2: rule__Service__Group__42__Impl rule__Service__Group__43
            {
            pushFollow(FOLLOW_rule__Service__Group__42__Impl_in_rule__Service__Group__428934);
            rule__Service__Group__42__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__43_in_rule__Service__Group__428937);
            rule__Service__Group__43();

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
    // $ANTLR end "rule__Service__Group__42"


    // $ANTLR start "rule__Service__Group__42__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4488:1: rule__Service__Group__42__Impl : ( ( rule__Service__Exception4Assignment_42 ) ) ;
    public final void rule__Service__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4492:1: ( ( ( rule__Service__Exception4Assignment_42 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4493:1: ( ( rule__Service__Exception4Assignment_42 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4493:1: ( ( rule__Service__Exception4Assignment_42 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4494:1: ( rule__Service__Exception4Assignment_42 )
            {
             before(grammarAccess.getServiceAccess().getException4Assignment_42()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4495:1: ( rule__Service__Exception4Assignment_42 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4495:2: rule__Service__Exception4Assignment_42
            {
            pushFollow(FOLLOW_rule__Service__Exception4Assignment_42_in_rule__Service__Group__42__Impl8964);
            rule__Service__Exception4Assignment_42();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getException4Assignment_42()); 

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
    // $ANTLR end "rule__Service__Group__42__Impl"


    // $ANTLR start "rule__Service__Group__43"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4505:1: rule__Service__Group__43 : rule__Service__Group__43__Impl rule__Service__Group__44 ;
    public final void rule__Service__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4509:1: ( rule__Service__Group__43__Impl rule__Service__Group__44 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4510:2: rule__Service__Group__43__Impl rule__Service__Group__44
            {
            pushFollow(FOLLOW_rule__Service__Group__43__Impl_in_rule__Service__Group__438994);
            rule__Service__Group__43__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__44_in_rule__Service__Group__438997);
            rule__Service__Group__44();

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
    // $ANTLR end "rule__Service__Group__43"


    // $ANTLR start "rule__Service__Group__43__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4517:1: rule__Service__Group__43__Impl : ( '{' ) ;
    public final void rule__Service__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4522:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4522:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4523:1: '{'
            {
             before(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_43()); 
            match(input,19,FOLLOW_19_in_rule__Service__Group__43__Impl9025); 
             after(grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_43()); 

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
    // $ANTLR end "rule__Service__Group__43__Impl"


    // $ANTLR start "rule__Service__Group__44"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:1: rule__Service__Group__44 : rule__Service__Group__44__Impl rule__Service__Group__45 ;
    public final void rule__Service__Group__44() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4540:1: ( rule__Service__Group__44__Impl rule__Service__Group__45 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4541:2: rule__Service__Group__44__Impl rule__Service__Group__45
            {
            pushFollow(FOLLOW_rule__Service__Group__44__Impl_in_rule__Service__Group__449056);
            rule__Service__Group__44__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Service__Group__45_in_rule__Service__Group__449059);
            rule__Service__Group__45();

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
    // $ANTLR end "rule__Service__Group__44"


    // $ANTLR start "rule__Service__Group__44__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4548:1: rule__Service__Group__44__Impl : ( ( rule__Service__DeleteMethodAssignment_44 ) ) ;
    public final void rule__Service__Group__44__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:1: ( ( ( rule__Service__DeleteMethodAssignment_44 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:1: ( ( rule__Service__DeleteMethodAssignment_44 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:1: ( ( rule__Service__DeleteMethodAssignment_44 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4554:1: ( rule__Service__DeleteMethodAssignment_44 )
            {
             before(grammarAccess.getServiceAccess().getDeleteMethodAssignment_44()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4555:1: ( rule__Service__DeleteMethodAssignment_44 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4555:2: rule__Service__DeleteMethodAssignment_44
            {
            pushFollow(FOLLOW_rule__Service__DeleteMethodAssignment_44_in_rule__Service__Group__44__Impl9086);
            rule__Service__DeleteMethodAssignment_44();

            state._fsp--;


            }

             after(grammarAccess.getServiceAccess().getDeleteMethodAssignment_44()); 

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
    // $ANTLR end "rule__Service__Group__44__Impl"


    // $ANTLR start "rule__Service__Group__45"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:1: rule__Service__Group__45 : rule__Service__Group__45__Impl ;
    public final void rule__Service__Group__45() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:1: ( rule__Service__Group__45__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4570:2: rule__Service__Group__45__Impl
            {
            pushFollow(FOLLOW_rule__Service__Group__45__Impl_in_rule__Service__Group__459116);
            rule__Service__Group__45__Impl();

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
    // $ANTLR end "rule__Service__Group__45"


    // $ANTLR start "rule__Service__Group__45__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4576:1: rule__Service__Group__45__Impl : ( '}' ) ;
    public final void rule__Service__Group__45__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4580:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4581:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4581:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4582:1: '}'
            {
             before(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_45()); 
            match(input,20,FOLLOW_20_in_rule__Service__Group__45__Impl9144); 
             after(grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_45()); 

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
    // $ANTLR end "rule__Service__Group__45__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4687:1: rule__DataAccessObject__Group__0 : rule__DataAccessObject__Group__0__Impl rule__DataAccessObject__Group__1 ;
    public final void rule__DataAccessObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4691:1: ( rule__DataAccessObject__Group__0__Impl rule__DataAccessObject__Group__1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:2: rule__DataAccessObject__Group__0__Impl rule__DataAccessObject__Group__1
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__0__Impl_in_rule__DataAccessObject__Group__09267);
            rule__DataAccessObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__1_in_rule__DataAccessObject__Group__09270);
            rule__DataAccessObject__Group__1();

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
    // $ANTLR end "rule__DataAccessObject__Group__0"


    // $ANTLR start "rule__DataAccessObject__Group__0__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4699:1: rule__DataAccessObject__Group__0__Impl : ( 'DAO' ) ;
    public final void rule__DataAccessObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:1: ( ( 'DAO' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4704:1: ( 'DAO' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4704:1: ( 'DAO' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4705:1: 'DAO'
            {
             before(grammarAccess.getDataAccessObjectAccess().getDAOKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__DataAccessObject__Group__0__Impl9298); 
             after(grammarAccess.getDataAccessObjectAccess().getDAOKeyword_0()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__0__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4718:1: rule__DataAccessObject__Group__1 : rule__DataAccessObject__Group__1__Impl rule__DataAccessObject__Group__2 ;
    public final void rule__DataAccessObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:1: ( rule__DataAccessObject__Group__1__Impl rule__DataAccessObject__Group__2 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:2: rule__DataAccessObject__Group__1__Impl rule__DataAccessObject__Group__2
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__1__Impl_in_rule__DataAccessObject__Group__19329);
            rule__DataAccessObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__2_in_rule__DataAccessObject__Group__19332);
            rule__DataAccessObject__Group__2();

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
    // $ANTLR end "rule__DataAccessObject__Group__1"


    // $ANTLR start "rule__DataAccessObject__Group__1__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4730:1: rule__DataAccessObject__Group__1__Impl : ( ( rule__DataAccessObject__NameAssignment_1 ) ) ;
    public final void rule__DataAccessObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4734:1: ( ( ( rule__DataAccessObject__NameAssignment_1 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: ( ( rule__DataAccessObject__NameAssignment_1 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: ( ( rule__DataAccessObject__NameAssignment_1 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4736:1: ( rule__DataAccessObject__NameAssignment_1 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getNameAssignment_1()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4737:1: ( rule__DataAccessObject__NameAssignment_1 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4737:2: rule__DataAccessObject__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DataAccessObject__NameAssignment_1_in_rule__DataAccessObject__Group__1__Impl9359);
            rule__DataAccessObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__1__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4747:1: rule__DataAccessObject__Group__2 : rule__DataAccessObject__Group__2__Impl rule__DataAccessObject__Group__3 ;
    public final void rule__DataAccessObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4751:1: ( rule__DataAccessObject__Group__2__Impl rule__DataAccessObject__Group__3 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4752:2: rule__DataAccessObject__Group__2__Impl rule__DataAccessObject__Group__3
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__2__Impl_in_rule__DataAccessObject__Group__29389);
            rule__DataAccessObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__3_in_rule__DataAccessObject__Group__29392);
            rule__DataAccessObject__Group__3();

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
    // $ANTLR end "rule__DataAccessObject__Group__2"


    // $ANTLR start "rule__DataAccessObject__Group__2__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4759:1: rule__DataAccessObject__Group__2__Impl : ( 'create' ) ;
    public final void rule__DataAccessObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4763:1: ( ( 'create' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4764:1: ( 'create' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4764:1: ( 'create' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4765:1: 'create'
            {
             before(grammarAccess.getDataAccessObjectAccess().getCreateKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__DataAccessObject__Group__2__Impl9420); 
             after(grammarAccess.getDataAccessObjectAccess().getCreateKeyword_2()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__2__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4778:1: rule__DataAccessObject__Group__3 : rule__DataAccessObject__Group__3__Impl rule__DataAccessObject__Group__4 ;
    public final void rule__DataAccessObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4782:1: ( rule__DataAccessObject__Group__3__Impl rule__DataAccessObject__Group__4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4783:2: rule__DataAccessObject__Group__3__Impl rule__DataAccessObject__Group__4
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__3__Impl_in_rule__DataAccessObject__Group__39451);
            rule__DataAccessObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__4_in_rule__DataAccessObject__Group__39454);
            rule__DataAccessObject__Group__4();

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
    // $ANTLR end "rule__DataAccessObject__Group__3"


    // $ANTLR start "rule__DataAccessObject__Group__3__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4790:1: rule__DataAccessObject__Group__3__Impl : ( '(' ) ;
    public final void rule__DataAccessObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4794:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: '('
            {
             before(grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__DataAccessObject__Group__3__Impl9482); 
             after(grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__3__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4809:1: rule__DataAccessObject__Group__4 : rule__DataAccessObject__Group__4__Impl rule__DataAccessObject__Group__5 ;
    public final void rule__DataAccessObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: ( rule__DataAccessObject__Group__4__Impl rule__DataAccessObject__Group__5 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:2: rule__DataAccessObject__Group__4__Impl rule__DataAccessObject__Group__5
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__4__Impl_in_rule__DataAccessObject__Group__49513);
            rule__DataAccessObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__5_in_rule__DataAccessObject__Group__49516);
            rule__DataAccessObject__Group__5();

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
    // $ANTLR end "rule__DataAccessObject__Group__4"


    // $ANTLR start "rule__DataAccessObject__Group__4__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4821:1: rule__DataAccessObject__Group__4__Impl : ( ( rule__DataAccessObject__CreateDataModelAssignment_4 ) ) ;
    public final void rule__DataAccessObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: ( ( ( rule__DataAccessObject__CreateDataModelAssignment_4 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4826:1: ( ( rule__DataAccessObject__CreateDataModelAssignment_4 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4826:1: ( ( rule__DataAccessObject__CreateDataModelAssignment_4 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4827:1: ( rule__DataAccessObject__CreateDataModelAssignment_4 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getCreateDataModelAssignment_4()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:1: ( rule__DataAccessObject__CreateDataModelAssignment_4 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4828:2: rule__DataAccessObject__CreateDataModelAssignment_4
            {
            pushFollow(FOLLOW_rule__DataAccessObject__CreateDataModelAssignment_4_in_rule__DataAccessObject__Group__4__Impl9543);
            rule__DataAccessObject__CreateDataModelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getCreateDataModelAssignment_4()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__4__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__5"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4838:1: rule__DataAccessObject__Group__5 : rule__DataAccessObject__Group__5__Impl rule__DataAccessObject__Group__6 ;
    public final void rule__DataAccessObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4842:1: ( rule__DataAccessObject__Group__5__Impl rule__DataAccessObject__Group__6 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4843:2: rule__DataAccessObject__Group__5__Impl rule__DataAccessObject__Group__6
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__5__Impl_in_rule__DataAccessObject__Group__59573);
            rule__DataAccessObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__6_in_rule__DataAccessObject__Group__59576);
            rule__DataAccessObject__Group__6();

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
    // $ANTLR end "rule__DataAccessObject__Group__5"


    // $ANTLR start "rule__DataAccessObject__Group__5__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:1: rule__DataAccessObject__Group__5__Impl : ( ')' ) ;
    public final void rule__DataAccessObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4856:1: ')'
            {
             before(grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__DataAccessObject__Group__5__Impl9604); 
             after(grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__5__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__6"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4869:1: rule__DataAccessObject__Group__6 : rule__DataAccessObject__Group__6__Impl rule__DataAccessObject__Group__7 ;
    public final void rule__DataAccessObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4873:1: ( rule__DataAccessObject__Group__6__Impl rule__DataAccessObject__Group__7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4874:2: rule__DataAccessObject__Group__6__Impl rule__DataAccessObject__Group__7
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__6__Impl_in_rule__DataAccessObject__Group__69635);
            rule__DataAccessObject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__7_in_rule__DataAccessObject__Group__69638);
            rule__DataAccessObject__Group__7();

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
    // $ANTLR end "rule__DataAccessObject__Group__6"


    // $ANTLR start "rule__DataAccessObject__Group__6__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4881:1: rule__DataAccessObject__Group__6__Impl : ( 'throws' ) ;
    public final void rule__DataAccessObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4885:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4886:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4886:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4887:1: 'throws'
            {
             before(grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__DataAccessObject__Group__6__Impl9666); 
             after(grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_6()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__6__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4900:1: rule__DataAccessObject__Group__7 : rule__DataAccessObject__Group__7__Impl rule__DataAccessObject__Group__8 ;
    public final void rule__DataAccessObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4904:1: ( rule__DataAccessObject__Group__7__Impl rule__DataAccessObject__Group__8 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4905:2: rule__DataAccessObject__Group__7__Impl rule__DataAccessObject__Group__8
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__7__Impl_in_rule__DataAccessObject__Group__79697);
            rule__DataAccessObject__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__8_in_rule__DataAccessObject__Group__79700);
            rule__DataAccessObject__Group__8();

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
    // $ANTLR end "rule__DataAccessObject__Group__7"


    // $ANTLR start "rule__DataAccessObject__Group__7__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4912:1: rule__DataAccessObject__Group__7__Impl : ( ( rule__DataAccessObject__Exception1Assignment_7 ) ) ;
    public final void rule__DataAccessObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:1: ( ( ( rule__DataAccessObject__Exception1Assignment_7 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4917:1: ( ( rule__DataAccessObject__Exception1Assignment_7 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4917:1: ( ( rule__DataAccessObject__Exception1Assignment_7 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4918:1: ( rule__DataAccessObject__Exception1Assignment_7 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getException1Assignment_7()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4919:1: ( rule__DataAccessObject__Exception1Assignment_7 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4919:2: rule__DataAccessObject__Exception1Assignment_7
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Exception1Assignment_7_in_rule__DataAccessObject__Group__7__Impl9727);
            rule__DataAccessObject__Exception1Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getException1Assignment_7()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__7__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__8"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4929:1: rule__DataAccessObject__Group__8 : rule__DataAccessObject__Group__8__Impl rule__DataAccessObject__Group__9 ;
    public final void rule__DataAccessObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4933:1: ( rule__DataAccessObject__Group__8__Impl rule__DataAccessObject__Group__9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4934:2: rule__DataAccessObject__Group__8__Impl rule__DataAccessObject__Group__9
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__8__Impl_in_rule__DataAccessObject__Group__89757);
            rule__DataAccessObject__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__9_in_rule__DataAccessObject__Group__89760);
            rule__DataAccessObject__Group__9();

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
    // $ANTLR end "rule__DataAccessObject__Group__8"


    // $ANTLR start "rule__DataAccessObject__Group__8__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4941:1: rule__DataAccessObject__Group__8__Impl : ( '{' ) ;
    public final void rule__DataAccessObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4945:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4946:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4946:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4947:1: '{'
            {
             before(grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__DataAccessObject__Group__8__Impl9788); 
             after(grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__8__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4960:1: rule__DataAccessObject__Group__9 : rule__DataAccessObject__Group__9__Impl rule__DataAccessObject__Group__10 ;
    public final void rule__DataAccessObject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4964:1: ( rule__DataAccessObject__Group__9__Impl rule__DataAccessObject__Group__10 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4965:2: rule__DataAccessObject__Group__9__Impl rule__DataAccessObject__Group__10
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__9__Impl_in_rule__DataAccessObject__Group__99819);
            rule__DataAccessObject__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__10_in_rule__DataAccessObject__Group__99822);
            rule__DataAccessObject__Group__10();

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
    // $ANTLR end "rule__DataAccessObject__Group__9"


    // $ANTLR start "rule__DataAccessObject__Group__9__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:1: rule__DataAccessObject__Group__9__Impl : ( ( rule__DataAccessObject__CreateMethodAssignment_9 ) ) ;
    public final void rule__DataAccessObject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4976:1: ( ( ( rule__DataAccessObject__CreateMethodAssignment_9 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4977:1: ( ( rule__DataAccessObject__CreateMethodAssignment_9 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4977:1: ( ( rule__DataAccessObject__CreateMethodAssignment_9 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:1: ( rule__DataAccessObject__CreateMethodAssignment_9 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getCreateMethodAssignment_9()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4979:1: ( rule__DataAccessObject__CreateMethodAssignment_9 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4979:2: rule__DataAccessObject__CreateMethodAssignment_9
            {
            pushFollow(FOLLOW_rule__DataAccessObject__CreateMethodAssignment_9_in_rule__DataAccessObject__Group__9__Impl9849);
            rule__DataAccessObject__CreateMethodAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getCreateMethodAssignment_9()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__9__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__10"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4989:1: rule__DataAccessObject__Group__10 : rule__DataAccessObject__Group__10__Impl rule__DataAccessObject__Group__11 ;
    public final void rule__DataAccessObject__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:1: ( rule__DataAccessObject__Group__10__Impl rule__DataAccessObject__Group__11 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4994:2: rule__DataAccessObject__Group__10__Impl rule__DataAccessObject__Group__11
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__10__Impl_in_rule__DataAccessObject__Group__109879);
            rule__DataAccessObject__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__11_in_rule__DataAccessObject__Group__109882);
            rule__DataAccessObject__Group__11();

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
    // $ANTLR end "rule__DataAccessObject__Group__10"


    // $ANTLR start "rule__DataAccessObject__Group__10__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5001:1: rule__DataAccessObject__Group__10__Impl : ( 'return' ) ;
    public final void rule__DataAccessObject__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5005:1: ( ( 'return' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: ( 'return' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5006:1: ( 'return' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:1: 'return'
            {
             before(grammarAccess.getDataAccessObjectAccess().getReturnKeyword_10()); 
            match(input,31,FOLLOW_31_in_rule__DataAccessObject__Group__10__Impl9910); 
             after(grammarAccess.getDataAccessObjectAccess().getReturnKeyword_10()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__10__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__11"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5020:1: rule__DataAccessObject__Group__11 : rule__DataAccessObject__Group__11__Impl rule__DataAccessObject__Group__12 ;
    public final void rule__DataAccessObject__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5024:1: ( rule__DataAccessObject__Group__11__Impl rule__DataAccessObject__Group__12 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5025:2: rule__DataAccessObject__Group__11__Impl rule__DataAccessObject__Group__12
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__11__Impl_in_rule__DataAccessObject__Group__119941);
            rule__DataAccessObject__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__12_in_rule__DataAccessObject__Group__119944);
            rule__DataAccessObject__Group__12();

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
    // $ANTLR end "rule__DataAccessObject__Group__11"


    // $ANTLR start "rule__DataAccessObject__Group__11__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:1: rule__DataAccessObject__Group__11__Impl : ( ( rule__DataAccessObject__CreatedDataModelAssignment_11 ) ) ;
    public final void rule__DataAccessObject__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5036:1: ( ( ( rule__DataAccessObject__CreatedDataModelAssignment_11 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5037:1: ( ( rule__DataAccessObject__CreatedDataModelAssignment_11 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5037:1: ( ( rule__DataAccessObject__CreatedDataModelAssignment_11 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5038:1: ( rule__DataAccessObject__CreatedDataModelAssignment_11 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getCreatedDataModelAssignment_11()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5039:1: ( rule__DataAccessObject__CreatedDataModelAssignment_11 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5039:2: rule__DataAccessObject__CreatedDataModelAssignment_11
            {
            pushFollow(FOLLOW_rule__DataAccessObject__CreatedDataModelAssignment_11_in_rule__DataAccessObject__Group__11__Impl9971);
            rule__DataAccessObject__CreatedDataModelAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getCreatedDataModelAssignment_11()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__11__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__12"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: rule__DataAccessObject__Group__12 : rule__DataAccessObject__Group__12__Impl rule__DataAccessObject__Group__13 ;
    public final void rule__DataAccessObject__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5053:1: ( rule__DataAccessObject__Group__12__Impl rule__DataAccessObject__Group__13 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5054:2: rule__DataAccessObject__Group__12__Impl rule__DataAccessObject__Group__13
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__12__Impl_in_rule__DataAccessObject__Group__1210001);
            rule__DataAccessObject__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__13_in_rule__DataAccessObject__Group__1210004);
            rule__DataAccessObject__Group__13();

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
    // $ANTLR end "rule__DataAccessObject__Group__12"


    // $ANTLR start "rule__DataAccessObject__Group__12__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: rule__DataAccessObject__Group__12__Impl : ( '}' ) ;
    public final void rule__DataAccessObject__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5065:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5066:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5067:1: '}'
            {
             before(grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_12()); 
            match(input,20,FOLLOW_20_in_rule__DataAccessObject__Group__12__Impl10032); 
             after(grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__12__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__13"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5080:1: rule__DataAccessObject__Group__13 : rule__DataAccessObject__Group__13__Impl rule__DataAccessObject__Group__14 ;
    public final void rule__DataAccessObject__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5084:1: ( rule__DataAccessObject__Group__13__Impl rule__DataAccessObject__Group__14 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5085:2: rule__DataAccessObject__Group__13__Impl rule__DataAccessObject__Group__14
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__13__Impl_in_rule__DataAccessObject__Group__1310063);
            rule__DataAccessObject__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__14_in_rule__DataAccessObject__Group__1310066);
            rule__DataAccessObject__Group__14();

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
    // $ANTLR end "rule__DataAccessObject__Group__13"


    // $ANTLR start "rule__DataAccessObject__Group__13__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:1: rule__DataAccessObject__Group__13__Impl : ( 'find' ) ;
    public final void rule__DataAccessObject__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5096:1: ( ( 'find' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:1: ( 'find' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5097:1: ( 'find' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:1: 'find'
            {
             before(grammarAccess.getDataAccessObjectAccess().getFindKeyword_13()); 
            match(input,32,FOLLOW_32_in_rule__DataAccessObject__Group__13__Impl10094); 
             after(grammarAccess.getDataAccessObjectAccess().getFindKeyword_13()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__13__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__14"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5111:1: rule__DataAccessObject__Group__14 : rule__DataAccessObject__Group__14__Impl rule__DataAccessObject__Group__15 ;
    public final void rule__DataAccessObject__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5115:1: ( rule__DataAccessObject__Group__14__Impl rule__DataAccessObject__Group__15 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5116:2: rule__DataAccessObject__Group__14__Impl rule__DataAccessObject__Group__15
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__14__Impl_in_rule__DataAccessObject__Group__1410125);
            rule__DataAccessObject__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__15_in_rule__DataAccessObject__Group__1410128);
            rule__DataAccessObject__Group__15();

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
    // $ANTLR end "rule__DataAccessObject__Group__14"


    // $ANTLR start "rule__DataAccessObject__Group__14__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5123:1: rule__DataAccessObject__Group__14__Impl : ( '(' ) ;
    public final void rule__DataAccessObject__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5127:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5128:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5128:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: '('
            {
             before(grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_14()); 
            match(input,24,FOLLOW_24_in_rule__DataAccessObject__Group__14__Impl10156); 
             after(grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_14()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__14__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__15"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5142:1: rule__DataAccessObject__Group__15 : rule__DataAccessObject__Group__15__Impl rule__DataAccessObject__Group__16 ;
    public final void rule__DataAccessObject__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5146:1: ( rule__DataAccessObject__Group__15__Impl rule__DataAccessObject__Group__16 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5147:2: rule__DataAccessObject__Group__15__Impl rule__DataAccessObject__Group__16
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__15__Impl_in_rule__DataAccessObject__Group__1510187);
            rule__DataAccessObject__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__16_in_rule__DataAccessObject__Group__1510190);
            rule__DataAccessObject__Group__16();

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
    // $ANTLR end "rule__DataAccessObject__Group__15"


    // $ANTLR start "rule__DataAccessObject__Group__15__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5154:1: rule__DataAccessObject__Group__15__Impl : ( ( rule__DataAccessObject__FindbyAssignment_15 ) ) ;
    public final void rule__DataAccessObject__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5158:1: ( ( ( rule__DataAccessObject__FindbyAssignment_15 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5159:1: ( ( rule__DataAccessObject__FindbyAssignment_15 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5159:1: ( ( rule__DataAccessObject__FindbyAssignment_15 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5160:1: ( rule__DataAccessObject__FindbyAssignment_15 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getFindbyAssignment_15()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5161:1: ( rule__DataAccessObject__FindbyAssignment_15 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5161:2: rule__DataAccessObject__FindbyAssignment_15
            {
            pushFollow(FOLLOW_rule__DataAccessObject__FindbyAssignment_15_in_rule__DataAccessObject__Group__15__Impl10217);
            rule__DataAccessObject__FindbyAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getFindbyAssignment_15()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__15__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__16"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5171:1: rule__DataAccessObject__Group__16 : rule__DataAccessObject__Group__16__Impl rule__DataAccessObject__Group__17 ;
    public final void rule__DataAccessObject__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5175:1: ( rule__DataAccessObject__Group__16__Impl rule__DataAccessObject__Group__17 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:2: rule__DataAccessObject__Group__16__Impl rule__DataAccessObject__Group__17
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__16__Impl_in_rule__DataAccessObject__Group__1610247);
            rule__DataAccessObject__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__17_in_rule__DataAccessObject__Group__1610250);
            rule__DataAccessObject__Group__17();

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
    // $ANTLR end "rule__DataAccessObject__Group__16"


    // $ANTLR start "rule__DataAccessObject__Group__16__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5183:1: rule__DataAccessObject__Group__16__Impl : ( ')' ) ;
    public final void rule__DataAccessObject__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5187:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: ')'
            {
             before(grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_16()); 
            match(input,26,FOLLOW_26_in_rule__DataAccessObject__Group__16__Impl10278); 
             after(grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_16()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__16__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__17"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5202:1: rule__DataAccessObject__Group__17 : rule__DataAccessObject__Group__17__Impl rule__DataAccessObject__Group__18 ;
    public final void rule__DataAccessObject__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5206:1: ( rule__DataAccessObject__Group__17__Impl rule__DataAccessObject__Group__18 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5207:2: rule__DataAccessObject__Group__17__Impl rule__DataAccessObject__Group__18
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__17__Impl_in_rule__DataAccessObject__Group__1710309);
            rule__DataAccessObject__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__18_in_rule__DataAccessObject__Group__1710312);
            rule__DataAccessObject__Group__18();

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
    // $ANTLR end "rule__DataAccessObject__Group__17"


    // $ANTLR start "rule__DataAccessObject__Group__17__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5214:1: rule__DataAccessObject__Group__17__Impl : ( 'throws' ) ;
    public final void rule__DataAccessObject__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5218:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5220:1: 'throws'
            {
             before(grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_17()); 
            match(input,30,FOLLOW_30_in_rule__DataAccessObject__Group__17__Impl10340); 
             after(grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_17()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__17__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__18"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5233:1: rule__DataAccessObject__Group__18 : rule__DataAccessObject__Group__18__Impl rule__DataAccessObject__Group__19 ;
    public final void rule__DataAccessObject__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:1: ( rule__DataAccessObject__Group__18__Impl rule__DataAccessObject__Group__19 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5238:2: rule__DataAccessObject__Group__18__Impl rule__DataAccessObject__Group__19
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__18__Impl_in_rule__DataAccessObject__Group__1810371);
            rule__DataAccessObject__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__19_in_rule__DataAccessObject__Group__1810374);
            rule__DataAccessObject__Group__19();

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
    // $ANTLR end "rule__DataAccessObject__Group__18"


    // $ANTLR start "rule__DataAccessObject__Group__18__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5245:1: rule__DataAccessObject__Group__18__Impl : ( ( rule__DataAccessObject__Exception2Assignment_18 ) ) ;
    public final void rule__DataAccessObject__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5249:1: ( ( ( rule__DataAccessObject__Exception2Assignment_18 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5250:1: ( ( rule__DataAccessObject__Exception2Assignment_18 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5250:1: ( ( rule__DataAccessObject__Exception2Assignment_18 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:1: ( rule__DataAccessObject__Exception2Assignment_18 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getException2Assignment_18()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5252:1: ( rule__DataAccessObject__Exception2Assignment_18 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5252:2: rule__DataAccessObject__Exception2Assignment_18
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Exception2Assignment_18_in_rule__DataAccessObject__Group__18__Impl10401);
            rule__DataAccessObject__Exception2Assignment_18();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getException2Assignment_18()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__18__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__19"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5262:1: rule__DataAccessObject__Group__19 : rule__DataAccessObject__Group__19__Impl rule__DataAccessObject__Group__20 ;
    public final void rule__DataAccessObject__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( rule__DataAccessObject__Group__19__Impl rule__DataAccessObject__Group__20 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5267:2: rule__DataAccessObject__Group__19__Impl rule__DataAccessObject__Group__20
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__19__Impl_in_rule__DataAccessObject__Group__1910431);
            rule__DataAccessObject__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__20_in_rule__DataAccessObject__Group__1910434);
            rule__DataAccessObject__Group__20();

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
    // $ANTLR end "rule__DataAccessObject__Group__19"


    // $ANTLR start "rule__DataAccessObject__Group__19__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5274:1: rule__DataAccessObject__Group__19__Impl : ( '{' ) ;
    public final void rule__DataAccessObject__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5278:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5279:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5279:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5280:1: '{'
            {
             before(grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_19()); 
            match(input,19,FOLLOW_19_in_rule__DataAccessObject__Group__19__Impl10462); 
             after(grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_19()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__19__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__20"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5293:1: rule__DataAccessObject__Group__20 : rule__DataAccessObject__Group__20__Impl rule__DataAccessObject__Group__21 ;
    public final void rule__DataAccessObject__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:1: ( rule__DataAccessObject__Group__20__Impl rule__DataAccessObject__Group__21 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5298:2: rule__DataAccessObject__Group__20__Impl rule__DataAccessObject__Group__21
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__20__Impl_in_rule__DataAccessObject__Group__2010493);
            rule__DataAccessObject__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__21_in_rule__DataAccessObject__Group__2010496);
            rule__DataAccessObject__Group__21();

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
    // $ANTLR end "rule__DataAccessObject__Group__20"


    // $ANTLR start "rule__DataAccessObject__Group__20__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5305:1: rule__DataAccessObject__Group__20__Impl : ( ( rule__DataAccessObject__FindMethodAssignment_20 ) ) ;
    public final void rule__DataAccessObject__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5309:1: ( ( ( rule__DataAccessObject__FindMethodAssignment_20 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5310:1: ( ( rule__DataAccessObject__FindMethodAssignment_20 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5310:1: ( ( rule__DataAccessObject__FindMethodAssignment_20 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5311:1: ( rule__DataAccessObject__FindMethodAssignment_20 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getFindMethodAssignment_20()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5312:1: ( rule__DataAccessObject__FindMethodAssignment_20 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5312:2: rule__DataAccessObject__FindMethodAssignment_20
            {
            pushFollow(FOLLOW_rule__DataAccessObject__FindMethodAssignment_20_in_rule__DataAccessObject__Group__20__Impl10523);
            rule__DataAccessObject__FindMethodAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getFindMethodAssignment_20()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__20__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__21"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5322:1: rule__DataAccessObject__Group__21 : rule__DataAccessObject__Group__21__Impl rule__DataAccessObject__Group__22 ;
    public final void rule__DataAccessObject__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5326:1: ( rule__DataAccessObject__Group__21__Impl rule__DataAccessObject__Group__22 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:2: rule__DataAccessObject__Group__21__Impl rule__DataAccessObject__Group__22
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__21__Impl_in_rule__DataAccessObject__Group__2110553);
            rule__DataAccessObject__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__22_in_rule__DataAccessObject__Group__2110556);
            rule__DataAccessObject__Group__22();

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
    // $ANTLR end "rule__DataAccessObject__Group__21"


    // $ANTLR start "rule__DataAccessObject__Group__21__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5334:1: rule__DataAccessObject__Group__21__Impl : ( 'return' ) ;
    public final void rule__DataAccessObject__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5338:1: ( ( 'return' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5339:1: ( 'return' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5339:1: ( 'return' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5340:1: 'return'
            {
             before(grammarAccess.getDataAccessObjectAccess().getReturnKeyword_21()); 
            match(input,31,FOLLOW_31_in_rule__DataAccessObject__Group__21__Impl10584); 
             after(grammarAccess.getDataAccessObjectAccess().getReturnKeyword_21()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__21__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__22"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5353:1: rule__DataAccessObject__Group__22 : rule__DataAccessObject__Group__22__Impl rule__DataAccessObject__Group__23 ;
    public final void rule__DataAccessObject__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: ( rule__DataAccessObject__Group__22__Impl rule__DataAccessObject__Group__23 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5358:2: rule__DataAccessObject__Group__22__Impl rule__DataAccessObject__Group__23
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__22__Impl_in_rule__DataAccessObject__Group__2210615);
            rule__DataAccessObject__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__23_in_rule__DataAccessObject__Group__2210618);
            rule__DataAccessObject__Group__23();

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
    // $ANTLR end "rule__DataAccessObject__Group__22"


    // $ANTLR start "rule__DataAccessObject__Group__22__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5365:1: rule__DataAccessObject__Group__22__Impl : ( ( rule__DataAccessObject__FoundDataModelAssignment_22 ) ) ;
    public final void rule__DataAccessObject__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5369:1: ( ( ( rule__DataAccessObject__FoundDataModelAssignment_22 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5370:1: ( ( rule__DataAccessObject__FoundDataModelAssignment_22 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5370:1: ( ( rule__DataAccessObject__FoundDataModelAssignment_22 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5371:1: ( rule__DataAccessObject__FoundDataModelAssignment_22 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getFoundDataModelAssignment_22()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5372:1: ( rule__DataAccessObject__FoundDataModelAssignment_22 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5372:2: rule__DataAccessObject__FoundDataModelAssignment_22
            {
            pushFollow(FOLLOW_rule__DataAccessObject__FoundDataModelAssignment_22_in_rule__DataAccessObject__Group__22__Impl10645);
            rule__DataAccessObject__FoundDataModelAssignment_22();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getFoundDataModelAssignment_22()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__22__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__23"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:1: rule__DataAccessObject__Group__23 : rule__DataAccessObject__Group__23__Impl rule__DataAccessObject__Group__24 ;
    public final void rule__DataAccessObject__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5386:1: ( rule__DataAccessObject__Group__23__Impl rule__DataAccessObject__Group__24 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5387:2: rule__DataAccessObject__Group__23__Impl rule__DataAccessObject__Group__24
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__23__Impl_in_rule__DataAccessObject__Group__2310675);
            rule__DataAccessObject__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__24_in_rule__DataAccessObject__Group__2310678);
            rule__DataAccessObject__Group__24();

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
    // $ANTLR end "rule__DataAccessObject__Group__23"


    // $ANTLR start "rule__DataAccessObject__Group__23__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5394:1: rule__DataAccessObject__Group__23__Impl : ( '}' ) ;
    public final void rule__DataAccessObject__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5398:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5399:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5399:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5400:1: '}'
            {
             before(grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_23()); 
            match(input,20,FOLLOW_20_in_rule__DataAccessObject__Group__23__Impl10706); 
             after(grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_23()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__23__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__24"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5413:1: rule__DataAccessObject__Group__24 : rule__DataAccessObject__Group__24__Impl rule__DataAccessObject__Group__25 ;
    public final void rule__DataAccessObject__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5417:1: ( rule__DataAccessObject__Group__24__Impl rule__DataAccessObject__Group__25 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5418:2: rule__DataAccessObject__Group__24__Impl rule__DataAccessObject__Group__25
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__24__Impl_in_rule__DataAccessObject__Group__2410737);
            rule__DataAccessObject__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__25_in_rule__DataAccessObject__Group__2410740);
            rule__DataAccessObject__Group__25();

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
    // $ANTLR end "rule__DataAccessObject__Group__24"


    // $ANTLR start "rule__DataAccessObject__Group__24__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5425:1: rule__DataAccessObject__Group__24__Impl : ( 'update' ) ;
    public final void rule__DataAccessObject__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5429:1: ( ( 'update' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5430:1: ( 'update' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5430:1: ( 'update' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5431:1: 'update'
            {
             before(grammarAccess.getDataAccessObjectAccess().getUpdateKeyword_24()); 
            match(input,33,FOLLOW_33_in_rule__DataAccessObject__Group__24__Impl10768); 
             after(grammarAccess.getDataAccessObjectAccess().getUpdateKeyword_24()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__24__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__25"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5444:1: rule__DataAccessObject__Group__25 : rule__DataAccessObject__Group__25__Impl rule__DataAccessObject__Group__26 ;
    public final void rule__DataAccessObject__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5448:1: ( rule__DataAccessObject__Group__25__Impl rule__DataAccessObject__Group__26 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5449:2: rule__DataAccessObject__Group__25__Impl rule__DataAccessObject__Group__26
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__25__Impl_in_rule__DataAccessObject__Group__2510799);
            rule__DataAccessObject__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__26_in_rule__DataAccessObject__Group__2510802);
            rule__DataAccessObject__Group__26();

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
    // $ANTLR end "rule__DataAccessObject__Group__25"


    // $ANTLR start "rule__DataAccessObject__Group__25__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5456:1: rule__DataAccessObject__Group__25__Impl : ( '(' ) ;
    public final void rule__DataAccessObject__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5460:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5461:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5461:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5462:1: '('
            {
             before(grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_25()); 
            match(input,24,FOLLOW_24_in_rule__DataAccessObject__Group__25__Impl10830); 
             after(grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_25()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__25__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__26"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5475:1: rule__DataAccessObject__Group__26 : rule__DataAccessObject__Group__26__Impl rule__DataAccessObject__Group__27 ;
    public final void rule__DataAccessObject__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5479:1: ( rule__DataAccessObject__Group__26__Impl rule__DataAccessObject__Group__27 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5480:2: rule__DataAccessObject__Group__26__Impl rule__DataAccessObject__Group__27
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__26__Impl_in_rule__DataAccessObject__Group__2610861);
            rule__DataAccessObject__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__27_in_rule__DataAccessObject__Group__2610864);
            rule__DataAccessObject__Group__27();

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
    // $ANTLR end "rule__DataAccessObject__Group__26"


    // $ANTLR start "rule__DataAccessObject__Group__26__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: rule__DataAccessObject__Group__26__Impl : ( ( rule__DataAccessObject__UpdatebyAssignment_26 ) ) ;
    public final void rule__DataAccessObject__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: ( ( ( rule__DataAccessObject__UpdatebyAssignment_26 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5492:1: ( ( rule__DataAccessObject__UpdatebyAssignment_26 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5492:1: ( ( rule__DataAccessObject__UpdatebyAssignment_26 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5493:1: ( rule__DataAccessObject__UpdatebyAssignment_26 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getUpdatebyAssignment_26()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5494:1: ( rule__DataAccessObject__UpdatebyAssignment_26 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5494:2: rule__DataAccessObject__UpdatebyAssignment_26
            {
            pushFollow(FOLLOW_rule__DataAccessObject__UpdatebyAssignment_26_in_rule__DataAccessObject__Group__26__Impl10891);
            rule__DataAccessObject__UpdatebyAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getUpdatebyAssignment_26()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__26__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__27"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5504:1: rule__DataAccessObject__Group__27 : rule__DataAccessObject__Group__27__Impl rule__DataAccessObject__Group__28 ;
    public final void rule__DataAccessObject__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5508:1: ( rule__DataAccessObject__Group__27__Impl rule__DataAccessObject__Group__28 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5509:2: rule__DataAccessObject__Group__27__Impl rule__DataAccessObject__Group__28
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__27__Impl_in_rule__DataAccessObject__Group__2710921);
            rule__DataAccessObject__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__28_in_rule__DataAccessObject__Group__2710924);
            rule__DataAccessObject__Group__28();

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
    // $ANTLR end "rule__DataAccessObject__Group__27"


    // $ANTLR start "rule__DataAccessObject__Group__27__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5516:1: rule__DataAccessObject__Group__27__Impl : ( ',' ) ;
    public final void rule__DataAccessObject__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5520:1: ( ( ',' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: ( ',' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5522:1: ','
            {
             before(grammarAccess.getDataAccessObjectAccess().getCommaKeyword_27()); 
            match(input,34,FOLLOW_34_in_rule__DataAccessObject__Group__27__Impl10952); 
             after(grammarAccess.getDataAccessObjectAccess().getCommaKeyword_27()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__27__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__28"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5535:1: rule__DataAccessObject__Group__28 : rule__DataAccessObject__Group__28__Impl rule__DataAccessObject__Group__29 ;
    public final void rule__DataAccessObject__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5539:1: ( rule__DataAccessObject__Group__28__Impl rule__DataAccessObject__Group__29 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5540:2: rule__DataAccessObject__Group__28__Impl rule__DataAccessObject__Group__29
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__28__Impl_in_rule__DataAccessObject__Group__2810983);
            rule__DataAccessObject__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__29_in_rule__DataAccessObject__Group__2810986);
            rule__DataAccessObject__Group__29();

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
    // $ANTLR end "rule__DataAccessObject__Group__28"


    // $ANTLR start "rule__DataAccessObject__Group__28__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: rule__DataAccessObject__Group__28__Impl : ( ( rule__DataAccessObject__UpdateDataModelAssignment_28 ) ) ;
    public final void rule__DataAccessObject__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: ( ( ( rule__DataAccessObject__UpdateDataModelAssignment_28 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5552:1: ( ( rule__DataAccessObject__UpdateDataModelAssignment_28 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5552:1: ( ( rule__DataAccessObject__UpdateDataModelAssignment_28 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5553:1: ( rule__DataAccessObject__UpdateDataModelAssignment_28 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getUpdateDataModelAssignment_28()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5554:1: ( rule__DataAccessObject__UpdateDataModelAssignment_28 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5554:2: rule__DataAccessObject__UpdateDataModelAssignment_28
            {
            pushFollow(FOLLOW_rule__DataAccessObject__UpdateDataModelAssignment_28_in_rule__DataAccessObject__Group__28__Impl11013);
            rule__DataAccessObject__UpdateDataModelAssignment_28();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getUpdateDataModelAssignment_28()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__28__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__29"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5564:1: rule__DataAccessObject__Group__29 : rule__DataAccessObject__Group__29__Impl rule__DataAccessObject__Group__30 ;
    public final void rule__DataAccessObject__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5568:1: ( rule__DataAccessObject__Group__29__Impl rule__DataAccessObject__Group__30 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5569:2: rule__DataAccessObject__Group__29__Impl rule__DataAccessObject__Group__30
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__29__Impl_in_rule__DataAccessObject__Group__2911043);
            rule__DataAccessObject__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__30_in_rule__DataAccessObject__Group__2911046);
            rule__DataAccessObject__Group__30();

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
    // $ANTLR end "rule__DataAccessObject__Group__29"


    // $ANTLR start "rule__DataAccessObject__Group__29__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5576:1: rule__DataAccessObject__Group__29__Impl : ( ')' ) ;
    public final void rule__DataAccessObject__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5580:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:1: ')'
            {
             before(grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_29()); 
            match(input,26,FOLLOW_26_in_rule__DataAccessObject__Group__29__Impl11074); 
             after(grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_29()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__29__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__30"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5595:1: rule__DataAccessObject__Group__30 : rule__DataAccessObject__Group__30__Impl rule__DataAccessObject__Group__31 ;
    public final void rule__DataAccessObject__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5599:1: ( rule__DataAccessObject__Group__30__Impl rule__DataAccessObject__Group__31 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5600:2: rule__DataAccessObject__Group__30__Impl rule__DataAccessObject__Group__31
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__30__Impl_in_rule__DataAccessObject__Group__3011105);
            rule__DataAccessObject__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__31_in_rule__DataAccessObject__Group__3011108);
            rule__DataAccessObject__Group__31();

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
    // $ANTLR end "rule__DataAccessObject__Group__30"


    // $ANTLR start "rule__DataAccessObject__Group__30__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: rule__DataAccessObject__Group__30__Impl : ( 'throws' ) ;
    public final void rule__DataAccessObject__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5611:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5612:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5612:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5613:1: 'throws'
            {
             before(grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_30()); 
            match(input,30,FOLLOW_30_in_rule__DataAccessObject__Group__30__Impl11136); 
             after(grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_30()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__30__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__31"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5626:1: rule__DataAccessObject__Group__31 : rule__DataAccessObject__Group__31__Impl rule__DataAccessObject__Group__32 ;
    public final void rule__DataAccessObject__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5630:1: ( rule__DataAccessObject__Group__31__Impl rule__DataAccessObject__Group__32 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5631:2: rule__DataAccessObject__Group__31__Impl rule__DataAccessObject__Group__32
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__31__Impl_in_rule__DataAccessObject__Group__3111167);
            rule__DataAccessObject__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__32_in_rule__DataAccessObject__Group__3111170);
            rule__DataAccessObject__Group__32();

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
    // $ANTLR end "rule__DataAccessObject__Group__31"


    // $ANTLR start "rule__DataAccessObject__Group__31__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5638:1: rule__DataAccessObject__Group__31__Impl : ( ( rule__DataAccessObject__Exception3Assignment_31 ) ) ;
    public final void rule__DataAccessObject__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5642:1: ( ( ( rule__DataAccessObject__Exception3Assignment_31 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5643:1: ( ( rule__DataAccessObject__Exception3Assignment_31 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5643:1: ( ( rule__DataAccessObject__Exception3Assignment_31 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5644:1: ( rule__DataAccessObject__Exception3Assignment_31 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getException3Assignment_31()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5645:1: ( rule__DataAccessObject__Exception3Assignment_31 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5645:2: rule__DataAccessObject__Exception3Assignment_31
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Exception3Assignment_31_in_rule__DataAccessObject__Group__31__Impl11197);
            rule__DataAccessObject__Exception3Assignment_31();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getException3Assignment_31()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__31__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__32"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5655:1: rule__DataAccessObject__Group__32 : rule__DataAccessObject__Group__32__Impl rule__DataAccessObject__Group__33 ;
    public final void rule__DataAccessObject__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5659:1: ( rule__DataAccessObject__Group__32__Impl rule__DataAccessObject__Group__33 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5660:2: rule__DataAccessObject__Group__32__Impl rule__DataAccessObject__Group__33
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__32__Impl_in_rule__DataAccessObject__Group__3211227);
            rule__DataAccessObject__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__33_in_rule__DataAccessObject__Group__3211230);
            rule__DataAccessObject__Group__33();

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
    // $ANTLR end "rule__DataAccessObject__Group__32"


    // $ANTLR start "rule__DataAccessObject__Group__32__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5667:1: rule__DataAccessObject__Group__32__Impl : ( '{' ) ;
    public final void rule__DataAccessObject__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5671:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5672:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5672:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5673:1: '{'
            {
             before(grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_32()); 
            match(input,19,FOLLOW_19_in_rule__DataAccessObject__Group__32__Impl11258); 
             after(grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_32()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__32__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__33"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5686:1: rule__DataAccessObject__Group__33 : rule__DataAccessObject__Group__33__Impl rule__DataAccessObject__Group__34 ;
    public final void rule__DataAccessObject__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5690:1: ( rule__DataAccessObject__Group__33__Impl rule__DataAccessObject__Group__34 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:2: rule__DataAccessObject__Group__33__Impl rule__DataAccessObject__Group__34
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__33__Impl_in_rule__DataAccessObject__Group__3311289);
            rule__DataAccessObject__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__34_in_rule__DataAccessObject__Group__3311292);
            rule__DataAccessObject__Group__34();

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
    // $ANTLR end "rule__DataAccessObject__Group__33"


    // $ANTLR start "rule__DataAccessObject__Group__33__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5698:1: rule__DataAccessObject__Group__33__Impl : ( ( rule__DataAccessObject__UpdateMethodAssignment_33 ) ) ;
    public final void rule__DataAccessObject__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5702:1: ( ( ( rule__DataAccessObject__UpdateMethodAssignment_33 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5703:1: ( ( rule__DataAccessObject__UpdateMethodAssignment_33 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5703:1: ( ( rule__DataAccessObject__UpdateMethodAssignment_33 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5704:1: ( rule__DataAccessObject__UpdateMethodAssignment_33 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getUpdateMethodAssignment_33()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5705:1: ( rule__DataAccessObject__UpdateMethodAssignment_33 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5705:2: rule__DataAccessObject__UpdateMethodAssignment_33
            {
            pushFollow(FOLLOW_rule__DataAccessObject__UpdateMethodAssignment_33_in_rule__DataAccessObject__Group__33__Impl11319);
            rule__DataAccessObject__UpdateMethodAssignment_33();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getUpdateMethodAssignment_33()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__33__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__34"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5715:1: rule__DataAccessObject__Group__34 : rule__DataAccessObject__Group__34__Impl rule__DataAccessObject__Group__35 ;
    public final void rule__DataAccessObject__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5719:1: ( rule__DataAccessObject__Group__34__Impl rule__DataAccessObject__Group__35 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5720:2: rule__DataAccessObject__Group__34__Impl rule__DataAccessObject__Group__35
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__34__Impl_in_rule__DataAccessObject__Group__3411349);
            rule__DataAccessObject__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__35_in_rule__DataAccessObject__Group__3411352);
            rule__DataAccessObject__Group__35();

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
    // $ANTLR end "rule__DataAccessObject__Group__34"


    // $ANTLR start "rule__DataAccessObject__Group__34__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5727:1: rule__DataAccessObject__Group__34__Impl : ( 'return' ) ;
    public final void rule__DataAccessObject__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5731:1: ( ( 'return' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5732:1: ( 'return' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5732:1: ( 'return' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5733:1: 'return'
            {
             before(grammarAccess.getDataAccessObjectAccess().getReturnKeyword_34()); 
            match(input,31,FOLLOW_31_in_rule__DataAccessObject__Group__34__Impl11380); 
             after(grammarAccess.getDataAccessObjectAccess().getReturnKeyword_34()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__34__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__35"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5746:1: rule__DataAccessObject__Group__35 : rule__DataAccessObject__Group__35__Impl rule__DataAccessObject__Group__36 ;
    public final void rule__DataAccessObject__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5750:1: ( rule__DataAccessObject__Group__35__Impl rule__DataAccessObject__Group__36 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5751:2: rule__DataAccessObject__Group__35__Impl rule__DataAccessObject__Group__36
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__35__Impl_in_rule__DataAccessObject__Group__3511411);
            rule__DataAccessObject__Group__35__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__36_in_rule__DataAccessObject__Group__3511414);
            rule__DataAccessObject__Group__36();

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
    // $ANTLR end "rule__DataAccessObject__Group__35"


    // $ANTLR start "rule__DataAccessObject__Group__35__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5758:1: rule__DataAccessObject__Group__35__Impl : ( ( rule__DataAccessObject__UpdatedDataModelAssignment_35 ) ) ;
    public final void rule__DataAccessObject__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5762:1: ( ( ( rule__DataAccessObject__UpdatedDataModelAssignment_35 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5763:1: ( ( rule__DataAccessObject__UpdatedDataModelAssignment_35 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5763:1: ( ( rule__DataAccessObject__UpdatedDataModelAssignment_35 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5764:1: ( rule__DataAccessObject__UpdatedDataModelAssignment_35 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getUpdatedDataModelAssignment_35()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:1: ( rule__DataAccessObject__UpdatedDataModelAssignment_35 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5765:2: rule__DataAccessObject__UpdatedDataModelAssignment_35
            {
            pushFollow(FOLLOW_rule__DataAccessObject__UpdatedDataModelAssignment_35_in_rule__DataAccessObject__Group__35__Impl11441);
            rule__DataAccessObject__UpdatedDataModelAssignment_35();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getUpdatedDataModelAssignment_35()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__35__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__36"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5775:1: rule__DataAccessObject__Group__36 : rule__DataAccessObject__Group__36__Impl rule__DataAccessObject__Group__37 ;
    public final void rule__DataAccessObject__Group__36() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5779:1: ( rule__DataAccessObject__Group__36__Impl rule__DataAccessObject__Group__37 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5780:2: rule__DataAccessObject__Group__36__Impl rule__DataAccessObject__Group__37
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__36__Impl_in_rule__DataAccessObject__Group__3611471);
            rule__DataAccessObject__Group__36__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__37_in_rule__DataAccessObject__Group__3611474);
            rule__DataAccessObject__Group__37();

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
    // $ANTLR end "rule__DataAccessObject__Group__36"


    // $ANTLR start "rule__DataAccessObject__Group__36__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5787:1: rule__DataAccessObject__Group__36__Impl : ( '}' ) ;
    public final void rule__DataAccessObject__Group__36__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5791:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5792:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5792:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5793:1: '}'
            {
             before(grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_36()); 
            match(input,20,FOLLOW_20_in_rule__DataAccessObject__Group__36__Impl11502); 
             after(grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_36()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__36__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__37"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5806:1: rule__DataAccessObject__Group__37 : rule__DataAccessObject__Group__37__Impl rule__DataAccessObject__Group__38 ;
    public final void rule__DataAccessObject__Group__37() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5810:1: ( rule__DataAccessObject__Group__37__Impl rule__DataAccessObject__Group__38 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5811:2: rule__DataAccessObject__Group__37__Impl rule__DataAccessObject__Group__38
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__37__Impl_in_rule__DataAccessObject__Group__3711533);
            rule__DataAccessObject__Group__37__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__38_in_rule__DataAccessObject__Group__3711536);
            rule__DataAccessObject__Group__38();

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
    // $ANTLR end "rule__DataAccessObject__Group__37"


    // $ANTLR start "rule__DataAccessObject__Group__37__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5818:1: rule__DataAccessObject__Group__37__Impl : ( 'delete' ) ;
    public final void rule__DataAccessObject__Group__37__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5822:1: ( ( 'delete' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5823:1: ( 'delete' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5823:1: ( 'delete' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5824:1: 'delete'
            {
             before(grammarAccess.getDataAccessObjectAccess().getDeleteKeyword_37()); 
            match(input,35,FOLLOW_35_in_rule__DataAccessObject__Group__37__Impl11564); 
             after(grammarAccess.getDataAccessObjectAccess().getDeleteKeyword_37()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__37__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__38"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5837:1: rule__DataAccessObject__Group__38 : rule__DataAccessObject__Group__38__Impl rule__DataAccessObject__Group__39 ;
    public final void rule__DataAccessObject__Group__38() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5841:1: ( rule__DataAccessObject__Group__38__Impl rule__DataAccessObject__Group__39 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5842:2: rule__DataAccessObject__Group__38__Impl rule__DataAccessObject__Group__39
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__38__Impl_in_rule__DataAccessObject__Group__3811595);
            rule__DataAccessObject__Group__38__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__39_in_rule__DataAccessObject__Group__3811598);
            rule__DataAccessObject__Group__39();

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
    // $ANTLR end "rule__DataAccessObject__Group__38"


    // $ANTLR start "rule__DataAccessObject__Group__38__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5849:1: rule__DataAccessObject__Group__38__Impl : ( '(' ) ;
    public final void rule__DataAccessObject__Group__38__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5853:1: ( ( '(' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5854:1: ( '(' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5854:1: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5855:1: '('
            {
             before(grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_38()); 
            match(input,24,FOLLOW_24_in_rule__DataAccessObject__Group__38__Impl11626); 
             after(grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_38()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__38__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__39"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5868:1: rule__DataAccessObject__Group__39 : rule__DataAccessObject__Group__39__Impl rule__DataAccessObject__Group__40 ;
    public final void rule__DataAccessObject__Group__39() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5872:1: ( rule__DataAccessObject__Group__39__Impl rule__DataAccessObject__Group__40 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5873:2: rule__DataAccessObject__Group__39__Impl rule__DataAccessObject__Group__40
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__39__Impl_in_rule__DataAccessObject__Group__3911657);
            rule__DataAccessObject__Group__39__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__40_in_rule__DataAccessObject__Group__3911660);
            rule__DataAccessObject__Group__40();

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
    // $ANTLR end "rule__DataAccessObject__Group__39"


    // $ANTLR start "rule__DataAccessObject__Group__39__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5880:1: rule__DataAccessObject__Group__39__Impl : ( ( rule__DataAccessObject__DeletebyAssignment_39 ) ) ;
    public final void rule__DataAccessObject__Group__39__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5884:1: ( ( ( rule__DataAccessObject__DeletebyAssignment_39 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5885:1: ( ( rule__DataAccessObject__DeletebyAssignment_39 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5885:1: ( ( rule__DataAccessObject__DeletebyAssignment_39 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5886:1: ( rule__DataAccessObject__DeletebyAssignment_39 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getDeletebyAssignment_39()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5887:1: ( rule__DataAccessObject__DeletebyAssignment_39 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5887:2: rule__DataAccessObject__DeletebyAssignment_39
            {
            pushFollow(FOLLOW_rule__DataAccessObject__DeletebyAssignment_39_in_rule__DataAccessObject__Group__39__Impl11687);
            rule__DataAccessObject__DeletebyAssignment_39();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getDeletebyAssignment_39()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__39__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__40"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5897:1: rule__DataAccessObject__Group__40 : rule__DataAccessObject__Group__40__Impl rule__DataAccessObject__Group__41 ;
    public final void rule__DataAccessObject__Group__40() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5901:1: ( rule__DataAccessObject__Group__40__Impl rule__DataAccessObject__Group__41 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5902:2: rule__DataAccessObject__Group__40__Impl rule__DataAccessObject__Group__41
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__40__Impl_in_rule__DataAccessObject__Group__4011717);
            rule__DataAccessObject__Group__40__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__41_in_rule__DataAccessObject__Group__4011720);
            rule__DataAccessObject__Group__41();

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
    // $ANTLR end "rule__DataAccessObject__Group__40"


    // $ANTLR start "rule__DataAccessObject__Group__40__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5909:1: rule__DataAccessObject__Group__40__Impl : ( ')' ) ;
    public final void rule__DataAccessObject__Group__40__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5913:1: ( ( ')' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5914:1: ( ')' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5914:1: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5915:1: ')'
            {
             before(grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_40()); 
            match(input,26,FOLLOW_26_in_rule__DataAccessObject__Group__40__Impl11748); 
             after(grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_40()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__40__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__41"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5928:1: rule__DataAccessObject__Group__41 : rule__DataAccessObject__Group__41__Impl rule__DataAccessObject__Group__42 ;
    public final void rule__DataAccessObject__Group__41() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5932:1: ( rule__DataAccessObject__Group__41__Impl rule__DataAccessObject__Group__42 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5933:2: rule__DataAccessObject__Group__41__Impl rule__DataAccessObject__Group__42
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__41__Impl_in_rule__DataAccessObject__Group__4111779);
            rule__DataAccessObject__Group__41__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__42_in_rule__DataAccessObject__Group__4111782);
            rule__DataAccessObject__Group__42();

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
    // $ANTLR end "rule__DataAccessObject__Group__41"


    // $ANTLR start "rule__DataAccessObject__Group__41__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5940:1: rule__DataAccessObject__Group__41__Impl : ( 'throws' ) ;
    public final void rule__DataAccessObject__Group__41__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5944:1: ( ( 'throws' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5945:1: ( 'throws' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5945:1: ( 'throws' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5946:1: 'throws'
            {
             before(grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_41()); 
            match(input,30,FOLLOW_30_in_rule__DataAccessObject__Group__41__Impl11810); 
             after(grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_41()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__41__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__42"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5959:1: rule__DataAccessObject__Group__42 : rule__DataAccessObject__Group__42__Impl rule__DataAccessObject__Group__43 ;
    public final void rule__DataAccessObject__Group__42() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5963:1: ( rule__DataAccessObject__Group__42__Impl rule__DataAccessObject__Group__43 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5964:2: rule__DataAccessObject__Group__42__Impl rule__DataAccessObject__Group__43
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__42__Impl_in_rule__DataAccessObject__Group__4211841);
            rule__DataAccessObject__Group__42__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__43_in_rule__DataAccessObject__Group__4211844);
            rule__DataAccessObject__Group__43();

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
    // $ANTLR end "rule__DataAccessObject__Group__42"


    // $ANTLR start "rule__DataAccessObject__Group__42__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5971:1: rule__DataAccessObject__Group__42__Impl : ( ( rule__DataAccessObject__Exception4Assignment_42 ) ) ;
    public final void rule__DataAccessObject__Group__42__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5975:1: ( ( ( rule__DataAccessObject__Exception4Assignment_42 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5976:1: ( ( rule__DataAccessObject__Exception4Assignment_42 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5976:1: ( ( rule__DataAccessObject__Exception4Assignment_42 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5977:1: ( rule__DataAccessObject__Exception4Assignment_42 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getException4Assignment_42()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5978:1: ( rule__DataAccessObject__Exception4Assignment_42 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5978:2: rule__DataAccessObject__Exception4Assignment_42
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Exception4Assignment_42_in_rule__DataAccessObject__Group__42__Impl11871);
            rule__DataAccessObject__Exception4Assignment_42();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getException4Assignment_42()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__42__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__43"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5988:1: rule__DataAccessObject__Group__43 : rule__DataAccessObject__Group__43__Impl rule__DataAccessObject__Group__44 ;
    public final void rule__DataAccessObject__Group__43() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5992:1: ( rule__DataAccessObject__Group__43__Impl rule__DataAccessObject__Group__44 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5993:2: rule__DataAccessObject__Group__43__Impl rule__DataAccessObject__Group__44
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__43__Impl_in_rule__DataAccessObject__Group__4311901);
            rule__DataAccessObject__Group__43__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__44_in_rule__DataAccessObject__Group__4311904);
            rule__DataAccessObject__Group__44();

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
    // $ANTLR end "rule__DataAccessObject__Group__43"


    // $ANTLR start "rule__DataAccessObject__Group__43__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6000:1: rule__DataAccessObject__Group__43__Impl : ( '{' ) ;
    public final void rule__DataAccessObject__Group__43__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6004:1: ( ( '{' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6005:1: ( '{' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6005:1: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6006:1: '{'
            {
             before(grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_43()); 
            match(input,19,FOLLOW_19_in_rule__DataAccessObject__Group__43__Impl11932); 
             after(grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_43()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__43__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__44"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6019:1: rule__DataAccessObject__Group__44 : rule__DataAccessObject__Group__44__Impl rule__DataAccessObject__Group__45 ;
    public final void rule__DataAccessObject__Group__44() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6023:1: ( rule__DataAccessObject__Group__44__Impl rule__DataAccessObject__Group__45 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6024:2: rule__DataAccessObject__Group__44__Impl rule__DataAccessObject__Group__45
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__44__Impl_in_rule__DataAccessObject__Group__4411963);
            rule__DataAccessObject__Group__44__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataAccessObject__Group__45_in_rule__DataAccessObject__Group__4411966);
            rule__DataAccessObject__Group__45();

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
    // $ANTLR end "rule__DataAccessObject__Group__44"


    // $ANTLR start "rule__DataAccessObject__Group__44__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6031:1: rule__DataAccessObject__Group__44__Impl : ( ( rule__DataAccessObject__DeleteMethodAssignment_44 ) ) ;
    public final void rule__DataAccessObject__Group__44__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6035:1: ( ( ( rule__DataAccessObject__DeleteMethodAssignment_44 ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6036:1: ( ( rule__DataAccessObject__DeleteMethodAssignment_44 ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6036:1: ( ( rule__DataAccessObject__DeleteMethodAssignment_44 ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6037:1: ( rule__DataAccessObject__DeleteMethodAssignment_44 )
            {
             before(grammarAccess.getDataAccessObjectAccess().getDeleteMethodAssignment_44()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6038:1: ( rule__DataAccessObject__DeleteMethodAssignment_44 )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6038:2: rule__DataAccessObject__DeleteMethodAssignment_44
            {
            pushFollow(FOLLOW_rule__DataAccessObject__DeleteMethodAssignment_44_in_rule__DataAccessObject__Group__44__Impl11993);
            rule__DataAccessObject__DeleteMethodAssignment_44();

            state._fsp--;


            }

             after(grammarAccess.getDataAccessObjectAccess().getDeleteMethodAssignment_44()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__44__Impl"


    // $ANTLR start "rule__DataAccessObject__Group__45"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6048:1: rule__DataAccessObject__Group__45 : rule__DataAccessObject__Group__45__Impl ;
    public final void rule__DataAccessObject__Group__45() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6052:1: ( rule__DataAccessObject__Group__45__Impl )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6053:2: rule__DataAccessObject__Group__45__Impl
            {
            pushFollow(FOLLOW_rule__DataAccessObject__Group__45__Impl_in_rule__DataAccessObject__Group__4512023);
            rule__DataAccessObject__Group__45__Impl();

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
    // $ANTLR end "rule__DataAccessObject__Group__45"


    // $ANTLR start "rule__DataAccessObject__Group__45__Impl"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6059:1: rule__DataAccessObject__Group__45__Impl : ( '}' ) ;
    public final void rule__DataAccessObject__Group__45__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6063:1: ( ( '}' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6064:1: ( '}' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6064:1: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6065:1: '}'
            {
             before(grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_45()); 
            match(input,20,FOLLOW_20_in_rule__DataAccessObject__Group__45__Impl12051); 
             after(grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_45()); 

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
    // $ANTLR end "rule__DataAccessObject__Group__45__Impl"


    // $ANTLR start "rule__DomainModel__ElementsAssignment_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6171:1: rule__DomainModel__ElementsAssignment_0 : ( ruleType ) ;
    public final void rule__DomainModel__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6175:1: ( ( ruleType ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6176:1: ( ruleType )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6176:1: ( ruleType )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6177:1: ruleType
            {
             before(grammarAccess.getDomainModelAccess().getElementsTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__DomainModel__ElementsAssignment_012179);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getElementsTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__DomainModel__ElementsAssignment_0"


    // $ANTLR start "rule__DomainModel__ApisAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6186:1: rule__DomainModel__ApisAssignment_1 : ( ruleRestAPI ) ;
    public final void rule__DomainModel__ApisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6190:1: ( ( ruleRestAPI ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6191:1: ( ruleRestAPI )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6191:1: ( ruleRestAPI )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6192:1: ruleRestAPI
            {
             before(grammarAccess.getDomainModelAccess().getApisRestAPIParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRestAPI_in_rule__DomainModel__ApisAssignment_112210);
            ruleRestAPI();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getApisRestAPIParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DomainModel__ApisAssignment_1"


    // $ANTLR start "rule__RestAPI__ResourceAssignment_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6201:1: rule__RestAPI__ResourceAssignment_0 : ( ruleResource ) ;
    public final void rule__RestAPI__ResourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6205:1: ( ( ruleResource ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6206:1: ( ruleResource )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6206:1: ( ruleResource )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6207:1: ruleResource
            {
             before(grammarAccess.getRestAPIAccess().getResourceResourceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleResource_in_rule__RestAPI__ResourceAssignment_012241);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getRestAPIAccess().getResourceResourceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__RestAPI__ResourceAssignment_0"


    // $ANTLR start "rule__RestAPI__ServiceAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6216:1: rule__RestAPI__ServiceAssignment_1 : ( ruleService ) ;
    public final void rule__RestAPI__ServiceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6220:1: ( ( ruleService ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6221:1: ( ruleService )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6221:1: ( ruleService )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6222:1: ruleService
            {
             before(grammarAccess.getRestAPIAccess().getServiceServiceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleService_in_rule__RestAPI__ServiceAssignment_112272);
            ruleService();

            state._fsp--;

             after(grammarAccess.getRestAPIAccess().getServiceServiceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RestAPI__ServiceAssignment_1"


    // $ANTLR start "rule__RestAPI__DaoAssignment_2"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6231:1: rule__RestAPI__DaoAssignment_2 : ( ruleDataAccessObject ) ;
    public final void rule__RestAPI__DaoAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6235:1: ( ( ruleDataAccessObject ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6236:1: ( ruleDataAccessObject )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6236:1: ( ruleDataAccessObject )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6237:1: ruleDataAccessObject
            {
             before(grammarAccess.getRestAPIAccess().getDaoDataAccessObjectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDataAccessObject_in_rule__RestAPI__DaoAssignment_212303);
            ruleDataAccessObject();

            state._fsp--;

             after(grammarAccess.getRestAPIAccess().getDaoDataAccessObjectParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RestAPI__DaoAssignment_2"


    // $ANTLR start "rule__PrimitiveType__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6246:1: rule__PrimitiveType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrimitiveType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6250:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6251:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6251:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6252:1: RULE_ID
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PrimitiveType__NameAssignment_112334); 
             after(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__PrimitiveType__NameAssignment_1"


    // $ANTLR start "rule__DataModel__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6261:1: rule__DataModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6265:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6266:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6266:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6267:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__NameAssignment_112365); 
             after(grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataModel__NameAssignment_1"


    // $ANTLR start "rule__DataModel__SuperTypeAssignment_2_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6276:1: rule__DataModel__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataModel__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6280:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6281:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6281:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6282:1: ( RULE_ID )
            {
             before(grammarAccess.getDataModelAccess().getSuperTypeDataModelCrossReference_2_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6283:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6284:1: RULE_ID
            {
             before(grammarAccess.getDataModelAccess().getSuperTypeDataModelIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataModel__SuperTypeAssignment_2_112400); 
             after(grammarAccess.getDataModelAccess().getSuperTypeDataModelIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDataModelAccess().getSuperTypeDataModelCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__DataModel__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__DataModel__FeaturesAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6295:1: rule__DataModel__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__DataModel__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6299:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6300:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6300:1: ( ruleFeature )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6301:1: ruleFeature
            {
             before(grammarAccess.getDataModelAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__DataModel__FeaturesAssignment_412435);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getFeaturesFeatureParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__DataModel__FeaturesAssignment_4"


    // $ANTLR start "rule__RestModel__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6310:1: rule__RestModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RestModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6314:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6315:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6315:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6316:1: RULE_ID
            {
             before(grammarAccess.getRestModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RestModel__NameAssignment_112466); 
             after(grammarAccess.getRestModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RestModel__NameAssignment_1"


    // $ANTLR start "rule__RestModel__SuperTypeAssignment_2_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6325:1: rule__RestModel__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__RestModel__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6329:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6330:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6330:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6331:1: ( RULE_ID )
            {
             before(grammarAccess.getRestModelAccess().getSuperTypeRestModelCrossReference_2_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6332:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6333:1: RULE_ID
            {
             before(grammarAccess.getRestModelAccess().getSuperTypeRestModelIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RestModel__SuperTypeAssignment_2_112501); 
             after(grammarAccess.getRestModelAccess().getSuperTypeRestModelIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getRestModelAccess().getSuperTypeRestModelCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__RestModel__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__RestModel__FeaturesAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6344:1: rule__RestModel__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__RestModel__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6348:1: ( ( ruleFeature ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6349:1: ( ruleFeature )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6349:1: ( ruleFeature )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6350:1: ruleFeature
            {
             before(grammarAccess.getRestModelAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__RestModel__FeaturesAssignment_412536);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getRestModelAccess().getFeaturesFeatureParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RestModel__FeaturesAssignment_4"


    // $ANTLR start "rule__MappingModel__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6359:1: rule__MappingModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MappingModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6363:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6364:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6364:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6365:1: RULE_ID
            {
             before(grammarAccess.getMappingModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MappingModel__NameAssignment_112567); 
             after(grammarAccess.getMappingModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MappingModel__NameAssignment_1"


    // $ANTLR start "rule__MappingModel__TransformationAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6374:1: rule__MappingModel__TransformationAssignment_3 : ( ruleTransformation ) ;
    public final void rule__MappingModel__TransformationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6378:1: ( ( ruleTransformation ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6379:1: ( ruleTransformation )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6379:1: ( ruleTransformation )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6380:1: ruleTransformation
            {
             before(grammarAccess.getMappingModelAccess().getTransformationTransformationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTransformation_in_rule__MappingModel__TransformationAssignment_312598);
            ruleTransformation();

            state._fsp--;

             after(grammarAccess.getMappingModelAccess().getTransformationTransformationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MappingModel__TransformationAssignment_3"


    // $ANTLR start "rule__Transformation__DataModelAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6389:1: rule__Transformation__DataModelAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transformation__DataModelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6393:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6394:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6394:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6395:1: ( RULE_ID )
            {
             before(grammarAccess.getTransformationAccess().getDataModelDataModelCrossReference_1_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6396:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6397:1: RULE_ID
            {
             before(grammarAccess.getTransformationAccess().getDataModelDataModelIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transformation__DataModelAssignment_112633); 
             after(grammarAccess.getTransformationAccess().getDataModelDataModelIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTransformationAccess().getDataModelDataModelCrossReference_1_0()); 

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
    // $ANTLR end "rule__Transformation__DataModelAssignment_1"


    // $ANTLR start "rule__Transformation__RestModelAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6408:1: rule__Transformation__RestModelAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Transformation__RestModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6412:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6413:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6413:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6414:1: ( RULE_ID )
            {
             before(grammarAccess.getTransformationAccess().getRestModelRestModelCrossReference_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6415:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6416:1: RULE_ID
            {
             before(grammarAccess.getTransformationAccess().getRestModelRestModelIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transformation__RestModelAssignment_312672); 
             after(grammarAccess.getTransformationAccess().getRestModelRestModelIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTransformationAccess().getRestModelRestModelCrossReference_3_0()); 

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
    // $ANTLR end "rule__Transformation__RestModelAssignment_3"


    // $ANTLR start "rule__Feature__ManyAssignment_0"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6427:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6431:1: ( ( ( 'many' ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6432:1: ( ( 'many' ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6432:1: ( ( 'many' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6433:1: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6434:1: ( 'many' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6435:1: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Feature__ManyAssignment_012712); 
             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

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
    // $ANTLR end "rule__Feature__ManyAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6450:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6454:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6455:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6455:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6456:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_112751); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6465:1: rule__Feature__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6469:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6470:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6470:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6471:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6472:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6473:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__TypeAssignment_312786); 
             after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Feature__TypeAssignment_3"


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6484:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6488:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6489:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6489:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6490:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_112821); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Resource__NameAssignment_1"


    // $ANTLR start "rule__Resource__CreateRestModelAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6499:1: rule__Resource__CreateRestModelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Resource__CreateRestModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6503:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6504:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6504:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6505:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceAccess().getCreateRestModelRestModelCrossReference_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6506:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6507:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getCreateRestModelRestModelIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__CreateRestModelAssignment_412856); 
             after(grammarAccess.getResourceAccess().getCreateRestModelRestModelIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getCreateRestModelRestModelCrossReference_4_0()); 

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
    // $ANTLR end "rule__Resource__CreateRestModelAssignment_4"


    // $ANTLR start "rule__Resource__Exception1Assignment_7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6518:1: rule__Resource__Exception1Assignment_7 : ( ruleRestException ) ;
    public final void rule__Resource__Exception1Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6522:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6523:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6523:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6524:1: ruleRestException
            {
             before(grammarAccess.getResourceAccess().getException1RestExceptionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__Resource__Exception1Assignment_712891);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getException1RestExceptionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Resource__Exception1Assignment_7"


    // $ANTLR start "rule__Resource__CreateMethodAssignment_9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6533:1: rule__Resource__CreateMethodAssignment_9 : ( ruleJavaMethod ) ;
    public final void rule__Resource__CreateMethodAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6537:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6538:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6538:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6539:1: ruleJavaMethod
            {
             before(grammarAccess.getResourceAccess().getCreateMethodJavaMethodParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__Resource__CreateMethodAssignment_912922);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getCreateMethodJavaMethodParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Resource__CreateMethodAssignment_9"


    // $ANTLR start "rule__Resource__CreatedRestModelAssignment_11"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6548:1: rule__Resource__CreatedRestModelAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Resource__CreatedRestModelAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6552:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6553:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6553:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6554:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceAccess().getCreatedRestModelRestModelCrossReference_11_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6555:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6556:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getCreatedRestModelRestModelIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__CreatedRestModelAssignment_1112957); 
             after(grammarAccess.getResourceAccess().getCreatedRestModelRestModelIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getCreatedRestModelRestModelCrossReference_11_0()); 

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
    // $ANTLR end "rule__Resource__CreatedRestModelAssignment_11"


    // $ANTLR start "rule__Resource__FindbyAssignment_15"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6567:1: rule__Resource__FindbyAssignment_15 : ( RULE_INTEGER ) ;
    public final void rule__Resource__FindbyAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6571:1: ( ( RULE_INTEGER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6572:1: ( RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6572:1: ( RULE_INTEGER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6573:1: RULE_INTEGER
            {
             before(grammarAccess.getResourceAccess().getFindbyINTEGERTerminalRuleCall_15_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__Resource__FindbyAssignment_1512992); 
             after(grammarAccess.getResourceAccess().getFindbyINTEGERTerminalRuleCall_15_0()); 

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
    // $ANTLR end "rule__Resource__FindbyAssignment_15"


    // $ANTLR start "rule__Resource__Exception2Assignment_18"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6582:1: rule__Resource__Exception2Assignment_18 : ( ruleRestException ) ;
    public final void rule__Resource__Exception2Assignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6586:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6587:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6587:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6588:1: ruleRestException
            {
             before(grammarAccess.getResourceAccess().getException2RestExceptionParserRuleCall_18_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__Resource__Exception2Assignment_1813023);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getException2RestExceptionParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__Resource__Exception2Assignment_18"


    // $ANTLR start "rule__Resource__FindMethodAssignment_20"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6597:1: rule__Resource__FindMethodAssignment_20 : ( ruleJavaMethod ) ;
    public final void rule__Resource__FindMethodAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6601:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6602:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6602:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6603:1: ruleJavaMethod
            {
             before(grammarAccess.getResourceAccess().getFindMethodJavaMethodParserRuleCall_20_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__Resource__FindMethodAssignment_2013054);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getFindMethodJavaMethodParserRuleCall_20_0()); 

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
    // $ANTLR end "rule__Resource__FindMethodAssignment_20"


    // $ANTLR start "rule__Resource__FoundRestModelAssignment_22"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6612:1: rule__Resource__FoundRestModelAssignment_22 : ( ( RULE_ID ) ) ;
    public final void rule__Resource__FoundRestModelAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6616:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6617:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6617:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6618:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceAccess().getFoundRestModelRestModelCrossReference_22_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6619:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6620:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getFoundRestModelRestModelIDTerminalRuleCall_22_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__FoundRestModelAssignment_2213089); 
             after(grammarAccess.getResourceAccess().getFoundRestModelRestModelIDTerminalRuleCall_22_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getFoundRestModelRestModelCrossReference_22_0()); 

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
    // $ANTLR end "rule__Resource__FoundRestModelAssignment_22"


    // $ANTLR start "rule__Resource__UpdatebyAssignment_26"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6631:1: rule__Resource__UpdatebyAssignment_26 : ( RULE_INTEGER ) ;
    public final void rule__Resource__UpdatebyAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6635:1: ( ( RULE_INTEGER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6636:1: ( RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6636:1: ( RULE_INTEGER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6637:1: RULE_INTEGER
            {
             before(grammarAccess.getResourceAccess().getUpdatebyINTEGERTerminalRuleCall_26_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__Resource__UpdatebyAssignment_2613124); 
             after(grammarAccess.getResourceAccess().getUpdatebyINTEGERTerminalRuleCall_26_0()); 

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
    // $ANTLR end "rule__Resource__UpdatebyAssignment_26"


    // $ANTLR start "rule__Resource__UpdateRestModelAssignment_28"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6646:1: rule__Resource__UpdateRestModelAssignment_28 : ( ( RULE_ID ) ) ;
    public final void rule__Resource__UpdateRestModelAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6650:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6651:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6651:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6652:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceAccess().getUpdateRestModelRestModelCrossReference_28_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6653:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6654:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getUpdateRestModelRestModelIDTerminalRuleCall_28_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__UpdateRestModelAssignment_2813159); 
             after(grammarAccess.getResourceAccess().getUpdateRestModelRestModelIDTerminalRuleCall_28_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getUpdateRestModelRestModelCrossReference_28_0()); 

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
    // $ANTLR end "rule__Resource__UpdateRestModelAssignment_28"


    // $ANTLR start "rule__Resource__Exception3Assignment_31"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6665:1: rule__Resource__Exception3Assignment_31 : ( ruleRestException ) ;
    public final void rule__Resource__Exception3Assignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6669:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6670:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6670:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6671:1: ruleRestException
            {
             before(grammarAccess.getResourceAccess().getException3RestExceptionParserRuleCall_31_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__Resource__Exception3Assignment_3113194);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getException3RestExceptionParserRuleCall_31_0()); 

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
    // $ANTLR end "rule__Resource__Exception3Assignment_31"


    // $ANTLR start "rule__Resource__UpdateMethodAssignment_33"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6680:1: rule__Resource__UpdateMethodAssignment_33 : ( ruleJavaMethod ) ;
    public final void rule__Resource__UpdateMethodAssignment_33() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6684:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6685:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6685:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6686:1: ruleJavaMethod
            {
             before(grammarAccess.getResourceAccess().getUpdateMethodJavaMethodParserRuleCall_33_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__Resource__UpdateMethodAssignment_3313225);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getUpdateMethodJavaMethodParserRuleCall_33_0()); 

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
    // $ANTLR end "rule__Resource__UpdateMethodAssignment_33"


    // $ANTLR start "rule__Resource__UpdatedRestModelAssignment_35"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6695:1: rule__Resource__UpdatedRestModelAssignment_35 : ( ( RULE_ID ) ) ;
    public final void rule__Resource__UpdatedRestModelAssignment_35() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6699:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6700:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6700:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6701:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceAccess().getUpdatedRestModelRestModelCrossReference_35_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6702:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6703:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getUpdatedRestModelRestModelIDTerminalRuleCall_35_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__UpdatedRestModelAssignment_3513260); 
             after(grammarAccess.getResourceAccess().getUpdatedRestModelRestModelIDTerminalRuleCall_35_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getUpdatedRestModelRestModelCrossReference_35_0()); 

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
    // $ANTLR end "rule__Resource__UpdatedRestModelAssignment_35"


    // $ANTLR start "rule__Resource__DeletebyAssignment_39"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6714:1: rule__Resource__DeletebyAssignment_39 : ( RULE_INTEGER ) ;
    public final void rule__Resource__DeletebyAssignment_39() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6718:1: ( ( RULE_INTEGER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6719:1: ( RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6719:1: ( RULE_INTEGER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6720:1: RULE_INTEGER
            {
             before(grammarAccess.getResourceAccess().getDeletebyINTEGERTerminalRuleCall_39_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__Resource__DeletebyAssignment_3913295); 
             after(grammarAccess.getResourceAccess().getDeletebyINTEGERTerminalRuleCall_39_0()); 

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
    // $ANTLR end "rule__Resource__DeletebyAssignment_39"


    // $ANTLR start "rule__Resource__Exception4Assignment_42"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6729:1: rule__Resource__Exception4Assignment_42 : ( ruleRestException ) ;
    public final void rule__Resource__Exception4Assignment_42() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6733:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6734:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6734:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6735:1: ruleRestException
            {
             before(grammarAccess.getResourceAccess().getException4RestExceptionParserRuleCall_42_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__Resource__Exception4Assignment_4213326);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getException4RestExceptionParserRuleCall_42_0()); 

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
    // $ANTLR end "rule__Resource__Exception4Assignment_42"


    // $ANTLR start "rule__Resource__DeleteMethodAssignment_44"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6744:1: rule__Resource__DeleteMethodAssignment_44 : ( ruleJavaMethod ) ;
    public final void rule__Resource__DeleteMethodAssignment_44() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6748:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6749:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6749:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6750:1: ruleJavaMethod
            {
             before(grammarAccess.getResourceAccess().getDeleteMethodJavaMethodParserRuleCall_44_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__Resource__DeleteMethodAssignment_4413357);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getDeleteMethodJavaMethodParserRuleCall_44_0()); 

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
    // $ANTLR end "rule__Resource__DeleteMethodAssignment_44"


    // $ANTLR start "rule__Service__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6759:1: rule__Service__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Service__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6763:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6764:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6764:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6765:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__NameAssignment_113388); 
             after(grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Service__NameAssignment_1"


    // $ANTLR start "rule__Service__CreateDataModelAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6774:1: rule__Service__CreateDataModelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Service__CreateDataModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6778:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6779:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6779:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6780:1: ( RULE_ID )
            {
             before(grammarAccess.getServiceAccess().getCreateDataModelDataModelCrossReference_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6781:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6782:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getCreateDataModelDataModelIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__CreateDataModelAssignment_413423); 
             after(grammarAccess.getServiceAccess().getCreateDataModelDataModelIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getCreateDataModelDataModelCrossReference_4_0()); 

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
    // $ANTLR end "rule__Service__CreateDataModelAssignment_4"


    // $ANTLR start "rule__Service__Exception1Assignment_7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6793:1: rule__Service__Exception1Assignment_7 : ( ruleRestException ) ;
    public final void rule__Service__Exception1Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6797:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6798:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6798:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6799:1: ruleRestException
            {
             before(grammarAccess.getServiceAccess().getException1RestExceptionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__Service__Exception1Assignment_713458);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getException1RestExceptionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Service__Exception1Assignment_7"


    // $ANTLR start "rule__Service__CreateMethodAssignment_9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6808:1: rule__Service__CreateMethodAssignment_9 : ( ruleJavaMethod ) ;
    public final void rule__Service__CreateMethodAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6812:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6813:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6813:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6814:1: ruleJavaMethod
            {
             before(grammarAccess.getServiceAccess().getCreateMethodJavaMethodParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__Service__CreateMethodAssignment_913489);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getCreateMethodJavaMethodParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Service__CreateMethodAssignment_9"


    // $ANTLR start "rule__Service__CreatedDataModelAssignment_11"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6823:1: rule__Service__CreatedDataModelAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Service__CreatedDataModelAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6827:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6828:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6828:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6829:1: ( RULE_ID )
            {
             before(grammarAccess.getServiceAccess().getCreatedDataModelDataModelCrossReference_11_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6830:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6831:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getCreatedDataModelDataModelIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__CreatedDataModelAssignment_1113524); 
             after(grammarAccess.getServiceAccess().getCreatedDataModelDataModelIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getCreatedDataModelDataModelCrossReference_11_0()); 

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
    // $ANTLR end "rule__Service__CreatedDataModelAssignment_11"


    // $ANTLR start "rule__Service__FindbyAssignment_15"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6842:1: rule__Service__FindbyAssignment_15 : ( RULE_INTEGER ) ;
    public final void rule__Service__FindbyAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6846:1: ( ( RULE_INTEGER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6847:1: ( RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6847:1: ( RULE_INTEGER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6848:1: RULE_INTEGER
            {
             before(grammarAccess.getServiceAccess().getFindbyINTEGERTerminalRuleCall_15_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__Service__FindbyAssignment_1513559); 
             after(grammarAccess.getServiceAccess().getFindbyINTEGERTerminalRuleCall_15_0()); 

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
    // $ANTLR end "rule__Service__FindbyAssignment_15"


    // $ANTLR start "rule__Service__Exception2Assignment_18"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6857:1: rule__Service__Exception2Assignment_18 : ( ruleRestException ) ;
    public final void rule__Service__Exception2Assignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6861:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6862:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6862:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6863:1: ruleRestException
            {
             before(grammarAccess.getServiceAccess().getException2RestExceptionParserRuleCall_18_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__Service__Exception2Assignment_1813590);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getException2RestExceptionParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__Service__Exception2Assignment_18"


    // $ANTLR start "rule__Service__FindMethodAssignment_20"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6872:1: rule__Service__FindMethodAssignment_20 : ( ruleJavaMethod ) ;
    public final void rule__Service__FindMethodAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6876:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6877:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6877:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6878:1: ruleJavaMethod
            {
             before(grammarAccess.getServiceAccess().getFindMethodJavaMethodParserRuleCall_20_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__Service__FindMethodAssignment_2013621);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getFindMethodJavaMethodParserRuleCall_20_0()); 

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
    // $ANTLR end "rule__Service__FindMethodAssignment_20"


    // $ANTLR start "rule__Service__FoundDataModelAssignment_22"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6887:1: rule__Service__FoundDataModelAssignment_22 : ( ( RULE_ID ) ) ;
    public final void rule__Service__FoundDataModelAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6891:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6892:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6892:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6893:1: ( RULE_ID )
            {
             before(grammarAccess.getServiceAccess().getFoundDataModelDataModelCrossReference_22_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6894:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6895:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getFoundDataModelDataModelIDTerminalRuleCall_22_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__FoundDataModelAssignment_2213656); 
             after(grammarAccess.getServiceAccess().getFoundDataModelDataModelIDTerminalRuleCall_22_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getFoundDataModelDataModelCrossReference_22_0()); 

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
    // $ANTLR end "rule__Service__FoundDataModelAssignment_22"


    // $ANTLR start "rule__Service__UpdatebyAssignment_26"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6906:1: rule__Service__UpdatebyAssignment_26 : ( RULE_INTEGER ) ;
    public final void rule__Service__UpdatebyAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6910:1: ( ( RULE_INTEGER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6911:1: ( RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6911:1: ( RULE_INTEGER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6912:1: RULE_INTEGER
            {
             before(grammarAccess.getServiceAccess().getUpdatebyINTEGERTerminalRuleCall_26_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__Service__UpdatebyAssignment_2613691); 
             after(grammarAccess.getServiceAccess().getUpdatebyINTEGERTerminalRuleCall_26_0()); 

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
    // $ANTLR end "rule__Service__UpdatebyAssignment_26"


    // $ANTLR start "rule__Service__UpdateDataModelAssignment_28"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6921:1: rule__Service__UpdateDataModelAssignment_28 : ( ( RULE_ID ) ) ;
    public final void rule__Service__UpdateDataModelAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6925:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6926:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6926:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6927:1: ( RULE_ID )
            {
             before(grammarAccess.getServiceAccess().getUpdateDataModelDataModelCrossReference_28_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6928:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6929:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getUpdateDataModelDataModelIDTerminalRuleCall_28_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__UpdateDataModelAssignment_2813726); 
             after(grammarAccess.getServiceAccess().getUpdateDataModelDataModelIDTerminalRuleCall_28_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getUpdateDataModelDataModelCrossReference_28_0()); 

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
    // $ANTLR end "rule__Service__UpdateDataModelAssignment_28"


    // $ANTLR start "rule__Service__Exception3Assignment_31"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6940:1: rule__Service__Exception3Assignment_31 : ( ruleRestException ) ;
    public final void rule__Service__Exception3Assignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6944:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6945:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6945:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6946:1: ruleRestException
            {
             before(grammarAccess.getServiceAccess().getException3RestExceptionParserRuleCall_31_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__Service__Exception3Assignment_3113761);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getException3RestExceptionParserRuleCall_31_0()); 

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
    // $ANTLR end "rule__Service__Exception3Assignment_31"


    // $ANTLR start "rule__Service__UpdateMethodAssignment_33"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6955:1: rule__Service__UpdateMethodAssignment_33 : ( ruleJavaMethod ) ;
    public final void rule__Service__UpdateMethodAssignment_33() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6959:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6960:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6960:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6961:1: ruleJavaMethod
            {
             before(grammarAccess.getServiceAccess().getUpdateMethodJavaMethodParserRuleCall_33_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__Service__UpdateMethodAssignment_3313792);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getUpdateMethodJavaMethodParserRuleCall_33_0()); 

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
    // $ANTLR end "rule__Service__UpdateMethodAssignment_33"


    // $ANTLR start "rule__Service__UpdatedDataModelAssignment_35"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6970:1: rule__Service__UpdatedDataModelAssignment_35 : ( ( RULE_ID ) ) ;
    public final void rule__Service__UpdatedDataModelAssignment_35() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6974:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6975:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6975:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6976:1: ( RULE_ID )
            {
             before(grammarAccess.getServiceAccess().getUpdatedDataModelDataModelCrossReference_35_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6977:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6978:1: RULE_ID
            {
             before(grammarAccess.getServiceAccess().getUpdatedDataModelDataModelIDTerminalRuleCall_35_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Service__UpdatedDataModelAssignment_3513827); 
             after(grammarAccess.getServiceAccess().getUpdatedDataModelDataModelIDTerminalRuleCall_35_0_1()); 

            }

             after(grammarAccess.getServiceAccess().getUpdatedDataModelDataModelCrossReference_35_0()); 

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
    // $ANTLR end "rule__Service__UpdatedDataModelAssignment_35"


    // $ANTLR start "rule__Service__DeletebyAssignment_39"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6989:1: rule__Service__DeletebyAssignment_39 : ( RULE_INTEGER ) ;
    public final void rule__Service__DeletebyAssignment_39() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6993:1: ( ( RULE_INTEGER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6994:1: ( RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6994:1: ( RULE_INTEGER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:6995:1: RULE_INTEGER
            {
             before(grammarAccess.getServiceAccess().getDeletebyINTEGERTerminalRuleCall_39_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__Service__DeletebyAssignment_3913862); 
             after(grammarAccess.getServiceAccess().getDeletebyINTEGERTerminalRuleCall_39_0()); 

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
    // $ANTLR end "rule__Service__DeletebyAssignment_39"


    // $ANTLR start "rule__Service__Exception4Assignment_42"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7004:1: rule__Service__Exception4Assignment_42 : ( ruleRestException ) ;
    public final void rule__Service__Exception4Assignment_42() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7008:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7009:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7009:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7010:1: ruleRestException
            {
             before(grammarAccess.getServiceAccess().getException4RestExceptionParserRuleCall_42_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__Service__Exception4Assignment_4213893);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getException4RestExceptionParserRuleCall_42_0()); 

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
    // $ANTLR end "rule__Service__Exception4Assignment_42"


    // $ANTLR start "rule__Service__DeleteMethodAssignment_44"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7019:1: rule__Service__DeleteMethodAssignment_44 : ( ruleJavaMethod ) ;
    public final void rule__Service__DeleteMethodAssignment_44() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7023:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7024:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7024:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7025:1: ruleJavaMethod
            {
             before(grammarAccess.getServiceAccess().getDeleteMethodJavaMethodParserRuleCall_44_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__Service__DeleteMethodAssignment_4413924);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getServiceAccess().getDeleteMethodJavaMethodParserRuleCall_44_0()); 

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
    // $ANTLR end "rule__Service__DeleteMethodAssignment_44"


    // $ANTLR start "rule__DataAccessObject__NameAssignment_1"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7034:1: rule__DataAccessObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataAccessObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7038:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7039:1: ( RULE_ID )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7039:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7040:1: RULE_ID
            {
             before(grammarAccess.getDataAccessObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataAccessObject__NameAssignment_113955); 
             after(grammarAccess.getDataAccessObjectAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataAccessObject__NameAssignment_1"


    // $ANTLR start "rule__DataAccessObject__CreateDataModelAssignment_4"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7049:1: rule__DataAccessObject__CreateDataModelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__DataAccessObject__CreateDataModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7053:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7054:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7054:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7055:1: ( RULE_ID )
            {
             before(grammarAccess.getDataAccessObjectAccess().getCreateDataModelDataModelCrossReference_4_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7056:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7057:1: RULE_ID
            {
             before(grammarAccess.getDataAccessObjectAccess().getCreateDataModelDataModelIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataAccessObject__CreateDataModelAssignment_413990); 
             after(grammarAccess.getDataAccessObjectAccess().getCreateDataModelDataModelIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDataAccessObjectAccess().getCreateDataModelDataModelCrossReference_4_0()); 

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
    // $ANTLR end "rule__DataAccessObject__CreateDataModelAssignment_4"


    // $ANTLR start "rule__DataAccessObject__Exception1Assignment_7"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7068:1: rule__DataAccessObject__Exception1Assignment_7 : ( ruleRestException ) ;
    public final void rule__DataAccessObject__Exception1Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7072:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7073:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7073:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7074:1: ruleRestException
            {
             before(grammarAccess.getDataAccessObjectAccess().getException1RestExceptionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__DataAccessObject__Exception1Assignment_714025);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getDataAccessObjectAccess().getException1RestExceptionParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__DataAccessObject__Exception1Assignment_7"


    // $ANTLR start "rule__DataAccessObject__CreateMethodAssignment_9"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7083:1: rule__DataAccessObject__CreateMethodAssignment_9 : ( ruleJavaMethod ) ;
    public final void rule__DataAccessObject__CreateMethodAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7087:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7088:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7088:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7089:1: ruleJavaMethod
            {
             before(grammarAccess.getDataAccessObjectAccess().getCreateMethodJavaMethodParserRuleCall_9_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__DataAccessObject__CreateMethodAssignment_914056);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getDataAccessObjectAccess().getCreateMethodJavaMethodParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__DataAccessObject__CreateMethodAssignment_9"


    // $ANTLR start "rule__DataAccessObject__CreatedDataModelAssignment_11"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7098:1: rule__DataAccessObject__CreatedDataModelAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__DataAccessObject__CreatedDataModelAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7102:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7103:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7103:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7104:1: ( RULE_ID )
            {
             before(grammarAccess.getDataAccessObjectAccess().getCreatedDataModelDataModelCrossReference_11_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7105:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7106:1: RULE_ID
            {
             before(grammarAccess.getDataAccessObjectAccess().getCreatedDataModelDataModelIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataAccessObject__CreatedDataModelAssignment_1114091); 
             after(grammarAccess.getDataAccessObjectAccess().getCreatedDataModelDataModelIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getDataAccessObjectAccess().getCreatedDataModelDataModelCrossReference_11_0()); 

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
    // $ANTLR end "rule__DataAccessObject__CreatedDataModelAssignment_11"


    // $ANTLR start "rule__DataAccessObject__FindbyAssignment_15"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7117:1: rule__DataAccessObject__FindbyAssignment_15 : ( RULE_INTEGER ) ;
    public final void rule__DataAccessObject__FindbyAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7121:1: ( ( RULE_INTEGER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7122:1: ( RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7122:1: ( RULE_INTEGER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7123:1: RULE_INTEGER
            {
             before(grammarAccess.getDataAccessObjectAccess().getFindbyINTEGERTerminalRuleCall_15_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__DataAccessObject__FindbyAssignment_1514126); 
             after(grammarAccess.getDataAccessObjectAccess().getFindbyINTEGERTerminalRuleCall_15_0()); 

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
    // $ANTLR end "rule__DataAccessObject__FindbyAssignment_15"


    // $ANTLR start "rule__DataAccessObject__Exception2Assignment_18"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7132:1: rule__DataAccessObject__Exception2Assignment_18 : ( ruleRestException ) ;
    public final void rule__DataAccessObject__Exception2Assignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7136:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7137:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7137:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7138:1: ruleRestException
            {
             before(grammarAccess.getDataAccessObjectAccess().getException2RestExceptionParserRuleCall_18_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__DataAccessObject__Exception2Assignment_1814157);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getDataAccessObjectAccess().getException2RestExceptionParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__DataAccessObject__Exception2Assignment_18"


    // $ANTLR start "rule__DataAccessObject__FindMethodAssignment_20"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7147:1: rule__DataAccessObject__FindMethodAssignment_20 : ( ruleJavaMethod ) ;
    public final void rule__DataAccessObject__FindMethodAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7151:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7152:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7152:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7153:1: ruleJavaMethod
            {
             before(grammarAccess.getDataAccessObjectAccess().getFindMethodJavaMethodParserRuleCall_20_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__DataAccessObject__FindMethodAssignment_2014188);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getDataAccessObjectAccess().getFindMethodJavaMethodParserRuleCall_20_0()); 

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
    // $ANTLR end "rule__DataAccessObject__FindMethodAssignment_20"


    // $ANTLR start "rule__DataAccessObject__FoundDataModelAssignment_22"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7162:1: rule__DataAccessObject__FoundDataModelAssignment_22 : ( ( RULE_ID ) ) ;
    public final void rule__DataAccessObject__FoundDataModelAssignment_22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7166:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7167:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7167:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7168:1: ( RULE_ID )
            {
             before(grammarAccess.getDataAccessObjectAccess().getFoundDataModelDataModelCrossReference_22_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7169:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7170:1: RULE_ID
            {
             before(grammarAccess.getDataAccessObjectAccess().getFoundDataModelDataModelIDTerminalRuleCall_22_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataAccessObject__FoundDataModelAssignment_2214223); 
             after(grammarAccess.getDataAccessObjectAccess().getFoundDataModelDataModelIDTerminalRuleCall_22_0_1()); 

            }

             after(grammarAccess.getDataAccessObjectAccess().getFoundDataModelDataModelCrossReference_22_0()); 

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
    // $ANTLR end "rule__DataAccessObject__FoundDataModelAssignment_22"


    // $ANTLR start "rule__DataAccessObject__UpdatebyAssignment_26"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7181:1: rule__DataAccessObject__UpdatebyAssignment_26 : ( RULE_INTEGER ) ;
    public final void rule__DataAccessObject__UpdatebyAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7185:1: ( ( RULE_INTEGER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7186:1: ( RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7186:1: ( RULE_INTEGER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7187:1: RULE_INTEGER
            {
             before(grammarAccess.getDataAccessObjectAccess().getUpdatebyINTEGERTerminalRuleCall_26_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__DataAccessObject__UpdatebyAssignment_2614258); 
             after(grammarAccess.getDataAccessObjectAccess().getUpdatebyINTEGERTerminalRuleCall_26_0()); 

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
    // $ANTLR end "rule__DataAccessObject__UpdatebyAssignment_26"


    // $ANTLR start "rule__DataAccessObject__UpdateDataModelAssignment_28"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7196:1: rule__DataAccessObject__UpdateDataModelAssignment_28 : ( ( RULE_ID ) ) ;
    public final void rule__DataAccessObject__UpdateDataModelAssignment_28() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7200:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7201:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7201:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7202:1: ( RULE_ID )
            {
             before(grammarAccess.getDataAccessObjectAccess().getUpdateDataModelDataModelCrossReference_28_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7203:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7204:1: RULE_ID
            {
             before(grammarAccess.getDataAccessObjectAccess().getUpdateDataModelDataModelIDTerminalRuleCall_28_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataAccessObject__UpdateDataModelAssignment_2814293); 
             after(grammarAccess.getDataAccessObjectAccess().getUpdateDataModelDataModelIDTerminalRuleCall_28_0_1()); 

            }

             after(grammarAccess.getDataAccessObjectAccess().getUpdateDataModelDataModelCrossReference_28_0()); 

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
    // $ANTLR end "rule__DataAccessObject__UpdateDataModelAssignment_28"


    // $ANTLR start "rule__DataAccessObject__Exception3Assignment_31"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7215:1: rule__DataAccessObject__Exception3Assignment_31 : ( ruleRestException ) ;
    public final void rule__DataAccessObject__Exception3Assignment_31() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7219:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7220:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7220:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7221:1: ruleRestException
            {
             before(grammarAccess.getDataAccessObjectAccess().getException3RestExceptionParserRuleCall_31_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__DataAccessObject__Exception3Assignment_3114328);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getDataAccessObjectAccess().getException3RestExceptionParserRuleCall_31_0()); 

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
    // $ANTLR end "rule__DataAccessObject__Exception3Assignment_31"


    // $ANTLR start "rule__DataAccessObject__UpdateMethodAssignment_33"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7230:1: rule__DataAccessObject__UpdateMethodAssignment_33 : ( ruleJavaMethod ) ;
    public final void rule__DataAccessObject__UpdateMethodAssignment_33() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7234:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7235:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7235:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7236:1: ruleJavaMethod
            {
             before(grammarAccess.getDataAccessObjectAccess().getUpdateMethodJavaMethodParserRuleCall_33_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__DataAccessObject__UpdateMethodAssignment_3314359);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getDataAccessObjectAccess().getUpdateMethodJavaMethodParserRuleCall_33_0()); 

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
    // $ANTLR end "rule__DataAccessObject__UpdateMethodAssignment_33"


    // $ANTLR start "rule__DataAccessObject__UpdatedDataModelAssignment_35"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7245:1: rule__DataAccessObject__UpdatedDataModelAssignment_35 : ( ( RULE_ID ) ) ;
    public final void rule__DataAccessObject__UpdatedDataModelAssignment_35() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7249:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7250:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7250:1: ( ( RULE_ID ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7251:1: ( RULE_ID )
            {
             before(grammarAccess.getDataAccessObjectAccess().getUpdatedDataModelDataModelCrossReference_35_0()); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7252:1: ( RULE_ID )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7253:1: RULE_ID
            {
             before(grammarAccess.getDataAccessObjectAccess().getUpdatedDataModelDataModelIDTerminalRuleCall_35_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataAccessObject__UpdatedDataModelAssignment_3514394); 
             after(grammarAccess.getDataAccessObjectAccess().getUpdatedDataModelDataModelIDTerminalRuleCall_35_0_1()); 

            }

             after(grammarAccess.getDataAccessObjectAccess().getUpdatedDataModelDataModelCrossReference_35_0()); 

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
    // $ANTLR end "rule__DataAccessObject__UpdatedDataModelAssignment_35"


    // $ANTLR start "rule__DataAccessObject__DeletebyAssignment_39"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7264:1: rule__DataAccessObject__DeletebyAssignment_39 : ( RULE_INTEGER ) ;
    public final void rule__DataAccessObject__DeletebyAssignment_39() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7268:1: ( ( RULE_INTEGER ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7269:1: ( RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7269:1: ( RULE_INTEGER )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7270:1: RULE_INTEGER
            {
             before(grammarAccess.getDataAccessObjectAccess().getDeletebyINTEGERTerminalRuleCall_39_0()); 
            match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_rule__DataAccessObject__DeletebyAssignment_3914429); 
             after(grammarAccess.getDataAccessObjectAccess().getDeletebyINTEGERTerminalRuleCall_39_0()); 

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
    // $ANTLR end "rule__DataAccessObject__DeletebyAssignment_39"


    // $ANTLR start "rule__DataAccessObject__Exception4Assignment_42"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7279:1: rule__DataAccessObject__Exception4Assignment_42 : ( ruleRestException ) ;
    public final void rule__DataAccessObject__Exception4Assignment_42() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7283:1: ( ( ruleRestException ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7284:1: ( ruleRestException )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7284:1: ( ruleRestException )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7285:1: ruleRestException
            {
             before(grammarAccess.getDataAccessObjectAccess().getException4RestExceptionParserRuleCall_42_0()); 
            pushFollow(FOLLOW_ruleRestException_in_rule__DataAccessObject__Exception4Assignment_4214460);
            ruleRestException();

            state._fsp--;

             after(grammarAccess.getDataAccessObjectAccess().getException4RestExceptionParserRuleCall_42_0()); 

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
    // $ANTLR end "rule__DataAccessObject__Exception4Assignment_42"


    // $ANTLR start "rule__DataAccessObject__DeleteMethodAssignment_44"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7294:1: rule__DataAccessObject__DeleteMethodAssignment_44 : ( ruleJavaMethod ) ;
    public final void rule__DataAccessObject__DeleteMethodAssignment_44() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7298:1: ( ( ruleJavaMethod ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7299:1: ( ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7299:1: ( ruleJavaMethod )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7300:1: ruleJavaMethod
            {
             before(grammarAccess.getDataAccessObjectAccess().getDeleteMethodJavaMethodParserRuleCall_44_0()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_rule__DataAccessObject__DeleteMethodAssignment_4414491);
            ruleJavaMethod();

            state._fsp--;

             after(grammarAccess.getDataAccessObjectAccess().getDeleteMethodJavaMethodParserRuleCall_44_0()); 

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
    // $ANTLR end "rule__DataAccessObject__DeleteMethodAssignment_44"


    // $ANTLR start "rule__RestException__StatusCodeAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7309:1: rule__RestException__StatusCodeAssignment : ( ruleRestStatusCode ) ;
    public final void rule__RestException__StatusCodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7313:1: ( ( ruleRestStatusCode ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7314:1: ( ruleRestStatusCode )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7314:1: ( ruleRestStatusCode )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7315:1: ruleRestStatusCode
            {
             before(grammarAccess.getRestExceptionAccess().getStatusCodeRestStatusCodeEnumRuleCall_0()); 
            pushFollow(FOLLOW_ruleRestStatusCode_in_rule__RestException__StatusCodeAssignment14522);
            ruleRestStatusCode();

            state._fsp--;

             after(grammarAccess.getRestExceptionAccess().getStatusCodeRestStatusCodeEnumRuleCall_0()); 

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
    // $ANTLR end "rule__RestException__StatusCodeAssignment"


    // $ANTLR start "rule__JavaMethod__CodeAssignment"
    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7324:1: rule__JavaMethod__CodeAssignment : ( RULE_STRING ) ;
    public final void rule__JavaMethod__CodeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7328:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7329:1: ( RULE_STRING )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7329:1: ( RULE_STRING )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:7330:1: RULE_STRING
            {
             before(grammarAccess.getJavaMethodAccess().getCodeSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JavaMethod__CodeAssignment14553); 
             after(grammarAccess.getJavaMethodAccess().getCodeSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__JavaMethod__CodeAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__0_in_ruleDomainModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestAPI_in_entryRuleRestAPI181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestAPI188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestAPI__Group__0_in_ruleRestAPI214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group__0_in_rulePrimitiveType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0_in_ruleDataModel334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestModel_in_entryRuleRestModel361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestModel368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__Group__0_in_ruleRestModel394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModel_in_entryRuleMappingModel421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingModel428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModel__Group__0_in_ruleMappingModel454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__0_in_ruleTransformation514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0_in_ruleService694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAccessObject_in_entryRuleDataAccessObject721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAccessObject728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__0_in_ruleDataAccessObject754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_entryRuleRestException781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestException788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestException__StatusCodeAssignment_in_ruleRestException814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_entryRuleJavaMethod841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaMethod848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaMethod__CodeAssignment_in_ruleJavaMethod874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestStatusCode__Alternatives_in_ruleRestStatusCode911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_rule__Type__Alternatives946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_rule__Type__Alternatives963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestModel_in_rule__Type__Alternatives980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModel_in_rule__Type__Alternatives997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RestStatusCode__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RestStatusCode__Alternatives1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RestStatusCode__Alternatives1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RestStatusCode__Alternatives1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RestStatusCode__Alternatives1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__0__Impl_in_rule__DomainModel__Group__01147 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__1_in_rule__DomainModel__Group__01150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__ElementsAssignment_0_in_rule__DomainModel__Group__0__Impl1177 = new BitSet(new long[]{0x0000000000C60002L});
    public static final BitSet FOLLOW_rule__DomainModel__Group__1__Impl_in_rule__DomainModel__Group__11208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainModel__ApisAssignment_1_in_rule__DomainModel__Group__1__Impl1235 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__RestAPI__Group__0__Impl_in_rule__RestAPI__Group__01270 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__RestAPI__Group__1_in_rule__RestAPI__Group__01273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestAPI__ResourceAssignment_0_in_rule__RestAPI__Group__0__Impl1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestAPI__Group__1__Impl_in_rule__RestAPI__Group__11330 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__RestAPI__Group__2_in_rule__RestAPI__Group__11333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestAPI__ServiceAssignment_1_in_rule__RestAPI__Group__1__Impl1360 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__RestAPI__Group__2__Impl_in_rule__RestAPI__Group__21391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestAPI__DaoAssignment_2_in_rule__RestAPI__Group__2__Impl1418 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group__0__Impl_in_rule__PrimitiveType__Group__01455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group__1_in_rule__PrimitiveType__Group__01458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PrimitiveType__Group__0__Impl1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__Group__1__Impl_in_rule__PrimitiveType__Group__11517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimitiveType__NameAssignment_1_in_rule__PrimitiveType__Group__1__Impl1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__0__Impl_in_rule__DataModel__Group__01578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1_in_rule__DataModel__Group__01581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataModel__Group__0__Impl1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__1__Impl_in_rule__DataModel__Group__11640 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2_in_rule__DataModel__Group__11643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__NameAssignment_1_in_rule__DataModel__Group__1__Impl1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__2__Impl_in_rule__DataModel__Group__21700 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3_in_rule__DataModel__Group__21703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_2__0_in_rule__DataModel__Group__2__Impl1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__3__Impl_in_rule__DataModel__Group__31761 = new BitSet(new long[]{0x0000004000100010L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4_in_rule__DataModel__Group__31764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataModel__Group__3__Impl1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group__4__Impl_in_rule__DataModel__Group__41823 = new BitSet(new long[]{0x0000004000100010L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5_in_rule__DataModel__Group__41826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__FeaturesAssignment_4_in_rule__DataModel__Group__4__Impl1853 = new BitSet(new long[]{0x0000004000000012L});
    public static final BitSet FOLLOW_rule__DataModel__Group__5__Impl_in_rule__DataModel__Group__51884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataModel__Group__5__Impl1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_2__0__Impl_in_rule__DataModel__Group_2__01955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataModel__Group_2__1_in_rule__DataModel__Group_2__01958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DataModel__Group_2__0__Impl1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__Group_2__1__Impl_in_rule__DataModel__Group_2__12017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataModel__SuperTypeAssignment_2_1_in_rule__DataModel__Group_2__1__Impl2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__Group__0__Impl_in_rule__RestModel__Group__02078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RestModel__Group__1_in_rule__RestModel__Group__02081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RestModel__Group__0__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__Group__1__Impl_in_rule__RestModel__Group__12140 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__RestModel__Group__2_in_rule__RestModel__Group__12143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__NameAssignment_1_in_rule__RestModel__Group__1__Impl2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__Group__2__Impl_in_rule__RestModel__Group__22200 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_rule__RestModel__Group__3_in_rule__RestModel__Group__22203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__Group_2__0_in_rule__RestModel__Group__2__Impl2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__Group__3__Impl_in_rule__RestModel__Group__32261 = new BitSet(new long[]{0x0000004000100010L});
    public static final BitSet FOLLOW_rule__RestModel__Group__4_in_rule__RestModel__Group__32264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RestModel__Group__3__Impl2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__Group__4__Impl_in_rule__RestModel__Group__42323 = new BitSet(new long[]{0x0000004000100010L});
    public static final BitSet FOLLOW_rule__RestModel__Group__5_in_rule__RestModel__Group__42326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__FeaturesAssignment_4_in_rule__RestModel__Group__4__Impl2353 = new BitSet(new long[]{0x0000004000000012L});
    public static final BitSet FOLLOW_rule__RestModel__Group__5__Impl_in_rule__RestModel__Group__52384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RestModel__Group__5__Impl2412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__Group_2__0__Impl_in_rule__RestModel__Group_2__02455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RestModel__Group_2__1_in_rule__RestModel__Group_2__02458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RestModel__Group_2__0__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__Group_2__1__Impl_in_rule__RestModel__Group_2__12517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RestModel__SuperTypeAssignment_2_1_in_rule__RestModel__Group_2__1__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModel__Group__0__Impl_in_rule__MappingModel__Group__02578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MappingModel__Group__1_in_rule__MappingModel__Group__02581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MappingModel__Group__0__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModel__Group__1__Impl_in_rule__MappingModel__Group__12640 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__MappingModel__Group__2_in_rule__MappingModel__Group__12643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModel__NameAssignment_1_in_rule__MappingModel__Group__1__Impl2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModel__Group__2__Impl_in_rule__MappingModel__Group__22700 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__MappingModel__Group__3_in_rule__MappingModel__Group__22703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__MappingModel__Group__2__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModel__Group__3__Impl_in_rule__MappingModel__Group__32762 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__MappingModel__Group__4_in_rule__MappingModel__Group__32765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MappingModel__TransformationAssignment_3_in_rule__MappingModel__Group__3__Impl2792 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__MappingModel__Group__4__Impl_in_rule__MappingModel__Group__42823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__MappingModel__Group__4__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__0__Impl_in_rule__Transformation__Group__02892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1_in_rule__Transformation__Group__02895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Transformation__Group__0__Impl2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__1__Impl_in_rule__Transformation__Group__12954 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2_in_rule__Transformation__Group__12957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__DataModelAssignment_1_in_rule__Transformation__Group__1__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__2__Impl_in_rule__Transformation__Group__23014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3_in_rule__Transformation__Group__23017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Transformation__Group__2__Impl3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__3__Impl_in_rule__Transformation__Group__33076 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4_in_rule__Transformation__Group__33079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__RestModelAssignment_3_in_rule__Transformation__Group__3__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transformation__Group__4__Impl_in_rule__Transformation__Group__43136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Transformation__Group__4__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__03205 = new BitSet(new long[]{0x0000004000000010L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__03208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ManyAssignment_0_in_rule__Feature__Group__0__Impl3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__13266 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Feature__Group__2_in_rule__Feature__Group__13269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl3296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__2__Impl_in_rule__Feature__Group__23326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Feature__Group__3_in_rule__Feature__Group__23329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Feature__Group__2__Impl3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__3__Impl_in_rule__Feature__Group__33388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_3_in_rule__Feature__Group__3__Impl3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__03453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__03456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Resource__Group__0__Impl3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__13515 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__13518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__23575 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__23578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Resource__Group__2__Impl3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__33637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__4_in_rule__Resource__Group__33640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Resource__Group__3__Impl3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__4__Impl_in_rule__Resource__Group__43699 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__5_in_rule__Resource__Group__43702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__CreateRestModelAssignment_4_in_rule__Resource__Group__4__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__5__Impl_in_rule__Resource__Group__53759 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__6_in_rule__Resource__Group__53762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Resource__Group__5__Impl3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__6__Impl_in_rule__Resource__Group__63821 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Resource__Group__7_in_rule__Resource__Group__63824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Resource__Group__6__Impl3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__7__Impl_in_rule__Resource__Group__73883 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Resource__Group__8_in_rule__Resource__Group__73886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Exception1Assignment_7_in_rule__Resource__Group__7__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__8__Impl_in_rule__Resource__Group__83943 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Resource__Group__9_in_rule__Resource__Group__83946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Resource__Group__8__Impl3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__9__Impl_in_rule__Resource__Group__94005 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__10_in_rule__Resource__Group__94008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__CreateMethodAssignment_9_in_rule__Resource__Group__9__Impl4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__10__Impl_in_rule__Resource__Group__104065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__11_in_rule__Resource__Group__104068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Resource__Group__10__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__11__Impl_in_rule__Resource__Group__114127 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Resource__Group__12_in_rule__Resource__Group__114130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__CreatedRestModelAssignment_11_in_rule__Resource__Group__11__Impl4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__12__Impl_in_rule__Resource__Group__124187 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__13_in_rule__Resource__Group__124190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Resource__Group__12__Impl4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__13__Impl_in_rule__Resource__Group__134249 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__14_in_rule__Resource__Group__134252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Resource__Group__13__Impl4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__14__Impl_in_rule__Resource__Group__144311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Resource__Group__15_in_rule__Resource__Group__144314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Resource__Group__14__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__15__Impl_in_rule__Resource__Group__154373 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__16_in_rule__Resource__Group__154376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__FindbyAssignment_15_in_rule__Resource__Group__15__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__16__Impl_in_rule__Resource__Group__164433 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__17_in_rule__Resource__Group__164436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Resource__Group__16__Impl4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__17__Impl_in_rule__Resource__Group__174495 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Resource__Group__18_in_rule__Resource__Group__174498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Resource__Group__17__Impl4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__18__Impl_in_rule__Resource__Group__184557 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Resource__Group__19_in_rule__Resource__Group__184560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Exception2Assignment_18_in_rule__Resource__Group__18__Impl4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__19__Impl_in_rule__Resource__Group__194617 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Resource__Group__20_in_rule__Resource__Group__194620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Resource__Group__19__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__20__Impl_in_rule__Resource__Group__204679 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__21_in_rule__Resource__Group__204682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__FindMethodAssignment_20_in_rule__Resource__Group__20__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__21__Impl_in_rule__Resource__Group__214739 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__22_in_rule__Resource__Group__214742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Resource__Group__21__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__22__Impl_in_rule__Resource__Group__224801 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Resource__Group__23_in_rule__Resource__Group__224804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__FoundRestModelAssignment_22_in_rule__Resource__Group__22__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__23__Impl_in_rule__Resource__Group__234861 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__24_in_rule__Resource__Group__234864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Resource__Group__23__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__24__Impl_in_rule__Resource__Group__244923 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__25_in_rule__Resource__Group__244926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Resource__Group__24__Impl4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__25__Impl_in_rule__Resource__Group__254985 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Resource__Group__26_in_rule__Resource__Group__254988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Resource__Group__25__Impl5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__26__Impl_in_rule__Resource__Group__265047 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__27_in_rule__Resource__Group__265050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__UpdatebyAssignment_26_in_rule__Resource__Group__26__Impl5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__27__Impl_in_rule__Resource__Group__275107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__28_in_rule__Resource__Group__275110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Resource__Group__27__Impl5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__28__Impl_in_rule__Resource__Group__285169 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__29_in_rule__Resource__Group__285172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__UpdateRestModelAssignment_28_in_rule__Resource__Group__28__Impl5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__29__Impl_in_rule__Resource__Group__295229 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__30_in_rule__Resource__Group__295232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Resource__Group__29__Impl5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__30__Impl_in_rule__Resource__Group__305291 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Resource__Group__31_in_rule__Resource__Group__305294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Resource__Group__30__Impl5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__31__Impl_in_rule__Resource__Group__315353 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Resource__Group__32_in_rule__Resource__Group__315356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Exception3Assignment_31_in_rule__Resource__Group__31__Impl5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__32__Impl_in_rule__Resource__Group__325413 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Resource__Group__33_in_rule__Resource__Group__325416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Resource__Group__32__Impl5444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__33__Impl_in_rule__Resource__Group__335475 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__34_in_rule__Resource__Group__335478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__UpdateMethodAssignment_33_in_rule__Resource__Group__33__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__34__Impl_in_rule__Resource__Group__345535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__35_in_rule__Resource__Group__345538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Resource__Group__34__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__35__Impl_in_rule__Resource__Group__355597 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Resource__Group__36_in_rule__Resource__Group__355600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__UpdatedRestModelAssignment_35_in_rule__Resource__Group__35__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__36__Impl_in_rule__Resource__Group__365657 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__37_in_rule__Resource__Group__365660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Resource__Group__36__Impl5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__37__Impl_in_rule__Resource__Group__375719 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__38_in_rule__Resource__Group__375722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Resource__Group__37__Impl5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__38__Impl_in_rule__Resource__Group__385781 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Resource__Group__39_in_rule__Resource__Group__385784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Resource__Group__38__Impl5812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__39__Impl_in_rule__Resource__Group__395843 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__40_in_rule__Resource__Group__395846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__DeletebyAssignment_39_in_rule__Resource__Group__39__Impl5873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__40__Impl_in_rule__Resource__Group__405903 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__41_in_rule__Resource__Group__405906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Resource__Group__40__Impl5934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__41__Impl_in_rule__Resource__Group__415965 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Resource__Group__42_in_rule__Resource__Group__415968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Resource__Group__41__Impl5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__42__Impl_in_rule__Resource__Group__426027 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Resource__Group__43_in_rule__Resource__Group__426030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Exception4Assignment_42_in_rule__Resource__Group__42__Impl6057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__43__Impl_in_rule__Resource__Group__436087 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Resource__Group__44_in_rule__Resource__Group__436090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Resource__Group__43__Impl6118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__44__Impl_in_rule__Resource__Group__446149 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Resource__Group__45_in_rule__Resource__Group__446152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__DeleteMethodAssignment_44_in_rule__Resource__Group__44__Impl6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__45__Impl_in_rule__Resource__Group__456209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Resource__Group__45__Impl6237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__0__Impl_in_rule__Service__Group__06360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__1_in_rule__Service__Group__06363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Service__Group__0__Impl6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__1__Impl_in_rule__Service__Group__16422 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Service__Group__2_in_rule__Service__Group__16425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__NameAssignment_1_in_rule__Service__Group__1__Impl6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__2__Impl_in_rule__Service__Group__26482 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Service__Group__3_in_rule__Service__Group__26485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Service__Group__2__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__3__Impl_in_rule__Service__Group__36544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__4_in_rule__Service__Group__36547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Service__Group__3__Impl6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__4__Impl_in_rule__Service__Group__46606 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Service__Group__5_in_rule__Service__Group__46609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__CreateDataModelAssignment_4_in_rule__Service__Group__4__Impl6636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__5__Impl_in_rule__Service__Group__56666 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Service__Group__6_in_rule__Service__Group__56669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Service__Group__5__Impl6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__6__Impl_in_rule__Service__Group__66728 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Service__Group__7_in_rule__Service__Group__66731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Service__Group__6__Impl6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__7__Impl_in_rule__Service__Group__76790 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Service__Group__8_in_rule__Service__Group__76793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Exception1Assignment_7_in_rule__Service__Group__7__Impl6820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__8__Impl_in_rule__Service__Group__86850 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Service__Group__9_in_rule__Service__Group__86853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__8__Impl6881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__9__Impl_in_rule__Service__Group__96912 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Service__Group__10_in_rule__Service__Group__96915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__CreateMethodAssignment_9_in_rule__Service__Group__9__Impl6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__10__Impl_in_rule__Service__Group__106972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__11_in_rule__Service__Group__106975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Service__Group__10__Impl7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__11__Impl_in_rule__Service__Group__117034 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Service__Group__12_in_rule__Service__Group__117037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__CreatedDataModelAssignment_11_in_rule__Service__Group__11__Impl7064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__12__Impl_in_rule__Service__Group__127094 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Service__Group__13_in_rule__Service__Group__127097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Service__Group__12__Impl7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__13__Impl_in_rule__Service__Group__137156 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Service__Group__14_in_rule__Service__Group__137159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Service__Group__13__Impl7187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__14__Impl_in_rule__Service__Group__147218 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Service__Group__15_in_rule__Service__Group__147221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Service__Group__14__Impl7249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__15__Impl_in_rule__Service__Group__157280 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Service__Group__16_in_rule__Service__Group__157283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__FindbyAssignment_15_in_rule__Service__Group__15__Impl7310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__16__Impl_in_rule__Service__Group__167340 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Service__Group__17_in_rule__Service__Group__167343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Service__Group__16__Impl7371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__17__Impl_in_rule__Service__Group__177402 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Service__Group__18_in_rule__Service__Group__177405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Service__Group__17__Impl7433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__18__Impl_in_rule__Service__Group__187464 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Service__Group__19_in_rule__Service__Group__187467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Exception2Assignment_18_in_rule__Service__Group__18__Impl7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__19__Impl_in_rule__Service__Group__197524 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Service__Group__20_in_rule__Service__Group__197527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__19__Impl7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__20__Impl_in_rule__Service__Group__207586 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Service__Group__21_in_rule__Service__Group__207589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__FindMethodAssignment_20_in_rule__Service__Group__20__Impl7616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__21__Impl_in_rule__Service__Group__217646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__22_in_rule__Service__Group__217649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Service__Group__21__Impl7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__22__Impl_in_rule__Service__Group__227708 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Service__Group__23_in_rule__Service__Group__227711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__FoundDataModelAssignment_22_in_rule__Service__Group__22__Impl7738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__23__Impl_in_rule__Service__Group__237768 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Service__Group__24_in_rule__Service__Group__237771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Service__Group__23__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__24__Impl_in_rule__Service__Group__247830 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Service__Group__25_in_rule__Service__Group__247833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Service__Group__24__Impl7861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__25__Impl_in_rule__Service__Group__257892 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Service__Group__26_in_rule__Service__Group__257895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Service__Group__25__Impl7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__26__Impl_in_rule__Service__Group__267954 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Service__Group__27_in_rule__Service__Group__267957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__UpdatebyAssignment_26_in_rule__Service__Group__26__Impl7984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__27__Impl_in_rule__Service__Group__278014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__28_in_rule__Service__Group__278017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Service__Group__27__Impl8045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__28__Impl_in_rule__Service__Group__288076 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Service__Group__29_in_rule__Service__Group__288079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__UpdateDataModelAssignment_28_in_rule__Service__Group__28__Impl8106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__29__Impl_in_rule__Service__Group__298136 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Service__Group__30_in_rule__Service__Group__298139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Service__Group__29__Impl8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__30__Impl_in_rule__Service__Group__308198 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Service__Group__31_in_rule__Service__Group__308201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Service__Group__30__Impl8229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__31__Impl_in_rule__Service__Group__318260 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Service__Group__32_in_rule__Service__Group__318263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Exception3Assignment_31_in_rule__Service__Group__31__Impl8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__32__Impl_in_rule__Service__Group__328320 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Service__Group__33_in_rule__Service__Group__328323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__32__Impl8351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__33__Impl_in_rule__Service__Group__338382 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Service__Group__34_in_rule__Service__Group__338385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__UpdateMethodAssignment_33_in_rule__Service__Group__33__Impl8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__34__Impl_in_rule__Service__Group__348442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Service__Group__35_in_rule__Service__Group__348445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Service__Group__34__Impl8473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__35__Impl_in_rule__Service__Group__358504 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Service__Group__36_in_rule__Service__Group__358507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__UpdatedDataModelAssignment_35_in_rule__Service__Group__35__Impl8534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__36__Impl_in_rule__Service__Group__368564 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Service__Group__37_in_rule__Service__Group__368567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Service__Group__36__Impl8595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__37__Impl_in_rule__Service__Group__378626 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Service__Group__38_in_rule__Service__Group__378629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Service__Group__37__Impl8657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__38__Impl_in_rule__Service__Group__388688 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Service__Group__39_in_rule__Service__Group__388691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Service__Group__38__Impl8719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__39__Impl_in_rule__Service__Group__398750 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Service__Group__40_in_rule__Service__Group__398753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__DeletebyAssignment_39_in_rule__Service__Group__39__Impl8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__40__Impl_in_rule__Service__Group__408810 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Service__Group__41_in_rule__Service__Group__408813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Service__Group__40__Impl8841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__41__Impl_in_rule__Service__Group__418872 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__Service__Group__42_in_rule__Service__Group__418875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Service__Group__41__Impl8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__42__Impl_in_rule__Service__Group__428934 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Service__Group__43_in_rule__Service__Group__428937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Exception4Assignment_42_in_rule__Service__Group__42__Impl8964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__43__Impl_in_rule__Service__Group__438994 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Service__Group__44_in_rule__Service__Group__438997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Service__Group__43__Impl9025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__44__Impl_in_rule__Service__Group__449056 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Service__Group__45_in_rule__Service__Group__449059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__DeleteMethodAssignment_44_in_rule__Service__Group__44__Impl9086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Service__Group__45__Impl_in_rule__Service__Group__459116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Service__Group__45__Impl9144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__0__Impl_in_rule__DataAccessObject__Group__09267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__1_in_rule__DataAccessObject__Group__09270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DataAccessObject__Group__0__Impl9298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__1__Impl_in_rule__DataAccessObject__Group__19329 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__2_in_rule__DataAccessObject__Group__19332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__NameAssignment_1_in_rule__DataAccessObject__Group__1__Impl9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__2__Impl_in_rule__DataAccessObject__Group__29389 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__3_in_rule__DataAccessObject__Group__29392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DataAccessObject__Group__2__Impl9420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__3__Impl_in_rule__DataAccessObject__Group__39451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__4_in_rule__DataAccessObject__Group__39454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataAccessObject__Group__3__Impl9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__4__Impl_in_rule__DataAccessObject__Group__49513 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__5_in_rule__DataAccessObject__Group__49516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__CreateDataModelAssignment_4_in_rule__DataAccessObject__Group__4__Impl9543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__5__Impl_in_rule__DataAccessObject__Group__59573 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__6_in_rule__DataAccessObject__Group__59576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataAccessObject__Group__5__Impl9604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__6__Impl_in_rule__DataAccessObject__Group__69635 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__7_in_rule__DataAccessObject__Group__69638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataAccessObject__Group__6__Impl9666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__7__Impl_in_rule__DataAccessObject__Group__79697 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__8_in_rule__DataAccessObject__Group__79700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Exception1Assignment_7_in_rule__DataAccessObject__Group__7__Impl9727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__8__Impl_in_rule__DataAccessObject__Group__89757 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__9_in_rule__DataAccessObject__Group__89760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataAccessObject__Group__8__Impl9788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__9__Impl_in_rule__DataAccessObject__Group__99819 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__10_in_rule__DataAccessObject__Group__99822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__CreateMethodAssignment_9_in_rule__DataAccessObject__Group__9__Impl9849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__10__Impl_in_rule__DataAccessObject__Group__109879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__11_in_rule__DataAccessObject__Group__109882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DataAccessObject__Group__10__Impl9910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__11__Impl_in_rule__DataAccessObject__Group__119941 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__12_in_rule__DataAccessObject__Group__119944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__CreatedDataModelAssignment_11_in_rule__DataAccessObject__Group__11__Impl9971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__12__Impl_in_rule__DataAccessObject__Group__1210001 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__13_in_rule__DataAccessObject__Group__1210004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataAccessObject__Group__12__Impl10032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__13__Impl_in_rule__DataAccessObject__Group__1310063 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__14_in_rule__DataAccessObject__Group__1310066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DataAccessObject__Group__13__Impl10094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__14__Impl_in_rule__DataAccessObject__Group__1410125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__15_in_rule__DataAccessObject__Group__1410128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataAccessObject__Group__14__Impl10156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__15__Impl_in_rule__DataAccessObject__Group__1510187 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__16_in_rule__DataAccessObject__Group__1510190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__FindbyAssignment_15_in_rule__DataAccessObject__Group__15__Impl10217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__16__Impl_in_rule__DataAccessObject__Group__1610247 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__17_in_rule__DataAccessObject__Group__1610250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataAccessObject__Group__16__Impl10278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__17__Impl_in_rule__DataAccessObject__Group__1710309 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__18_in_rule__DataAccessObject__Group__1710312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataAccessObject__Group__17__Impl10340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__18__Impl_in_rule__DataAccessObject__Group__1810371 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__19_in_rule__DataAccessObject__Group__1810374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Exception2Assignment_18_in_rule__DataAccessObject__Group__18__Impl10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__19__Impl_in_rule__DataAccessObject__Group__1910431 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__20_in_rule__DataAccessObject__Group__1910434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataAccessObject__Group__19__Impl10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__20__Impl_in_rule__DataAccessObject__Group__2010493 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__21_in_rule__DataAccessObject__Group__2010496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__FindMethodAssignment_20_in_rule__DataAccessObject__Group__20__Impl10523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__21__Impl_in_rule__DataAccessObject__Group__2110553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__22_in_rule__DataAccessObject__Group__2110556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DataAccessObject__Group__21__Impl10584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__22__Impl_in_rule__DataAccessObject__Group__2210615 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__23_in_rule__DataAccessObject__Group__2210618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__FoundDataModelAssignment_22_in_rule__DataAccessObject__Group__22__Impl10645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__23__Impl_in_rule__DataAccessObject__Group__2310675 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__24_in_rule__DataAccessObject__Group__2310678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataAccessObject__Group__23__Impl10706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__24__Impl_in_rule__DataAccessObject__Group__2410737 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__25_in_rule__DataAccessObject__Group__2410740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DataAccessObject__Group__24__Impl10768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__25__Impl_in_rule__DataAccessObject__Group__2510799 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__26_in_rule__DataAccessObject__Group__2510802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataAccessObject__Group__25__Impl10830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__26__Impl_in_rule__DataAccessObject__Group__2610861 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__27_in_rule__DataAccessObject__Group__2610864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__UpdatebyAssignment_26_in_rule__DataAccessObject__Group__26__Impl10891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__27__Impl_in_rule__DataAccessObject__Group__2710921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__28_in_rule__DataAccessObject__Group__2710924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DataAccessObject__Group__27__Impl10952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__28__Impl_in_rule__DataAccessObject__Group__2810983 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__29_in_rule__DataAccessObject__Group__2810986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__UpdateDataModelAssignment_28_in_rule__DataAccessObject__Group__28__Impl11013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__29__Impl_in_rule__DataAccessObject__Group__2911043 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__30_in_rule__DataAccessObject__Group__2911046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataAccessObject__Group__29__Impl11074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__30__Impl_in_rule__DataAccessObject__Group__3011105 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__31_in_rule__DataAccessObject__Group__3011108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataAccessObject__Group__30__Impl11136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__31__Impl_in_rule__DataAccessObject__Group__3111167 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__32_in_rule__DataAccessObject__Group__3111170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Exception3Assignment_31_in_rule__DataAccessObject__Group__31__Impl11197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__32__Impl_in_rule__DataAccessObject__Group__3211227 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__33_in_rule__DataAccessObject__Group__3211230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataAccessObject__Group__32__Impl11258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__33__Impl_in_rule__DataAccessObject__Group__3311289 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__34_in_rule__DataAccessObject__Group__3311292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__UpdateMethodAssignment_33_in_rule__DataAccessObject__Group__33__Impl11319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__34__Impl_in_rule__DataAccessObject__Group__3411349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__35_in_rule__DataAccessObject__Group__3411352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DataAccessObject__Group__34__Impl11380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__35__Impl_in_rule__DataAccessObject__Group__3511411 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__36_in_rule__DataAccessObject__Group__3511414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__UpdatedDataModelAssignment_35_in_rule__DataAccessObject__Group__35__Impl11441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__36__Impl_in_rule__DataAccessObject__Group__3611471 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__37_in_rule__DataAccessObject__Group__3611474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataAccessObject__Group__36__Impl11502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__37__Impl_in_rule__DataAccessObject__Group__3711533 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__38_in_rule__DataAccessObject__Group__3711536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DataAccessObject__Group__37__Impl11564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__38__Impl_in_rule__DataAccessObject__Group__3811595 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__39_in_rule__DataAccessObject__Group__3811598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataAccessObject__Group__38__Impl11626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__39__Impl_in_rule__DataAccessObject__Group__3911657 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__40_in_rule__DataAccessObject__Group__3911660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__DeletebyAssignment_39_in_rule__DataAccessObject__Group__39__Impl11687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__40__Impl_in_rule__DataAccessObject__Group__4011717 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__41_in_rule__DataAccessObject__Group__4011720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DataAccessObject__Group__40__Impl11748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__41__Impl_in_rule__DataAccessObject__Group__4111779 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__42_in_rule__DataAccessObject__Group__4111782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DataAccessObject__Group__41__Impl11810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__42__Impl_in_rule__DataAccessObject__Group__4211841 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__43_in_rule__DataAccessObject__Group__4211844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Exception4Assignment_42_in_rule__DataAccessObject__Group__42__Impl11871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__43__Impl_in_rule__DataAccessObject__Group__4311901 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__44_in_rule__DataAccessObject__Group__4311904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataAccessObject__Group__43__Impl11932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__44__Impl_in_rule__DataAccessObject__Group__4411963 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__45_in_rule__DataAccessObject__Group__4411966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__DeleteMethodAssignment_44_in_rule__DataAccessObject__Group__44__Impl11993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataAccessObject__Group__45__Impl_in_rule__DataAccessObject__Group__4512023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataAccessObject__Group__45__Impl12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__DomainModel__ElementsAssignment_012179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestAPI_in_rule__DomainModel__ApisAssignment_112210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__RestAPI__ResourceAssignment_012241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_rule__RestAPI__ServiceAssignment_112272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAccessObject_in_rule__RestAPI__DaoAssignment_212303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PrimitiveType__NameAssignment_112334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__NameAssignment_112365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataModel__SuperTypeAssignment_2_112400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__DataModel__FeaturesAssignment_412435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RestModel__NameAssignment_112466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RestModel__SuperTypeAssignment_2_112501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__RestModel__FeaturesAssignment_412536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MappingModel__NameAssignment_112567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformation_in_rule__MappingModel__TransformationAssignment_312598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transformation__DataModelAssignment_112633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transformation__RestModelAssignment_312672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Feature__ManyAssignment_012712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_112751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__TypeAssignment_312786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_112821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__CreateRestModelAssignment_412856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__Resource__Exception1Assignment_712891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__Resource__CreateMethodAssignment_912922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__CreatedRestModelAssignment_1112957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__Resource__FindbyAssignment_1512992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__Resource__Exception2Assignment_1813023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__Resource__FindMethodAssignment_2013054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__FoundRestModelAssignment_2213089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__Resource__UpdatebyAssignment_2613124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__UpdateRestModelAssignment_2813159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__Resource__Exception3Assignment_3113194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__Resource__UpdateMethodAssignment_3313225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__UpdatedRestModelAssignment_3513260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__Resource__DeletebyAssignment_3913295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__Resource__Exception4Assignment_4213326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__Resource__DeleteMethodAssignment_4413357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__NameAssignment_113388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__CreateDataModelAssignment_413423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__Service__Exception1Assignment_713458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__Service__CreateMethodAssignment_913489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__CreatedDataModelAssignment_1113524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__Service__FindbyAssignment_1513559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__Service__Exception2Assignment_1813590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__Service__FindMethodAssignment_2013621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__FoundDataModelAssignment_2213656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__Service__UpdatebyAssignment_2613691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__UpdateDataModelAssignment_2813726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__Service__Exception3Assignment_3113761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__Service__UpdateMethodAssignment_3313792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Service__UpdatedDataModelAssignment_3513827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__Service__DeletebyAssignment_3913862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__Service__Exception4Assignment_4213893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__Service__DeleteMethodAssignment_4413924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataAccessObject__NameAssignment_113955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataAccessObject__CreateDataModelAssignment_413990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__DataAccessObject__Exception1Assignment_714025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__DataAccessObject__CreateMethodAssignment_914056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataAccessObject__CreatedDataModelAssignment_1114091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__DataAccessObject__FindbyAssignment_1514126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__DataAccessObject__Exception2Assignment_1814157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__DataAccessObject__FindMethodAssignment_2014188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataAccessObject__FoundDataModelAssignment_2214223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__DataAccessObject__UpdatebyAssignment_2614258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataAccessObject__UpdateDataModelAssignment_2814293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__DataAccessObject__Exception3Assignment_3114328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__DataAccessObject__UpdateMethodAssignment_3314359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataAccessObject__UpdatedDataModelAssignment_3514394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_rule__DataAccessObject__DeletebyAssignment_3914429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_rule__DataAccessObject__Exception4Assignment_4214460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_rule__DataAccessObject__DeleteMethodAssignment_4414491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestStatusCode_in_rule__RestException__StatusCodeAssignment14522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JavaMethod__CodeAssignment14553 = new BitSet(new long[]{0x0000000000000002L});

}