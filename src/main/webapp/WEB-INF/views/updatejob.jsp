<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
    <title>Update Job</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h2 class="text-center mb-4">Update Job</h2>

    <form action="updatejob" method="post">

        <!-- ID (hidden or readonly) -->
        <input type="hidden" name="postid" value="${jobPost.postid}" />

        <div class="mb-2">
            <label>Profile</label>
            <input type="text" class="form-control" name="profile" value="${jobPost.profile}" required />
        </div>

        <div class="mb-2">
            <label>Description</label>
            <textarea class="form-control" name="description" required>${jobPost.description}</textarea>
        </div>

        <div class="mb-2">
            <label>Experience</label>
            <input type="number" class="form-control" name="experience" value="${jobPost.experience}" required />
        </div>

        <div class="mb-3">
            <label>Tech Stack</label>
            <select multiple class="form-select" name="tech_stack">
                <c:forEach var="tech" items="${jobPost.tech_stack}">
                    <option selected>${tech}</option>
                </c:forEach>
            </select>
        </div>

        <button class="btn btn-success">Update Job</button>
        <a href="viewalljobs" class="btn btn-secondary">Cancel</a>

    </form>
</div>

</body>
</html>
