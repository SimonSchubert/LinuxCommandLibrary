# TLDR

**Parse IE cookies**

```galleta [index.dat]```

**Output to file**

```galleta [index.dat] > [cookies.txt]```

**Parse with delimiters**

```galleta -d [index.dat]```

# SYNOPSIS

**galleta** [_options_] _file_

# PARAMETERS

_FILE_
> Internet Explorer cookie file (index.dat).

**-d**
> Delimited output for spreadsheets.

**--help**
> Display help information.

# DESCRIPTION

**galleta** is a digital forensics tool that parses Internet Explorer cookie files. It extracts cookie data including domains, paths, values, and timestamps from index.dat files.

The tool produces human-readable or delimited output for analysis. It's used in forensic investigations to examine web browsing history and user activity.

galleta handles the binary index.dat format used by older versions of Internet Explorer.

# CAVEATS

Only for IE index.dat format. Modern browsers use different formats. File must be accessible (not locked).

# HISTORY

galleta (Spanish for "cookie") is part of forensic toolkit collections for analyzing Internet Explorer artifacts. It parses the proprietary index.dat format used by IE for cookie storage.

# SEE ALSO

[pasco](/man/pasco)(1), [strings](/man/strings)(1)
