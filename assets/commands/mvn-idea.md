# TAGLINE

generates IntelliJ IDEA project files

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

**mvn idea** invokes the legacy Maven IDEA Plugin, which generates IntelliJ IDEA project files (**.ipr**, **.iml**, and **.iws**) from a Maven POM. The plugin reads dependencies, source folders, and resources and writes them into IDEA's XML project metadata so the project opens without further configuration.

Modern IntelliJ IDEA imports **pom.xml** files directly through its built-in Maven integration, making this plugin largely obsolete. It remains useful only in legacy build setups or CI scripts that need to materialize IDEA project files without launching the IDE.

# CAVEATS

The plugin is no longer actively developed and was retired from the official Maven project. The generated **.iml** files may use older IDEA module formats incompatible with newer IDEA releases. Prefer File > Open on the **pom.xml** in modern IDEA.

# HISTORY

The Maven IDEA Plugin (groupId **org.apache.maven.plugins**, artifactId **maven-idea-plugin**) was created before IntelliJ IDEA gained native Maven import support. It was officially retired by Apache Maven once IDEA's first-class Maven integration matured.

# INSTALL

```dnf: sudo dnf install maven```

```pacman: sudo pacman -S maven```

```apk: sudo apk add maven```

```zypper: sudo zypper install maven```

```brew: brew install maven```

```nix: nix profile install nixpkgs#maven```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[mvn](/man/mvn)(1), [mvn-compile](/man/mvn-compile)(1), [idea](/man/idea)(1)

