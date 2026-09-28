# TAGLINE

generates project documentation website

# TLDR

**Generate project site** into target/site

```mvn site```

**Clean and regenerate**

```mvn clean site```

**Preview the site** on a local web server (http://localhost:8080)

```mvn site:run```

Preview on a **different port**

```mvn site:run -Dport=[9000]```

Generate the site into a **specific directory**

```mvn site -DsiteOutputDirectory=[docs]```

Generate only the site pages **without reports**

```mvn site -DgenerateReports=false```

**Stage** a multi-module site locally to check links

```mvn site site:stage```

**Generate and deploy site** to the URL in distributionManagement

```mvn site-deploy```

# SYNOPSIS

**mvn** [_options_] **site** | **site-deploy** | **site:**_goal_ [**-D**_property_=_value_]

# PARAMETERS

**site**
> Lifecycle phase that generates the project website.

**site-deploy**
> Lifecycle phase that generates and deploys the site.

**site:run**
> Serve the site with a local web server, rendering pages on request.

**site:stage**
> Stage the generated site in target/staging for a multi-module build.

**site:stage-deploy**
> Deploy the staged site to a staging location.

**site:jar**
> Bundle the site into a JAR for deployment to a repository.

**site:effective-site**
> Print the effective site descriptor after inheritance and interpolation.

**-DsiteOutputDirectory**=_DIR_
> Output location (default **target/site**).

**-DgenerateReports**=_BOOL_
> Generate reports configured in the reporting section (default true).

**-DgenerateProjectInfo**=_BOOL_
> Generate the default project info pages (default true).

**-Dport**=_PORT_
> Port for **site:run** (default 8080).

**-Dmaven.site.skip**=true
> Skip site generation.

**-Dmaven.site.deploy.skip**=true
> Skip site deployment.

# DESCRIPTION

**mvn site** runs the **site** lifecycle, which uses the Maven Site Plugin to build an HTML website for the project from POM metadata, **src/site** content (Markdown, APT, XDoc) and reports such as Javadoc, test and dependency reports.

Reports are configured in the **reporting** section of pom.xml; the look and menus come from **src/site/site.xml** and the chosen skin.

# CAVEATS

Generating reports can be slow and downloads many plugins on first run. Links between modules in a multi-module build only work after **site:stage**. Deployment requires a **distributionManagement/site** URL in the POM.

# HISTORY

The Maven Site Plugin is part of **Apache Maven** and has been used since Maven 1 to publish project documentation, including maven.apache.org itself.

# INSTALL

```dnf: sudo dnf install maven```

```pacman: sudo pacman -S maven```

```apk: sudo apk add maven```

```zypper: sudo zypper install maven```

```brew: brew install maven```

```nix: nix profile install nixpkgs#maven```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-deploy](/man/mvn-deploy)(1), [javadoc](/man/javadoc)(1), [jekyll](/man/jekyll)(1)

# RESOURCES

```[Source code](https://github.com/apache/maven-site-plugin)```

```[Documentation](https://maven.apache.org/plugins/maven-site-plugin/)```

<!-- verified: 2026-09-29 -->
