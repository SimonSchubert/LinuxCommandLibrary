# TLDR

**Add NumPy dependencies** to package

```dh_numpy```

**Process with verbose** output

```dh_numpy -v```

**Process specific package**

```dh_numpy -p [package_name]```

# SYNOPSIS

**dh_numpy** [_debhelper-options_]

# PARAMETERS

**-v**, **--verbose**
> Verbose output.

**-p** _PACKAGE_, **--package** _PACKAGE_
> Process specified package only.

**-N** _PACKAGE_
> Exclude specified package.

**-a**, **--arch**
> Process architecture-dependent packages.

**-i**, **--indep**
> Process architecture-independent packages.

# DESCRIPTION

**dh_numpy** is a debhelper addon for Debian packages that use NumPy. It automatically adds the correct NumPy ABI dependency to packages that contain compiled extensions linked against NumPy.

NumPy extensions compiled against one version may not work with another due to ABI changes. dh_numpy examines installed extensions and adds appropriate numpy-abiN dependencies to ensure binary compatibility.

This automation prevents the common problem of NumPy extensions breaking after NumPy upgrades due to missing or incorrect ABI dependencies.

# CAVEATS

Only relevant for packages with compiled NumPy extensions. Requires NumPy development headers present during build. NumPy ABI versioning policies affect dependency generation.

# HISTORY

dh_numpy was created for the Debian Python ecosystem to manage the complexity of NumPy binary compatibility. It addresses the challenge of maintaining correct dependencies across NumPy version updates.

# SEE ALSO

[dh](/man/dh)(1), [dh_python3](/man/dh_python3)(1), [numpy](/man/numpy)(3)
