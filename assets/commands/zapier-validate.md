# TAGLINE

Validate Zapier integration configuration

# TLDR

**Validate integration**

```zapier validate```

**Validate including style checks**

```zapier validate --include-style```

# SYNOPSIS

**zapier** **validate** [_--include-style_] [_--format_ _json|plain_]

# PARAMETERS

**--include-style**
> Run additional lint/style checks used by the Zapier app review.

**--format** _FORMAT_
> Output format: plain (default) or json.

# DESCRIPTION

**zapier validate** checks a Zapier integration for errors. It validates the integration schema, required fields, and configuration. Run before **zapier push** to catch issues early, since invalid integrations cannot be uploaded.

# SEE ALSO

[zapier](/man/zapier)(1), [zapier-test](/man/zapier-test)(1), [zapier-push](/man/zapier-push)(1)

