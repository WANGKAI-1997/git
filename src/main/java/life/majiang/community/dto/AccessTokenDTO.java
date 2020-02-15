package life.majiang.community.dto;

/**
 * @author 王凯
 * @version 1.0
 * @date 2019/12/14 14:35
 */
public class AccessTokenDTO {
    private String clint_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

    public String getClint_id() {
        return clint_id;
    }

    public void setClint_id(String clint_id) {
        this.clint_id = clint_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
