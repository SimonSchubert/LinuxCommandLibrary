# TLDR

**Generate IDEA project files**

```mvn idea:idea```

**Generate module files**

```mvn idea:module```

**Generate workspace**

```mvn idea:workspace```

**Clean IDEA files**

```mvn idea:clean```

**Download sources**

```mvn idea:idea -DdownloadSources=true```

**Download JavaDocs**

```mvn idea:idea -DdownloadJavadocs=true```

# SYNOPSIS

**mvn** **idea:**_goal_ [_options_]

# PARAMETERS

_GOAL_
> IDEA plugin goal.

**idea**
> Generate all files.

**module**
> Generate module file.

**workspace**
> Generate workspace.

**clean**
> Remove IDEA files.

**-DdownloadSources**
> Include source JARs.

**--help**
> Display help information.

# DESCRIPTION

**mvn idea** generates IntelliJ IDEA project files. It creates .ipr, .iml, and .iws files.

The plugin converts Maven project to IDEA format. Modern IDEA imports pom.xml directly.

mvn idea creates IDEA files.

# CAVEATS

Deprecated approach. IDEA imports Maven natively. Legacy project support.

# HISTORY

The Maven IDEA Plugin was created before **IntelliJ IDEA** gained native Maven import support.

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-eclipse](/man/mvn-eclipse)(1), [idea](/man/idea)(1)

