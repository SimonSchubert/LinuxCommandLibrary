# TAGLINE

Validate Android App Bundle files

# TLDR

**Validate an Android App Bundle**

```bundletool validate --bundle=[app.aab]```

# SYNOPSIS

**bundletool** **validate** **--bundle**=_path_

# PARAMETERS

**--bundle** _path_
> Path to the Android App Bundle (.aab) file to validate.

# DESCRIPTION

**bundletool validate** checks if an Android App Bundle (.aab) file is structurally valid and conforms to the App Bundle format specification. It verifies the bundle's internal structure, manifest, and configuration.

This is useful for catching issues before uploading to Google Play or other app distribution stores.

# CAVEATS

Requires Java Runtime Environment (JRE) version 11 or higher. Validation is structural; it does not verify runtime behavior or business logic.

# SEE ALSO

[bundletool](/man/bundletool)(1), [bundletool-dump](/man/bundletool-dump)(1)
