package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'primitiveType'", "'dataModel'", "'extends'", "'{'", "'}'", "'restModel'", "'mappingModel'", "'('", "'<=>'", "')'", "'many'", "':'", "'Resource'", "'create'", "'throws'", "'return'", "'find'", "'update'", "','", "'delete'", "'Service'", "'DAO'", "'INFORMATIONAL'", "'SUCCESS'", "'REDIRECTION'", "'CLIENT_ERROR'", "'SERVER_ERROR'"
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
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDomainModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleDomainModel= ruleDomainModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_ruleDomainModel_in_entryRuleDomainModel75);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainModel85); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleDomainModel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleType ) )* ( (lv_apis_1_0= ruleRestAPI ) )* ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_apis_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( ( ( (lv_elements_0_0= ruleType ) )* ( (lv_apis_1_0= ruleRestAPI ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( ( (lv_elements_0_0= ruleType ) )* ( (lv_apis_1_0= ruleRestAPI ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( ( (lv_elements_0_0= ruleType ) )* ( (lv_apis_1_0= ruleRestAPI ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: ( (lv_elements_0_0= ruleType ) )* ( (lv_apis_1_0= ruleRestAPI ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:2: ( (lv_elements_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=13)||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_elements_0_0= ruleType )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_elements_0_0= ruleType )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:83:3: lv_elements_0_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getElementsTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleDomainModel131);
            	    lv_elements_0_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:99:3: ( (lv_apis_1_0= ruleRestAPI ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==24) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:100:1: (lv_apis_1_0= ruleRestAPI )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:100:1: (lv_apis_1_0= ruleRestAPI )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:101:3: lv_apis_1_0= ruleRestAPI
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDomainModelAccess().getApisRestAPIParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestAPI_in_ruleDomainModel153);
            	    lv_apis_1_0=ruleRestAPI();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"apis",
            	            		lv_apis_1_0, 
            	            		"RestAPI");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:125:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:126:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:127:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType190);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType200); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:134:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_DataModel_1= ruleDataModel | this_RestModel_2= ruleRestModel | this_MappingModel_3= ruleMappingModel ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_DataModel_1 = null;

        EObject this_RestModel_2 = null;

        EObject this_MappingModel_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:28: ( (this_PrimitiveType_0= rulePrimitiveType | this_DataModel_1= ruleDataModel | this_RestModel_2= ruleRestModel | this_MappingModel_3= ruleMappingModel ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:138:1: (this_PrimitiveType_0= rulePrimitiveType | this_DataModel_1= ruleDataModel | this_RestModel_2= ruleRestModel | this_MappingModel_3= ruleMappingModel )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:138:1: (this_PrimitiveType_0= rulePrimitiveType | this_DataModel_1= ruleDataModel | this_RestModel_2= ruleRestModel | this_MappingModel_3= ruleMappingModel )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:139:5: this_PrimitiveType_0= rulePrimitiveType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveType_in_ruleType247);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;

                     
                            current = this_PrimitiveType_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:149:5: this_DataModel_1= ruleDataModel
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getDataModelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDataModel_in_ruleType274);
                    this_DataModel_1=ruleDataModel();

                    state._fsp--;

                     
                            current = this_DataModel_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:159:5: this_RestModel_2= ruleRestModel
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRestModelParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRestModel_in_ruleType301);
                    this_RestModel_2=ruleRestModel();

                    state._fsp--;

                     
                            current = this_RestModel_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:169:5: this_MappingModel_3= ruleMappingModel
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getMappingModelParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMappingModel_in_ruleType328);
                    this_MappingModel_3=ruleMappingModel();

                    state._fsp--;

                     
                            current = this_MappingModel_3; 
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


    // $ANTLR start "entryRuleRestAPI"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:185:1: entryRuleRestAPI returns [EObject current=null] : iv_ruleRestAPI= ruleRestAPI EOF ;
    public final EObject entryRuleRestAPI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestAPI = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:186:2: (iv_ruleRestAPI= ruleRestAPI EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:187:2: iv_ruleRestAPI= ruleRestAPI EOF
            {
             newCompositeNode(grammarAccess.getRestAPIRule()); 
            pushFollow(FOLLOW_ruleRestAPI_in_entryRuleRestAPI363);
            iv_ruleRestAPI=ruleRestAPI();

            state._fsp--;

             current =iv_ruleRestAPI; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestAPI373); 

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
    // $ANTLR end "entryRuleRestAPI"


    // $ANTLR start "ruleRestAPI"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:194:1: ruleRestAPI returns [EObject current=null] : ( ( (lv_resource_0_0= ruleResource ) ) ( (lv_service_1_0= ruleService ) )* ( (lv_dao_2_0= ruleDataAccessObject ) )* ) ;
    public final EObject ruleRestAPI() throws RecognitionException {
        EObject current = null;

        EObject lv_resource_0_0 = null;

        EObject lv_service_1_0 = null;

        EObject lv_dao_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:28: ( ( ( (lv_resource_0_0= ruleResource ) ) ( (lv_service_1_0= ruleService ) )* ( (lv_dao_2_0= ruleDataAccessObject ) )* ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:1: ( ( (lv_resource_0_0= ruleResource ) ) ( (lv_service_1_0= ruleService ) )* ( (lv_dao_2_0= ruleDataAccessObject ) )* )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:1: ( ( (lv_resource_0_0= ruleResource ) ) ( (lv_service_1_0= ruleService ) )* ( (lv_dao_2_0= ruleDataAccessObject ) )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:2: ( (lv_resource_0_0= ruleResource ) ) ( (lv_service_1_0= ruleService ) )* ( (lv_dao_2_0= ruleDataAccessObject ) )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:2: ( (lv_resource_0_0= ruleResource ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:1: (lv_resource_0_0= ruleResource )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:199:1: (lv_resource_0_0= ruleResource )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:200:3: lv_resource_0_0= ruleResource
            {
             
            	        newCompositeNode(grammarAccess.getRestAPIAccess().getResourceResourceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleResource_in_ruleRestAPI419);
            lv_resource_0_0=ruleResource();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestAPIRule());
            	        }
                   		set(
                   			current, 
                   			"resource",
                    		lv_resource_0_0, 
                    		"Resource");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:216:2: ( (lv_service_1_0= ruleService ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==32) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:217:1: (lv_service_1_0= ruleService )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:217:1: (lv_service_1_0= ruleService )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:218:3: lv_service_1_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestAPIAccess().getServiceServiceParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleRestAPI440);
            	    lv_service_1_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestAPIRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"service",
            	            		lv_service_1_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:234:3: ( (lv_dao_2_0= ruleDataAccessObject ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:1: (lv_dao_2_0= ruleDataAccessObject )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:235:1: (lv_dao_2_0= ruleDataAccessObject )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:236:3: lv_dao_2_0= ruleDataAccessObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestAPIAccess().getDaoDataAccessObjectParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataAccessObject_in_ruleRestAPI462);
            	    lv_dao_2_0=ruleDataAccessObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestAPIRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dao",
            	            		lv_dao_2_0, 
            	            		"DataAccessObject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleRestAPI"


    // $ANTLR start "entryRulePrimitiveType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:260:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:261:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:262:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType499);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType509); 

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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:269:1: rulePrimitiveType returns [EObject current=null] : (otherlv_0= 'primitiveType' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:272:28: ( (otherlv_0= 'primitiveType' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: (otherlv_0= 'primitiveType' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: (otherlv_0= 'primitiveType' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:273:3: otherlv_0= 'primitiveType' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_rulePrimitiveType546); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:277:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:278:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:278:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:279:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveType563); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrimitiveTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleDataModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:304:2: (iv_ruleDataModel= ruleDataModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:305:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel604);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel614); 

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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:312:1: ruleDataModel returns [EObject current=null] : (otherlv_0= 'dataModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:315:28: ( (otherlv_0= 'dataModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:316:1: (otherlv_0= 'dataModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:316:1: (otherlv_0= 'dataModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:316:3: otherlv_0= 'dataModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleDataModel651); 

                	newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getDataModelKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:320:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:321:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:321:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:322:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModel668); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDataModel686); 

                        	newLeafNode(otherlv_2, grammarAccess.getDataModelAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:343:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:344:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataModelRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModel706); 

                    		newLeafNode(otherlv_3, grammarAccess.getDataModelAccess().getSuperTypeDataModelCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDataModel720); 

                	newLeafNode(otherlv_4, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:359:1: ( (lv_features_5_0= ruleFeature ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:360:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:360:1: (lv_features_5_0= ruleFeature )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:361:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataModelAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleDataModel741);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleDataModel754); 

                	newLeafNode(otherlv_6, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleRestModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:389:1: entryRuleRestModel returns [EObject current=null] : iv_ruleRestModel= ruleRestModel EOF ;
    public final EObject entryRuleRestModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:390:2: (iv_ruleRestModel= ruleRestModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:391:2: iv_ruleRestModel= ruleRestModel EOF
            {
             newCompositeNode(grammarAccess.getRestModelRule()); 
            pushFollow(FOLLOW_ruleRestModel_in_entryRuleRestModel790);
            iv_ruleRestModel=ruleRestModel();

            state._fsp--;

             current =iv_ruleRestModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestModel800); 

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
    // $ANTLR end "entryRuleRestModel"


    // $ANTLR start "ruleRestModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:398:1: ruleRestModel returns [EObject current=null] : (otherlv_0= 'restModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleRestModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:401:28: ( (otherlv_0= 'restModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:402:1: (otherlv_0= 'restModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:402:1: (otherlv_0= 'restModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:402:3: otherlv_0= 'restModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleRestModel837); 

                	newLeafNode(otherlv_0, grammarAccess.getRestModelAccess().getRestModelKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:406:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:408:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRestModel854); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRestModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRestModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:424:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleRestModel872); 

                        	newLeafNode(otherlv_2, grammarAccess.getRestModelAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:428:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:429:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:429:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:430:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRestModelRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRestModel892); 

                    		newLeafNode(otherlv_3, grammarAccess.getRestModelAccess().getSuperTypeRestModelCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleRestModel906); 

                	newLeafNode(otherlv_4, grammarAccess.getRestModelAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:445:1: ( (lv_features_5_0= ruleFeature ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:446:1: (lv_features_5_0= ruleFeature )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:446:1: (lv_features_5_0= ruleFeature )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:447:3: lv_features_5_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestModelAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleRestModel927);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_5_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleRestModel940); 

                	newLeafNode(otherlv_6, grammarAccess.getRestModelAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleRestModel"


    // $ANTLR start "entryRuleMappingModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:475:1: entryRuleMappingModel returns [EObject current=null] : iv_ruleMappingModel= ruleMappingModel EOF ;
    public final EObject entryRuleMappingModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappingModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:2: (iv_ruleMappingModel= ruleMappingModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:477:2: iv_ruleMappingModel= ruleMappingModel EOF
            {
             newCompositeNode(grammarAccess.getMappingModelRule()); 
            pushFollow(FOLLOW_ruleMappingModel_in_entryRuleMappingModel976);
            iv_ruleMappingModel=ruleMappingModel();

            state._fsp--;

             current =iv_ruleMappingModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappingModel986); 

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
    // $ANTLR end "entryRuleMappingModel"


    // $ANTLR start "ruleMappingModel"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:484:1: ruleMappingModel returns [EObject current=null] : (otherlv_0= 'mappingModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_transformation_3_0= ruleTransformation ) )* otherlv_4= '}' ) ;
    public final EObject ruleMappingModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_transformation_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:487:28: ( (otherlv_0= 'mappingModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_transformation_3_0= ruleTransformation ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:1: (otherlv_0= 'mappingModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_transformation_3_0= ruleTransformation ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:1: (otherlv_0= 'mappingModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_transformation_3_0= ruleTransformation ) )* otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:488:3: otherlv_0= 'mappingModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_transformation_3_0= ruleTransformation ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMappingModel1023); 

                	newLeafNode(otherlv_0, grammarAccess.getMappingModelAccess().getMappingModelKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:492:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:493:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:493:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:494:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMappingModel1040); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMappingModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleMappingModel1057); 

                	newLeafNode(otherlv_2, grammarAccess.getMappingModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:514:1: ( (lv_transformation_3_0= ruleTransformation ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:1: (lv_transformation_3_0= ruleTransformation )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:515:1: (lv_transformation_3_0= ruleTransformation )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:516:3: lv_transformation_3_0= ruleTransformation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingModelAccess().getTransformationTransformationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransformation_in_ruleMappingModel1078);
            	    lv_transformation_3_0=ruleTransformation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transformation",
            	            		lv_transformation_3_0, 
            	            		"Transformation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMappingModel1091); 

                	newLeafNode(otherlv_4, grammarAccess.getMappingModelAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleMappingModel"


    // $ANTLR start "entryRuleTransformation"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:544:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:545:2: (iv_ruleTransformation= ruleTransformation EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:546:2: iv_ruleTransformation= ruleTransformation EOF
            {
             newCompositeNode(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_ruleTransformation_in_entryRuleTransformation1127);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;

             current =iv_ruleTransformation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformation1137); 

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
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:553:1: ruleTransformation returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=>' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:556:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=>' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=>' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=>' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:557:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=>' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTransformation1174); 

                	newLeafNode(otherlv_0, grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:561:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:562:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:562:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:563:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransformation1194); 

            		newLeafNode(otherlv_1, grammarAccess.getTransformationAccess().getDataModelDataModelCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTransformation1206); 

                	newLeafNode(otherlv_2, grammarAccess.getTransformationAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:578:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:580:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformationRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransformation1226); 

            		newLeafNode(otherlv_3, grammarAccess.getTransformationAccess().getRestModelRestModelCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTransformation1238); 

                	newLeafNode(otherlv_4, grammarAccess.getTransformationAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:603:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:604:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:605:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1274);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1284); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:612:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:615:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:616:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:616:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:616:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:616:2: ( (lv_many_0_0= 'many' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:617:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:617:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:618:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,22,FOLLOW_22_in_ruleFeature1327); 

                            newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:631:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:632:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:632:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:633:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1358); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleFeature1375); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:653:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:654:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:654:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:655:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1395); 

            		newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            	

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleResource"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:674:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:675:2: (iv_ruleResource= ruleResource EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:676:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1431);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1441); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: ruleResource returns [EObject current=null] : (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_findby_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_updateby_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_deleteby_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        EObject lv_exception1_7_0 = null;

        EObject lv_createMethod_9_0 = null;

        EObject lv_exception2_18_0 = null;

        EObject lv_findMethod_20_0 = null;

        EObject lv_exception3_31_0 = null;

        EObject lv_updateMethod_33_0 = null;

        EObject lv_exception4_42_0 = null;

        EObject lv_deleteMethod_44_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:686:28: ( (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:687:3: otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleResource1478); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:691:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:692:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:692:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:693:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1495); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleResource1512); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getCreateKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleResource1524); 

                	newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:717:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:718:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:718:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:719:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1544); 

            		newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getCreateRestModelRestModelCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleResource1556); 

                	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleResource1568); 

                	newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getThrowsKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:738:1: ( (lv_exception1_7_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:739:1: (lv_exception1_7_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:739:1: (lv_exception1_7_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:740:3: lv_exception1_7_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getException1RestExceptionParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleResource1589);
            lv_exception1_7_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"exception1",
                    		lv_exception1_7_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleResource1601); 

                	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:760:1: ( (lv_createMethod_9_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:761:1: (lv_createMethod_9_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:761:1: (lv_createMethod_9_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:762:3: lv_createMethod_9_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getCreateMethodJavaMethodParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleResource1622);
            lv_createMethod_9_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"createMethod",
                    		lv_createMethod_9_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleResource1634); 

                	newLeafNode(otherlv_10, grammarAccess.getResourceAccess().getReturnKeyword_10());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:782:1: ( (otherlv_11= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:783:1: (otherlv_11= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:783:1: (otherlv_11= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:784:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1654); 

            		newLeafNode(otherlv_11, grammarAccess.getResourceAccess().getCreatedRestModelRestModelCrossReference_11_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleResource1666); 

                	newLeafNode(otherlv_12, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_12());
                
            otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleResource1678); 

                	newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getFindKeyword_13());
                
            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleResource1690); 

                	newLeafNode(otherlv_14, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_14());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:807:1: ( (lv_findby_15_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:808:1: (lv_findby_15_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:808:1: (lv_findby_15_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:809:3: lv_findby_15_0= RULE_INTEGER
            {
            lv_findby_15_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleResource1707); 

            			newLeafNode(lv_findby_15_0, grammarAccess.getResourceAccess().getFindbyINTEGERTerminalRuleCall_15_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"findby",
                    		lv_findby_15_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleResource1724); 

                	newLeafNode(otherlv_16, grammarAccess.getResourceAccess().getRightParenthesisKeyword_16());
                
            otherlv_17=(Token)match(input,26,FOLLOW_26_in_ruleResource1736); 

                	newLeafNode(otherlv_17, grammarAccess.getResourceAccess().getThrowsKeyword_17());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:833:1: ( (lv_exception2_18_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_exception2_18_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:834:1: (lv_exception2_18_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:835:3: lv_exception2_18_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getException2RestExceptionParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleResource1757);
            lv_exception2_18_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"exception2",
                    		lv_exception2_18_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleResource1769); 

                	newLeafNode(otherlv_19, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_19());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:855:1: ( (lv_findMethod_20_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:1: (lv_findMethod_20_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:856:1: (lv_findMethod_20_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:857:3: lv_findMethod_20_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getFindMethodJavaMethodParserRuleCall_20_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleResource1790);
            lv_findMethod_20_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"findMethod",
                    		lv_findMethod_20_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_21=(Token)match(input,27,FOLLOW_27_in_ruleResource1802); 

                	newLeafNode(otherlv_21, grammarAccess.getResourceAccess().getReturnKeyword_21());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:877:1: ( (otherlv_22= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:878:1: (otherlv_22= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:878:1: (otherlv_22= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:879:3: otherlv_22= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                    
            otherlv_22=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1822); 

            		newLeafNode(otherlv_22, grammarAccess.getResourceAccess().getFoundRestModelRestModelCrossReference_22_0()); 
            	

            }


            }

            otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleResource1834); 

                	newLeafNode(otherlv_23, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_23());
                
            otherlv_24=(Token)match(input,29,FOLLOW_29_in_ruleResource1846); 

                	newLeafNode(otherlv_24, grammarAccess.getResourceAccess().getUpdateKeyword_24());
                
            otherlv_25=(Token)match(input,19,FOLLOW_19_in_ruleResource1858); 

                	newLeafNode(otherlv_25, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_25());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:902:1: ( (lv_updateby_26_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:903:1: (lv_updateby_26_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:903:1: (lv_updateby_26_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:904:3: lv_updateby_26_0= RULE_INTEGER
            {
            lv_updateby_26_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleResource1875); 

            			newLeafNode(lv_updateby_26_0, grammarAccess.getResourceAccess().getUpdatebyINTEGERTerminalRuleCall_26_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"updateby",
                    		lv_updateby_26_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_27=(Token)match(input,30,FOLLOW_30_in_ruleResource1892); 

                	newLeafNode(otherlv_27, grammarAccess.getResourceAccess().getCommaKeyword_27());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:924:1: ( (otherlv_28= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:925:1: (otherlv_28= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:925:1: (otherlv_28= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:926:3: otherlv_28= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                    
            otherlv_28=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1912); 

            		newLeafNode(otherlv_28, grammarAccess.getResourceAccess().getUpdateRestModelRestModelCrossReference_28_0()); 
            	

            }


            }

            otherlv_29=(Token)match(input,21,FOLLOW_21_in_ruleResource1924); 

                	newLeafNode(otherlv_29, grammarAccess.getResourceAccess().getRightParenthesisKeyword_29());
                
            otherlv_30=(Token)match(input,26,FOLLOW_26_in_ruleResource1936); 

                	newLeafNode(otherlv_30, grammarAccess.getResourceAccess().getThrowsKeyword_30());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:945:1: ( (lv_exception3_31_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:946:1: (lv_exception3_31_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:946:1: (lv_exception3_31_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:947:3: lv_exception3_31_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getException3RestExceptionParserRuleCall_31_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleResource1957);
            lv_exception3_31_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"exception3",
                    		lv_exception3_31_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_32=(Token)match(input,15,FOLLOW_15_in_ruleResource1969); 

                	newLeafNode(otherlv_32, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_32());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:967:1: ( (lv_updateMethod_33_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:1: (lv_updateMethod_33_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:968:1: (lv_updateMethod_33_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:969:3: lv_updateMethod_33_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getUpdateMethodJavaMethodParserRuleCall_33_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleResource1990);
            lv_updateMethod_33_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"updateMethod",
                    		lv_updateMethod_33_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_34=(Token)match(input,27,FOLLOW_27_in_ruleResource2002); 

                	newLeafNode(otherlv_34, grammarAccess.getResourceAccess().getReturnKeyword_34());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:989:1: ( (otherlv_35= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:990:1: (otherlv_35= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:990:1: (otherlv_35= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:991:3: otherlv_35= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                    
            otherlv_35=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource2022); 

            		newLeafNode(otherlv_35, grammarAccess.getResourceAccess().getUpdatedRestModelRestModelCrossReference_35_0()); 
            	

            }


            }

            otherlv_36=(Token)match(input,16,FOLLOW_16_in_ruleResource2034); 

                	newLeafNode(otherlv_36, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_36());
                
            otherlv_37=(Token)match(input,31,FOLLOW_31_in_ruleResource2046); 

                	newLeafNode(otherlv_37, grammarAccess.getResourceAccess().getDeleteKeyword_37());
                
            otherlv_38=(Token)match(input,19,FOLLOW_19_in_ruleResource2058); 

                	newLeafNode(otherlv_38, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_38());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1014:1: ( (lv_deleteby_39_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1015:1: (lv_deleteby_39_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1015:1: (lv_deleteby_39_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1016:3: lv_deleteby_39_0= RULE_INTEGER
            {
            lv_deleteby_39_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleResource2075); 

            			newLeafNode(lv_deleteby_39_0, grammarAccess.getResourceAccess().getDeletebyINTEGERTerminalRuleCall_39_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"deleteby",
                    		lv_deleteby_39_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_40=(Token)match(input,21,FOLLOW_21_in_ruleResource2092); 

                	newLeafNode(otherlv_40, grammarAccess.getResourceAccess().getRightParenthesisKeyword_40());
                
            otherlv_41=(Token)match(input,26,FOLLOW_26_in_ruleResource2104); 

                	newLeafNode(otherlv_41, grammarAccess.getResourceAccess().getThrowsKeyword_41());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1040:1: ( (lv_exception4_42_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:1: (lv_exception4_42_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1041:1: (lv_exception4_42_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1042:3: lv_exception4_42_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getException4RestExceptionParserRuleCall_42_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleResource2125);
            lv_exception4_42_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"exception4",
                    		lv_exception4_42_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_43=(Token)match(input,15,FOLLOW_15_in_ruleResource2137); 

                	newLeafNode(otherlv_43, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_43());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:1: ( (lv_deleteMethod_44_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:1: (lv_deleteMethod_44_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:1: (lv_deleteMethod_44_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:3: lv_deleteMethod_44_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getDeleteMethodJavaMethodParserRuleCall_44_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleResource2158);
            lv_deleteMethod_44_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"deleteMethod",
                    		lv_deleteMethod_44_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_45=(Token)match(input,16,FOLLOW_16_in_ruleResource2170); 

                	newLeafNode(otherlv_45, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_45());
                

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleService"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:2: (iv_ruleService= ruleService EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1094:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2206);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2216); 

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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1101:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_findby_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_updateby_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_deleteby_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        EObject lv_exception1_7_0 = null;

        EObject lv_createMethod_9_0 = null;

        EObject lv_exception2_18_0 = null;

        EObject lv_findMethod_20_0 = null;

        EObject lv_exception3_31_0 = null;

        EObject lv_updateMethod_33_0 = null;

        EObject lv_exception4_42_0 = null;

        EObject lv_deleteMethod_44_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1104:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1105:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1105:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1105:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleService2253); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1110:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1110:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1111:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2270); 

            			newLeafNode(lv_name_1_0, grammarAccess.getServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleService2287); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getCreateKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleService2299); 

                	newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1135:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1136:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1136:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1137:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2319); 

            		newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getCreateDataModelDataModelCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleService2331); 

                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleService2343); 

                	newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getThrowsKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1156:1: ( (lv_exception1_7_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1157:1: (lv_exception1_7_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1157:1: (lv_exception1_7_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1158:3: lv_exception1_7_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getException1RestExceptionParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleService2364);
            lv_exception1_7_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"exception1",
                    		lv_exception1_7_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleService2376); 

                	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:1: ( (lv_createMethod_9_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1179:1: (lv_createMethod_9_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1179:1: (lv_createMethod_9_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1180:3: lv_createMethod_9_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getCreateMethodJavaMethodParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleService2397);
            lv_createMethod_9_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"createMethod",
                    		lv_createMethod_9_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleService2409); 

                	newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getReturnKeyword_10());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1200:1: ( (otherlv_11= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1201:1: (otherlv_11= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1201:1: (otherlv_11= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1202:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2429); 

            		newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getCreatedDataModelDataModelCrossReference_11_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleService2441); 

                	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_12());
                
            otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleService2453); 

                	newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getFindKeyword_13());
                
            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleService2465); 

                	newLeafNode(otherlv_14, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_14());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1225:1: ( (lv_findby_15_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:1: (lv_findby_15_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1226:1: (lv_findby_15_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1227:3: lv_findby_15_0= RULE_INTEGER
            {
            lv_findby_15_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleService2482); 

            			newLeafNode(lv_findby_15_0, grammarAccess.getServiceAccess().getFindbyINTEGERTerminalRuleCall_15_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"findby",
                    		lv_findby_15_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleService2499); 

                	newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getRightParenthesisKeyword_16());
                
            otherlv_17=(Token)match(input,26,FOLLOW_26_in_ruleService2511); 

                	newLeafNode(otherlv_17, grammarAccess.getServiceAccess().getThrowsKeyword_17());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1251:1: ( (lv_exception2_18_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1252:1: (lv_exception2_18_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1252:1: (lv_exception2_18_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1253:3: lv_exception2_18_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getException2RestExceptionParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleService2532);
            lv_exception2_18_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"exception2",
                    		lv_exception2_18_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleService2544); 

                	newLeafNode(otherlv_19, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_19());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1273:1: ( (lv_findMethod_20_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1274:1: (lv_findMethod_20_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1274:1: (lv_findMethod_20_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1275:3: lv_findMethod_20_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getFindMethodJavaMethodParserRuleCall_20_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleService2565);
            lv_findMethod_20_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"findMethod",
                    		lv_findMethod_20_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_21=(Token)match(input,27,FOLLOW_27_in_ruleService2577); 

                	newLeafNode(otherlv_21, grammarAccess.getServiceAccess().getReturnKeyword_21());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1295:1: ( (otherlv_22= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1296:1: (otherlv_22= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1296:1: (otherlv_22= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1297:3: otherlv_22= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                    
            otherlv_22=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2597); 

            		newLeafNode(otherlv_22, grammarAccess.getServiceAccess().getFoundDataModelDataModelCrossReference_22_0()); 
            	

            }


            }

            otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleService2609); 

                	newLeafNode(otherlv_23, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_23());
                
            otherlv_24=(Token)match(input,29,FOLLOW_29_in_ruleService2621); 

                	newLeafNode(otherlv_24, grammarAccess.getServiceAccess().getUpdateKeyword_24());
                
            otherlv_25=(Token)match(input,19,FOLLOW_19_in_ruleService2633); 

                	newLeafNode(otherlv_25, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_25());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1320:1: ( (lv_updateby_26_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1321:1: (lv_updateby_26_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1321:1: (lv_updateby_26_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1322:3: lv_updateby_26_0= RULE_INTEGER
            {
            lv_updateby_26_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleService2650); 

            			newLeafNode(lv_updateby_26_0, grammarAccess.getServiceAccess().getUpdatebyINTEGERTerminalRuleCall_26_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"updateby",
                    		lv_updateby_26_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_27=(Token)match(input,30,FOLLOW_30_in_ruleService2667); 

                	newLeafNode(otherlv_27, grammarAccess.getServiceAccess().getCommaKeyword_27());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1342:1: ( (otherlv_28= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1343:1: (otherlv_28= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1343:1: (otherlv_28= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1344:3: otherlv_28= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                    
            otherlv_28=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2687); 

            		newLeafNode(otherlv_28, grammarAccess.getServiceAccess().getUpdateDataModelDataModelCrossReference_28_0()); 
            	

            }


            }

            otherlv_29=(Token)match(input,21,FOLLOW_21_in_ruleService2699); 

                	newLeafNode(otherlv_29, grammarAccess.getServiceAccess().getRightParenthesisKeyword_29());
                
            otherlv_30=(Token)match(input,26,FOLLOW_26_in_ruleService2711); 

                	newLeafNode(otherlv_30, grammarAccess.getServiceAccess().getThrowsKeyword_30());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1363:1: ( (lv_exception3_31_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:1: (lv_exception3_31_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:1: (lv_exception3_31_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1365:3: lv_exception3_31_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getException3RestExceptionParserRuleCall_31_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleService2732);
            lv_exception3_31_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"exception3",
                    		lv_exception3_31_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_32=(Token)match(input,15,FOLLOW_15_in_ruleService2744); 

                	newLeafNode(otherlv_32, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_32());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1385:1: ( (lv_updateMethod_33_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1386:1: (lv_updateMethod_33_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1386:1: (lv_updateMethod_33_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1387:3: lv_updateMethod_33_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getUpdateMethodJavaMethodParserRuleCall_33_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleService2765);
            lv_updateMethod_33_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"updateMethod",
                    		lv_updateMethod_33_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_34=(Token)match(input,27,FOLLOW_27_in_ruleService2777); 

                	newLeafNode(otherlv_34, grammarAccess.getServiceAccess().getReturnKeyword_34());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1407:1: ( (otherlv_35= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1408:1: (otherlv_35= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1408:1: (otherlv_35= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1409:3: otherlv_35= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                    
            otherlv_35=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2797); 

            		newLeafNode(otherlv_35, grammarAccess.getServiceAccess().getUpdatedDataModelDataModelCrossReference_35_0()); 
            	

            }


            }

            otherlv_36=(Token)match(input,16,FOLLOW_16_in_ruleService2809); 

                	newLeafNode(otherlv_36, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_36());
                
            otherlv_37=(Token)match(input,31,FOLLOW_31_in_ruleService2821); 

                	newLeafNode(otherlv_37, grammarAccess.getServiceAccess().getDeleteKeyword_37());
                
            otherlv_38=(Token)match(input,19,FOLLOW_19_in_ruleService2833); 

                	newLeafNode(otherlv_38, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_38());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1432:1: ( (lv_deleteby_39_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:1: (lv_deleteby_39_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1433:1: (lv_deleteby_39_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1434:3: lv_deleteby_39_0= RULE_INTEGER
            {
            lv_deleteby_39_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleService2850); 

            			newLeafNode(lv_deleteby_39_0, grammarAccess.getServiceAccess().getDeletebyINTEGERTerminalRuleCall_39_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"deleteby",
                    		lv_deleteby_39_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_40=(Token)match(input,21,FOLLOW_21_in_ruleService2867); 

                	newLeafNode(otherlv_40, grammarAccess.getServiceAccess().getRightParenthesisKeyword_40());
                
            otherlv_41=(Token)match(input,26,FOLLOW_26_in_ruleService2879); 

                	newLeafNode(otherlv_41, grammarAccess.getServiceAccess().getThrowsKeyword_41());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1458:1: ( (lv_exception4_42_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1459:1: (lv_exception4_42_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1459:1: (lv_exception4_42_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1460:3: lv_exception4_42_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getException4RestExceptionParserRuleCall_42_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleService2900);
            lv_exception4_42_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"exception4",
                    		lv_exception4_42_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_43=(Token)match(input,15,FOLLOW_15_in_ruleService2912); 

                	newLeafNode(otherlv_43, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_43());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1480:1: ( (lv_deleteMethod_44_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1481:1: (lv_deleteMethod_44_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1481:1: (lv_deleteMethod_44_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1482:3: lv_deleteMethod_44_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getDeleteMethodJavaMethodParserRuleCall_44_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleService2933);
            lv_deleteMethod_44_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"deleteMethod",
                    		lv_deleteMethod_44_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_45=(Token)match(input,16,FOLLOW_16_in_ruleService2945); 

                	newLeafNode(otherlv_45, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_45());
                

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleDataAccessObject"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1510:1: entryRuleDataAccessObject returns [EObject current=null] : iv_ruleDataAccessObject= ruleDataAccessObject EOF ;
    public final EObject entryRuleDataAccessObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccessObject = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1511:2: (iv_ruleDataAccessObject= ruleDataAccessObject EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1512:2: iv_ruleDataAccessObject= ruleDataAccessObject EOF
            {
             newCompositeNode(grammarAccess.getDataAccessObjectRule()); 
            pushFollow(FOLLOW_ruleDataAccessObject_in_entryRuleDataAccessObject2981);
            iv_ruleDataAccessObject=ruleDataAccessObject();

            state._fsp--;

             current =iv_ruleDataAccessObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAccessObject2991); 

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
    // $ANTLR end "entryRuleDataAccessObject"


    // $ANTLR start "ruleDataAccessObject"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1519:1: ruleDataAccessObject returns [EObject current=null] : (otherlv_0= 'DAO' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' ) ;
    public final EObject ruleDataAccessObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_findby_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_updateby_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token lv_deleteby_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        EObject lv_exception1_7_0 = null;

        EObject lv_createMethod_9_0 = null;

        EObject lv_exception2_18_0 = null;

        EObject lv_findMethod_20_0 = null;

        EObject lv_exception3_31_0 = null;

        EObject lv_updateMethod_33_0 = null;

        EObject lv_exception4_42_0 = null;

        EObject lv_deleteMethod_44_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1522:28: ( (otherlv_0= 'DAO' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1523:1: (otherlv_0= 'DAO' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1523:1: (otherlv_0= 'DAO' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1523:3: otherlv_0= 'DAO' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'create' otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) otherlv_5= ')' otherlv_6= 'throws' ( (lv_exception1_7_0= ruleRestException ) ) otherlv_8= '{' ( (lv_createMethod_9_0= ruleJavaMethod ) ) otherlv_10= 'return' ( (otherlv_11= RULE_ID ) ) otherlv_12= '}' otherlv_13= 'find' otherlv_14= '(' ( (lv_findby_15_0= RULE_INTEGER ) ) otherlv_16= ')' otherlv_17= 'throws' ( (lv_exception2_18_0= ruleRestException ) ) otherlv_19= '{' ( (lv_findMethod_20_0= ruleJavaMethod ) ) otherlv_21= 'return' ( (otherlv_22= RULE_ID ) ) otherlv_23= '}' otherlv_24= 'update' otherlv_25= '(' ( (lv_updateby_26_0= RULE_INTEGER ) ) otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) otherlv_29= ')' otherlv_30= 'throws' ( (lv_exception3_31_0= ruleRestException ) ) otherlv_32= '{' ( (lv_updateMethod_33_0= ruleJavaMethod ) ) otherlv_34= 'return' ( (otherlv_35= RULE_ID ) ) otherlv_36= '}' otherlv_37= 'delete' otherlv_38= '(' ( (lv_deleteby_39_0= RULE_INTEGER ) ) otherlv_40= ')' otherlv_41= 'throws' ( (lv_exception4_42_0= ruleRestException ) ) otherlv_43= '{' ( (lv_deleteMethod_44_0= ruleJavaMethod ) ) otherlv_45= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleDataAccessObject3028); 

                	newLeafNode(otherlv_0, grammarAccess.getDataAccessObjectAccess().getDAOKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1527:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1528:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1528:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1529:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataAccessObject3045); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDataAccessObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleDataAccessObject3062); 

                	newLeafNode(otherlv_2, grammarAccess.getDataAccessObjectAccess().getCreateKeyword_2());
                
            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleDataAccessObject3074); 

                	newLeafNode(otherlv_3, grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_3());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1553:1: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1554:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1554:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1555:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataAccessObject3094); 

            		newLeafNode(otherlv_4, grammarAccess.getDataAccessObjectAccess().getCreateDataModelDataModelCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleDataAccessObject3106); 

                	newLeafNode(otherlv_5, grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_5());
                
            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleDataAccessObject3118); 

                	newLeafNode(otherlv_6, grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1574:1: ( (lv_exception1_7_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1575:1: (lv_exception1_7_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1575:1: (lv_exception1_7_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1576:3: lv_exception1_7_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getException1RestExceptionParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleDataAccessObject3139);
            lv_exception1_7_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"exception1",
                    		lv_exception1_7_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleDataAccessObject3151); 

                	newLeafNode(otherlv_8, grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1596:1: ( (lv_createMethod_9_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1597:1: (lv_createMethod_9_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1597:1: (lv_createMethod_9_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1598:3: lv_createMethod_9_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getCreateMethodJavaMethodParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleDataAccessObject3172);
            lv_createMethod_9_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"createMethod",
                    		lv_createMethod_9_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleDataAccessObject3184); 

                	newLeafNode(otherlv_10, grammarAccess.getDataAccessObjectAccess().getReturnKeyword_10());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1618:1: ( (otherlv_11= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1619:1: (otherlv_11= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1619:1: (otherlv_11= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1620:3: otherlv_11= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                    
            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataAccessObject3204); 

            		newLeafNode(otherlv_11, grammarAccess.getDataAccessObjectAccess().getCreatedDataModelDataModelCrossReference_11_0()); 
            	

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleDataAccessObject3216); 

                	newLeafNode(otherlv_12, grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_12());
                
            otherlv_13=(Token)match(input,28,FOLLOW_28_in_ruleDataAccessObject3228); 

                	newLeafNode(otherlv_13, grammarAccess.getDataAccessObjectAccess().getFindKeyword_13());
                
            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleDataAccessObject3240); 

                	newLeafNode(otherlv_14, grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_14());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1643:1: ( (lv_findby_15_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1644:1: (lv_findby_15_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1644:1: (lv_findby_15_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1645:3: lv_findby_15_0= RULE_INTEGER
            {
            lv_findby_15_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3257); 

            			newLeafNode(lv_findby_15_0, grammarAccess.getDataAccessObjectAccess().getFindbyINTEGERTerminalRuleCall_15_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"findby",
                    		lv_findby_15_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleDataAccessObject3274); 

                	newLeafNode(otherlv_16, grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_16());
                
            otherlv_17=(Token)match(input,26,FOLLOW_26_in_ruleDataAccessObject3286); 

                	newLeafNode(otherlv_17, grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_17());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1669:1: ( (lv_exception2_18_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1670:1: (lv_exception2_18_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1670:1: (lv_exception2_18_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1671:3: lv_exception2_18_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getException2RestExceptionParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleDataAccessObject3307);
            lv_exception2_18_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"exception2",
                    		lv_exception2_18_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_19=(Token)match(input,15,FOLLOW_15_in_ruleDataAccessObject3319); 

                	newLeafNode(otherlv_19, grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_19());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1691:1: ( (lv_findMethod_20_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1692:1: (lv_findMethod_20_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1692:1: (lv_findMethod_20_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1693:3: lv_findMethod_20_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getFindMethodJavaMethodParserRuleCall_20_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleDataAccessObject3340);
            lv_findMethod_20_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"findMethod",
                    		lv_findMethod_20_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_21=(Token)match(input,27,FOLLOW_27_in_ruleDataAccessObject3352); 

                	newLeafNode(otherlv_21, grammarAccess.getDataAccessObjectAccess().getReturnKeyword_21());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1713:1: ( (otherlv_22= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1714:1: (otherlv_22= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1714:1: (otherlv_22= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1715:3: otherlv_22= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                    
            otherlv_22=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataAccessObject3372); 

            		newLeafNode(otherlv_22, grammarAccess.getDataAccessObjectAccess().getFoundDataModelDataModelCrossReference_22_0()); 
            	

            }


            }

            otherlv_23=(Token)match(input,16,FOLLOW_16_in_ruleDataAccessObject3384); 

                	newLeafNode(otherlv_23, grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_23());
                
            otherlv_24=(Token)match(input,29,FOLLOW_29_in_ruleDataAccessObject3396); 

                	newLeafNode(otherlv_24, grammarAccess.getDataAccessObjectAccess().getUpdateKeyword_24());
                
            otherlv_25=(Token)match(input,19,FOLLOW_19_in_ruleDataAccessObject3408); 

                	newLeafNode(otherlv_25, grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_25());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1738:1: ( (lv_updateby_26_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1739:1: (lv_updateby_26_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1739:1: (lv_updateby_26_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1740:3: lv_updateby_26_0= RULE_INTEGER
            {
            lv_updateby_26_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3425); 

            			newLeafNode(lv_updateby_26_0, grammarAccess.getDataAccessObjectAccess().getUpdatebyINTEGERTerminalRuleCall_26_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"updateby",
                    		lv_updateby_26_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_27=(Token)match(input,30,FOLLOW_30_in_ruleDataAccessObject3442); 

                	newLeafNode(otherlv_27, grammarAccess.getDataAccessObjectAccess().getCommaKeyword_27());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1760:1: ( (otherlv_28= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1761:1: (otherlv_28= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1761:1: (otherlv_28= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1762:3: otherlv_28= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                    
            otherlv_28=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataAccessObject3462); 

            		newLeafNode(otherlv_28, grammarAccess.getDataAccessObjectAccess().getUpdateDataModelDataModelCrossReference_28_0()); 
            	

            }


            }

            otherlv_29=(Token)match(input,21,FOLLOW_21_in_ruleDataAccessObject3474); 

                	newLeafNode(otherlv_29, grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_29());
                
            otherlv_30=(Token)match(input,26,FOLLOW_26_in_ruleDataAccessObject3486); 

                	newLeafNode(otherlv_30, grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_30());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1781:1: ( (lv_exception3_31_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1782:1: (lv_exception3_31_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1782:1: (lv_exception3_31_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1783:3: lv_exception3_31_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getException3RestExceptionParserRuleCall_31_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleDataAccessObject3507);
            lv_exception3_31_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"exception3",
                    		lv_exception3_31_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_32=(Token)match(input,15,FOLLOW_15_in_ruleDataAccessObject3519); 

                	newLeafNode(otherlv_32, grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_32());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1803:1: ( (lv_updateMethod_33_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1804:1: (lv_updateMethod_33_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1804:1: (lv_updateMethod_33_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1805:3: lv_updateMethod_33_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getUpdateMethodJavaMethodParserRuleCall_33_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleDataAccessObject3540);
            lv_updateMethod_33_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"updateMethod",
                    		lv_updateMethod_33_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_34=(Token)match(input,27,FOLLOW_27_in_ruleDataAccessObject3552); 

                	newLeafNode(otherlv_34, grammarAccess.getDataAccessObjectAccess().getReturnKeyword_34());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1825:1: ( (otherlv_35= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1826:1: (otherlv_35= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1826:1: (otherlv_35= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1827:3: otherlv_35= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                    
            otherlv_35=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataAccessObject3572); 

            		newLeafNode(otherlv_35, grammarAccess.getDataAccessObjectAccess().getUpdatedDataModelDataModelCrossReference_35_0()); 
            	

            }


            }

            otherlv_36=(Token)match(input,16,FOLLOW_16_in_ruleDataAccessObject3584); 

                	newLeafNode(otherlv_36, grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_36());
                
            otherlv_37=(Token)match(input,31,FOLLOW_31_in_ruleDataAccessObject3596); 

                	newLeafNode(otherlv_37, grammarAccess.getDataAccessObjectAccess().getDeleteKeyword_37());
                
            otherlv_38=(Token)match(input,19,FOLLOW_19_in_ruleDataAccessObject3608); 

                	newLeafNode(otherlv_38, grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_38());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1850:1: ( (lv_deleteby_39_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1851:1: (lv_deleteby_39_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1851:1: (lv_deleteby_39_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1852:3: lv_deleteby_39_0= RULE_INTEGER
            {
            lv_deleteby_39_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3625); 

            			newLeafNode(lv_deleteby_39_0, grammarAccess.getDataAccessObjectAccess().getDeletebyINTEGERTerminalRuleCall_39_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"deleteby",
                    		lv_deleteby_39_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_40=(Token)match(input,21,FOLLOW_21_in_ruleDataAccessObject3642); 

                	newLeafNode(otherlv_40, grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_40());
                
            otherlv_41=(Token)match(input,26,FOLLOW_26_in_ruleDataAccessObject3654); 

                	newLeafNode(otherlv_41, grammarAccess.getDataAccessObjectAccess().getThrowsKeyword_41());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1876:1: ( (lv_exception4_42_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1877:1: (lv_exception4_42_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1877:1: (lv_exception4_42_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1878:3: lv_exception4_42_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getException4RestExceptionParserRuleCall_42_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleDataAccessObject3675);
            lv_exception4_42_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"exception4",
                    		lv_exception4_42_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_43=(Token)match(input,15,FOLLOW_15_in_ruleDataAccessObject3687); 

                	newLeafNode(otherlv_43, grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_43());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1898:1: ( (lv_deleteMethod_44_0= ruleJavaMethod ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1899:1: (lv_deleteMethod_44_0= ruleJavaMethod )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1899:1: (lv_deleteMethod_44_0= ruleJavaMethod )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1900:3: lv_deleteMethod_44_0= ruleJavaMethod
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getDeleteMethodJavaMethodParserRuleCall_44_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaMethod_in_ruleDataAccessObject3708);
            lv_deleteMethod_44_0=ruleJavaMethod();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"deleteMethod",
                    		lv_deleteMethod_44_0, 
                    		"JavaMethod");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_45=(Token)match(input,16,FOLLOW_16_in_ruleDataAccessObject3720); 

                	newLeafNode(otherlv_45, grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_45());
                

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
    // $ANTLR end "ruleDataAccessObject"


    // $ANTLR start "entryRuleRestException"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1928:1: entryRuleRestException returns [EObject current=null] : iv_ruleRestException= ruleRestException EOF ;
    public final EObject entryRuleRestException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestException = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1929:2: (iv_ruleRestException= ruleRestException EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1930:2: iv_ruleRestException= ruleRestException EOF
            {
             newCompositeNode(grammarAccess.getRestExceptionRule()); 
            pushFollow(FOLLOW_ruleRestException_in_entryRuleRestException3756);
            iv_ruleRestException=ruleRestException();

            state._fsp--;

             current =iv_ruleRestException; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestException3766); 

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
    // $ANTLR end "entryRuleRestException"


    // $ANTLR start "ruleRestException"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1937:1: ruleRestException returns [EObject current=null] : ( (lv_statusCode_0_0= ruleRestStatusCode ) ) ;
    public final EObject ruleRestException() throws RecognitionException {
        EObject current = null;

        Enumerator lv_statusCode_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1940:28: ( ( (lv_statusCode_0_0= ruleRestStatusCode ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1941:1: ( (lv_statusCode_0_0= ruleRestStatusCode ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1941:1: ( (lv_statusCode_0_0= ruleRestStatusCode ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:1: (lv_statusCode_0_0= ruleRestStatusCode )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1942:1: (lv_statusCode_0_0= ruleRestStatusCode )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1943:3: lv_statusCode_0_0= ruleRestStatusCode
            {
             
            	        newCompositeNode(grammarAccess.getRestExceptionAccess().getStatusCodeRestStatusCodeEnumRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleRestStatusCode_in_ruleRestException3811);
            lv_statusCode_0_0=ruleRestStatusCode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestExceptionRule());
            	        }
                   		set(
                   			current, 
                   			"statusCode",
                    		lv_statusCode_0_0, 
                    		"RestStatusCode");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleRestException"


    // $ANTLR start "entryRuleJavaMethod"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1967:1: entryRuleJavaMethod returns [EObject current=null] : iv_ruleJavaMethod= ruleJavaMethod EOF ;
    public final EObject entryRuleJavaMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaMethod = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1968:2: (iv_ruleJavaMethod= ruleJavaMethod EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1969:2: iv_ruleJavaMethod= ruleJavaMethod EOF
            {
             newCompositeNode(grammarAccess.getJavaMethodRule()); 
            pushFollow(FOLLOW_ruleJavaMethod_in_entryRuleJavaMethod3846);
            iv_ruleJavaMethod=ruleJavaMethod();

            state._fsp--;

             current =iv_ruleJavaMethod; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaMethod3856); 

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
    // $ANTLR end "entryRuleJavaMethod"


    // $ANTLR start "ruleJavaMethod"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1976:1: ruleJavaMethod returns [EObject current=null] : ( (lv_code_0_0= RULE_STRING ) ) ;
    public final EObject ruleJavaMethod() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1979:28: ( ( (lv_code_0_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:1: ( (lv_code_0_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:1: ( (lv_code_0_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:1: (lv_code_0_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:1: (lv_code_0_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJavaMethod3897); 

            			newLeafNode(lv_code_0_0, grammarAccess.getJavaMethodAccess().getCodeSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJavaMethodRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"code",
                    		lv_code_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleJavaMethod"


    // $ANTLR start "ruleRestStatusCode"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2006:1: ruleRestStatusCode returns [Enumerator current=null] : ( (enumLiteral_0= 'INFORMATIONAL' ) | (enumLiteral_1= 'SUCCESS' ) | (enumLiteral_2= 'REDIRECTION' ) | (enumLiteral_3= 'CLIENT_ERROR' ) | (enumLiteral_4= 'SERVER_ERROR' ) ) ;
    public final Enumerator ruleRestStatusCode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2008:28: ( ( (enumLiteral_0= 'INFORMATIONAL' ) | (enumLiteral_1= 'SUCCESS' ) | (enumLiteral_2= 'REDIRECTION' ) | (enumLiteral_3= 'CLIENT_ERROR' ) | (enumLiteral_4= 'SERVER_ERROR' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2009:1: ( (enumLiteral_0= 'INFORMATIONAL' ) | (enumLiteral_1= 'SUCCESS' ) | (enumLiteral_2= 'REDIRECTION' ) | (enumLiteral_3= 'CLIENT_ERROR' ) | (enumLiteral_4= 'SERVER_ERROR' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2009:1: ( (enumLiteral_0= 'INFORMATIONAL' ) | (enumLiteral_1= 'SUCCESS' ) | (enumLiteral_2= 'REDIRECTION' ) | (enumLiteral_3= 'CLIENT_ERROR' ) | (enumLiteral_4= 'SERVER_ERROR' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 35:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            case 37:
                {
                alt12=4;
                }
                break;
            case 38:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2009:2: (enumLiteral_0= 'INFORMATIONAL' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2009:2: (enumLiteral_0= 'INFORMATIONAL' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2009:4: enumLiteral_0= 'INFORMATIONAL'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleRestStatusCode3951); 

                            current = grammarAccess.getRestStatusCodeAccess().getINFORMATIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRestStatusCodeAccess().getINFORMATIONALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:6: (enumLiteral_1= 'SUCCESS' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:6: (enumLiteral_1= 'SUCCESS' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:8: enumLiteral_1= 'SUCCESS'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_35_in_ruleRestStatusCode3968); 

                            current = grammarAccess.getRestStatusCodeAccess().getSUCCESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRestStatusCodeAccess().getSUCCESSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2021:6: (enumLiteral_2= 'REDIRECTION' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2021:6: (enumLiteral_2= 'REDIRECTION' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2021:8: enumLiteral_2= 'REDIRECTION'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_36_in_ruleRestStatusCode3985); 

                            current = grammarAccess.getRestStatusCodeAccess().getREDIRECTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRestStatusCodeAccess().getREDIRECTIONEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2027:6: (enumLiteral_3= 'CLIENT_ERROR' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2027:6: (enumLiteral_3= 'CLIENT_ERROR' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2027:8: enumLiteral_3= 'CLIENT_ERROR'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_37_in_ruleRestStatusCode4002); 

                            current = grammarAccess.getRestStatusCodeAccess().getCLIENT_ERROREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRestStatusCodeAccess().getCLIENT_ERROREnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2033:6: (enumLiteral_4= 'SERVER_ERROR' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2033:6: (enumLiteral_4= 'SERVER_ERROR' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2033:8: enumLiteral_4= 'SERVER_ERROR'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_38_in_ruleRestStatusCode4019); 

                            current = grammarAccess.getRestStatusCodeAccess().getSERVER_ERROREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getRestStatusCodeAccess().getSERVER_ERROREnumLiteralDeclaration_4()); 
                        

                    }


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
    // $ANTLR end "ruleRestStatusCode"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomainModel_in_entryRuleDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleDomainModel131 = new BitSet(new long[]{0x0000000001063002L});
    public static final BitSet FOLLOW_ruleRestAPI_in_ruleDomainModel153 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_ruleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestModel_in_ruleType301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModel_in_ruleType328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestAPI_in_entryRuleRestAPI363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestAPI373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleRestAPI419 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleService_in_ruleRestAPI440 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleDataAccessObject_in_ruleRestAPI462 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rulePrimitiveType546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveType563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleDataModel651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel668 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleDataModel686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel706 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataModel720 = new BitSet(new long[]{0x0000000000410010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleDataModel741 = new BitSet(new long[]{0x0000000000410010L});
    public static final BitSet FOLLOW_16_in_ruleDataModel754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestModel_in_entryRuleRestModel790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestModel800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRestModel837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRestModel854 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleRestModel872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRestModel892 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRestModel906 = new BitSet(new long[]{0x0000000000410010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleRestModel927 = new BitSet(new long[]{0x0000000000410010L});
    public static final BitSet FOLLOW_16_in_ruleRestModel940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMappingModel_in_entryRuleMappingModel976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappingModel986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMappingModel1023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMappingModel1040 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMappingModel1057 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_ruleTransformation_in_ruleMappingModel1078 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16_in_ruleMappingModel1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation1127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTransformation1174 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransformation1194 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTransformation1206 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransformation1226 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTransformation1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFeature1327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1358 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFeature1375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleResource1478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1495 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleResource1512 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource1524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1544 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResource1556 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResource1568 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleResource1589 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResource1601 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleResource1622 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleResource1634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1654 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResource1666 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleResource1678 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource1690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleResource1707 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResource1724 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResource1736 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleResource1757 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResource1769 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleResource1790 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleResource1802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1822 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResource1834 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleResource1846 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource1858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleResource1875 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleResource1892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1912 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResource1924 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResource1936 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleResource1957 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResource1969 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleResource1990 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleResource2002 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource2022 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResource2034 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleResource2046 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource2058 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleResource2075 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleResource2092 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResource2104 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleResource2125 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleResource2137 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleResource2158 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResource2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleService2253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2270 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleService2287 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService2299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2319 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleService2331 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleService2343 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleService2364 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleService2376 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleService2397 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleService2409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2429 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleService2441 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleService2453 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService2465 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleService2482 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleService2499 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleService2511 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleService2532 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleService2544 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleService2565 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleService2577 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2597 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleService2609 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleService2621 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService2633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleService2650 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleService2667 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2687 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleService2699 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleService2711 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleService2732 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleService2744 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleService2765 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleService2777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2797 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleService2809 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleService2821 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleService2833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleService2850 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleService2867 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleService2879 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleService2900 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleService2912 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleService2933 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleService2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAccessObject_in_entryRuleDataAccessObject2981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAccessObject2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataAccessObject3028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataAccessObject3045 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDataAccessObject3062 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDataAccessObject3074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataAccessObject3094 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDataAccessObject3106 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDataAccessObject3118 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleDataAccessObject3139 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataAccessObject3151 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleDataAccessObject3172 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDataAccessObject3184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataAccessObject3204 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDataAccessObject3216 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleDataAccessObject3228 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDataAccessObject3240 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3257 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDataAccessObject3274 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDataAccessObject3286 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleDataAccessObject3307 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataAccessObject3319 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleDataAccessObject3340 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDataAccessObject3352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataAccessObject3372 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDataAccessObject3384 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDataAccessObject3396 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDataAccessObject3408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3425 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDataAccessObject3442 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataAccessObject3462 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDataAccessObject3474 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDataAccessObject3486 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleDataAccessObject3507 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataAccessObject3519 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleDataAccessObject3540 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleDataAccessObject3552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataAccessObject3572 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDataAccessObject3584 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDataAccessObject3596 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDataAccessObject3608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3625 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDataAccessObject3642 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDataAccessObject3654 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleDataAccessObject3675 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDataAccessObject3687 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_ruleDataAccessObject3708 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDataAccessObject3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_entryRuleRestException3756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestException3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestStatusCode_in_ruleRestException3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaMethod_in_entryRuleJavaMethod3846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaMethod3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJavaMethod3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRestStatusCode3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRestStatusCode3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRestStatusCode3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRestStatusCode4002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRestStatusCode4019 = new BitSet(new long[]{0x0000000000000002L});

}