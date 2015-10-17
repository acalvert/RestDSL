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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<BEGIN_REST_API>'", "'<END_REST_API>'", "'primitiveType'", "'DataModel'", "'extends'", "'{'", "'id'", "':'", "'}'", "'RestModel'", "'self'", "'ModelMapper'", "'('", "'<=>'", "')'", "'many'", "'Resource'", "'create'", "'find'", "'update'", "','", "'delete'", "'throw'", "'Service'", "'validate'", "'DAO'", "'return'", "'['", "']'", "'ExceptionMapper'", "'INFORMATIONAL'", "'SUCCESS'", "'REDIRECTION'", "'CLIENT_ERROR'", "'SERVER_ERROR'", "'NETWORK_ERROR'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=5;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( ((LA1_0>=14 && LA1_0<=15)||LA1_0==21||LA1_0==23) ) {
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

                if ( (LA2_0==12) ) {
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:134:1: ruleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_DataModel_1= ruleDataModel | this_RestModel_2= ruleRestModel | this_ModelMapper_3= ruleModelMapper ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_DataModel_1 = null;

        EObject this_RestModel_2 = null;

        EObject this_ModelMapper_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:137:28: ( (this_PrimitiveType_0= rulePrimitiveType | this_DataModel_1= ruleDataModel | this_RestModel_2= ruleRestModel | this_ModelMapper_3= ruleModelMapper ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:138:1: (this_PrimitiveType_0= rulePrimitiveType | this_DataModel_1= ruleDataModel | this_RestModel_2= ruleRestModel | this_ModelMapper_3= ruleModelMapper )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:138:1: (this_PrimitiveType_0= rulePrimitiveType | this_DataModel_1= ruleDataModel | this_RestModel_2= ruleRestModel | this_ModelMapper_3= ruleModelMapper )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            case 23:
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
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:169:5: this_ModelMapper_3= ruleModelMapper
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getModelMapperParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleModelMapper_in_ruleType328);
                    this_ModelMapper_3=ruleModelMapper();

                    state._fsp--;

                     
                            current = this_ModelMapper_3; 
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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:194:1: ruleRestAPI returns [EObject current=null] : (otherlv_0= '<BEGIN_REST_API>' ( (lv_resource_1_0= ruleResource ) ) ( (lv_service_2_0= ruleService ) )* ( (lv_dao_3_0= ruleDataAccessObject ) )* ( (lv_exceptionMapper_4_0= ruleExceptionMapper ) )* otherlv_5= '<END_REST_API>' ) ;
    public final EObject ruleRestAPI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_5=null;
        EObject lv_resource_1_0 = null;

        EObject lv_service_2_0 = null;

        EObject lv_dao_3_0 = null;

        EObject lv_exceptionMapper_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:197:28: ( (otherlv_0= '<BEGIN_REST_API>' ( (lv_resource_1_0= ruleResource ) ) ( (lv_service_2_0= ruleService ) )* ( (lv_dao_3_0= ruleDataAccessObject ) )* ( (lv_exceptionMapper_4_0= ruleExceptionMapper ) )* otherlv_5= '<END_REST_API>' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:1: (otherlv_0= '<BEGIN_REST_API>' ( (lv_resource_1_0= ruleResource ) ) ( (lv_service_2_0= ruleService ) )* ( (lv_dao_3_0= ruleDataAccessObject ) )* ( (lv_exceptionMapper_4_0= ruleExceptionMapper ) )* otherlv_5= '<END_REST_API>' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:1: (otherlv_0= '<BEGIN_REST_API>' ( (lv_resource_1_0= ruleResource ) ) ( (lv_service_2_0= ruleService ) )* ( (lv_dao_3_0= ruleDataAccessObject ) )* ( (lv_exceptionMapper_4_0= ruleExceptionMapper ) )* otherlv_5= '<END_REST_API>' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:198:3: otherlv_0= '<BEGIN_REST_API>' ( (lv_resource_1_0= ruleResource ) ) ( (lv_service_2_0= ruleService ) )* ( (lv_dao_3_0= ruleDataAccessObject ) )* ( (lv_exceptionMapper_4_0= ruleExceptionMapper ) )* otherlv_5= '<END_REST_API>'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleRestAPI410); 

                	newLeafNode(otherlv_0, grammarAccess.getRestAPIAccess().getBEGIN_REST_APIKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:202:1: ( (lv_resource_1_0= ruleResource ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:203:1: (lv_resource_1_0= ruleResource )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:203:1: (lv_resource_1_0= ruleResource )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:204:3: lv_resource_1_0= ruleResource
            {
             
            	        newCompositeNode(grammarAccess.getRestAPIAccess().getResourceResourceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleResource_in_ruleRestAPI431);
            lv_resource_1_0=ruleResource();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestAPIRule());
            	        }
                   		set(
                   			current, 
                   			"resource",
                    		lv_resource_1_0, 
                    		"Resource");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:220:2: ( (lv_service_2_0= ruleService ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==35) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:221:1: (lv_service_2_0= ruleService )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:221:1: (lv_service_2_0= ruleService )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:222:3: lv_service_2_0= ruleService
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestAPIAccess().getServiceServiceParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleService_in_ruleRestAPI452);
            	    lv_service_2_0=ruleService();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestAPIRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"service",
            	            		lv_service_2_0, 
            	            		"Service");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:238:3: ( (lv_dao_3_0= ruleDataAccessObject ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==37) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:239:1: (lv_dao_3_0= ruleDataAccessObject )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:239:1: (lv_dao_3_0= ruleDataAccessObject )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:240:3: lv_dao_3_0= ruleDataAccessObject
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestAPIAccess().getDaoDataAccessObjectParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataAccessObject_in_ruleRestAPI474);
            	    lv_dao_3_0=ruleDataAccessObject();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestAPIRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dao",
            	            		lv_dao_3_0, 
            	            		"DataAccessObject");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:256:3: ( (lv_exceptionMapper_4_0= ruleExceptionMapper ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==41) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:257:1: (lv_exceptionMapper_4_0= ruleExceptionMapper )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:257:1: (lv_exceptionMapper_4_0= ruleExceptionMapper )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:258:3: lv_exceptionMapper_4_0= ruleExceptionMapper
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestAPIAccess().getExceptionMapperExceptionMapperParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleExceptionMapper_in_ruleRestAPI496);
            	    lv_exceptionMapper_4_0=ruleExceptionMapper();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestAPIRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exceptionMapper",
            	            		lv_exceptionMapper_4_0, 
            	            		"ExceptionMapper");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleRestAPI509); 

                	newLeafNode(otherlv_5, grammarAccess.getRestAPIAccess().getEND_REST_APIKeyword_5());
                

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:286:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:287:2: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:288:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType545);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveType555); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:295:1: rulePrimitiveType returns [EObject current=null] : (otherlv_0= 'primitiveType' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:298:28: ( (otherlv_0= 'primitiveType' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:1: (otherlv_0= 'primitiveType' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:1: (otherlv_0= 'primitiveType' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:299:3: otherlv_0= 'primitiveType' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePrimitiveType592); 

                	newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:303:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:304:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:304:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:305:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimitiveType609); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:329:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:330:2: (iv_ruleDataModel= ruleDataModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:331:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_ruleDataModel_in_entryRuleDataModel650);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModel660); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:338:1: ruleDataModel returns [EObject current=null] : (otherlv_0= 'DataModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_INTEGER ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token otherlv_9=null;
        EObject lv_features_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:341:28: ( (otherlv_0= 'DataModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_INTEGER ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:1: (otherlv_0= 'DataModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_INTEGER ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:1: (otherlv_0= 'DataModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_INTEGER ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:342:3: otherlv_0= 'DataModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_INTEGER ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleDataModel697); 

                	newLeafNode(otherlv_0, grammarAccess.getDataModelAccess().getDataModelKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:346:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:347:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:347:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:348:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModel714); 

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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:364:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleDataModel732); 

                        	newLeafNode(otherlv_2, grammarAccess.getDataModelAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:368:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:369:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:370:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataModelRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModel752); 

                    		newLeafNode(otherlv_3, grammarAccess.getDataModelAccess().getSuperTypeDataModelCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDataModel766); 

                	newLeafNode(otherlv_4, grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDataModel778); 

                	newLeafNode(otherlv_5, grammarAccess.getDataModelAccess().getIdKeyword_4());
                
            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleDataModel790); 

                	newLeafNode(otherlv_6, grammarAccess.getDataModelAccess().getColonKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:393:1: ( (lv_id_7_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:394:1: (lv_id_7_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:394:1: (lv_id_7_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:395:3: lv_id_7_0= RULE_INTEGER
            {
            lv_id_7_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleDataModel807); 

            			newLeafNode(lv_id_7_0, grammarAccess.getDataModelAccess().getIdINTEGERTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_7_0, 
                    		"INTEGER");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:411:2: ( (lv_features_8_0= ruleFeature ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:412:1: (lv_features_8_0= ruleFeature )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:412:1: (lv_features_8_0= ruleFeature )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:413:3: lv_features_8_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDataModelAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleDataModel833);
            	    lv_features_8_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_8_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleDataModel846); 

                	newLeafNode(otherlv_9, grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:441:1: entryRuleRestModel returns [EObject current=null] : iv_ruleRestModel= ruleRestModel EOF ;
    public final EObject entryRuleRestModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestModel = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:442:2: (iv_ruleRestModel= ruleRestModel EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:443:2: iv_ruleRestModel= ruleRestModel EOF
            {
             newCompositeNode(grammarAccess.getRestModelRule()); 
            pushFollow(FOLLOW_ruleRestModel_in_entryRuleRestModel882);
            iv_ruleRestModel=ruleRestModel();

            state._fsp--;

             current =iv_ruleRestModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestModel892); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:450:1: ruleRestModel returns [EObject current=null] : (otherlv_0= 'RestModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_INTEGER ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= 'self' otherlv_10= ':' ( (lv_self_11_0= RULE_STRING ) ) otherlv_12= '}' ) ;
    public final EObject ruleRestModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_id_7_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_self_11_0=null;
        Token otherlv_12=null;
        EObject lv_features_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:453:28: ( (otherlv_0= 'RestModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_INTEGER ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= 'self' otherlv_10= ':' ( (lv_self_11_0= RULE_STRING ) ) otherlv_12= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:1: (otherlv_0= 'RestModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_INTEGER ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= 'self' otherlv_10= ':' ( (lv_self_11_0= RULE_STRING ) ) otherlv_12= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:1: (otherlv_0= 'RestModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_INTEGER ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= 'self' otherlv_10= ':' ( (lv_self_11_0= RULE_STRING ) ) otherlv_12= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:454:3: otherlv_0= 'RestModel' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' otherlv_6= ':' ( (lv_id_7_0= RULE_INTEGER ) ) ( (lv_features_8_0= ruleFeature ) )* otherlv_9= 'self' otherlv_10= ':' ( (lv_self_11_0= RULE_STRING ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleRestModel929); 

                	newLeafNode(otherlv_0, grammarAccess.getRestModelAccess().getRestModelKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:458:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:460:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRestModel946); 

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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:476:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRestModel964); 

                        	newLeafNode(otherlv_2, grammarAccess.getRestModelAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:480:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:481:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:481:1: (otherlv_3= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:482:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRestModelRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRestModel984); 

                    		newLeafNode(otherlv_3, grammarAccess.getRestModelAccess().getSuperTypeRestModelCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleRestModel998); 

                	newLeafNode(otherlv_4, grammarAccess.getRestModelAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleRestModel1010); 

                	newLeafNode(otherlv_5, grammarAccess.getRestModelAccess().getIdKeyword_4());
                
            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleRestModel1022); 

                	newLeafNode(otherlv_6, grammarAccess.getRestModelAccess().getColonKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:505:1: ( (lv_id_7_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:506:1: (lv_id_7_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:506:1: (lv_id_7_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:507:3: lv_id_7_0= RULE_INTEGER
            {
            lv_id_7_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleRestModel1039); 

            			newLeafNode(lv_id_7_0, grammarAccess.getRestModelAccess().getIdINTEGERTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRestModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_7_0, 
                    		"INTEGER");
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:523:2: ( (lv_features_8_0= ruleFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:1: (lv_features_8_0= ruleFeature )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:524:1: (lv_features_8_0= ruleFeature )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:525:3: lv_features_8_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestModelAccess().getFeaturesFeatureParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleRestModel1065);
            	    lv_features_8_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"features",
            	            		lv_features_8_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleRestModel1078); 

                	newLeafNode(otherlv_9, grammarAccess.getRestModelAccess().getSelfKeyword_8());
                
            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleRestModel1090); 

                	newLeafNode(otherlv_10, grammarAccess.getRestModelAccess().getColonKeyword_9());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:549:1: ( (lv_self_11_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:550:1: (lv_self_11_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:550:1: (lv_self_11_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:551:3: lv_self_11_0= RULE_STRING
            {
            lv_self_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRestModel1107); 

            			newLeafNode(lv_self_11_0, grammarAccess.getRestModelAccess().getSelfSTRINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRestModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"self",
                    		lv_self_11_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleRestModel1124); 

                	newLeafNode(otherlv_12, grammarAccess.getRestModelAccess().getRightCurlyBracketKeyword_11());
                

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


    // $ANTLR start "entryRuleModelMapper"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:579:1: entryRuleModelMapper returns [EObject current=null] : iv_ruleModelMapper= ruleModelMapper EOF ;
    public final EObject entryRuleModelMapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelMapper = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:580:2: (iv_ruleModelMapper= ruleModelMapper EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:581:2: iv_ruleModelMapper= ruleModelMapper EOF
            {
             newCompositeNode(grammarAccess.getModelMapperRule()); 
            pushFollow(FOLLOW_ruleModelMapper_in_entryRuleModelMapper1160);
            iv_ruleModelMapper=ruleModelMapper();

            state._fsp--;

             current =iv_ruleModelMapper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelMapper1170); 

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
    // $ANTLR end "entryRuleModelMapper"


    // $ANTLR start "ruleModelMapper"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:588:1: ruleModelMapper returns [EObject current=null] : (otherlv_0= 'ModelMapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_transformation_3_0= ruleTransformation ) )* otherlv_4= '}' ) ;
    public final EObject ruleModelMapper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_transformation_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:591:28: ( (otherlv_0= 'ModelMapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_transformation_3_0= ruleTransformation ) )* otherlv_4= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:1: (otherlv_0= 'ModelMapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_transformation_3_0= ruleTransformation ) )* otherlv_4= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:1: (otherlv_0= 'ModelMapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_transformation_3_0= ruleTransformation ) )* otherlv_4= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:592:3: otherlv_0= 'ModelMapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_transformation_3_0= ruleTransformation ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleModelMapper1207); 

                	newLeafNode(otherlv_0, grammarAccess.getModelMapperAccess().getModelMapperKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:596:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:597:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:597:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:598:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModelMapper1224); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelMapperAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelMapperRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleModelMapper1241); 

                	newLeafNode(otherlv_2, grammarAccess.getModelMapperAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:618:1: ( (lv_transformation_3_0= ruleTransformation ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:619:1: (lv_transformation_3_0= ruleTransformation )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:619:1: (lv_transformation_3_0= ruleTransformation )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:620:3: lv_transformation_3_0= ruleTransformation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelMapperAccess().getTransformationTransformationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransformation_in_ruleModelMapper1262);
            	    lv_transformation_3_0=ruleTransformation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelMapperRule());
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
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleModelMapper1275); 

                	newLeafNode(otherlv_4, grammarAccess.getModelMapperAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleModelMapper"


    // $ANTLR start "entryRuleTransformation"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:648:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:649:2: (iv_ruleTransformation= ruleTransformation EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:650:2: iv_ruleTransformation= ruleTransformation EOF
            {
             newCompositeNode(grammarAccess.getTransformationRule()); 
            pushFollow(FOLLOW_ruleTransformation_in_entryRuleTransformation1311);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;

             current =iv_ruleTransformation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformation1321); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:657:1: ruleTransformation returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=>' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:660:28: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=>' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=>' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:1: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=>' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:661:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '<=>' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleTransformation1358); 

                	newLeafNode(otherlv_0, grammarAccess.getTransformationAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:665:1: ( (otherlv_1= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:666:1: (otherlv_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:666:1: (otherlv_1= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:667:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransformation1378); 

            		newLeafNode(otherlv_1, grammarAccess.getTransformationAccess().getDataModelDataModelCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleTransformation1390); 

                	newLeafNode(otherlv_2, grammarAccess.getTransformationAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:682:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:683:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:684:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransformationRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransformation1410); 

            		newLeafNode(otherlv_3, grammarAccess.getTransformationAccess().getRestModelRestModelCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleTransformation1422); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:707:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:708:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:709:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1458);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1468); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:716:1: ruleFeature returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:719:28: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:1: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:2: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:720:2: ( (lv_many_0_0= 'many' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:721:1: (lv_many_0_0= 'many' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:721:1: (lv_many_0_0= 'many' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:722:3: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,27,FOLLOW_27_in_ruleFeature1511); 

                            newLeafNode(lv_many_0_0, grammarAccess.getFeatureAccess().getManyManyKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "many");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:735:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:736:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:737:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1542); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleFeature1559); 

                	newLeafNode(otherlv_2, grammarAccess.getFeatureAccess().getColonKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:757:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:758:1: (otherlv_3= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:759:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFeatureRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature1579); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:778:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:779:2: (iv_ruleResource= ruleResource EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:780:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1615);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1625); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:787:1: ruleResource returns [EObject current=null] : (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ ( (otherlv_4= RULE_ID ) ) otherlv_5= 'create' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_createValService_10_0= ruleValidationService ) ) ( (lv_createMethod_11_0= ruleBlock ) ) ( (lv_createConclusion_12_0= ruleRestModelMethodConclusion ) ) otherlv_13= '}' otherlv_14= 'find' otherlv_15= '(' ( (lv_findby_16_0= RULE_INTEGER ) ) otherlv_17= ')' otherlv_18= '{' ( (lv_findMethod_19_0= ruleBlock ) ) ( (lv_findConclusion_20_0= ruleRestModelMethodConclusion ) ) otherlv_21= '}' otherlv_22= 'update' otherlv_23= '(' ( (lv_updateby_24_0= RULE_INTEGER ) ) otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' otherlv_28= '{' ( (lv_updateValService_29_0= ruleValidationService ) ) ( (lv_updateMethod_30_0= ruleBlock ) ) ( (lv_updateConclusion_31_0= ruleRestModelMethodConclusion ) ) otherlv_32= '}' otherlv_33= 'delete' otherlv_34= '(' ( (lv_deleteby_35_0= RULE_INTEGER ) ) otherlv_36= ')' otherlv_37= '{' ( (lv_deleteMethod_38_0= ruleBlock ) ) (otherlv_39= 'throw' ( (lv_exception4_40_0= ruleRestExceptionList ) ) )? otherlv_41= '}' otherlv_42= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_findby_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token lv_updateby_24_0=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token lv_deleteby_35_0=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        EObject lv_createValService_10_0 = null;

        EObject lv_createMethod_11_0 = null;

        EObject lv_createConclusion_12_0 = null;

        EObject lv_findMethod_19_0 = null;

        EObject lv_findConclusion_20_0 = null;

        EObject lv_updateValService_29_0 = null;

        EObject lv_updateMethod_30_0 = null;

        EObject lv_updateConclusion_31_0 = null;

        EObject lv_deleteMethod_38_0 = null;

        EObject lv_exception4_40_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:790:28: ( (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ ( (otherlv_4= RULE_ID ) ) otherlv_5= 'create' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_createValService_10_0= ruleValidationService ) ) ( (lv_createMethod_11_0= ruleBlock ) ) ( (lv_createConclusion_12_0= ruleRestModelMethodConclusion ) ) otherlv_13= '}' otherlv_14= 'find' otherlv_15= '(' ( (lv_findby_16_0= RULE_INTEGER ) ) otherlv_17= ')' otherlv_18= '{' ( (lv_findMethod_19_0= ruleBlock ) ) ( (lv_findConclusion_20_0= ruleRestModelMethodConclusion ) ) otherlv_21= '}' otherlv_22= 'update' otherlv_23= '(' ( (lv_updateby_24_0= RULE_INTEGER ) ) otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' otherlv_28= '{' ( (lv_updateValService_29_0= ruleValidationService ) ) ( (lv_updateMethod_30_0= ruleBlock ) ) ( (lv_updateConclusion_31_0= ruleRestModelMethodConclusion ) ) otherlv_32= '}' otherlv_33= 'delete' otherlv_34= '(' ( (lv_deleteby_35_0= RULE_INTEGER ) ) otherlv_36= ')' otherlv_37= '{' ( (lv_deleteMethod_38_0= ruleBlock ) ) (otherlv_39= 'throw' ( (lv_exception4_40_0= ruleRestExceptionList ) ) )? otherlv_41= '}' otherlv_42= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:791:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ ( (otherlv_4= RULE_ID ) ) otherlv_5= 'create' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_createValService_10_0= ruleValidationService ) ) ( (lv_createMethod_11_0= ruleBlock ) ) ( (lv_createConclusion_12_0= ruleRestModelMethodConclusion ) ) otherlv_13= '}' otherlv_14= 'find' otherlv_15= '(' ( (lv_findby_16_0= RULE_INTEGER ) ) otherlv_17= ')' otherlv_18= '{' ( (lv_findMethod_19_0= ruleBlock ) ) ( (lv_findConclusion_20_0= ruleRestModelMethodConclusion ) ) otherlv_21= '}' otherlv_22= 'update' otherlv_23= '(' ( (lv_updateby_24_0= RULE_INTEGER ) ) otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' otherlv_28= '{' ( (lv_updateValService_29_0= ruleValidationService ) ) ( (lv_updateMethod_30_0= ruleBlock ) ) ( (lv_updateConclusion_31_0= ruleRestModelMethodConclusion ) ) otherlv_32= '}' otherlv_33= 'delete' otherlv_34= '(' ( (lv_deleteby_35_0= RULE_INTEGER ) ) otherlv_36= ')' otherlv_37= '{' ( (lv_deleteMethod_38_0= ruleBlock ) ) (otherlv_39= 'throw' ( (lv_exception4_40_0= ruleRestExceptionList ) ) )? otherlv_41= '}' otherlv_42= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:791:1: (otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ ( (otherlv_4= RULE_ID ) ) otherlv_5= 'create' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_createValService_10_0= ruleValidationService ) ) ( (lv_createMethod_11_0= ruleBlock ) ) ( (lv_createConclusion_12_0= ruleRestModelMethodConclusion ) ) otherlv_13= '}' otherlv_14= 'find' otherlv_15= '(' ( (lv_findby_16_0= RULE_INTEGER ) ) otherlv_17= ')' otherlv_18= '{' ( (lv_findMethod_19_0= ruleBlock ) ) ( (lv_findConclusion_20_0= ruleRestModelMethodConclusion ) ) otherlv_21= '}' otherlv_22= 'update' otherlv_23= '(' ( (lv_updateby_24_0= RULE_INTEGER ) ) otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' otherlv_28= '{' ( (lv_updateValService_29_0= ruleValidationService ) ) ( (lv_updateMethod_30_0= ruleBlock ) ) ( (lv_updateConclusion_31_0= ruleRestModelMethodConclusion ) ) otherlv_32= '}' otherlv_33= 'delete' otherlv_34= '(' ( (lv_deleteby_35_0= RULE_INTEGER ) ) otherlv_36= ')' otherlv_37= '{' ( (lv_deleteMethod_38_0= ruleBlock ) ) (otherlv_39= 'throw' ( (lv_exception4_40_0= ruleRestExceptionList ) ) )? otherlv_41= '}' otherlv_42= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:791:3: otherlv_0= 'Resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ ( (otherlv_4= RULE_ID ) ) otherlv_5= 'create' otherlv_6= '(' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' otherlv_9= '{' ( (lv_createValService_10_0= ruleValidationService ) ) ( (lv_createMethod_11_0= ruleBlock ) ) ( (lv_createConclusion_12_0= ruleRestModelMethodConclusion ) ) otherlv_13= '}' otherlv_14= 'find' otherlv_15= '(' ( (lv_findby_16_0= RULE_INTEGER ) ) otherlv_17= ')' otherlv_18= '{' ( (lv_findMethod_19_0= ruleBlock ) ) ( (lv_findConclusion_20_0= ruleRestModelMethodConclusion ) ) otherlv_21= '}' otherlv_22= 'update' otherlv_23= '(' ( (lv_updateby_24_0= RULE_INTEGER ) ) otherlv_25= ',' ( (otherlv_26= RULE_ID ) ) otherlv_27= ')' otherlv_28= '{' ( (lv_updateValService_29_0= ruleValidationService ) ) ( (lv_updateMethod_30_0= ruleBlock ) ) ( (lv_updateConclusion_31_0= ruleRestModelMethodConclusion ) ) otherlv_32= '}' otherlv_33= 'delete' otherlv_34= '(' ( (lv_deleteby_35_0= RULE_INTEGER ) ) otherlv_36= ')' otherlv_37= '{' ( (lv_deleteMethod_38_0= ruleBlock ) ) (otherlv_39= 'throw' ( (lv_exception4_40_0= ruleRestExceptionList ) ) )? otherlv_41= '}' otherlv_42= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleResource1662); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:795:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:796:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:797:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1679); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleResource1696); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:817:1: ( (otherlv_3= RULE_ID ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==RULE_ID) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:818:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:818:1: (otherlv_3= RULE_ID )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:819:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getResourceRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1716); 

            	    		newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getServiceServiceCrossReference_3_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:830:3: ( (otherlv_4= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:831:1: (otherlv_4= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:831:1: (otherlv_4= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:832:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1737); 

            		newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getExceptionMapperExceptionMapperCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleResource1749); 

                	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getCreateKeyword_5());
                
            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleResource1761); 

                	newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_6());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:851:1: ( (otherlv_7= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:1: (otherlv_7= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:852:1: (otherlv_7= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:853:3: otherlv_7= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                    
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1781); 

            		newLeafNode(otherlv_7, grammarAccess.getResourceAccess().getCreateRestModelRestModelCrossReference_7_0()); 
            	

            }


            }

            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleResource1793); 

                	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getRightParenthesisKeyword_8());
                
            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleResource1805); 

                	newLeafNode(otherlv_9, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_9());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:872:1: ( (lv_createValService_10_0= ruleValidationService ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:1: (lv_createValService_10_0= ruleValidationService )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:873:1: (lv_createValService_10_0= ruleValidationService )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:874:3: lv_createValService_10_0= ruleValidationService
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getCreateValServiceValidationServiceParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleValidationService_in_ruleResource1826);
            lv_createValService_10_0=ruleValidationService();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"createValService",
                    		lv_createValService_10_0, 
                    		"ValidationService");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:890:2: ( (lv_createMethod_11_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:1: (lv_createMethod_11_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:891:1: (lv_createMethod_11_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:892:3: lv_createMethod_11_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getCreateMethodBlockParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleResource1847);
            lv_createMethod_11_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"createMethod",
                    		lv_createMethod_11_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:908:2: ( (lv_createConclusion_12_0= ruleRestModelMethodConclusion ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:909:1: (lv_createConclusion_12_0= ruleRestModelMethodConclusion )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:909:1: (lv_createConclusion_12_0= ruleRestModelMethodConclusion )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:910:3: lv_createConclusion_12_0= ruleRestModelMethodConclusion
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getCreateConclusionRestModelMethodConclusionParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleRestModelMethodConclusion_in_ruleResource1868);
            lv_createConclusion_12_0=ruleRestModelMethodConclusion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"createConclusion",
                    		lv_createConclusion_12_0, 
                    		"RestModelMethodConclusion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleResource1880); 

                	newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_13());
                
            otherlv_14=(Token)match(input,30,FOLLOW_30_in_ruleResource1892); 

                	newLeafNode(otherlv_14, grammarAccess.getResourceAccess().getFindKeyword_14());
                
            otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleResource1904); 

                	newLeafNode(otherlv_15, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_15());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:938:1: ( (lv_findby_16_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:939:1: (lv_findby_16_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:939:1: (lv_findby_16_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:940:3: lv_findby_16_0= RULE_INTEGER
            {
            lv_findby_16_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleResource1921); 

            			newLeafNode(lv_findby_16_0, grammarAccess.getResourceAccess().getFindbyINTEGERTerminalRuleCall_16_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"findby",
                    		lv_findby_16_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_17=(Token)match(input,26,FOLLOW_26_in_ruleResource1938); 

                	newLeafNode(otherlv_17, grammarAccess.getResourceAccess().getRightParenthesisKeyword_17());
                
            otherlv_18=(Token)match(input,17,FOLLOW_17_in_ruleResource1950); 

                	newLeafNode(otherlv_18, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_18());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:964:1: ( (lv_findMethod_19_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:1: (lv_findMethod_19_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:965:1: (lv_findMethod_19_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:966:3: lv_findMethod_19_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getFindMethodBlockParserRuleCall_19_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleResource1971);
            lv_findMethod_19_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"findMethod",
                    		lv_findMethod_19_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:982:2: ( (lv_findConclusion_20_0= ruleRestModelMethodConclusion ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:983:1: (lv_findConclusion_20_0= ruleRestModelMethodConclusion )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:983:1: (lv_findConclusion_20_0= ruleRestModelMethodConclusion )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:984:3: lv_findConclusion_20_0= ruleRestModelMethodConclusion
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getFindConclusionRestModelMethodConclusionParserRuleCall_20_0()); 
            	    
            pushFollow(FOLLOW_ruleRestModelMethodConclusion_in_ruleResource1992);
            lv_findConclusion_20_0=ruleRestModelMethodConclusion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"findConclusion",
                    		lv_findConclusion_20_0, 
                    		"RestModelMethodConclusion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_21=(Token)match(input,20,FOLLOW_20_in_ruleResource2004); 

                	newLeafNode(otherlv_21, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_21());
                
            otherlv_22=(Token)match(input,31,FOLLOW_31_in_ruleResource2016); 

                	newLeafNode(otherlv_22, grammarAccess.getResourceAccess().getUpdateKeyword_22());
                
            otherlv_23=(Token)match(input,24,FOLLOW_24_in_ruleResource2028); 

                	newLeafNode(otherlv_23, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_23());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:1: ( (lv_updateby_24_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1013:1: (lv_updateby_24_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1013:1: (lv_updateby_24_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1014:3: lv_updateby_24_0= RULE_INTEGER
            {
            lv_updateby_24_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleResource2045); 

            			newLeafNode(lv_updateby_24_0, grammarAccess.getResourceAccess().getUpdatebyINTEGERTerminalRuleCall_24_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"updateby",
                    		lv_updateby_24_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_25=(Token)match(input,32,FOLLOW_32_in_ruleResource2062); 

                	newLeafNode(otherlv_25, grammarAccess.getResourceAccess().getCommaKeyword_25());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1034:1: ( (otherlv_26= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1035:1: (otherlv_26= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1035:1: (otherlv_26= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:3: otherlv_26= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                    
            otherlv_26=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource2082); 

            		newLeafNode(otherlv_26, grammarAccess.getResourceAccess().getUpdateRestModelRestModelCrossReference_26_0()); 
            	

            }


            }

            otherlv_27=(Token)match(input,26,FOLLOW_26_in_ruleResource2094); 

                	newLeafNode(otherlv_27, grammarAccess.getResourceAccess().getRightParenthesisKeyword_27());
                
            otherlv_28=(Token)match(input,17,FOLLOW_17_in_ruleResource2106); 

                	newLeafNode(otherlv_28, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_28());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1055:1: ( (lv_updateValService_29_0= ruleValidationService ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1056:1: (lv_updateValService_29_0= ruleValidationService )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1056:1: (lv_updateValService_29_0= ruleValidationService )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1057:3: lv_updateValService_29_0= ruleValidationService
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getUpdateValServiceValidationServiceParserRuleCall_29_0()); 
            	    
            pushFollow(FOLLOW_ruleValidationService_in_ruleResource2127);
            lv_updateValService_29_0=ruleValidationService();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"updateValService",
                    		lv_updateValService_29_0, 
                    		"ValidationService");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:2: ( (lv_updateMethod_30_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:1: (lv_updateMethod_30_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:1: (lv_updateMethod_30_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:3: lv_updateMethod_30_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getUpdateMethodBlockParserRuleCall_30_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleResource2148);
            lv_updateMethod_30_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"updateMethod",
                    		lv_updateMethod_30_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:2: ( (lv_updateConclusion_31_0= ruleRestModelMethodConclusion ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:1: (lv_updateConclusion_31_0= ruleRestModelMethodConclusion )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1092:1: (lv_updateConclusion_31_0= ruleRestModelMethodConclusion )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:3: lv_updateConclusion_31_0= ruleRestModelMethodConclusion
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getUpdateConclusionRestModelMethodConclusionParserRuleCall_31_0()); 
            	    
            pushFollow(FOLLOW_ruleRestModelMethodConclusion_in_ruleResource2169);
            lv_updateConclusion_31_0=ruleRestModelMethodConclusion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"updateConclusion",
                    		lv_updateConclusion_31_0, 
                    		"RestModelMethodConclusion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_32=(Token)match(input,20,FOLLOW_20_in_ruleResource2181); 

                	newLeafNode(otherlv_32, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_32());
                
            otherlv_33=(Token)match(input,33,FOLLOW_33_in_ruleResource2193); 

                	newLeafNode(otherlv_33, grammarAccess.getResourceAccess().getDeleteKeyword_33());
                
            otherlv_34=(Token)match(input,24,FOLLOW_24_in_ruleResource2205); 

                	newLeafNode(otherlv_34, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_34());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:1: ( (lv_deleteby_35_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1122:1: (lv_deleteby_35_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1122:1: (lv_deleteby_35_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1123:3: lv_deleteby_35_0= RULE_INTEGER
            {
            lv_deleteby_35_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleResource2222); 

            			newLeafNode(lv_deleteby_35_0, grammarAccess.getResourceAccess().getDeletebyINTEGERTerminalRuleCall_35_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"deleteby",
                    		lv_deleteby_35_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_36=(Token)match(input,26,FOLLOW_26_in_ruleResource2239); 

                	newLeafNode(otherlv_36, grammarAccess.getResourceAccess().getRightParenthesisKeyword_36());
                
            otherlv_37=(Token)match(input,17,FOLLOW_17_in_ruleResource2251); 

                	newLeafNode(otherlv_37, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_37());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:1: ( (lv_deleteMethod_38_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:1: (lv_deleteMethod_38_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:1: (lv_deleteMethod_38_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:3: lv_deleteMethod_38_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getResourceAccess().getDeleteMethodBlockParserRuleCall_38_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleResource2272);
            lv_deleteMethod_38_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	        }
                   		set(
                   			current, 
                   			"deleteMethod",
                    		lv_deleteMethod_38_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:2: (otherlv_39= 'throw' ( (lv_exception4_40_0= ruleRestExceptionList ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1165:4: otherlv_39= 'throw' ( (lv_exception4_40_0= ruleRestExceptionList ) )
                    {
                    otherlv_39=(Token)match(input,34,FOLLOW_34_in_ruleResource2285); 

                        	newLeafNode(otherlv_39, grammarAccess.getResourceAccess().getThrowKeyword_39_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1169:1: ( (lv_exception4_40_0= ruleRestExceptionList ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:1: (lv_exception4_40_0= ruleRestExceptionList )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1170:1: (lv_exception4_40_0= ruleRestExceptionList )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1171:3: lv_exception4_40_0= ruleRestExceptionList
                    {
                     
                    	        newCompositeNode(grammarAccess.getResourceAccess().getException4RestExceptionListParserRuleCall_39_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRestExceptionList_in_ruleResource2306);
                    lv_exception4_40_0=ruleRestExceptionList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getResourceRule());
                    	        }
                           		set(
                           			current, 
                           			"exception4",
                            		lv_exception4_40_0, 
                            		"RestExceptionList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_41=(Token)match(input,20,FOLLOW_20_in_ruleResource2320); 

                	newLeafNode(otherlv_41, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_40());
                
            otherlv_42=(Token)match(input,20,FOLLOW_20_in_ruleResource2332); 

                	newLeafNode(otherlv_42, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_41());
                

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1203:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1204:2: (iv_ruleService= ruleService EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1205:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_ruleService_in_entryRuleService2368);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleService2378); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1212:1: ruleService returns [EObject current=null] : (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'create' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_createMethod_9_0= ruleBlock ) ) ( (lv_createConclusion_10_0= ruleDataModelMethodConclusion ) ) otherlv_11= '}' otherlv_12= 'find' otherlv_13= '(' ( (lv_findby_14_0= RULE_INTEGER ) ) otherlv_15= ')' otherlv_16= '{' ( (lv_findMethod_17_0= ruleBlock ) ) ( (lv_findConclusion_18_0= ruleDataModelMethodConclusion ) ) otherlv_19= '}' otherlv_20= 'update' otherlv_21= '(' ( (lv_updateby_22_0= RULE_INTEGER ) ) otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')' otherlv_26= '{' ( (lv_updateMethod_27_0= ruleBlock ) ) ( (lv_updateConclusion_28_0= ruleDataModelMethodConclusion ) ) otherlv_29= '}' otherlv_30= 'delete' otherlv_31= '(' ( (lv_deleteby_32_0= RULE_INTEGER ) ) otherlv_33= ')' otherlv_34= '{' ( (lv_deleteMethod_35_0= ruleBlock ) ) (otherlv_36= 'throw' ( (lv_exception4_37_0= ruleRestExceptionList ) ) )? otherlv_38= '}' otherlv_39= '}' ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_findby_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_updateby_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token lv_deleteby_32_0=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        EObject lv_createMethod_9_0 = null;

        EObject lv_createConclusion_10_0 = null;

        EObject lv_findMethod_17_0 = null;

        EObject lv_findConclusion_18_0 = null;

        EObject lv_updateMethod_27_0 = null;

        EObject lv_updateConclusion_28_0 = null;

        EObject lv_deleteMethod_35_0 = null;

        EObject lv_exception4_37_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1215:28: ( (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'create' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_createMethod_9_0= ruleBlock ) ) ( (lv_createConclusion_10_0= ruleDataModelMethodConclusion ) ) otherlv_11= '}' otherlv_12= 'find' otherlv_13= '(' ( (lv_findby_14_0= RULE_INTEGER ) ) otherlv_15= ')' otherlv_16= '{' ( (lv_findMethod_17_0= ruleBlock ) ) ( (lv_findConclusion_18_0= ruleDataModelMethodConclusion ) ) otherlv_19= '}' otherlv_20= 'update' otherlv_21= '(' ( (lv_updateby_22_0= RULE_INTEGER ) ) otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')' otherlv_26= '{' ( (lv_updateMethod_27_0= ruleBlock ) ) ( (lv_updateConclusion_28_0= ruleDataModelMethodConclusion ) ) otherlv_29= '}' otherlv_30= 'delete' otherlv_31= '(' ( (lv_deleteby_32_0= RULE_INTEGER ) ) otherlv_33= ')' otherlv_34= '{' ( (lv_deleteMethod_35_0= ruleBlock ) ) (otherlv_36= 'throw' ( (lv_exception4_37_0= ruleRestExceptionList ) ) )? otherlv_38= '}' otherlv_39= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1216:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'create' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_createMethod_9_0= ruleBlock ) ) ( (lv_createConclusion_10_0= ruleDataModelMethodConclusion ) ) otherlv_11= '}' otherlv_12= 'find' otherlv_13= '(' ( (lv_findby_14_0= RULE_INTEGER ) ) otherlv_15= ')' otherlv_16= '{' ( (lv_findMethod_17_0= ruleBlock ) ) ( (lv_findConclusion_18_0= ruleDataModelMethodConclusion ) ) otherlv_19= '}' otherlv_20= 'update' otherlv_21= '(' ( (lv_updateby_22_0= RULE_INTEGER ) ) otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')' otherlv_26= '{' ( (lv_updateMethod_27_0= ruleBlock ) ) ( (lv_updateConclusion_28_0= ruleDataModelMethodConclusion ) ) otherlv_29= '}' otherlv_30= 'delete' otherlv_31= '(' ( (lv_deleteby_32_0= RULE_INTEGER ) ) otherlv_33= ')' otherlv_34= '{' ( (lv_deleteMethod_35_0= ruleBlock ) ) (otherlv_36= 'throw' ( (lv_exception4_37_0= ruleRestExceptionList ) ) )? otherlv_38= '}' otherlv_39= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1216:1: (otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'create' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_createMethod_9_0= ruleBlock ) ) ( (lv_createConclusion_10_0= ruleDataModelMethodConclusion ) ) otherlv_11= '}' otherlv_12= 'find' otherlv_13= '(' ( (lv_findby_14_0= RULE_INTEGER ) ) otherlv_15= ')' otherlv_16= '{' ( (lv_findMethod_17_0= ruleBlock ) ) ( (lv_findConclusion_18_0= ruleDataModelMethodConclusion ) ) otherlv_19= '}' otherlv_20= 'update' otherlv_21= '(' ( (lv_updateby_22_0= RULE_INTEGER ) ) otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')' otherlv_26= '{' ( (lv_updateMethod_27_0= ruleBlock ) ) ( (lv_updateConclusion_28_0= ruleDataModelMethodConclusion ) ) otherlv_29= '}' otherlv_30= 'delete' otherlv_31= '(' ( (lv_deleteby_32_0= RULE_INTEGER ) ) otherlv_33= ')' otherlv_34= '{' ( (lv_deleteMethod_35_0= ruleBlock ) ) (otherlv_36= 'throw' ( (lv_exception4_37_0= ruleRestExceptionList ) ) )? otherlv_38= '}' otherlv_39= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1216:3: otherlv_0= 'Service' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'create' otherlv_5= '(' ( (otherlv_6= RULE_ID ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_createMethod_9_0= ruleBlock ) ) ( (lv_createConclusion_10_0= ruleDataModelMethodConclusion ) ) otherlv_11= '}' otherlv_12= 'find' otherlv_13= '(' ( (lv_findby_14_0= RULE_INTEGER ) ) otherlv_15= ')' otherlv_16= '{' ( (lv_findMethod_17_0= ruleBlock ) ) ( (lv_findConclusion_18_0= ruleDataModelMethodConclusion ) ) otherlv_19= '}' otherlv_20= 'update' otherlv_21= '(' ( (lv_updateby_22_0= RULE_INTEGER ) ) otherlv_23= ',' ( (otherlv_24= RULE_ID ) ) otherlv_25= ')' otherlv_26= '{' ( (lv_updateMethod_27_0= ruleBlock ) ) ( (lv_updateConclusion_28_0= ruleDataModelMethodConclusion ) ) otherlv_29= '}' otherlv_30= 'delete' otherlv_31= '(' ( (lv_deleteby_32_0= RULE_INTEGER ) ) otherlv_33= ')' otherlv_34= '{' ( (lv_deleteMethod_35_0= ruleBlock ) ) (otherlv_36= 'throw' ( (lv_exception4_37_0= ruleRestExceptionList ) ) )? otherlv_38= '}' otherlv_39= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleService2415); 

                	newLeafNode(otherlv_0, grammarAccess.getServiceAccess().getServiceKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1220:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1221:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1221:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1222:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2432); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleService2449); 

                	newLeafNode(otherlv_2, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1242:1: ( (otherlv_3= RULE_ID ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1243:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1243:1: (otherlv_3= RULE_ID )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1244:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getServiceRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2469); 

            	    		newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getDaoDataAccessObjectCrossReference_3_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleService2482); 

                	newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getCreateKeyword_4());
                
            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleService2494); 

                	newLeafNode(otherlv_5, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_5());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1263:1: ( (otherlv_6= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:1: (otherlv_6= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1264:1: (otherlv_6= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1265:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2514); 

            		newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getCreateDataModelDataModelCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleService2526); 

                	newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getRightParenthesisKeyword_7());
                
            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleService2538); 

                	newLeafNode(otherlv_8, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_8());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1284:1: ( (lv_createMethod_9_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:1: (lv_createMethod_9_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:1: (lv_createMethod_9_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1286:3: lv_createMethod_9_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getCreateMethodBlockParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleService2559);
            lv_createMethod_9_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"createMethod",
                    		lv_createMethod_9_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1302:2: ( (lv_createConclusion_10_0= ruleDataModelMethodConclusion ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1303:1: (lv_createConclusion_10_0= ruleDataModelMethodConclusion )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1303:1: (lv_createConclusion_10_0= ruleDataModelMethodConclusion )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1304:3: lv_createConclusion_10_0= ruleDataModelMethodConclusion
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getCreateConclusionDataModelMethodConclusionParserRuleCall_10_0()); 
            	    
            pushFollow(FOLLOW_ruleDataModelMethodConclusion_in_ruleService2580);
            lv_createConclusion_10_0=ruleDataModelMethodConclusion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"createConclusion",
                    		lv_createConclusion_10_0, 
                    		"DataModelMethodConclusion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleService2592); 

                	newLeafNode(otherlv_11, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_11());
                
            otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleService2604); 

                	newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getFindKeyword_12());
                
            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleService2616); 

                	newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_13());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1332:1: ( (lv_findby_14_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1333:1: (lv_findby_14_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1333:1: (lv_findby_14_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1334:3: lv_findby_14_0= RULE_INTEGER
            {
            lv_findby_14_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleService2633); 

            			newLeafNode(lv_findby_14_0, grammarAccess.getServiceAccess().getFindbyINTEGERTerminalRuleCall_14_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"findby",
                    		lv_findby_14_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleService2650); 

                	newLeafNode(otherlv_15, grammarAccess.getServiceAccess().getRightParenthesisKeyword_15());
                
            otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleService2662); 

                	newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_16());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:1: ( (lv_findMethod_17_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:1: (lv_findMethod_17_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:1: (lv_findMethod_17_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1360:3: lv_findMethod_17_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getFindMethodBlockParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleService2683);
            lv_findMethod_17_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"findMethod",
                    		lv_findMethod_17_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1376:2: ( (lv_findConclusion_18_0= ruleDataModelMethodConclusion ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:1: (lv_findConclusion_18_0= ruleDataModelMethodConclusion )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1377:1: (lv_findConclusion_18_0= ruleDataModelMethodConclusion )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1378:3: lv_findConclusion_18_0= ruleDataModelMethodConclusion
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getFindConclusionDataModelMethodConclusionParserRuleCall_18_0()); 
            	    
            pushFollow(FOLLOW_ruleDataModelMethodConclusion_in_ruleService2704);
            lv_findConclusion_18_0=ruleDataModelMethodConclusion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"findConclusion",
                    		lv_findConclusion_18_0, 
                    		"DataModelMethodConclusion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleService2716); 

                	newLeafNode(otherlv_19, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_19());
                
            otherlv_20=(Token)match(input,31,FOLLOW_31_in_ruleService2728); 

                	newLeafNode(otherlv_20, grammarAccess.getServiceAccess().getUpdateKeyword_20());
                
            otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleService2740); 

                	newLeafNode(otherlv_21, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_21());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:1: ( (lv_updateby_22_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1407:1: (lv_updateby_22_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1407:1: (lv_updateby_22_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1408:3: lv_updateby_22_0= RULE_INTEGER
            {
            lv_updateby_22_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleService2757); 

            			newLeafNode(lv_updateby_22_0, grammarAccess.getServiceAccess().getUpdatebyINTEGERTerminalRuleCall_22_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"updateby",
                    		lv_updateby_22_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_23=(Token)match(input,32,FOLLOW_32_in_ruleService2774); 

                	newLeafNode(otherlv_23, grammarAccess.getServiceAccess().getCommaKeyword_23());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1428:1: ( (otherlv_24= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1429:1: (otherlv_24= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1429:1: (otherlv_24= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1430:3: otherlv_24= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                    
            otherlv_24=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleService2794); 

            		newLeafNode(otherlv_24, grammarAccess.getServiceAccess().getUpdateDataModelDataModelCrossReference_24_0()); 
            	

            }


            }

            otherlv_25=(Token)match(input,26,FOLLOW_26_in_ruleService2806); 

                	newLeafNode(otherlv_25, grammarAccess.getServiceAccess().getRightParenthesisKeyword_25());
                
            otherlv_26=(Token)match(input,17,FOLLOW_17_in_ruleService2818); 

                	newLeafNode(otherlv_26, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_26());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1449:1: ( (lv_updateMethod_27_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1450:1: (lv_updateMethod_27_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1450:1: (lv_updateMethod_27_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1451:3: lv_updateMethod_27_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getUpdateMethodBlockParserRuleCall_27_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleService2839);
            lv_updateMethod_27_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"updateMethod",
                    		lv_updateMethod_27_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1467:2: ( (lv_updateConclusion_28_0= ruleDataModelMethodConclusion ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1468:1: (lv_updateConclusion_28_0= ruleDataModelMethodConclusion )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1468:1: (lv_updateConclusion_28_0= ruleDataModelMethodConclusion )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1469:3: lv_updateConclusion_28_0= ruleDataModelMethodConclusion
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getUpdateConclusionDataModelMethodConclusionParserRuleCall_28_0()); 
            	    
            pushFollow(FOLLOW_ruleDataModelMethodConclusion_in_ruleService2860);
            lv_updateConclusion_28_0=ruleDataModelMethodConclusion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"updateConclusion",
                    		lv_updateConclusion_28_0, 
                    		"DataModelMethodConclusion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_29=(Token)match(input,20,FOLLOW_20_in_ruleService2872); 

                	newLeafNode(otherlv_29, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_29());
                
            otherlv_30=(Token)match(input,33,FOLLOW_33_in_ruleService2884); 

                	newLeafNode(otherlv_30, grammarAccess.getServiceAccess().getDeleteKeyword_30());
                
            otherlv_31=(Token)match(input,24,FOLLOW_24_in_ruleService2896); 

                	newLeafNode(otherlv_31, grammarAccess.getServiceAccess().getLeftParenthesisKeyword_31());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1497:1: ( (lv_deleteby_32_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1498:1: (lv_deleteby_32_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1498:1: (lv_deleteby_32_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1499:3: lv_deleteby_32_0= RULE_INTEGER
            {
            lv_deleteby_32_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleService2913); 

            			newLeafNode(lv_deleteby_32_0, grammarAccess.getServiceAccess().getDeletebyINTEGERTerminalRuleCall_32_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getServiceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"deleteby",
                    		lv_deleteby_32_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_33=(Token)match(input,26,FOLLOW_26_in_ruleService2930); 

                	newLeafNode(otherlv_33, grammarAccess.getServiceAccess().getRightParenthesisKeyword_33());
                
            otherlv_34=(Token)match(input,17,FOLLOW_17_in_ruleService2942); 

                	newLeafNode(otherlv_34, grammarAccess.getServiceAccess().getLeftCurlyBracketKeyword_34());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1523:1: ( (lv_deleteMethod_35_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1524:1: (lv_deleteMethod_35_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1524:1: (lv_deleteMethod_35_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1525:3: lv_deleteMethod_35_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getServiceAccess().getDeleteMethodBlockParserRuleCall_35_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleService2963);
            lv_deleteMethod_35_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getServiceRule());
            	        }
                   		set(
                   			current, 
                   			"deleteMethod",
                    		lv_deleteMethod_35_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1541:2: (otherlv_36= 'throw' ( (lv_exception4_37_0= ruleRestExceptionList ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1541:4: otherlv_36= 'throw' ( (lv_exception4_37_0= ruleRestExceptionList ) )
                    {
                    otherlv_36=(Token)match(input,34,FOLLOW_34_in_ruleService2976); 

                        	newLeafNode(otherlv_36, grammarAccess.getServiceAccess().getThrowKeyword_36_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1545:1: ( (lv_exception4_37_0= ruleRestExceptionList ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1546:1: (lv_exception4_37_0= ruleRestExceptionList )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1546:1: (lv_exception4_37_0= ruleRestExceptionList )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1547:3: lv_exception4_37_0= ruleRestExceptionList
                    {
                     
                    	        newCompositeNode(grammarAccess.getServiceAccess().getException4RestExceptionListParserRuleCall_36_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRestExceptionList_in_ruleService2997);
                    lv_exception4_37_0=ruleRestExceptionList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getServiceRule());
                    	        }
                           		set(
                           			current, 
                           			"exception4",
                            		lv_exception4_37_0, 
                            		"RestExceptionList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_38=(Token)match(input,20,FOLLOW_20_in_ruleService3011); 

                	newLeafNode(otherlv_38, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_37());
                
            otherlv_39=(Token)match(input,20,FOLLOW_20_in_ruleService3023); 

                	newLeafNode(otherlv_39, grammarAccess.getServiceAccess().getRightCurlyBracketKeyword_38());
                

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


    // $ANTLR start "entryRuleValidationService"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1579:1: entryRuleValidationService returns [EObject current=null] : iv_ruleValidationService= ruleValidationService EOF ;
    public final EObject entryRuleValidationService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValidationService = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1580:2: (iv_ruleValidationService= ruleValidationService EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1581:2: iv_ruleValidationService= ruleValidationService EOF
            {
             newCompositeNode(grammarAccess.getValidationServiceRule()); 
            pushFollow(FOLLOW_ruleValidationService_in_entryRuleValidationService3059);
            iv_ruleValidationService=ruleValidationService();

            state._fsp--;

             current =iv_ruleValidationService; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidationService3069); 

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
    // $ANTLR end "entryRuleValidationService"


    // $ANTLR start "ruleValidationService"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1588:1: ruleValidationService returns [EObject current=null] : (otherlv_0= 'validate' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' ) ;
    public final EObject ruleValidationService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_block_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1591:28: ( (otherlv_0= 'validate' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1592:1: (otherlv_0= 'validate' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1592:1: (otherlv_0= 'validate' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1592:3: otherlv_0= 'validate' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_block_5_0= ruleBlock ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleValidationService3106); 

                	newLeafNode(otherlv_0, grammarAccess.getValidationServiceAccess().getValidateKeyword_0());
                
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleValidationService3118); 

                	newLeafNode(otherlv_1, grammarAccess.getValidationServiceAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1600:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1601:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1601:1: (otherlv_2= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1602:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getValidationServiceRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidationService3138); 

            		newLeafNode(otherlv_2, grammarAccess.getValidationServiceAccess().getRestModelRestModelCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleValidationService3150); 

                	newLeafNode(otherlv_3, grammarAccess.getValidationServiceAccess().getRightParenthesisKeyword_3());
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleValidationService3162); 

                	newLeafNode(otherlv_4, grammarAccess.getValidationServiceAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1621:1: ( (lv_block_5_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1622:1: (lv_block_5_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1622:1: (lv_block_5_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1623:3: lv_block_5_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getValidationServiceAccess().getBlockBlockParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleValidationService3183);
            lv_block_5_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValidationServiceRule());
            	        }
                   		set(
                   			current, 
                   			"block",
                    		lv_block_5_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleValidationService3195); 

                	newLeafNode(otherlv_6, grammarAccess.getValidationServiceAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleValidationService"


    // $ANTLR start "entryRuleDataAccessObject"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1651:1: entryRuleDataAccessObject returns [EObject current=null] : iv_ruleDataAccessObject= ruleDataAccessObject EOF ;
    public final EObject entryRuleDataAccessObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataAccessObject = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1652:2: (iv_ruleDataAccessObject= ruleDataAccessObject EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1653:2: iv_ruleDataAccessObject= ruleDataAccessObject EOF
            {
             newCompositeNode(grammarAccess.getDataAccessObjectRule()); 
            pushFollow(FOLLOW_ruleDataAccessObject_in_entryRuleDataAccessObject3231);
            iv_ruleDataAccessObject=ruleDataAccessObject();

            state._fsp--;

             current =iv_ruleDataAccessObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataAccessObject3241); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1660:1: ruleDataAccessObject returns [EObject current=null] : (otherlv_0= 'DAO' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'create' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_createMethod_8_0= ruleBlock ) ) ( (lv_createConclusion_9_0= ruleDataModelMethodConclusion ) ) otherlv_10= '}' otherlv_11= 'find' otherlv_12= '(' ( (lv_findby_13_0= RULE_INTEGER ) ) otherlv_14= ')' otherlv_15= '{' ( (lv_findMethod_16_0= ruleBlock ) ) ( (lv_findConclusion_17_0= ruleDataModelMethodConclusion ) ) otherlv_18= '}' otherlv_19= 'update' otherlv_20= '(' ( (lv_updateby_21_0= RULE_INTEGER ) ) otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' otherlv_25= '{' ( (lv_updateMethod_26_0= ruleBlock ) ) ( (lv_updateConclusion_27_0= ruleDataModelMethodConclusion ) ) otherlv_28= '}' otherlv_29= 'delete' otherlv_30= '(' ( (lv_deleteby_31_0= RULE_INTEGER ) ) otherlv_32= ')' otherlv_33= '{' ( (lv_deleteMethod_34_0= ruleBlock ) ) (otherlv_35= 'throw' ( (lv_exceptions_36_0= ruleRestExceptionList ) ) )? otherlv_37= '}' otherlv_38= '}' ) ;
    public final EObject ruleDataAccessObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_findby_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_updateby_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token lv_deleteby_31_0=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        EObject lv_createMethod_8_0 = null;

        EObject lv_createConclusion_9_0 = null;

        EObject lv_findMethod_16_0 = null;

        EObject lv_findConclusion_17_0 = null;

        EObject lv_updateMethod_26_0 = null;

        EObject lv_updateConclusion_27_0 = null;

        EObject lv_deleteMethod_34_0 = null;

        EObject lv_exceptions_36_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1663:28: ( (otherlv_0= 'DAO' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'create' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_createMethod_8_0= ruleBlock ) ) ( (lv_createConclusion_9_0= ruleDataModelMethodConclusion ) ) otherlv_10= '}' otherlv_11= 'find' otherlv_12= '(' ( (lv_findby_13_0= RULE_INTEGER ) ) otherlv_14= ')' otherlv_15= '{' ( (lv_findMethod_16_0= ruleBlock ) ) ( (lv_findConclusion_17_0= ruleDataModelMethodConclusion ) ) otherlv_18= '}' otherlv_19= 'update' otherlv_20= '(' ( (lv_updateby_21_0= RULE_INTEGER ) ) otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' otherlv_25= '{' ( (lv_updateMethod_26_0= ruleBlock ) ) ( (lv_updateConclusion_27_0= ruleDataModelMethodConclusion ) ) otherlv_28= '}' otherlv_29= 'delete' otherlv_30= '(' ( (lv_deleteby_31_0= RULE_INTEGER ) ) otherlv_32= ')' otherlv_33= '{' ( (lv_deleteMethod_34_0= ruleBlock ) ) (otherlv_35= 'throw' ( (lv_exceptions_36_0= ruleRestExceptionList ) ) )? otherlv_37= '}' otherlv_38= '}' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1664:1: (otherlv_0= 'DAO' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'create' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_createMethod_8_0= ruleBlock ) ) ( (lv_createConclusion_9_0= ruleDataModelMethodConclusion ) ) otherlv_10= '}' otherlv_11= 'find' otherlv_12= '(' ( (lv_findby_13_0= RULE_INTEGER ) ) otherlv_14= ')' otherlv_15= '{' ( (lv_findMethod_16_0= ruleBlock ) ) ( (lv_findConclusion_17_0= ruleDataModelMethodConclusion ) ) otherlv_18= '}' otherlv_19= 'update' otherlv_20= '(' ( (lv_updateby_21_0= RULE_INTEGER ) ) otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' otherlv_25= '{' ( (lv_updateMethod_26_0= ruleBlock ) ) ( (lv_updateConclusion_27_0= ruleDataModelMethodConclusion ) ) otherlv_28= '}' otherlv_29= 'delete' otherlv_30= '(' ( (lv_deleteby_31_0= RULE_INTEGER ) ) otherlv_32= ')' otherlv_33= '{' ( (lv_deleteMethod_34_0= ruleBlock ) ) (otherlv_35= 'throw' ( (lv_exceptions_36_0= ruleRestExceptionList ) ) )? otherlv_37= '}' otherlv_38= '}' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1664:1: (otherlv_0= 'DAO' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'create' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_createMethod_8_0= ruleBlock ) ) ( (lv_createConclusion_9_0= ruleDataModelMethodConclusion ) ) otherlv_10= '}' otherlv_11= 'find' otherlv_12= '(' ( (lv_findby_13_0= RULE_INTEGER ) ) otherlv_14= ')' otherlv_15= '{' ( (lv_findMethod_16_0= ruleBlock ) ) ( (lv_findConclusion_17_0= ruleDataModelMethodConclusion ) ) otherlv_18= '}' otherlv_19= 'update' otherlv_20= '(' ( (lv_updateby_21_0= RULE_INTEGER ) ) otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' otherlv_25= '{' ( (lv_updateMethod_26_0= ruleBlock ) ) ( (lv_updateConclusion_27_0= ruleDataModelMethodConclusion ) ) otherlv_28= '}' otherlv_29= 'delete' otherlv_30= '(' ( (lv_deleteby_31_0= RULE_INTEGER ) ) otherlv_32= ')' otherlv_33= '{' ( (lv_deleteMethod_34_0= ruleBlock ) ) (otherlv_35= 'throw' ( (lv_exceptions_36_0= ruleRestExceptionList ) ) )? otherlv_37= '}' otherlv_38= '}' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1664:3: otherlv_0= 'DAO' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'create' otherlv_4= '(' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' otherlv_7= '{' ( (lv_createMethod_8_0= ruleBlock ) ) ( (lv_createConclusion_9_0= ruleDataModelMethodConclusion ) ) otherlv_10= '}' otherlv_11= 'find' otherlv_12= '(' ( (lv_findby_13_0= RULE_INTEGER ) ) otherlv_14= ')' otherlv_15= '{' ( (lv_findMethod_16_0= ruleBlock ) ) ( (lv_findConclusion_17_0= ruleDataModelMethodConclusion ) ) otherlv_18= '}' otherlv_19= 'update' otherlv_20= '(' ( (lv_updateby_21_0= RULE_INTEGER ) ) otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' otherlv_25= '{' ( (lv_updateMethod_26_0= ruleBlock ) ) ( (lv_updateConclusion_27_0= ruleDataModelMethodConclusion ) ) otherlv_28= '}' otherlv_29= 'delete' otherlv_30= '(' ( (lv_deleteby_31_0= RULE_INTEGER ) ) otherlv_32= ')' otherlv_33= '{' ( (lv_deleteMethod_34_0= ruleBlock ) ) (otherlv_35= 'throw' ( (lv_exceptions_36_0= ruleRestExceptionList ) ) )? otherlv_37= '}' otherlv_38= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleDataAccessObject3278); 

                	newLeafNode(otherlv_0, grammarAccess.getDataAccessObjectAccess().getDAOKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1668:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1669:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1669:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1670:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataAccessObject3295); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleDataAccessObject3312); 

                	newLeafNode(otherlv_2, grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleDataAccessObject3324); 

                	newLeafNode(otherlv_3, grammarAccess.getDataAccessObjectAccess().getCreateKeyword_3());
                
            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleDataAccessObject3336); 

                	newLeafNode(otherlv_4, grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1698:1: ( (otherlv_5= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1699:1: (otherlv_5= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1699:1: (otherlv_5= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1700:3: otherlv_5= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                    
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataAccessObject3356); 

            		newLeafNode(otherlv_5, grammarAccess.getDataAccessObjectAccess().getCreateDataModelDataModelCrossReference_5_0()); 
            	

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleDataAccessObject3368); 

                	newLeafNode(otherlv_6, grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_6());
                
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleDataAccessObject3380); 

                	newLeafNode(otherlv_7, grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_7());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1719:1: ( (lv_createMethod_8_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1720:1: (lv_createMethod_8_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1720:1: (lv_createMethod_8_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1721:3: lv_createMethod_8_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getCreateMethodBlockParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleDataAccessObject3401);
            lv_createMethod_8_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"createMethod",
                    		lv_createMethod_8_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1737:2: ( (lv_createConclusion_9_0= ruleDataModelMethodConclusion ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1738:1: (lv_createConclusion_9_0= ruleDataModelMethodConclusion )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1738:1: (lv_createConclusion_9_0= ruleDataModelMethodConclusion )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1739:3: lv_createConclusion_9_0= ruleDataModelMethodConclusion
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getCreateConclusionDataModelMethodConclusionParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleDataModelMethodConclusion_in_ruleDataAccessObject3422);
            lv_createConclusion_9_0=ruleDataModelMethodConclusion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"createConclusion",
                    		lv_createConclusion_9_0, 
                    		"DataModelMethodConclusion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleDataAccessObject3434); 

                	newLeafNode(otherlv_10, grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_11=(Token)match(input,30,FOLLOW_30_in_ruleDataAccessObject3446); 

                	newLeafNode(otherlv_11, grammarAccess.getDataAccessObjectAccess().getFindKeyword_11());
                
            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleDataAccessObject3458); 

                	newLeafNode(otherlv_12, grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_12());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1767:1: ( (lv_findby_13_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1768:1: (lv_findby_13_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1768:1: (lv_findby_13_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1769:3: lv_findby_13_0= RULE_INTEGER
            {
            lv_findby_13_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3475); 

            			newLeafNode(lv_findby_13_0, grammarAccess.getDataAccessObjectAccess().getFindbyINTEGERTerminalRuleCall_13_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"findby",
                    		lv_findby_13_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleDataAccessObject3492); 

                	newLeafNode(otherlv_14, grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_14());
                
            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleDataAccessObject3504); 

                	newLeafNode(otherlv_15, grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_15());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1793:1: ( (lv_findMethod_16_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1794:1: (lv_findMethod_16_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1794:1: (lv_findMethod_16_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1795:3: lv_findMethod_16_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getFindMethodBlockParserRuleCall_16_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleDataAccessObject3525);
            lv_findMethod_16_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"findMethod",
                    		lv_findMethod_16_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1811:2: ( (lv_findConclusion_17_0= ruleDataModelMethodConclusion ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1812:1: (lv_findConclusion_17_0= ruleDataModelMethodConclusion )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1812:1: (lv_findConclusion_17_0= ruleDataModelMethodConclusion )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1813:3: lv_findConclusion_17_0= ruleDataModelMethodConclusion
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getFindConclusionDataModelMethodConclusionParserRuleCall_17_0()); 
            	    
            pushFollow(FOLLOW_ruleDataModelMethodConclusion_in_ruleDataAccessObject3546);
            lv_findConclusion_17_0=ruleDataModelMethodConclusion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"findConclusion",
                    		lv_findConclusion_17_0, 
                    		"DataModelMethodConclusion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleDataAccessObject3558); 

                	newLeafNode(otherlv_18, grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_18());
                
            otherlv_19=(Token)match(input,31,FOLLOW_31_in_ruleDataAccessObject3570); 

                	newLeafNode(otherlv_19, grammarAccess.getDataAccessObjectAccess().getUpdateKeyword_19());
                
            otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleDataAccessObject3582); 

                	newLeafNode(otherlv_20, grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_20());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1841:1: ( (lv_updateby_21_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:1: (lv_updateby_21_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1842:1: (lv_updateby_21_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1843:3: lv_updateby_21_0= RULE_INTEGER
            {
            lv_updateby_21_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3599); 

            			newLeafNode(lv_updateby_21_0, grammarAccess.getDataAccessObjectAccess().getUpdatebyINTEGERTerminalRuleCall_21_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"updateby",
                    		lv_updateby_21_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_22=(Token)match(input,32,FOLLOW_32_in_ruleDataAccessObject3616); 

                	newLeafNode(otherlv_22, grammarAccess.getDataAccessObjectAccess().getCommaKeyword_22());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1863:1: ( (otherlv_23= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1864:1: (otherlv_23= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1864:1: (otherlv_23= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1865:3: otherlv_23= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                    
            otherlv_23=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataAccessObject3636); 

            		newLeafNode(otherlv_23, grammarAccess.getDataAccessObjectAccess().getUpdateDataModelDataModelCrossReference_23_0()); 
            	

            }


            }

            otherlv_24=(Token)match(input,26,FOLLOW_26_in_ruleDataAccessObject3648); 

                	newLeafNode(otherlv_24, grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_24());
                
            otherlv_25=(Token)match(input,17,FOLLOW_17_in_ruleDataAccessObject3660); 

                	newLeafNode(otherlv_25, grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_25());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1884:1: ( (lv_updateMethod_26_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1885:1: (lv_updateMethod_26_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1885:1: (lv_updateMethod_26_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1886:3: lv_updateMethod_26_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getUpdateMethodBlockParserRuleCall_26_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleDataAccessObject3681);
            lv_updateMethod_26_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"updateMethod",
                    		lv_updateMethod_26_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1902:2: ( (lv_updateConclusion_27_0= ruleDataModelMethodConclusion ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:1: (lv_updateConclusion_27_0= ruleDataModelMethodConclusion )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1903:1: (lv_updateConclusion_27_0= ruleDataModelMethodConclusion )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1904:3: lv_updateConclusion_27_0= ruleDataModelMethodConclusion
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getUpdateConclusionDataModelMethodConclusionParserRuleCall_27_0()); 
            	    
            pushFollow(FOLLOW_ruleDataModelMethodConclusion_in_ruleDataAccessObject3702);
            lv_updateConclusion_27_0=ruleDataModelMethodConclusion();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"updateConclusion",
                    		lv_updateConclusion_27_0, 
                    		"DataModelMethodConclusion");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_28=(Token)match(input,20,FOLLOW_20_in_ruleDataAccessObject3714); 

                	newLeafNode(otherlv_28, grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_28());
                
            otherlv_29=(Token)match(input,33,FOLLOW_33_in_ruleDataAccessObject3726); 

                	newLeafNode(otherlv_29, grammarAccess.getDataAccessObjectAccess().getDeleteKeyword_29());
                
            otherlv_30=(Token)match(input,24,FOLLOW_24_in_ruleDataAccessObject3738); 

                	newLeafNode(otherlv_30, grammarAccess.getDataAccessObjectAccess().getLeftParenthesisKeyword_30());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1932:1: ( (lv_deleteby_31_0= RULE_INTEGER ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1933:1: (lv_deleteby_31_0= RULE_INTEGER )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1933:1: (lv_deleteby_31_0= RULE_INTEGER )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1934:3: lv_deleteby_31_0= RULE_INTEGER
            {
            lv_deleteby_31_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3755); 

            			newLeafNode(lv_deleteby_31_0, grammarAccess.getDataAccessObjectAccess().getDeletebyINTEGERTerminalRuleCall_31_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataAccessObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"deleteby",
                    		lv_deleteby_31_0, 
                    		"INTEGER");
            	    

            }


            }

            otherlv_32=(Token)match(input,26,FOLLOW_26_in_ruleDataAccessObject3772); 

                	newLeafNode(otherlv_32, grammarAccess.getDataAccessObjectAccess().getRightParenthesisKeyword_32());
                
            otherlv_33=(Token)match(input,17,FOLLOW_17_in_ruleDataAccessObject3784); 

                	newLeafNode(otherlv_33, grammarAccess.getDataAccessObjectAccess().getLeftCurlyBracketKeyword_33());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1958:1: ( (lv_deleteMethod_34_0= ruleBlock ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1959:1: (lv_deleteMethod_34_0= ruleBlock )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1959:1: (lv_deleteMethod_34_0= ruleBlock )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1960:3: lv_deleteMethod_34_0= ruleBlock
            {
             
            	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getDeleteMethodBlockParserRuleCall_34_0()); 
            	    
            pushFollow(FOLLOW_ruleBlock_in_ruleDataAccessObject3805);
            lv_deleteMethod_34_0=ruleBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
            	        }
                   		set(
                   			current, 
                   			"deleteMethod",
                    		lv_deleteMethod_34_0, 
                    		"Block");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1976:2: (otherlv_35= 'throw' ( (lv_exceptions_36_0= ruleRestExceptionList ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1976:4: otherlv_35= 'throw' ( (lv_exceptions_36_0= ruleRestExceptionList ) )
                    {
                    otherlv_35=(Token)match(input,34,FOLLOW_34_in_ruleDataAccessObject3818); 

                        	newLeafNode(otherlv_35, grammarAccess.getDataAccessObjectAccess().getThrowKeyword_35_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1980:1: ( (lv_exceptions_36_0= ruleRestExceptionList ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:1: (lv_exceptions_36_0= ruleRestExceptionList )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1981:1: (lv_exceptions_36_0= ruleRestExceptionList )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1982:3: lv_exceptions_36_0= ruleRestExceptionList
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataAccessObjectAccess().getExceptionsRestExceptionListParserRuleCall_35_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRestExceptionList_in_ruleDataAccessObject3839);
                    lv_exceptions_36_0=ruleRestExceptionList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataAccessObjectRule());
                    	        }
                           		set(
                           			current, 
                           			"exceptions",
                            		lv_exceptions_36_0, 
                            		"RestExceptionList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_37=(Token)match(input,20,FOLLOW_20_in_ruleDataAccessObject3853); 

                	newLeafNode(otherlv_37, grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_36());
                
            otherlv_38=(Token)match(input,20,FOLLOW_20_in_ruleDataAccessObject3865); 

                	newLeafNode(otherlv_38, grammarAccess.getDataAccessObjectAccess().getRightCurlyBracketKeyword_37());
                

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


    // $ANTLR start "entryRuleDataModelMethodConclusion"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2014:1: entryRuleDataModelMethodConclusion returns [EObject current=null] : iv_ruleDataModelMethodConclusion= ruleDataModelMethodConclusion EOF ;
    public final EObject entryRuleDataModelMethodConclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModelMethodConclusion = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2015:2: (iv_ruleDataModelMethodConclusion= ruleDataModelMethodConclusion EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2016:2: iv_ruleDataModelMethodConclusion= ruleDataModelMethodConclusion EOF
            {
             newCompositeNode(grammarAccess.getDataModelMethodConclusionRule()); 
            pushFollow(FOLLOW_ruleDataModelMethodConclusion_in_entryRuleDataModelMethodConclusion3901);
            iv_ruleDataModelMethodConclusion=ruleDataModelMethodConclusion();

            state._fsp--;

             current =iv_ruleDataModelMethodConclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataModelMethodConclusion3911); 

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
    // $ANTLR end "entryRuleDataModelMethodConclusion"


    // $ANTLR start "ruleDataModelMethodConclusion"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2023:1: ruleDataModelMethodConclusion returns [EObject current=null] : ( (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'throw' ( (lv_exceptions_3_0= ruleRestExceptionList ) ) ) ) ;
    public final EObject ruleDataModelMethodConclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_exceptions_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2026:28: ( ( (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'throw' ( (lv_exceptions_3_0= ruleRestExceptionList ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2027:1: ( (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'throw' ( (lv_exceptions_3_0= ruleRestExceptionList ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2027:1: ( (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'throw' ( (lv_exceptions_3_0= ruleRestExceptionList ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2027:2: (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2027:2: (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2027:4: otherlv_0= 'return' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleDataModelMethodConclusion3949); 

                        	newLeafNode(otherlv_0, grammarAccess.getDataModelMethodConclusionAccess().getReturnKeyword_0_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2031:1: ( (otherlv_1= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2032:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2032:1: (otherlv_1= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2033:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataModelMethodConclusionRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataModelMethodConclusion3969); 

                    		newLeafNode(otherlv_1, grammarAccess.getDataModelMethodConclusionAccess().getDataModelDataModelCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2045:6: (otherlv_2= 'throw' ( (lv_exceptions_3_0= ruleRestExceptionList ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2045:6: (otherlv_2= 'throw' ( (lv_exceptions_3_0= ruleRestExceptionList ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2045:8: otherlv_2= 'throw' ( (lv_exceptions_3_0= ruleRestExceptionList ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleDataModelMethodConclusion3989); 

                        	newLeafNode(otherlv_2, grammarAccess.getDataModelMethodConclusionAccess().getThrowKeyword_1_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2049:1: ( (lv_exceptions_3_0= ruleRestExceptionList ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2050:1: (lv_exceptions_3_0= ruleRestExceptionList )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2050:1: (lv_exceptions_3_0= ruleRestExceptionList )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2051:3: lv_exceptions_3_0= ruleRestExceptionList
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataModelMethodConclusionAccess().getExceptionsRestExceptionListParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRestExceptionList_in_ruleDataModelMethodConclusion4010);
                    lv_exceptions_3_0=ruleRestExceptionList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataModelMethodConclusionRule());
                    	        }
                           		add(
                           			current, 
                           			"exceptions",
                            		lv_exceptions_3_0, 
                            		"RestExceptionList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleDataModelMethodConclusion"


    // $ANTLR start "entryRuleRestModelMethodConclusion"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2075:1: entryRuleRestModelMethodConclusion returns [EObject current=null] : iv_ruleRestModelMethodConclusion= ruleRestModelMethodConclusion EOF ;
    public final EObject entryRuleRestModelMethodConclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestModelMethodConclusion = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2076:2: (iv_ruleRestModelMethodConclusion= ruleRestModelMethodConclusion EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2077:2: iv_ruleRestModelMethodConclusion= ruleRestModelMethodConclusion EOF
            {
             newCompositeNode(grammarAccess.getRestModelMethodConclusionRule()); 
            pushFollow(FOLLOW_ruleRestModelMethodConclusion_in_entryRuleRestModelMethodConclusion4047);
            iv_ruleRestModelMethodConclusion=ruleRestModelMethodConclusion();

            state._fsp--;

             current =iv_ruleRestModelMethodConclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestModelMethodConclusion4057); 

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
    // $ANTLR end "entryRuleRestModelMethodConclusion"


    // $ANTLR start "ruleRestModelMethodConclusion"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2084:1: ruleRestModelMethodConclusion returns [EObject current=null] : ( (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'throw' ( (lv_exception_3_0= ruleRestExceptionList ) ) ) ) ;
    public final EObject ruleRestModelMethodConclusion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_exception_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2087:28: ( ( (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'throw' ( (lv_exception_3_0= ruleRestExceptionList ) ) ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2088:1: ( (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'throw' ( (lv_exception_3_0= ruleRestExceptionList ) ) ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2088:1: ( (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) ) | (otherlv_2= 'throw' ( (lv_exception_3_0= ruleRestExceptionList ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2088:2: (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2088:2: (otherlv_0= 'return' ( (otherlv_1= RULE_ID ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2088:4: otherlv_0= 'return' ( (otherlv_1= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleRestModelMethodConclusion4095); 

                        	newLeafNode(otherlv_0, grammarAccess.getRestModelMethodConclusionAccess().getReturnKeyword_0_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2092:1: ( (otherlv_1= RULE_ID ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2093:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2093:1: (otherlv_1= RULE_ID )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2094:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRestModelMethodConclusionRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRestModelMethodConclusion4115); 

                    		newLeafNode(otherlv_1, grammarAccess.getRestModelMethodConclusionAccess().getRestModelRestModelCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2106:6: (otherlv_2= 'throw' ( (lv_exception_3_0= ruleRestExceptionList ) ) )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2106:6: (otherlv_2= 'throw' ( (lv_exception_3_0= ruleRestExceptionList ) ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2106:8: otherlv_2= 'throw' ( (lv_exception_3_0= ruleRestExceptionList ) )
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleRestModelMethodConclusion4135); 

                        	newLeafNode(otherlv_2, grammarAccess.getRestModelMethodConclusionAccess().getThrowKeyword_1_0());
                        
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2110:1: ( (lv_exception_3_0= ruleRestExceptionList ) )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2111:1: (lv_exception_3_0= ruleRestExceptionList )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2111:1: (lv_exception_3_0= ruleRestExceptionList )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2112:3: lv_exception_3_0= ruleRestExceptionList
                    {
                     
                    	        newCompositeNode(grammarAccess.getRestModelMethodConclusionAccess().getExceptionRestExceptionListParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRestExceptionList_in_ruleRestModelMethodConclusion4156);
                    lv_exception_3_0=ruleRestExceptionList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRestModelMethodConclusionRule());
                    	        }
                           		add(
                           			current, 
                           			"exception",
                            		lv_exception_3_0, 
                            		"RestExceptionList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


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
    // $ANTLR end "ruleRestModelMethodConclusion"


    // $ANTLR start "entryRuleRestExceptionList"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2136:1: entryRuleRestExceptionList returns [EObject current=null] : iv_ruleRestExceptionList= ruleRestExceptionList EOF ;
    public final EObject entryRuleRestExceptionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestExceptionList = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2137:2: (iv_ruleRestExceptionList= ruleRestExceptionList EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2138:2: iv_ruleRestExceptionList= ruleRestExceptionList EOF
            {
             newCompositeNode(grammarAccess.getRestExceptionListRule()); 
            pushFollow(FOLLOW_ruleRestExceptionList_in_entryRuleRestExceptionList4193);
            iv_ruleRestExceptionList=ruleRestExceptionList();

            state._fsp--;

             current =iv_ruleRestExceptionList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestExceptionList4203); 

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
    // $ANTLR end "entryRuleRestExceptionList"


    // $ANTLR start "ruleRestExceptionList"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2145:1: ruleRestExceptionList returns [EObject current=null] : ( (lv_exception_0_0= ruleRestException ) )+ ;
    public final EObject ruleRestExceptionList() throws RecognitionException {
        EObject current = null;

        EObject lv_exception_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2148:28: ( ( (lv_exception_0_0= ruleRestException ) )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:1: ( (lv_exception_0_0= ruleRestException ) )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2149:1: ( (lv_exception_0_0= ruleRestException ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==39) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2150:1: (lv_exception_0_0= ruleRestException )
            	    {
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2150:1: (lv_exception_0_0= ruleRestException )
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2151:3: lv_exception_0_0= ruleRestException
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestExceptionListAccess().getExceptionRestExceptionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRestException_in_ruleRestExceptionList4248);
            	    lv_exception_0_0=ruleRestException();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestExceptionListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"exception",
            	            		lv_exception_0_0, 
            	            		"RestException");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
    // $ANTLR end "ruleRestExceptionList"


    // $ANTLR start "entryRuleBaseException"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2175:1: entryRuleBaseException returns [EObject current=null] : iv_ruleBaseException= ruleBaseException EOF ;
    public final EObject entryRuleBaseException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBaseException = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2176:2: (iv_ruleBaseException= ruleBaseException EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2177:2: iv_ruleBaseException= ruleBaseException EOF
            {
             newCompositeNode(grammarAccess.getBaseExceptionRule()); 
            pushFollow(FOLLOW_ruleBaseException_in_entryRuleBaseException4284);
            iv_ruleBaseException=ruleBaseException();

            state._fsp--;

             current =iv_ruleBaseException; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBaseException4294); 

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
    // $ANTLR end "entryRuleBaseException"


    // $ANTLR start "ruleBaseException"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2184:1: ruleBaseException returns [EObject current=null] : (otherlv_0= '[' ( (lv_errorCode_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ']' ) ;
    public final EObject ruleBaseException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_errorCode_1_0=null;
        Token otherlv_2=null;
        Token lv_message_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2187:28: ( (otherlv_0= '[' ( (lv_errorCode_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ']' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2188:1: (otherlv_0= '[' ( (lv_errorCode_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ']' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2188:1: (otherlv_0= '[' ( (lv_errorCode_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ']' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2188:3: otherlv_0= '[' ( (lv_errorCode_1_0= RULE_STRING ) ) otherlv_2= ',' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleBaseException4331); 

                	newLeafNode(otherlv_0, grammarAccess.getBaseExceptionAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2192:1: ( (lv_errorCode_1_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2193:1: (lv_errorCode_1_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2193:1: (lv_errorCode_1_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2194:3: lv_errorCode_1_0= RULE_STRING
            {
            lv_errorCode_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBaseException4348); 

            			newLeafNode(lv_errorCode_1_0, grammarAccess.getBaseExceptionAccess().getErrorCodeSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBaseExceptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"errorCode",
                    		lv_errorCode_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleBaseException4365); 

                	newLeafNode(otherlv_2, grammarAccess.getBaseExceptionAccess().getCommaKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2214:1: ( (lv_message_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2215:1: (lv_message_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2215:1: (lv_message_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2216:3: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBaseException4382); 

            			newLeafNode(lv_message_3_0, grammarAccess.getBaseExceptionAccess().getMessageSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBaseExceptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"message",
                    		lv_message_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleBaseException4399); 

                	newLeafNode(otherlv_4, grammarAccess.getBaseExceptionAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleBaseException"


    // $ANTLR start "entryRuleExceptionMapper"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2244:1: entryRuleExceptionMapper returns [EObject current=null] : iv_ruleExceptionMapper= ruleExceptionMapper EOF ;
    public final EObject entryRuleExceptionMapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionMapper = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2245:2: (iv_ruleExceptionMapper= ruleExceptionMapper EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2246:2: iv_ruleExceptionMapper= ruleExceptionMapper EOF
            {
             newCompositeNode(grammarAccess.getExceptionMapperRule()); 
            pushFollow(FOLLOW_ruleExceptionMapper_in_entryRuleExceptionMapper4435);
            iv_ruleExceptionMapper=ruleExceptionMapper();

            state._fsp--;

             current =iv_ruleExceptionMapper; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionMapper4445); 

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
    // $ANTLR end "entryRuleExceptionMapper"


    // $ANTLR start "ruleExceptionMapper"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2253:1: ruleExceptionMapper returns [EObject current=null] : (otherlv_0= 'ExceptionMapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_restException_3_0= ruleRestException ) ) otherlv_4= '<=>' ( (lv_baseException_5_0= ruleBaseException ) ) otherlv_6= ')' ) ;
    public final EObject ruleExceptionMapper() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_restException_3_0 = null;

        EObject lv_baseException_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2256:28: ( (otherlv_0= 'ExceptionMapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_restException_3_0= ruleRestException ) ) otherlv_4= '<=>' ( (lv_baseException_5_0= ruleBaseException ) ) otherlv_6= ')' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2257:1: (otherlv_0= 'ExceptionMapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_restException_3_0= ruleRestException ) ) otherlv_4= '<=>' ( (lv_baseException_5_0= ruleBaseException ) ) otherlv_6= ')' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2257:1: (otherlv_0= 'ExceptionMapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_restException_3_0= ruleRestException ) ) otherlv_4= '<=>' ( (lv_baseException_5_0= ruleBaseException ) ) otherlv_6= ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2257:3: otherlv_0= 'ExceptionMapper' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_restException_3_0= ruleRestException ) ) otherlv_4= '<=>' ( (lv_baseException_5_0= ruleBaseException ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleExceptionMapper4482); 

                	newLeafNode(otherlv_0, grammarAccess.getExceptionMapperAccess().getExceptionMapperKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2261:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2262:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2262:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2263:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExceptionMapper4499); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExceptionMapperAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExceptionMapperRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleExceptionMapper4516); 

                	newLeafNode(otherlv_2, grammarAccess.getExceptionMapperAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2283:1: ( (lv_restException_3_0= ruleRestException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2284:1: (lv_restException_3_0= ruleRestException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2284:1: (lv_restException_3_0= ruleRestException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2285:3: lv_restException_3_0= ruleRestException
            {
             
            	        newCompositeNode(grammarAccess.getExceptionMapperAccess().getRestExceptionRestExceptionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRestException_in_ruleExceptionMapper4537);
            lv_restException_3_0=ruleRestException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExceptionMapperRule());
            	        }
                   		set(
                   			current, 
                   			"restException",
                    		lv_restException_3_0, 
                    		"RestException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleExceptionMapper4549); 

                	newLeafNode(otherlv_4, grammarAccess.getExceptionMapperAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_4());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2305:1: ( (lv_baseException_5_0= ruleBaseException ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2306:1: (lv_baseException_5_0= ruleBaseException )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2306:1: (lv_baseException_5_0= ruleBaseException )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2307:3: lv_baseException_5_0= ruleBaseException
            {
             
            	        newCompositeNode(grammarAccess.getExceptionMapperAccess().getBaseExceptionBaseExceptionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleBaseException_in_ruleExceptionMapper4570);
            lv_baseException_5_0=ruleBaseException();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExceptionMapperRule());
            	        }
                   		set(
                   			current, 
                   			"baseException",
                    		lv_baseException_5_0, 
                    		"BaseException");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleExceptionMapper4582); 

                	newLeafNode(otherlv_6, grammarAccess.getExceptionMapperAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleExceptionMapper"


    // $ANTLR start "entryRuleRestException"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2335:1: entryRuleRestException returns [EObject current=null] : iv_ruleRestException= ruleRestException EOF ;
    public final EObject entryRuleRestException() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestException = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2336:2: (iv_ruleRestException= ruleRestException EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2337:2: iv_ruleRestException= ruleRestException EOF
            {
             newCompositeNode(grammarAccess.getRestExceptionRule()); 
            pushFollow(FOLLOW_ruleRestException_in_entryRuleRestException4618);
            iv_ruleRestException=ruleRestException();

            state._fsp--;

             current =iv_ruleRestException; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRestException4628); 

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
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2344:1: ruleRestException returns [EObject current=null] : (otherlv_0= '[' ( (lv_statusCode_1_0= ruleRestStatusCode ) ) otherlv_2= ',' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ']' ) ;
    public final EObject ruleRestException() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_message_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_statusCode_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2347:28: ( (otherlv_0= '[' ( (lv_statusCode_1_0= ruleRestStatusCode ) ) otherlv_2= ',' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ']' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2348:1: (otherlv_0= '[' ( (lv_statusCode_1_0= ruleRestStatusCode ) ) otherlv_2= ',' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ']' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2348:1: (otherlv_0= '[' ( (lv_statusCode_1_0= ruleRestStatusCode ) ) otherlv_2= ',' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ']' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2348:3: otherlv_0= '[' ( (lv_statusCode_1_0= ruleRestStatusCode ) ) otherlv_2= ',' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleRestException4665); 

                	newLeafNode(otherlv_0, grammarAccess.getRestExceptionAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2352:1: ( (lv_statusCode_1_0= ruleRestStatusCode ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2353:1: (lv_statusCode_1_0= ruleRestStatusCode )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2353:1: (lv_statusCode_1_0= ruleRestStatusCode )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2354:3: lv_statusCode_1_0= ruleRestStatusCode
            {
             
            	        newCompositeNode(grammarAccess.getRestExceptionAccess().getStatusCodeRestStatusCodeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRestStatusCode_in_ruleRestException4686);
            lv_statusCode_1_0=ruleRestStatusCode();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestExceptionRule());
            	        }
                   		set(
                   			current, 
                   			"statusCode",
                    		lv_statusCode_1_0, 
                    		"RestStatusCode");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleRestException4698); 

                	newLeafNode(otherlv_2, grammarAccess.getRestExceptionAccess().getCommaKeyword_2());
                
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2374:1: ( (lv_message_3_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2375:1: (lv_message_3_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2375:1: (lv_message_3_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2376:3: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRestException4715); 

            			newLeafNode(lv_message_3_0, grammarAccess.getRestExceptionAccess().getMessageSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRestExceptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"message",
                    		lv_message_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleRestException4732); 

                	newLeafNode(otherlv_4, grammarAccess.getRestExceptionAccess().getRightSquareBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleBlock"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2404:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2405:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2406:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock4768);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock4778); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2413:1: ruleBlock returns [EObject current=null] : ( (lv_code_0_0= RULE_STRING ) ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token lv_code_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2416:28: ( ( (lv_code_0_0= RULE_STRING ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2417:1: ( (lv_code_0_0= RULE_STRING ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2417:1: ( (lv_code_0_0= RULE_STRING ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2418:1: (lv_code_0_0= RULE_STRING )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2418:1: (lv_code_0_0= RULE_STRING )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2419:3: lv_code_0_0= RULE_STRING
            {
            lv_code_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBlock4819); 

            			newLeafNode(lv_code_0_0, grammarAccess.getBlockAccess().getCodeSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBlockRule());
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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "ruleRestStatusCode"
    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2443:1: ruleRestStatusCode returns [Enumerator current=null] : ( (enumLiteral_0= 'INFORMATIONAL' ) | (enumLiteral_1= 'SUCCESS' ) | (enumLiteral_2= 'REDIRECTION' ) | (enumLiteral_3= 'CLIENT_ERROR' ) | (enumLiteral_4= 'SERVER_ERROR' ) | (enumLiteral_5= 'NETWORK_ERROR' ) ) ;
    public final Enumerator ruleRestStatusCode() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2445:28: ( ( (enumLiteral_0= 'INFORMATIONAL' ) | (enumLiteral_1= 'SUCCESS' ) | (enumLiteral_2= 'REDIRECTION' ) | (enumLiteral_3= 'CLIENT_ERROR' ) | (enumLiteral_4= 'SERVER_ERROR' ) | (enumLiteral_5= 'NETWORK_ERROR' ) ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2446:1: ( (enumLiteral_0= 'INFORMATIONAL' ) | (enumLiteral_1= 'SUCCESS' ) | (enumLiteral_2= 'REDIRECTION' ) | (enumLiteral_3= 'CLIENT_ERROR' ) | (enumLiteral_4= 'SERVER_ERROR' ) | (enumLiteral_5= 'NETWORK_ERROR' ) )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2446:1: ( (enumLiteral_0= 'INFORMATIONAL' ) | (enumLiteral_1= 'SUCCESS' ) | (enumLiteral_2= 'REDIRECTION' ) | (enumLiteral_3= 'CLIENT_ERROR' ) | (enumLiteral_4= 'SERVER_ERROR' ) | (enumLiteral_5= 'NETWORK_ERROR' ) )
            int alt21=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt21=1;
                }
                break;
            case 43:
                {
                alt21=2;
                }
                break;
            case 44:
                {
                alt21=3;
                }
                break;
            case 45:
                {
                alt21=4;
                }
                break;
            case 46:
                {
                alt21=5;
                }
                break;
            case 47:
                {
                alt21=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2446:2: (enumLiteral_0= 'INFORMATIONAL' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2446:2: (enumLiteral_0= 'INFORMATIONAL' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2446:4: enumLiteral_0= 'INFORMATIONAL'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_42_in_ruleRestStatusCode4873); 

                            current = grammarAccess.getRestStatusCodeAccess().getINFORMATIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getRestStatusCodeAccess().getINFORMATIONALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2452:6: (enumLiteral_1= 'SUCCESS' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2452:6: (enumLiteral_1= 'SUCCESS' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2452:8: enumLiteral_1= 'SUCCESS'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleRestStatusCode4890); 

                            current = grammarAccess.getRestStatusCodeAccess().getSUCCESSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getRestStatusCodeAccess().getSUCCESSEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2458:6: (enumLiteral_2= 'REDIRECTION' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2458:6: (enumLiteral_2= 'REDIRECTION' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2458:8: enumLiteral_2= 'REDIRECTION'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_44_in_ruleRestStatusCode4907); 

                            current = grammarAccess.getRestStatusCodeAccess().getREDIRECTIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getRestStatusCodeAccess().getREDIRECTIONEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2464:6: (enumLiteral_3= 'CLIENT_ERROR' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2464:6: (enumLiteral_3= 'CLIENT_ERROR' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2464:8: enumLiteral_3= 'CLIENT_ERROR'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_45_in_ruleRestStatusCode4924); 

                            current = grammarAccess.getRestStatusCodeAccess().getCLIENT_ERROREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getRestStatusCodeAccess().getCLIENT_ERROREnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2470:6: (enumLiteral_4= 'SERVER_ERROR' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2470:6: (enumLiteral_4= 'SERVER_ERROR' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2470:8: enumLiteral_4= 'SERVER_ERROR'
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_46_in_ruleRestStatusCode4941); 

                            current = grammarAccess.getRestStatusCodeAccess().getSERVER_ERROREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getRestStatusCodeAccess().getSERVER_ERROREnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2476:6: (enumLiteral_5= 'NETWORK_ERROR' )
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2476:6: (enumLiteral_5= 'NETWORK_ERROR' )
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:2476:8: enumLiteral_5= 'NETWORK_ERROR'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_47_in_ruleRestStatusCode4958); 

                            current = grammarAccess.getRestStatusCodeAccess().getNETWORK_ERROREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getRestStatusCodeAccess().getNETWORK_ERROREnumLiteralDeclaration_5()); 
                        

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
    public static final BitSet FOLLOW_ruleType_in_ruleDomainModel131 = new BitSet(new long[]{0x0000000000A0D002L});
    public static final BitSet FOLLOW_ruleRestAPI_in_ruleDomainModel153 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_ruleType247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_ruleType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestModel_in_ruleType301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMapper_in_ruleType328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestAPI_in_entryRuleRestAPI363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestAPI373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleRestAPI410 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleResource_in_ruleRestAPI431 = new BitSet(new long[]{0x0000022800002000L});
    public static final BitSet FOLLOW_ruleService_in_ruleRestAPI452 = new BitSet(new long[]{0x0000022800002000L});
    public static final BitSet FOLLOW_ruleDataAccessObject_in_ruleRestAPI474 = new BitSet(new long[]{0x0000022000002000L});
    public static final BitSet FOLLOW_ruleExceptionMapper_in_ruleRestAPI496 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_13_in_ruleRestAPI509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveType_in_entryRulePrimitiveType545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveType555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimitiveType592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimitiveType609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModel_in_entryRuleDataModel650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModel660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleDataModel697 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel714 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleDataModel732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModel752 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataModel766 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDataModel778 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDataModel790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleDataModel807 = new BitSet(new long[]{0x0000000008100010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleDataModel833 = new BitSet(new long[]{0x0000000008100010L});
    public static final BitSet FOLLOW_20_in_ruleDataModel846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestModel_in_entryRuleRestModel882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestModel892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRestModel929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRestModel946 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleRestModel964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRestModel984 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRestModel998 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleRestModel1010 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRestModel1022 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleRestModel1039 = new BitSet(new long[]{0x0000000008400010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleRestModel1065 = new BitSet(new long[]{0x0000000008400010L});
    public static final BitSet FOLLOW_22_in_ruleRestModel1078 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRestModel1090 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRestModel1107 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleRestModel1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMapper_in_entryRuleModelMapper1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMapper1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleModelMapper1207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModelMapper1224 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModelMapper1241 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_ruleTransformation_in_ruleModelMapper1262 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleModelMapper1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation1311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTransformation1358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransformation1378 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTransformation1390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransformation1410 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTransformation1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFeature1511 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1542 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFeature1559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleResource1662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1679 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource1696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1737 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleResource1749 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleResource1761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1781 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResource1793 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource1805 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleValidationService_in_ruleResource1826 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleResource1847 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_ruleRestModelMethodConclusion_in_ruleResource1868 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleResource1880 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleResource1892 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleResource1904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleResource1921 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResource1938 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource1950 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleResource1971 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_ruleRestModelMethodConclusion_in_ruleResource1992 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleResource2004 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleResource2016 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleResource2028 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleResource2045 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleResource2062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource2082 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResource2094 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource2106 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ruleValidationService_in_ruleResource2127 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleResource2148 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_ruleRestModelMethodConclusion_in_ruleResource2169 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleResource2181 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleResource2193 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleResource2205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleResource2222 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResource2239 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource2251 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleResource2272 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleResource2285 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleRestExceptionList_in_ruleResource2306 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleResource2320 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleResource2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleService_in_entryRuleService2368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleService2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleService2415 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2432 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleService2449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2469 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_29_in_ruleService2482 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleService2494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2514 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleService2526 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleService2538 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleService2559 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_ruleDataModelMethodConclusion_in_ruleService2580 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleService2592 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleService2604 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleService2616 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleService2633 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleService2650 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleService2662 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleService2683 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_ruleDataModelMethodConclusion_in_ruleService2704 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleService2716 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleService2728 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleService2740 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleService2757 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleService2774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleService2794 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleService2806 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleService2818 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleService2839 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_ruleDataModelMethodConclusion_in_ruleService2860 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleService2872 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleService2884 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleService2896 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleService2913 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleService2930 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleService2942 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleService2963 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleService2976 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleRestExceptionList_in_ruleService2997 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleService3011 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleService3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidationService_in_entryRuleValidationService3059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidationService3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleValidationService3106 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleValidationService3118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidationService3138 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleValidationService3150 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleValidationService3162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleValidationService3183 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleValidationService3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataAccessObject_in_entryRuleDataAccessObject3231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataAccessObject3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDataAccessObject3278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataAccessObject3295 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataAccessObject3312 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDataAccessObject3324 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDataAccessObject3336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataAccessObject3356 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDataAccessObject3368 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataAccessObject3380 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleDataAccessObject3401 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_ruleDataModelMethodConclusion_in_ruleDataAccessObject3422 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDataAccessObject3434 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleDataAccessObject3446 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDataAccessObject3458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3475 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDataAccessObject3492 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataAccessObject3504 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleDataAccessObject3525 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_ruleDataModelMethodConclusion_in_ruleDataAccessObject3546 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDataAccessObject3558 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleDataAccessObject3570 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDataAccessObject3582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3599 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDataAccessObject3616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataAccessObject3636 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDataAccessObject3648 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataAccessObject3660 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleDataAccessObject3681 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_ruleDataModelMethodConclusion_in_ruleDataAccessObject3702 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDataAccessObject3714 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDataAccessObject3726 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDataAccessObject3738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleDataAccessObject3755 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleDataAccessObject3772 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDataAccessObject3784 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleDataAccessObject3805 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_34_in_ruleDataAccessObject3818 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleRestExceptionList_in_ruleDataAccessObject3839 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDataAccessObject3853 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDataAccessObject3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataModelMethodConclusion_in_entryRuleDataModelMethodConclusion3901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataModelMethodConclusion3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataModelMethodConclusion3949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataModelMethodConclusion3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDataModelMethodConclusion3989 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleRestExceptionList_in_ruleDataModelMethodConclusion4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestModelMethodConclusion_in_entryRuleRestModelMethodConclusion4047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestModelMethodConclusion4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRestModelMethodConclusion4095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRestModelMethodConclusion4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRestModelMethodConclusion4135 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleRestExceptionList_in_ruleRestModelMethodConclusion4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestExceptionList_in_entryRuleRestExceptionList4193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestExceptionList4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleRestExceptionList4248 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleBaseException_in_entryRuleBaseException4284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBaseException4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBaseException4331 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBaseException4348 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleBaseException4365 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBaseException4382 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleBaseException4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionMapper_in_entryRuleExceptionMapper4435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionMapper4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExceptionMapper4482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExceptionMapper4499 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleExceptionMapper4516 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleRestException_in_ruleExceptionMapper4537 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleExceptionMapper4549 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleBaseException_in_ruleExceptionMapper4570 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleExceptionMapper4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRestException_in_entryRuleRestException4618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRestException4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRestException4665 = new BitSet(new long[]{0x0000FC0000000000L});
    public static final BitSet FOLLOW_ruleRestStatusCode_in_ruleRestException4686 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleRestException4698 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRestException4715 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleRestException4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock4768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBlock4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRestStatusCode4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRestStatusCode4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRestStatusCode4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRestStatusCode4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRestStatusCode4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRestStatusCode4958 = new BitSet(new long[]{0x0000000000000002L});

}