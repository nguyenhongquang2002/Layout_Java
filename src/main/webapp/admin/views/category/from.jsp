<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/admin/components/head.jsp">
    <jsp:param name="from_category" value="from_category"/>
</jsp:include>
<body>
<div class="wrapper">
    <jsp:include page="/admin/components/sidebar.jsp"/>
    <div class="main">
        <jsp:include page="/admin/components/navbar.jsp"/>
        <div class="row">
            <div class="col-12">
                <div class="card">
                    <div class="card-header">
                        <h5 class="card-title">Basic form</h5>
                        <h6 class="card-subtitle text-muted">Default Bootstrap form layout.</h6>
                    </div>
                    <div class="card-body">
                        <form>
                            <div class="mb-3">
                                <label class="form-label" style="color: lightseagreen">Sản Phẩm</label>
                                <input type="text" name="name" class="form-control" placeholder="Name">
                            </div>
                            <%--                            <div class="mb-3">--%>
                            <%--                                <label class="form-label w-100">File input</label>--%>
                            <%--                                <input type="file">--%>
                            <%--                                <small class="form-text text-muted">Example block-level help text here.</small>--%>
                            <%--                            </div>--%>
                            <%--                            <div class="mb-3">--%>
                            <%--                                <label class="form-check m-0">--%>
                            <%--                                    <input type="checkbox" class="form-check-input">--%>
                            <%--                                    <span class="form-check-label">Check me out</span>--%>
                            <%--                                </label>--%>
                            <%--                            </div>--%>
                            <button type="submit" class="btn btn-primary">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="/admin/components/footer.jsp"/>
        <jsp:include page="/admin/components/scripts.jsp"/>
    </div>
</div>
</body>
</html>
