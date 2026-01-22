# TLDR

List enrolled fingerprints for a **specific user**

```fprintd-list [username]```

List enrolled fingerprints for **multiple users**

```fprintd-list [username1] [username2] ...```

Display **help**

```fprintd-list```

# SYNOPSIS

**fprintd-list** _username_ [_username_...]

# DESCRIPTION

**fprintd-list** displays the fingerprints enrolled in the fprintd database for specified users. The output shows which fingers have been registered for each user.

The command queries the fprintd daemon via D-Bus to retrieve enrollment information. This is useful for verifying which fingers are registered before attempting authentication or deciding which additional fingers to enroll.

# CAVEATS

Requires the fprintd daemon to be running. May require appropriate permissions to list fingerprints for other users.

# SEE ALSO

[fprintd](/man/fprintd)(1), [fprintd-enroll](/man/fprintd-enroll)(1), [fprintd-delete](/man/fprintd-delete)(1), [fprintd-verify](/man/fprintd-verify)(1)
