# TLDR

**Generate project site**

```mvn site```

**Generate and deploy site**

```mvn site-deploy```

**Generate site in specific directory**

```mvn site -DoutputDirectory=[docs]```

**Run site with reports**

```mvn site -DgenerateReports=true```

**Stage site locally**

```mvn site:stage```

**Clean and regenerate**

```mvn clean site```

# SYNOPSIS

**mvn** **site** [_options_]

# PARAMETERS

**site**
> Generate project website.

**site-deploy**
> Deploy site to server.

**site:stage**
> Stage site locally.

**-DoutputDirectory** _DIR_
> Output location.

**-DgenerateReports** _BOOL_
> Include reports.

**--help**
> Display help information.

# DESCRIPTION

**mvn site** generates project documentation website. It creates HTML from project metadata.

The goal produces reports, JavaDocs, and info pages. Configured via pom.xml reporting section.

mvn site generates project docs.

# CAVEATS

Requires site configuration. Heavy dependency download. Plugins control content.

# HISTORY

The Maven Site Plugin is part of **Apache Maven** for generating project documentation sites.

# SEE ALSO

[mvn](/man/mvn)(1), [javadoc](/man/javadoc)(1), [jekyll](/man/jekyll)(1)

