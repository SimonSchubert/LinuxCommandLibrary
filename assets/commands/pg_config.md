# TAGLINE

displays PostgreSQL installation configuration

# TLDR

**Show all configuration**

```pg_config```

**Show include directory** for client headers

```pg_config --includedir```

**Show library directory**

```pg_config --libdir```

**Show server include directory** (for extension development)

```pg_config --includedir-server```

**Show module (pkglib) directory**

```pg_config --pkglibdir```

**Show version**

```pg_config --version```

# SYNOPSIS

**pg_config** [_option_...]

# PARAMETERS

**--bindir**
> Location of user executables.

**--docdir**
> Location of documentation files.

**--htmldir**
> Location of HTML documentation files.

**--includedir**
> Location of C header files for client interfaces.

**--pkgincludedir**
> Location of other C header files.

**--includedir-server**
> Location of C header files for server programming (needed when building extensions).

**--libdir**
> Location of object code libraries.

**--pkglibdir**
> Location of dynamically loadable modules.

**--localedir**
> Location of locale support files.

**--mandir**
> Location of manual pages.

**--sharedir**
> Location of architecture-independent support files.

**--sysconfdir**
> Location of system-wide configuration files.

**--pgxs**
> Location of extension makefile (pgxs.mk).

**--configure**
> Options passed to the configure script during build.

**--cc**
> C compiler used to build PostgreSQL.

**--cppflags**
> Value of CPPFLAGS used when building PostgreSQL.

**--cflags**
> Value of CFLAGS used when building PostgreSQL.

**--cflags_sl**
> Value of CFLAGS_SL used when building PostgreSQL.

**--ldflags**
> Value of LDFLAGS used when building PostgreSQL.

**--ldflags_ex**
> Value of LDFLAGS_EX used when building PostgreSQL.

**--ldflags_sl**
> Value of LDFLAGS_SL used when building PostgreSQL.

**--libs**
> Value of LIBS used when building PostgreSQL.

**--version**
> Version of PostgreSQL.

**-?**, **--help**
> Show help about pg_config command-line arguments.

# DESCRIPTION

**pg_config** prints configuration parameters of the currently installed version of PostgreSQL. It is intended, for example, to be used by software packages that want to interface to PostgreSQL to facilitate finding the required header files and libraries. Shows installation paths and build options. Essential for compiling extensions (via PGXS) and locating PostgreSQL components.

When invoked with no arguments, **pg_config** prints all known settings. Specifying one or more options restricts output to just those values.

# SEE ALSO

[postgres](/man/postgres)(1), [psql](/man/psql)(1)

