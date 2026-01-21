<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
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

        <div class="mb-2">
            <label for="postTechStack" class="form-label">Tech Stack</label>

            <select multiple class="form-select" id="postTechStack" name="tech_stack">

                <option value="Java" <c:if test="${jobPost.tech_stack.contains('Java')}">selected</c:if>>Java</option>
                <option value="Spring" <c:if test="${jobPost.tech_stack.contains('Spring')}">selected</c:if>>Spring</option>
                <option value="JavaScript" <c:if test="${jobPost.tech_stack.contains('JavaScript')}">selected</c:if>>JavaScript</option>
                <option value="Swift" <c:if test="${jobPost.tech_stack.contains('Swift')}">selected</c:if>>Swift</option>
                <option value="TypeScript" <c:if test="${jobPost.tech_stack.contains('TypeScript')}">selected</c:if>>TypeScript</option>
                <option value="Go" <c:if test="${jobPost.tech_stack.contains('Go')}">selected</c:if>>Go</option>
                <option value="Kotlin" <c:if test="${jobPost.tech_stack.contains('Kotlin')}">selected</c:if>>Kotlin</option>
                <option value="Rust" <c:if test="${jobPost.tech_stack.contains('Rust')}">selected</c:if>>Rust</option>
                <option value="PHP" <c:if test="${jobPost.tech_stack.contains('PHP')}">selected</c:if>>PHP</option>

                <option value="HTML5" <c:if test="${jobPost.tech_stack.contains('HTML5')}">selected</c:if>>HTML5</option>
                <option value="CSS3" <c:if test="${jobPost.tech_stack.contains('CSS3')}">selected</c:if>>CSS3</option>

                <option value="GraphQL" <c:if test="${jobPost.tech_stack.contains('GraphQL')}">selected</c:if>>GraphQL</option>
                <option value="Raspberry Pi" <c:if test="${jobPost.tech_stack.contains('Raspberry Pi')}">selected</c:if>>Raspberry Pi</option>
                <option value="Arduino" <c:if test="${jobPost.tech_stack.contains('Arduino')}">selected</c:if>>Arduino</option>
                <option value="IoT (Internet of Things)" <c:if test="${jobPost.tech_stack.contains('IoT (Internet of Things)')}">selected</c:if>>
                    IoT (Internet of Things)
                </option>

                <option value="Apache Kafka" <c:if test="${jobPost.tech_stack.contains('Apache Kafka')}">selected</c:if>>Apache Kafka</option>
                <option value="Elasticsearch" <c:if test="${jobPost.tech_stack.contains('Elasticsearch')}">selected</c:if>>Elasticsearch</option>
                <option value="Unity" <c:if test="${jobPost.tech_stack.contains('Unity')}">selected</c:if>>Unity</option>
                <option value="Game Development" <c:if test="${jobPost.tech_stack.contains('Game Development')}">selected</c:if>>Game Development</option>

                <option value="Vue.js" <c:if test="${jobPost.tech_stack.contains('Vue.js')}">selected</c:if>>Vue.js</option>
                <option value="Angular" <c:if test="${jobPost.tech_stack.contains('Angular')}">selected</c:if>>Angular</option>
                <option value="React Native" <c:if test="${jobPost.tech_stack.contains('React Native')}">selected</c:if>>React Native</option>
                <option value="Flutter" <c:if test="${jobPost.tech_stack.contains('Flutter')}">selected</c:if>>Flutter</option>

                <option value="Node.js" <c:if test="${jobPost.tech_stack.contains('Node.js')}">selected</c:if>>Node.js</option>
                <option value="Express.js" <c:if test="${jobPost.tech_stack.contains('Express.js')}">selected</c:if>>Express.js</option>
                <option value="Django" <c:if test="${jobPost.tech_stack.contains('Django')}">selected</c:if>>Django</option>
                <option value="Flask" <c:if test="${jobPost.tech_stack.contains('Flask')}">selected</c:if>>Flask</option>
                <option value="Ruby on Rails" <c:if test="${jobPost.tech_stack.contains('Ruby on Rails')}">selected</c:if>>Ruby on Rails</option>
                <option value="Laravel" <c:if test="${jobPost.tech_stack.contains('Laravel')}">selected</c:if>>Laravel</option>

                <option value="TensorFlow" <c:if test="${jobPost.tech_stack.contains('TensorFlow')}">selected</c:if>>TensorFlow</option>
                <option value="PyTorch" <c:if test="${jobPost.tech_stack.contains('PyTorch')}">selected</c:if>>PyTorch</option>

                <option value="Docker" <c:if test="${jobPost.tech_stack.contains('Docker')}">selected</c:if>>Docker</option>
                <option value="Kubernetes" <c:if test="${jobPost.tech_stack.contains('Kubernetes')}">selected</c:if>>Kubernetes</option>
                <option value="Jenkins" <c:if test="${jobPost.tech_stack.contains('Jenkins')}">selected</c:if>>Jenkins</option>

                <option value="AWS (Amazon Web Services)" <c:if test="${jobPost.tech_stack.contains('AWS (Amazon Web Services)')}">selected</c:if>>
                    AWS (Amazon Web Services)
                </option>
                <option value="Azure" <c:if test="${jobPost.tech_stack.contains('Azure')}">selected</c:if>>Azure</option>
                <option value="Google Cloud" <c:if test="${jobPost.tech_stack.contains('Google Cloud')}">selected</c:if>>Google Cloud</option>

                <option value="DevOps" <c:if test="${jobPost.tech_stack.contains('DevOps')}">selected</c:if>>DevOps</option>
                <option value="Blockchain" <c:if test="${jobPost.tech_stack.contains('Blockchain')}">selected</c:if>>Blockchain</option>
                <option value="Machine Learning" <c:if test="${jobPost.tech_stack.contains('Machine Learning')}">selected</c:if>>Machine Learning</option>
                <option value="Artificial Intelligence" <c:if test="${jobPost.tech_stack.contains('Artificial Intelligence')}">selected</c:if>>
                    Artificial Intelligence
                </option>

                <option value="Cybersecurity" <c:if test="${jobPost.tech_stack.contains('Cybersecurity')}">selected</c:if>>Cybersecurity</option>
                <option value="CISSP (Certified Information Systems Security Professional)"
                        <c:if test="${jobPost.tech_stack.contains('CISSP (Certified Information Systems Security Professional)')}">selected</c:if>>
                    CISSP (Certified Information Systems Security Professional)
                </option>
                <option value="CompTIA Security+" <c:if test="${jobPost.tech_stack.contains('CompTIA Security+')}">selected</c:if>>
                    CompTIA Security+
                </option>
                <option value="Certified Ethical Hacker (CEH)"
                        <c:if test="${jobPost.tech_stack.contains('Certified Ethical Hacker (CEH)')}">selected</c:if>>
                    Certified Ethical Hacker (CEH)
                </option>

                <option value="Scrum" <c:if test="${jobPost.tech_stack.contains('Scrum')}">selected</c:if>>Scrum</option>
                <option value="Agile" <c:if test="${jobPost.tech_stack.contains('Agile')}">selected</c:if>>Agile</option>
                <option value="Kanban" <c:if test="${jobPost.tech_stack.contains('Kanban')}">selected</c:if>>Kanban</option>

                <option value="Android SDK" <c:if test="${jobPost.tech_stack.contains('Android SDK')}">selected</c:if>>Android SDK</option>

            </select>
        </div>


        <button class="btn btn-success">Update Job</button>
        <a href="viewalljobs" class="btn btn-secondary">Cancel</a>

    </form>
</div>

</body>
</html>
