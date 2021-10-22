package application.clientApi;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.internal.SpecificationMerger;
import io.restassured.internal.assertion.AssertParameter;
import io.restassured.internal.log.LogRepository;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.specification.MultiPartSpecification;
import io.restassured.specification.ProxySpecification;
import io.restassured.specification.RequestSpecification;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.util.Collection;
import java.util.Map;

/**
 * @autor: Boris.Perez
 **/
public class RequestBuilder {
    private RequestSpecificationImpl spec;

    public RequestBuilder() {
        this.spec = (RequestSpecificationImpl) (new RequestSpecificationImpl(RestAssured.baseURI, RestAssured.port, RestAssured.basePath, RestAssured.authentication, RestAssured.filters(), RestAssured.requestSpecification, RestAssured.urlEncodingEnabled, RestAssured.config, new LogRepository(), RestAssured.proxy)).config(RestAssured.config());
    }

    public RequestBuilder setBody(String body) {
        this.spec.body(body);
        return this;
    }

    public RequestBuilder setBody(byte[] body) {
        this.spec.body(body);
        return this;
    }

    public RequestBuilder setBody(Object object) {
        this.spec.body(object);
        return this;
    }

    public RequestBuilder setBody(Object object, ObjectMapper mapper) {
        this.spec.body(object, mapper);
        return this;
    }

    public RequestBuilder setBody(Object object, ObjectMapperType mapperType) {
        this.spec.body(object, mapperType);
        return this;
    }

    public RequestBuilder addCookies(Map<String, ?> cookies) {
        this.spec.cookies(cookies);
        return this;
    }

    public RequestBuilder addCookie(Cookie cookie) {
        this.spec.cookie(cookie);
        return this;
    }

    public RequestBuilder addCookie(String key, Object value, Object... cookieNameValuePairs) {
        this.spec.cookie(key, value, cookieNameValuePairs);
        return this;
    }

    public RequestBuilder addCookie(String name) {
        this.spec.cookie(name);
        return this;
    }

    public RequestBuilder addCookies(Cookies cookies) {
        this.spec.cookies(cookies);
        return this;
    }

    public RequestBuilder addQueryParam(String parameterName, Collection<?> parameterValues) {
        this.spec.queryParam(parameterName, parameterValues);
        return this;
    }

    public RequestBuilder addQueryParams(Map<String, ?> parametersMap) {
        this.spec.queryParams(parametersMap);
        return this;
    }

    public RequestBuilder addQueryParam(String parameterName, Object... parameterValues) {
        this.spec.queryParam(parameterName, parameterValues);
        return this;
    }

    public RequestBuilder addFormParam(String parameterName, Collection<?> parameterValues) {
        this.spec.formParam(parameterName, parameterValues);
        return this;
    }

    public RequestBuilder addFormParams(Map<String, ?> parametersMap) {
        this.spec.formParams(parametersMap);
        return this;
    }

    public RequestBuilder addFormParam(String parameterName, Object... parameterValues) {
        this.spec.formParam(parameterName, parameterValues);
        return this;
    }

    public RequestBuilder addPathParam(String parameterName, Object parameterValue) {
        this.spec.pathParam(parameterName, parameterValue);
        return this;
    }

    public RequestBuilder addPathParams(String firstParameterName, Object firstParameterValue, Object... parameterNameValuePairs) {
        this.spec.pathParams(firstParameterName, firstParameterValue, parameterNameValuePairs);
        return this;
    }

    public RequestBuilder addPathParams(Map<String, ?> parameterNameValuePairs) {
        this.spec.pathParams(parameterNameValuePairs);
        return this;
    }

    public RequestBuilder addHeaders(Map<String, String> headers) {
        this.spec.headers(headers);
        return this;
    }

    public RequestBuilder addHeader(String headerName, String headerValue) {
        this.spec.header(headerName, headerValue, new Object[0]);
        return this;
    }

    public RequestBuilder setContentType(ContentType contentType) {
        this.spec.contentType(contentType);
        return this;
    }

    public RequestBuilder setContentType(String contentType) {
        this.spec.contentType(contentType);
        return this;
    }

    public RequestBuilder addMultiPart(MultiPartSpecification multiPartSpecification) {
        this.spec.multiPart(multiPartSpecification);
        return this;
    }

    public RequestBuilder addMultiPart(File file) {
        this.spec.multiPart(file);
        return this;
    }

    public RequestBuilder addMultiPart(String controlName, File file) {
        this.spec.multiPart(controlName, file);
        return this;
    }

    public RequestBuilder addMultiPart(String controlName, File file, String mimeType) {
        this.spec.multiPart(controlName, file, mimeType);
        return this;
    }

    public RequestBuilder addMultiPart(String controlName, String fileName, byte[] bytes) {
        this.spec.multiPart(controlName, fileName, bytes);
        return this;
    }

    public RequestBuilder addMultiPart(String controlName, String fileName, byte[] bytes, String mimeType) {
        this.spec.multiPart(controlName, fileName, bytes, mimeType);
        return this;
    }

    public RequestBuilder addMultiPart(String controlName, String fileName, InputStream stream) {
        this.spec.multiPart(controlName, fileName, stream);
        return this;
    }

    public RequestBuilder addMultiPart(String controlName, String fileName, InputStream stream, String mimeType) {
        this.spec.multiPart(controlName, fileName, stream, mimeType);
        return this;
    }

    public RequestBuilder addMultiPart(String controlName, String contentBody) {
        this.spec.multiPart(controlName, contentBody);
        return this;
    }

    public RequestBuilder addMultiPart(String controlName, String contentBody, String mimeType) {
        this.spec.multiPart(controlName, contentBody, mimeType);
        return this;
    }

    public RequestBuilder setAuthentication(AuthenticationScheme auth) {
        this.spec.setAuthenticationScheme(auth);
        return this;
    }

    public RequestBuilder setAuth(AuthenticationScheme auth) {
        return this.setAuthentication(auth);
    }

    public RequestBuilder setPort(int port) {
        this.spec.port(port);
        return this;
    }

    public RequestBuilder addRequestSpecification(RequestSpecification specification) {
        if (!(specification instanceof RequestSpecificationImpl)) {
            throw new IllegalArgumentException("Specification must be of type " + RequestSpecificationImpl.class.getClass() + ".");
        } else {
            RequestSpecificationImpl rs = (RequestSpecificationImpl) specification;
            SpecificationMerger.merge(this.spec, rs);
            return this;
        }
    }

    public RequestBuilder setConfig(RestAssuredConfig config) {
        this.spec.config(config);
        return this;
    }

    public RequestSpecification build() {
        return this.spec;
    }

    public RequestBuilder setBaseUri(String uri) {
        this.spec.baseUri(uri);
        return this;
    }

    public RequestBuilder setBaseUri(URI uri) {
        return this.setBaseUri(((URI) AssertParameter.notNull(uri, "Base URI")).toString());
    }

    public RequestBuilder setBasePath(String path) {
        this.spec.basePath(path);
        return this;
    }

    public RequestBuilder setProxy(String host, int port) {
        this.spec.proxy(host, port);
        return this;
    }

    public RequestBuilder setProxy(String host) {
        this.spec.proxy(host);
        return this;
    }

    public RequestBuilder setProxy(int port) {
        this.spec.proxy(port);
        return this;
    }

    public RequestBuilder setProxy(String host, int port, String scheme) {
        this.spec.proxy(host, port, scheme);
        return this;
    }

    public RequestBuilder setProxy(URI uri) {
        this.spec.proxy(uri);
        return this;
    }

    public RequestBuilder setProxy(ProxySpecification proxySpecification) {
        this.spec.proxy(proxySpecification);
        return this;
    }

}
