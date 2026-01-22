# TLDR

Display a **random name** and address

```rig```

Display a **male** random identity

```rig -m```

Display a **female** random identity

```rig -f```

Use data files from a **specific directory**

```rig -d path/to/directory```

Display a **specific number** of identities

```rig -c 5```

# SYNOPSIS

**rig** [_options_]

# PARAMETERS

**-m**
> Generate male identities only

**-f**
> Generate female identities only

**-d** _directory_
> Use data files from specified directory

**-c** _count_
> Number of identities to generate

# DESCRIPTION

**rig** generates random identities including first name, last name, street address, city, state, ZIP code, and area code. All components are geographically consistent for the same region.

This is useful for testing applications, generating sample data, or populating databases with realistic-looking but fake personal information.

# CAVEATS

Generated data is random and fictional. Data files determine available names and locations.

# HISTORY

Created as a utility for generating random test data with realistic-looking personal information.

# SEE ALSO

[pwgen](/man/pwgen)(1)
