/**
 * STWSCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.apus.st;


/**
 *  STWSCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class STWSCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public STWSCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public STWSCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for setTradePointCreateOrder method
     * override this method for handling normal response from setTradePointCreateOrder operation
     */
    public void receiveResultsetTradePointCreateOrder(
        com.apus.st.SetTradePointCreateOrderResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setTradePointCreateOrder operation
     */
    public void receiveErrorsetTradePointCreateOrder(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for preparePayment method
     * override this method for handling normal response from preparePayment operation
     */
    public void receiveResultpreparePayment(
        com.apus.st.PreparePaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from preparePayment operation
     */
    public void receiveErrorpreparePayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setUserSession method
     * override this method for handling normal response from setUserSession operation
     */
    public void receiveResultsetUserSession(
        com.apus.st.SetUserSessionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setUserSession operation
     */
    public void receiveErrorsetUserSession(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for userUcoins method
     * override this method for handling normal response from userUcoins operation
     */
    public void receiveResultuserUcoins(com.apus.st.UserUcoinsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from userUcoins operation
     */
    public void receiveErroruserUcoins(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for forgotPasswordSetPass method
     * override this method for handling normal response from forgotPasswordSetPass operation
     */
    public void receiveResultforgotPasswordSetPass(
        com.apus.st.ForgotPasswordSetPassResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from forgotPasswordSetPass operation
     */
    public void receiveErrorforgotPasswordSetPass(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getKvitansia method
     * override this method for handling normal response from getKvitansia operation
     */
    public void receiveResultgetKvitansia(
        com.apus.st.GetKvitansiaResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getKvitansia operation
     */
    public void receiveErrorgetKvitansia(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cardP2PPaymentConfirm method
     * override this method for handling normal response from cardP2PPaymentConfirm operation
     */
    public void receiveResultcardP2PPaymentConfirm(
        com.apus.st.CardP2PPaymentConfirmResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cardP2PPaymentConfirm operation
     */
    public void receiveErrorcardP2PPaymentConfirm(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for ucoinsInformations method
     * override this method for handling normal response from ucoinsInformations operation
     */
    public void receiveResultucoinsInformations(
        com.apus.st.UcoinsInformationsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from ucoinsInformations operation
     */
    public void receiveErrorucoinsInformations(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkTransactionOneTimeVisa method
     * override this method for handling normal response from checkTransactionOneTimeVisa operation
     */
    public void receiveResultcheckTransactionOneTimeVisa(
        com.apus.st.CheckTransactionOneTimeVisaResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkTransactionOneTimeVisa operation
     */
    public void receiveErrorcheckTransactionOneTimeVisa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for bankPayment method
     * override this method for handling normal response from bankPayment operation
     */
    public void receiveResultbankPayment(com.apus.st.BankPaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from bankPayment operation
     */
    public void receiveErrorbankPayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for bankCheckBalance method
     * override this method for handling normal response from bankCheckBalance operation
     */
    public void receiveResultbankCheckBalance(
        com.apus.st.BankCheckBalanceResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from bankCheckBalance operation
     */
    public void receiveErrorbankCheckBalance(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getServiceCategoryList method
     * override this method for handling normal response from getServiceCategoryList operation
     */
    public void receiveResultgetServiceCategoryList(
        com.apus.st.GetServiceCategoryListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getServiceCategoryList operation
     */
    public void receiveErrorgetServiceCategoryList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for removeUser method
     * override this method for handling normal response from removeUser operation
     */
    public void receiveResultremoveUser(com.apus.st.RemoveUserResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from removeUser operation
     */
    public void receiveErrorremoveUser(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for balance method
     * override this method for handling normal response from balance operation
     */
    public void receiveResultbalance(com.apus.st.BalanceResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from balance operation
     */
    public void receiveErrorbalance(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setCashback method
     * override this method for handling normal response from setCashback operation
     */
    public void receiveResultsetCashback(com.apus.st.SetCashbackResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setCashback operation
     */
    public void receiveErrorsetCashback(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for payment method
     * override this method for handling normal response from payment operation
     */
    public void receiveResultpayment(com.apus.st.PaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from payment operation
     */
    public void receiveErrorpayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testCardP2PCreate method
     * override this method for handling normal response from testCardP2PCreate operation
     */
    public void receiveResulttestCardP2PCreate(
        com.apus.st.TestCardP2PCreateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testCardP2PCreate operation
     */
    public void receiveErrortestCardP2PCreate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for findServiceAccount method
     * override this method for handling normal response from findServiceAccount operation
     */
    public void receiveResultfindServiceAccount(
        com.apus.st.FindServiceAccountResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from findServiceAccount operation
     */
    public void receiveErrorfindServiceAccount(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for userUcoinsHistory method
     * override this method for handling normal response from userUcoinsHistory operation
     */
    public void receiveResultuserUcoinsHistory(
        com.apus.st.UserUcoinsHistoryResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from userUcoinsHistory operation
     */
    public void receiveErroruserUcoinsHistory(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setQRCodeUIDCreate method
     * override this method for handling normal response from setQRCodeUIDCreate operation
     */
    public void receiveResultsetQRCodeUIDCreate(
        com.apus.st.SetQRCodeUIDCreateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setQRCodeUIDCreate operation
     */
    public void receiveErrorsetQRCodeUIDCreate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for changeUserPassword method
     * override this method for handling normal response from changeUserPassword operation
     */
    public void receiveResultchangeUserPassword(
        com.apus.st.ChangeUserPasswordResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from changeUserPassword operation
     */
    public void receiveErrorchangeUserPassword(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerHoldCancel method
     * override this method for handling normal response from partnerHoldCancel operation
     */
    public void receiveResultpartnerHoldCancel(
        com.apus.st.PartnerHoldCancelResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerHoldCancel operation
     */
    public void receiveErrorpartnerHoldCancel(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getThemeCovers method
     * override this method for handling normal response from getThemeCovers operation
     */
    public void receiveResultgetThemeCovers(
        com.apus.st.GetThemeCoversResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getThemeCovers operation
     */
    public void receiveErrorgetThemeCovers(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for paymentService method
     * override this method for handling normal response from paymentService operation
     */
    public void receiveResultpaymentService(
        com.apus.st.PaymentServiceResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from paymentService operation
     */
    public void receiveErrorpaymentService(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cardRegistration method
     * override this method for handling normal response from cardRegistration operation
     */
    public void receiveResultcardRegistration(
        com.apus.st.CardRegistrationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cardRegistration operation
     */
    public void receiveErrorcardRegistration(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUserFavoriteList method
     * override this method for handling normal response from getUserFavoriteList operation
     */
    public void receiveResultgetUserFavoriteList(
        com.apus.st.GetUserFavoriteListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUserFavoriteList operation
     */
    public void receiveErrorgetUserFavoriteList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerCardResendSms method
     * override this method for handling normal response from partnerCardResendSms operation
     */
    public void receiveResultpartnerCardResendSms(
        com.apus.st.PartnerCardResendSmsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerCardResendSms operation
     */
    public void receiveErrorpartnerCardResendSms(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCrypto method
     * override this method for handling normal response from getCrypto operation
     */
    public void receiveResultgetCrypto(com.apus.st.GetCryptoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCrypto operation
     */
    public void receiveErrorgetCrypto(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setUserInformation method
     * override this method for handling normal response from setUserInformation operation
     */
    public void receiveResultsetUserInformation(
        com.apus.st.SetUserInformationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setUserInformation operation
     */
    public void receiveErrorsetUserInformation(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for forgotPasswordConfirm method
     * override this method for handling normal response from forgotPasswordConfirm operation
     */
    public void receiveResultforgotPasswordConfirm(
        com.apus.st.ForgotPasswordConfirmResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from forgotPasswordConfirm operation
     */
    public void receiveErrorforgotPasswordConfirm(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testCardP2PPay method
     * override this method for handling normal response from testCardP2PPay operation
     */
    public void receiveResulttestCardP2PPay(
        com.apus.st.TestCardP2PPayResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testCardP2PPay operation
     */
    public void receiveErrortestCardP2PPay(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUserSession method
     * override this method for handling normal response from getUserSession operation
     */
    public void receiveResultgetUserSession(
        com.apus.st.GetUserSessionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUserSession operation
     */
    public void receiveErrorgetUserSession(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registerUserConfirm method
     * override this method for handling normal response from registerUserConfirm operation
     */
    public void receiveResultregisterUserConfirm(
        com.apus.st.RegisterUserConfirmResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registerUserConfirm operation
     */
    public void receiveErrorregisterUserConfirm(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRegions method
     * override this method for handling normal response from getRegions operation
     */
    public void receiveResultgetRegions(com.apus.st.GetRegionsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getRegions operation
     */
    public void receiveErrorgetRegions(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testRegisterNewCard method
     * override this method for handling normal response from testRegisterNewCard operation
     */
    public void receiveResulttestRegisterNewCard(
        com.apus.st.TestRegisterNewCardResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testRegisterNewCard operation
     */
    public void receiveErrortestRegisterNewCard(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerCardList method
     * override this method for handling normal response from partnerCardList operation
     */
    public void receiveResultpartnerCardList(
        com.apus.st.PartnerCardListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerCardList operation
     */
    public void receiveErrorpartnerCardList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for paymentOneTimeVisa method
     * override this method for handling normal response from paymentOneTimeVisa operation
     */
    public void receiveResultpaymentOneTimeVisa(
        com.apus.st.PaymentOneTimeVisaResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from paymentOneTimeVisa operation
     */
    public void receiveErrorpaymentOneTimeVisa(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setP2PFavorite method
     * override this method for handling normal response from setP2PFavorite operation
     */
    public void receiveResultsetP2PFavorite(
        com.apus.st.SetP2PFavoriteResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setP2PFavorite operation
     */
    public void receiveErrorsetP2PFavorite(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setApplicationToken method
     * override this method for handling normal response from setApplicationToken operation
     */
    public void receiveResultsetApplicationToken(
        com.apus.st.SetApplicationTokenResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setApplicationToken operation
     */
    public void receiveErrorsetApplicationToken(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testCardP2PInfo method
     * override this method for handling normal response from testCardP2PInfo operation
     */
    public void receiveResulttestCardP2PInfo(
        com.apus.st.TestCardP2PInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testCardP2PInfo operation
     */
    public void receiveErrortestCardP2PInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for findPersonalAccount method
     * override this method for handling normal response from findPersonalAccount operation
     */
    public void receiveResultfindPersonalAccount(
        com.apus.st.FindPersonalAccountResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from findPersonalAccount operation
     */
    public void receiveErrorfindPersonalAccount(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registerCars method
     * override this method for handling normal response from registerCars operation
     */
    public void receiveResultregisterCars(
        com.apus.st.RegisterCarsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registerCars operation
     */
    public void receiveErrorregisterCars(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for forgotPassword method
     * override this method for handling normal response from forgotPassword operation
     */
    public void receiveResultforgotPassword(
        com.apus.st.ForgotPasswordResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from forgotPassword operation
     */
    public void receiveErrorforgotPassword(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cardP2PPayment method
     * override this method for handling normal response from cardP2PPayment operation
     */
    public void receiveResultcardP2PPayment(
        com.apus.st.CardP2PPaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cardP2PPayment operation
     */
    public void receiveErrorcardP2PPayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getTradePointServiceByUssdCode method
     * override this method for handling normal response from getTradePointServiceByUssdCode operation
     */
    public void receiveResultgetTradePointServiceByUssdCode(
        com.apus.st.GetTradePointServiceByUssdCodeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTradePointServiceByUssdCode operation
     */
    public void receiveErrorgetTradePointServiceByUssdCode(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUserTransactionsList method
     * override this method for handling normal response from getUserTransactionsList operation
     */
    public void receiveResultgetUserTransactionsList(
        com.apus.st.GetUserTransactionsListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUserTransactionsList operation
     */
    public void receiveErrorgetUserTransactionsList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getQRCodeDataInfo method
     * override this method for handling normal response from getQRCodeDataInfo operation
     */
    public void receiveResultgetQRCodeDataInfo(
        com.apus.st.GetQRCodeDataInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getQRCodeDataInfo operation
     */
    public void receiveErrorgetQRCodeDataInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for upayHelps method
     * override this method for handling normal response from upayHelps operation
     */
    public void receiveResultupayHelps(com.apus.st.UpayHelpsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from upayHelps operation
     */
    public void receiveErrorupayHelps(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getServiceList method
     * override this method for handling normal response from getServiceList operation
     */
    public void receiveResultgetServiceList(
        com.apus.st.GetServiceListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getServiceList operation
     */
    public void receiveErrorgetServiceList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for actionUserCardBonus method
     * override this method for handling normal response from actionUserCardBonus operation
     */
    public void receiveResultactionUserCardBonus(
        com.apus.st.ActionUserCardBonusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from actionUserCardBonus operation
     */
    public void receiveErroractionUserCardBonus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for bankCheckAccount method
     * override this method for handling normal response from bankCheckAccount operation
     */
    public void receiveResultbankCheckAccount(
        com.apus.st.BankCheckAccountResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from bankCheckAccount operation
     */
    public void receiveErrorbankCheckAccount(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testCheckCardNumber method
     * override this method for handling normal response from testCheckCardNumber operation
     */
    public void receiveResulttestCheckCardNumber(
        com.apus.st.TestCheckCardNumberResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testCheckCardNumber operation
     */
    public void receiveErrortestCheckCardNumber(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getServiceByAccount method
     * override this method for handling normal response from getServiceByAccount operation
     */
    public void receiveResultgetServiceByAccount(
        com.apus.st.GetServiceByAccountResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getServiceByAccount operation
     */
    public void receiveErrorgetServiceByAccount(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registerServiceAccount method
     * override this method for handling normal response from registerServiceAccount operation
     */
    public void receiveResultregisterServiceAccount(
        com.apus.st.RegisterServiceAccountResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registerServiceAccount operation
     */
    public void receiveErrorregisterServiceAccount(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setUserCards method
     * override this method for handling normal response from setUserCards operation
     */
    public void receiveResultsetUserCards(
        com.apus.st.SetUserCardsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setUserCards operation
     */
    public void receiveErrorsetUserCards(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getExchangeRates method
     * override this method for handling normal response from getExchangeRates operation
     */
    public void receiveResultgetExchangeRates(
        com.apus.st.GetExchangeRatesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getExchangeRates operation
     */
    public void receiveErrorgetExchangeRates(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testCardP2PPayment method
     * override this method for handling normal response from testCardP2PPayment operation
     */
    public void receiveResulttestCardP2PPayment(
        com.apus.st.TestCardP2PPaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testCardP2PPayment operation
     */
    public void receiveErrortestCardP2PPayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for prepareAuthentication method
     * override this method for handling normal response from prepareAuthentication operation
     */
    public void receiveResultprepareAuthentication(
        com.apus.st.PrepareAuthenticationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from prepareAuthentication operation
     */
    public void receiveErrorprepareAuthentication(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for paymentServiceConfirm method
     * override this method for handling normal response from paymentServiceConfirm operation
     */
    public void receiveResultpaymentServiceConfirm(
        com.apus.st.PaymentServiceConfirmResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from paymentServiceConfirm operation
     */
    public void receiveErrorpaymentServiceConfirm(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for confirmRegistration method
     * override this method for handling normal response from confirmRegistration operation
     */
    public void receiveResultconfirmRegistration(
        com.apus.st.ConfirmRegistrationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from confirmRegistration operation
     */
    public void receiveErrorconfirmRegistration(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRegionsList method
     * override this method for handling normal response from getRegionsList operation
     */
    public void receiveResultgetRegionsList(
        com.apus.st.GetRegionsListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getRegionsList operation
     */
    public void receiveErrorgetRegionsList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for paymentOneTime method
     * override this method for handling normal response from paymentOneTime operation
     */
    public void receiveResultpaymentOneTime(
        com.apus.st.PaymentOneTimeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from paymentOneTime operation
     */
    public void receiveErrorpaymentOneTime(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for prepayment method
     * override this method for handling normal response from prepayment operation
     */
    public void receiveResultprepayment(com.apus.st.PrepaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from prepayment operation
     */
    public void receiveErrorprepayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerPayment method
     * override this method for handling normal response from partnerPayment operation
     */
    public void receiveResultpartnerPayment(
        com.apus.st.PartnerPaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerPayment operation
     */
    public void receiveErrorpartnerPayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerRegisterCard method
     * override this method for handling normal response from partnerRegisterCard operation
     */
    public void receiveResultpartnerRegisterCard(
        com.apus.st.PartnerRegisterCardResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerRegisterCard operation
     */
    public void receiveErrorpartnerRegisterCard(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerHoldCreate method
     * override this method for handling normal response from partnerHoldCreate operation
     */
    public void receiveResultpartnerHoldCreate(
        com.apus.st.PartnerHoldCreateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerHoldCreate operation
     */
    public void receiveErrorpartnerHoldCreate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerPreCardInfo method
     * override this method for handling normal response from partnerPreCardInfo operation
     */
    public void receiveResultpartnerPreCardInfo(
        com.apus.st.PartnerPreCardInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerPreCardInfo operation
     */
    public void receiveErrorpartnerPreCardInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUserCardInfo method
     * override this method for handling normal response from getUserCardInfo operation
     */
    public void receiveResultgetUserCardInfo(
        com.apus.st.GetUserCardInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUserCardInfo operation
     */
    public void receiveErrorgetUserCardInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testCardP2PPayOneTime method
     * override this method for handling normal response from testCardP2PPayOneTime operation
     */
    public void receiveResulttestCardP2PPayOneTime(
        com.apus.st.TestCardP2PPayOneTimeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testCardP2PPayOneTime operation
     */
    public void receiveErrortestCardP2PPayOneTime(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerConfirmCard method
     * override this method for handling normal response from partnerConfirmCard operation
     */
    public void receiveResultpartnerConfirmCard(
        com.apus.st.PartnerConfirmCardResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerConfirmCard operation
     */
    public void receiveErrorpartnerConfirmCard(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerConfirmPayment method
     * override this method for handling normal response from partnerConfirmPayment operation
     */
    public void receiveResultpartnerConfirmPayment(
        com.apus.st.PartnerConfirmPaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerConfirmPayment operation
     */
    public void receiveErrorpartnerConfirmPayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerCheckTransaction method
     * override this method for handling normal response from partnerCheckTransaction operation
     */
    public void receiveResultpartnerCheckTransaction(
        com.apus.st.PartnerCheckTransactionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerCheckTransaction operation
     */
    public void receiveErrorpartnerCheckTransaction(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerCancelTransaction method
     * override this method for handling normal response from partnerCancelTransaction operation
     */
    public void receiveResultpartnerCancelTransaction(
        com.apus.st.PartnerCancelTransactionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerCancelTransaction operation
     */
    public void receiveErrorpartnerCancelTransaction(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getTradePointServiceList method
     * override this method for handling normal response from getTradePointServiceList operation
     */
    public void receiveResultgetTradePointServiceList(
        com.apus.st.GetTradePointServiceListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTradePointServiceList operation
     */
    public void receiveErrorgetTradePointServiceList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for reRegister method
     * override this method for handling normal response from reRegister operation
     */
    public void receiveResultreRegister(com.apus.st.ReRegisterResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from reRegister operation
     */
    public void receiveErrorreRegister(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cardInfo method
     * override this method for handling normal response from cardInfo operation
     */
    public void receiveResultcardInfo(com.apus.st.CardInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cardInfo operation
     */
    public void receiveErrorcardInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for userUcoinsAchievementAction method
     * override this method for handling normal response from userUcoinsAchievementAction operation
     */
    public void receiveResultuserUcoinsAchievementAction(
        com.apus.st.UserUcoinsAchievementActionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from userUcoinsAchievementAction operation
     */
    public void receiveErroruserUcoinsAchievementAction(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerHoldPayment method
     * override this method for handling normal response from partnerHoldPayment operation
     */
    public void receiveResultpartnerHoldPayment(
        com.apus.st.PartnerHoldPaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerHoldPayment operation
     */
    public void receiveErrorpartnerHoldPayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testPaymentOneTime method
     * override this method for handling normal response from testPaymentOneTime operation
     */
    public void receiveResulttestPaymentOneTime(
        com.apus.st.TestPaymentOneTimeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testPaymentOneTime operation
     */
    public void receiveErrortestPaymentOneTime(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cardP2PCreate method
     * override this method for handling normal response from cardP2PCreate operation
     */
    public void receiveResultcardP2PCreate(
        com.apus.st.CardP2PCreateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cardP2PCreate operation
     */
    public void receiveErrorcardP2PCreate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for test method
     * override this method for handling normal response from test operation
     */
    public void receiveResulttest(com.apus.st.TestResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from test operation
     */
    public void receiveErrortest(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkCardNumber method
     * override this method for handling normal response from checkCardNumber operation
     */
    public void receiveResultcheckCardNumber(
        com.apus.st.CheckCardNumberResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkCardNumber operation
     */
    public void receiveErrorcheckCardNumber(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getP2PFavoriteList method
     * override this method for handling normal response from getP2PFavoriteList operation
     */
    public void receiveResultgetP2PFavoriteList(
        com.apus.st.GetP2PFavoriteListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getP2PFavoriteList operation
     */
    public void receiveErrorgetP2PFavoriteList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testConfirmRegistration method
     * override this method for handling normal response from testConfirmRegistration operation
     */
    public void receiveResulttestConfirmRegistration(
        com.apus.st.TestConfirmRegistrationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testConfirmRegistration operation
     */
    public void receiveErrortestConfirmRegistration(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkTransaction method
     * override this method for handling normal response from checkTransaction operation
     */
    public void receiveResultcheckTransaction(
        com.apus.st.CheckTransactionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkTransaction operation
     */
    public void receiveErrorcheckTransaction(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for isRegistered method
     * override this method for handling normal response from isRegistered operation
     */
    public void receiveResultisRegistered(
        com.apus.st.IsRegisteredResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from isRegistered operation
     */
    public void receiveErrorisRegistered(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUserCardsList method
     * override this method for handling normal response from getUserCardsList operation
     */
    public void receiveResultgetUserCardsList(
        com.apus.st.GetUserCardsListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUserCardsList operation
     */
    public void receiveErrorgetUserCardsList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerHoldCreateConfirm method
     * override this method for handling normal response from partnerHoldCreateConfirm operation
     */
    public void receiveResultpartnerHoldCreateConfirm(
        com.apus.st.PartnerHoldCreateConfirmResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerHoldCreateConfirm operation
     */
    public void receiveErrorpartnerHoldCreateConfirm(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setUserFavoriteAccount method
     * override this method for handling normal response from setUserFavoriteAccount operation
     */
    public void receiveResultsetUserFavoriteAccount(
        com.apus.st.SetUserFavoriteAccountResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setUserFavoriteAccount operation
     */
    public void receiveErrorsetUserFavoriteAccount(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testPrepayment method
     * override this method for handling normal response from testPrepayment operation
     */
    public void receiveResulttestPrepayment(
        com.apus.st.TestPrepaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testPrepayment operation
     */
    public void receiveErrortestPrepayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getTerritoriesList method
     * override this method for handling normal response from getTerritoriesList operation
     */
    public void receiveResultgetTerritoriesList(
        com.apus.st.GetTerritoriesListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTerritoriesList operation
     */
    public void receiveErrorgetTerritoriesList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getCountryList method
     * override this method for handling normal response from getCountryList operation
     */
    public void receiveResultgetCountryList(
        com.apus.st.GetCountryListResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getCountryList operation
     */
    public void receiveErrorgetCountryList(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testBankCheckAccount method
     * override this method for handling normal response from testBankCheckAccount operation
     */
    public void receiveResulttestBankCheckAccount(
        com.apus.st.TestBankCheckAccountResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testBankCheckAccount operation
     */
    public void receiveErrortestBankCheckAccount(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for bankPaymentHistory method
     * override this method for handling normal response from bankPaymentHistory operation
     */
    public void receiveResultbankPaymentHistory(
        com.apus.st.BankPaymentHistoryResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from bankPaymentHistory operation
     */
    public void receiveErrorbankPaymentHistory(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testBankPayment method
     * override this method for handling normal response from testBankPayment operation
     */
    public void receiveResulttestBankPayment(
        com.apus.st.TestBankPaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testBankPayment operation
     */
    public void receiveErrortestBankPayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cardRegistrationActivate method
     * override this method for handling normal response from cardRegistrationActivate operation
     */
    public void receiveResultcardRegistrationActivate(
        com.apus.st.CardRegistrationActivateResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cardRegistrationActivate operation
     */
    public void receiveErrorcardRegistrationActivate(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cancelPayment method
     * override this method for handling normal response from cancelPayment operation
     */
    public void receiveResultcancelPayment(
        com.apus.st.CancelPaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cancelPayment operation
     */
    public void receiveErrorcancelPayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for partnerConfirmCardInfo method
     * override this method for handling normal response from partnerConfirmCardInfo operation
     */
    public void receiveResultpartnerConfirmCardInfo(
        com.apus.st.PartnerConfirmCardInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from partnerConfirmCardInfo operation
     */
    public void receiveErrorpartnerConfirmCardInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cardRegistrationConfirm method
     * override this method for handling normal response from cardRegistrationConfirm operation
     */
    public void receiveResultcardRegistrationConfirm(
        com.apus.st.CardRegistrationConfirmResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cardRegistrationConfirm operation
     */
    public void receiveErrorcardRegistrationConfirm(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cardP2PPay method
     * override this method for handling normal response from cardP2PPay operation
     */
    public void receiveResultcardP2PPay(com.apus.st.CardP2PPayResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cardP2PPay operation
     */
    public void receiveErrorcardP2PPay(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for authentication method
     * override this method for handling normal response from authentication operation
     */
    public void receiveResultauthentication(
        com.apus.st.AuthenticationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from authentication operation
     */
    public void receiveErrorauthentication(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getRegisteredPersonalAccounts method
     * override this method for handling normal response from getRegisteredPersonalAccounts operation
     */
    public void receiveResultgetRegisteredPersonalAccounts(
        com.apus.st.GetRegisteredPersonalAccountsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getRegisteredPersonalAccounts operation
     */
    public void receiveErrorgetRegisteredPersonalAccounts(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for converterNotify method
     * override this method for handling normal response from converterNotify operation
     */
    public void receiveResultconverterNotify(
        com.apus.st.ConverterNotifyResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from converterNotify operation
     */
    public void receiveErrorconverterNotify(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getServiceSearchTags method
     * override this method for handling normal response from getServiceSearchTags operation
     */
    public void receiveResultgetServiceSearchTags(
        com.apus.st.GetServiceSearchTagsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getServiceSearchTags operation
     */
    public void receiveErrorgetServiceSearchTags(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for checkTransactionOneTime method
     * override this method for handling normal response from checkTransactionOneTime operation
     */
    public void receiveResultcheckTransactionOneTime(
        com.apus.st.CheckTransactionOneTimeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from checkTransactionOneTime operation
     */
    public void receiveErrorcheckTransactionOneTime(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for bankCheckTransaction method
     * override this method for handling normal response from bankCheckTransaction operation
     */
    public void receiveResultbankCheckTransaction(
        com.apus.st.BankCheckTransactionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from bankCheckTransaction operation
     */
    public void receiveErrorbankCheckTransaction(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for userUcoinsLevels method
     * override this method for handling normal response from userUcoinsLevels operation
     */
    public void receiveResultuserUcoinsLevels(
        com.apus.st.UserUcoinsLevelsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from userUcoinsLevels operation
     */
    public void receiveErroruserUcoinsLevels(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getTitlesTagAndNameForServices method
     * override this method for handling normal response from getTitlesTagAndNameForServices operation
     */
    public void receiveResultgetTitlesTagAndNameForServices(
        com.apus.st.GetTitlesTagAndNameForServicesResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getTitlesTagAndNameForServices operation
     */
    public void receiveErrorgetTitlesTagAndNameForServices(
        java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cardP2PInfo method
     * override this method for handling normal response from cardP2PInfo operation
     */
    public void receiveResultcardP2PInfo(com.apus.st.CardP2PInfoResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cardP2PInfo operation
     */
    public void receiveErrorcardP2PInfo(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for infoP2PBanks method
     * override this method for handling normal response from infoP2PBanks operation
     */
    public void receiveResultinfoP2PBanks(
        com.apus.st.InfoP2PBanksResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from infoP2PBanks operation
     */
    public void receiveErrorinfoP2PBanks(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registerNewCard method
     * override this method for handling normal response from registerNewCard operation
     */
    public void receiveResultregisterNewCard(
        com.apus.st.RegisterNewCardResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registerNewCard operation
     */
    public void receiveErrorregisterNewCard(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getUserInformation method
     * override this method for handling normal response from getUserInformation operation
     */
    public void receiveResultgetUserInformation(
        com.apus.st.GetUserInformationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getUserInformation operation
     */
    public void receiveErrorgetUserInformation(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testReRegister method
     * override this method for handling normal response from testReRegister operation
     */
    public void receiveResulttestReRegister(
        com.apus.st.TestReRegisterResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testReRegister operation
     */
    public void receiveErrortestReRegister(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getKvitansiaParams method
     * override this method for handling normal response from getKvitansiaParams operation
     */
    public void receiveResultgetKvitansiaParams(
        com.apus.st.GetKvitansiaParamsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getKvitansiaParams operation
     */
    public void receiveErrorgetKvitansiaParams(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for userCardBonusHistory method
     * override this method for handling normal response from userCardBonusHistory operation
     */
    public void receiveResultuserCardBonusHistory(
        com.apus.st.UserCardBonusHistoryResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from userCardBonusHistory operation
     */
    public void receiveErroruserCardBonusHistory(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for registerUserPrepare method
     * override this method for handling normal response from registerUserPrepare operation
     */
    public void receiveResultregisterUserPrepare(
        com.apus.st.RegisterUserPrepareResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from registerUserPrepare operation
     */
    public void receiveErrorregisterUserPrepare(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for confirmPayment method
     * override this method for handling normal response from confirmPayment operation
     */
    public void receiveResultconfirmPayment(
        com.apus.st.ConfirmPaymentResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from confirmPayment operation
     */
    public void receiveErrorconfirmPayment(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for cardP2PPayOneTime method
     * override this method for handling normal response from cardP2PPayOneTime operation
     */
    public void receiveResultcardP2PPayOneTime(
        com.apus.st.CardP2PPayOneTimeResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cardP2PPayOneTime operation
     */
    public void receiveErrorcardP2PPayOneTime(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for testCardP2PPaymentConfirm method
     * override this method for handling normal response from testCardP2PPaymentConfirm operation
     */
    public void receiveResulttestCardP2PPaymentConfirm(
        com.apus.st.TestCardP2PPaymentConfirmResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from testCardP2PPaymentConfirm operation
     */
    public void receiveErrortestCardP2PPaymentConfirm(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for confirmAuthentication method
     * override this method for handling normal response from confirmAuthentication operation
     */
    public void receiveResultconfirmAuthentication(
        com.apus.st.ConfirmAuthenticationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from confirmAuthentication operation
     */
    public void receiveErrorconfirmAuthentication(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for findTaxAccount method
     * override this method for handling normal response from findTaxAccount operation
     */
    public void receiveResultfindTaxAccount(
        com.apus.st.FindTaxAccountResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from findTaxAccount operation
     */
    public void receiveErrorfindTaxAccount(java.lang.Exception e) {
    }
}
