# TAGLINE

test fingerprint authentication

# TLDR

Verify **all stored fingerprints** for the current user

```fprintd-verify```

Verify a **specific fingerprint** for the current user

```fprintd-verify -f [left-thumb|left-index-finger|right-thumb|...]```

Verify fingerprints for a **specific user**

```fprintd-verify [username]```

Verify a **specific fingerprint** for a **specific user**

```fprintd-verify -f [finger_name] [username]```

**Fail** the process if a fingerprint doesn't match

```fprintd-verify --g-fatal-warnings```

Display **help**

```fprintd-verify -h```

# SYNOPSIS

**fprintd-verify** [_options_] [_username_]

# PARAMETERS

**-f**, **--finger** _FINGER_
> Specify which finger to verify: left-thumb, left-index-finger, left-middle-finger, left-ring-finger, left-little-finger, right-thumb, right-index-finger, right-middle-finger, right-ring-finger, right-little-finger

**--g-fatal-warnings**
> Exit with error code if verification fails

**-h**, **--help**
> Display help message

# DESCRIPTION

**fprintd-verify** tests enrolled fingerprints against the fprintd database. It prompts the user to scan their finger and reports whether the scan matches any enrolled fingerprint.

This is useful for testing fingerprint enrollment quality and troubleshooting authentication issues. Without specifying a finger, the system attempts to match against any enrolled finger.

# CAVEATS

Verification success depends on scan quality and may require multiple attempts. Environmental factors like moisture or dirt on the sensor can affect results. This command is for testing; actual authentication uses PAM integration.

# SEE ALSO

[fprintd](/man/fprintd)(1), [fprintd-enroll](/man/fprintd-enroll)(1), [fprintd-delete](/man/fprintd-delete)(1), [fprintd-list](/man/fprintd-list)(1)
