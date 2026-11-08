# TAGLINE

Build RPM packages for Sailfish apps

# TLDR

**Create RPM packages**

```sfdk package```

**Skip the %check section**

```sfdk package --no-check```

**Sign the built packages**

```sfdk package --sign```

# SYNOPSIS

**sfdk package** [**--no-check**] [**--sign**]

# PARAMETERS

**--no-check**
> Do not execute the %check section.

**--sign**
> Sign the built packages.

# DESCRIPTION

**sfdk package** runs **rpmbuild** to execute just the %install section of the RPM SPEC file, then builds binary packages and optionally signs them. The %check section is also executed if present, unless **--no-check** is passed. Part of the Sailfish SDK command-line tool.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-deploy](/man/sfdk-deploy)(1), [sfdk-check](/man/sfdk-check)(1), [rpmbuild](/man/rpmbuild)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
