# TAGLINE

register fingerprints for authentication

# TLDR

Enroll the **right index finger** for the current user

```fprintd-enroll```

Enroll a **specific finger** for the current user

```fprintd-enroll -f [left-thumb|left-index-finger|right-thumb|...]```

Enroll the right index finger for a **specific user**

```fprintd-enroll [username]```

Enroll a **specific finger** for a **specific user**

```fprintd-enroll -f [finger_name] [username]```

Display **help**

```fprintd-enroll --help```

# SYNOPSIS

**fprintd-enroll** [_options_] [_username_]

# PARAMETERS

**-f**, **--finger** _FINGER_
> Specify which finger to enroll: left-thumb, left-index-finger, left-middle-finger, left-ring-finger, left-little-finger, right-thumb, right-index-finger, right-middle-finger, right-ring-finger, right-little-finger

# DESCRIPTION

**fprintd-enroll** registers fingerprints into the fprintd database for biometric authentication. During enrollment, the user is prompted to scan their finger multiple times to build a reliable fingerprint template.

The default finger is right-index-finger. Multiple fingers can be enrolled by running the command multiple times with different **--finger** values.

Enrolled fingerprints can be used for PAM authentication, allowing fingerprint login, sudo verification, and other authentication contexts when properly configured.

# CAVEATS

Enrollment quality depends on the fingerprint reader and skin condition. Dry or damaged skin may result in poor enrollment. Multiple scans are required for reliable templates. Root privileges may be needed to enroll fingerprints for other users.

# SEE ALSO

[fprintd](/man/fprintd)(1), [fprintd-delete](/man/fprintd-delete)(1), [fprintd-list](/man/fprintd-list)(1), [fprintd-verify](/man/fprintd-verify)(1)
