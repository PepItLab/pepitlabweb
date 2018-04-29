<%@attribute name="pageTitle" fragment="true" %>
<html>
<head>
    <!-- Material Design Lite sources -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.light_blue-pink.min.css">
    <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>

    <jsp:invoke fragment="pageTitle" />
</head>
<body>
<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
    <header class="mdl-layout__header">
        <div class="mdl-layout__header-row">
            <!-- Title -->
            <span class="mdl-layout-title">Pep'It Lab</span>
            <!-- Add spacer, to align navigation to the right -->
            <div class="mdl-layout-spacer"></div>
            <!-- Navigation. We hide it in small screens. -->
            <nav class="mdl-navigation mdl-layout--large-screen-only">
                <a class="mdl-navigation__link" href="">Accueil</a>
                <a class="mdl-navigation__link" href="">Pep'It Lab</a>
                <a class="mdl-navigation__link" href="">Tutoriels</a>
                <a class="mdl-navigation__link" href="">Projets</a>
                <a class="mdl-navigation__link" href="">Forum</a>
                <a class="mdl-navigation__link" href="">Tribune Libre</a>
            </nav>
        </div>
    </header>
    <div class="mdl-layout__drawer mdl-layout--small-screen-only">
        <span class="mdl-layout-title">Title</span>
        <nav class="mdl-navigation">
            <a class="mdl-navigation__link" href="">Accueil</a>
            <a class="mdl-navigation__link" href="">Pep'It Lab</a>
            <a class="mdl-navigation__link" href="">Tutoriels</a>
            <a class="mdl-navigation__link" href="">Projets</a>
            <a class="mdl-navigation__link" href="">Forum</a>
            <a class="mdl-navigation__link" href="">Tribune Libre</a>
        </nav>
    </div>
    <main class="mdl-layout__content">
        <div class="page-content"><jsp:doBody /></div>
    </main>
</div>
</body>
</html>