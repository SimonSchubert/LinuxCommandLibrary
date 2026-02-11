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

**Test what would be done** without making changes

```update-java-alternatives --test --set [java-17-openjdk-amd64]```

# SYNOPSIS

**update-java-alternatives** [**-l**|**--list**] [**-s**|**--set** _jname_] [**-a**|**--auto**] [**--jre**] [**--jre-headless**] [**--plugin**]

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

**-t**, **--test**
> Dry run mode. Show what would be done without making changes.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**update-java-alternatives** manages multiple Java installations on Debian and Ubuntu systems. It is a wrapper around the update-alternatives system specifically designed for Java, updating all Java-related binaries (java, javac, jar, javadoc, etc.) simultaneously.

When switching Java versions, this tool ensures all associated commands point to the same installation, preventing version mismatches between the JRE and JDK tools. This is essential for development environments that require specific Java versions.

The jname parameter corresponds to the directory name under /usr/lib/jvm/ for the Java installation. Use **--list** to see available installations and their names.

The tool is part of the java-common package on Debian-based systems.

# CAVEATS

Requires root privileges to modify system alternatives. Only manages Java installations installed through the package manager that register with the alternatives system. Manual Java installations must be registered with update-alternatives separately. JAVA_HOME environment variable may need to be set separately in user profiles.

# HISTORY

**update-java-alternatives** was developed for **Debian** and Ubuntu to simplify Java version management. It addresses the complexity of having multiple Java binaries (java, javac, jar, keytool, etc.) that must all be switched together. The tool has been part of the java-common package since the early **2000s** and remains the standard way to manage Java versions on Debian-based systems.

# SEE ALSO

[update-alternatives](/man/update-alternatives)(1), [java](/man/java)(1), [javac](/man/javac)(1)
