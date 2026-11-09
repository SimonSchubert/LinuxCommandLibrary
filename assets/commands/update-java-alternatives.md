# TAGLINE

Switch between installed Java versions

# TLDR

**List all installed Java versions**

```update-java-alternatives --list```

**Switch to a specific Java version**

```sudo update-java-alternatives --set [java-17-openjdk-amd64]```

**Set all Java alternatives to automatic mode**

```sudo update-java-alternatives --auto```

**Only switch JRE** (runtime, not development kit)

```sudo update-java-alternatives --jre --set [java-17-openjdk-amd64]```

**Show each alternative** provided by an installation

```update-java-alternatives --verbose --list [java-17-openjdk-amd64]```

# SYNOPSIS

**update-java-alternatives** [**--jre-headless**] [**--jre**] [**--plugin**] [**-v**|**--verbose**] **-l**|**--list** [_jname_] | **-s**|**--set** _jname_ | **-a**|**--auto** | **-h**|**--help**

# PARAMETERS

**-l**, **--list** [_jname_]
> List all installed Java packages, or details about a specific installation.

**-s**, **--set** _jname_
> Set all alternatives to the specified Java installation.

**-a**, **--auto**
> Switch all alternatives to automatic mode, letting the system choose the highest priority version.

**--jre**
> Limit actions to runtime environment alternatives only, not development kit tools.

**--jre-headless**
> Limit actions to headless runtime alternatives (no GUI support).

**--plugin**
> Limit actions to browser plugin alternatives.

**-v**, **--verbose**
> Verbose output. With **--list**, shows each alternative provided by the packages.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**update-java-alternatives** manages multiple Java installations on Debian and Ubuntu systems. It is a wrapper around the update-alternatives system specifically designed for Java, updating all Java-related binaries (java, javac, jar, javadoc, etc.) simultaneously.

When switching Java versions, this tool ensures all associated commands point to the same installation, preventing version mismatches between the JRE and JDK tools. This is essential for development environments that require specific Java versions.

The jname parameter corresponds to a package-provided description file named /usr/lib/jvm/._jname_.jinfo. Use **--list** to see available installations and their names.

The tool is part of the java-common package on Debian-based systems.

# CAVEATS

Requires root privileges to modify system alternatives. Only manages Java installations that provide a .jinfo file, which manual installations usually lack. Those must be registered with update-alternatives separately. JAVA_HOME environment variable may need to be set separately in user profiles.

# HISTORY

**update-java-alternatives** and its manual page were written by Matthias Klose for **Debian** and Ubuntu to simplify Java version management. It addresses the complexity of having multiple Java binaries (java, javac, jar, keytool, etc.) that must all be switched together.

# SEE ALSO

[update-alternatives](/man/update-alternatives)(1), [java](/man/java)(1), [javac](/man/javac)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/java-team/java-common)```

<!-- verified: 2026-11-09 -->
