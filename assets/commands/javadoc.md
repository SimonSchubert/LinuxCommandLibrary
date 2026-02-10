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

**Link to external docs**

```javadoc -link [https://docs.oracle.com/javase/17/docs/api/] [*.java]```

# SYNOPSIS

**javadoc** [_options_] _sources_...

# PARAMETERS

**-d** _DIR_
> Output directory.

**-sourcepath** _PATH_
> Source file path.

**-cp** _PATH_
> Classpath for dependencies.

**-private**
> Include all members.

**-public**
> Include only public.

**-link** _URL_
> Link to external documentation.

**-author**
> Include @author tags.

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
