# TAGLINE

generates API documentation from Java source code

# TLDR

**Generate documentation**

```javadoc [*.java]```

**Output to directory**

```javadoc -d [docs/] [*.java]```

**Include private members**

```javadoc -private [*.java]```

**Generate with classpath**

```javadoc -cp [lib/*] [src/*.java]```

**Document package**

```javadoc -d [docs/] -sourcepath [src/] [com.example]```

**Document a package tree recursively**

```javadoc -d [docs/] -sourcepath [src/] -subpackages [com.example]```

**Link to external docs**

```javadoc -link [https://docs.oracle.com/javase/17/docs/api/] [*.java]```

# SYNOPSIS

**javadoc** [_options_] [_packagenames_] [_sourcefiles_] [_@files_]

# PARAMETERS

**-d** _DIR_
> Output directory.

**--source-path**, **-sourcepath** _PATH_
> Source file path.

**--class-path**, **-classpath**, **-cp** _PATH_
> Classpath for dependencies.

**-private**
> Include all members.

**-public**
> Include only public.

**-protected**
> Include protected and public members (default).

**-package**
> Include package, protected and public members.

**--release** _N_
> Compile for the given Java SE release.

**-Xdoclint**[:_groups_]
> Control checks for problems in documentation comments.

**-quiet**
> Suppress non-warning and non-error messages.

**-link** _URL_
> Link to external documentation.

**-author**
> Include @author tags.

**-version**
> Include @version tags.

**-subpackages** _PKGS_
> Recursively process subpackages (colon-separated).

**-encoding** _NAME_
> Source file encoding.

**-windowtitle** _TITLE_
> Browser window title.

**-doctitle** _TITLE_
> Title on the overview page.

**--help**
> Display help information.

# DESCRIPTION

**javadoc** generates API documentation from Java source code. It parses Javadoc comments and produces HTML pages.

The tool creates navigable documentation with class hierarchies, method details, and cross-references. It's the standard Java documentation generator.

# CAVEATS

Requires source code. Comment format matters. Large projects may be slow.

# HISTORY

javadoc has been part of the **JDK** since Java 1.0, created by **Sun Microsystems** for generating API documentation.

# SEE ALSO

[javac](/man/javac)(1), [java](/man/java)(1), [doxygen](/man/doxygen)(1)

# RESOURCES

```[Source code](https://github.com/openjdk/jdk)```

```[Homepage](https://openjdk.org/)```

```[Documentation](https://docs.oracle.com/en/java/javase/25/docs/specs/man/javadoc.html)```

<!-- verified: 2026-11-09 -->
