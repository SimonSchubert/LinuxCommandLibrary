# TAGLINE

Update the IEEE OUI manufacturer database

# TLDR

**Update** the OUI database

```sudo airodump-ng-oui-update```

# SYNOPSIS

**airodump-ng-oui-update**

# DESCRIPTION

**airodump-ng-oui-update** downloads the latest IEEE OUI (Organizationally Unique Identifier) database file. This database maps MAC address prefixes to manufacturer names, allowing airodump-ng to display device manufacturers.

The tool fetches the database from IEEE's website and installs it in the aircrack-ng data directory, typically /usr/share/aircrack-ng/ or similar.

# CAVEATS

Requires internet connectivity and root privileges. The IEEE OUI database is updated periodically; run this command occasionally to get accurate manufacturer information for newer devices.

# HISTORY

**airodump-ng-oui-update** is a helper script included with the aircrack-ng suite, added to simplify keeping the OUI database current without manually downloading and placing files.

# SEE ALSO

[airodump-ng](/man/airodump-ng)(1), [aircrack-ng](/man/aircrack-ng)(1)
