# TAGLINE

remove enrolled fingerprint data

# TLDR

Remove **all fingerprints** for a specific user

```fprintd-delete [username]```

Remove a **specific fingerprint** for a specific user

```fprintd-delete [username] -f [left-thumb|left-index-finger|right-thumb|...]```

Display **help**

```fprintd-delete```

# SYNOPSIS

**fprintd-delete** [_options_] _username_

# PARAMETERS

**-f**, **--finger** _FINGER_
> Specify which finger to delete: left-thumb, left-index-finger, left-middle-finger, left-ring-finger, left-little-finger, right-thumb, right-index-finger, right-middle-finger, right-ring-finger, right-little-finger

# DESCRIPTION

**fprintd-delete** removes enrolled fingerprint data from the fprintd database. Without the **--finger** option, all fingerprints for the specified user are removed.

This command communicates with the fprintd daemon via D-Bus to perform the deletion. Fingerprint data is stored in **/var/lib/fprint** and requires appropriate permissions to modify.

# CAVEATS

Deleting fingerprints cannot be undone. Users must re-enroll their fingerprints using **fprintd-enroll** if needed. Root privileges may be required to delete fingerprints for other users.

# SEE ALSO

[fprintd](/man/fprintd)(1), [fprintd-enroll](/man/fprintd-enroll)(1), [fprintd-list](/man/fprintd-list)(1), [fprintd-verify](/man/fprintd-verify)(1)
