# TLDR

**Lint Markdown file**

```markdownlint [file.md]```

**Lint directory**

```markdownlint [docs/]```

**Fix issues automatically**

```markdownlint --fix [file.md]```

**Use config file**

```markdownlint --config [.markdownlint.json] [file.md]```

**Ignore specific rules**

```markdownlint --disable [MD013] [MD033] -- [file.md]```

**Output JSON format**

```markdownlint --json [file.md]```

# SYNOPSIS

**markdownlint** [_options_] _files_...

# PARAMETERS

**-f**, **--fix**
> Fix issues automatically.

**-c**, **--config** _file_
> Configuration file.

**-d**, **--disable** _rules_
> Disable rules.

**-e**, **--enable** _rules_
> Enable rules.

**-i**, **--ignore** _pattern_
> Ignore files.

**-o**, **--output** _file_
> Output file.

**-j**, **--json**
> JSON output.

# DESCRIPTION

**markdownlint** is a style checker and linter for Markdown files. It enforces consistent Markdown formatting based on configurable rules.

The tool checks for issues like inconsistent heading styles, line length, trailing spaces, and proper list formatting.

# CONFIGURATION

```json
// .markdownlint.json
{
  "MD013": { "line_length": 120 },
  "MD033": false,
  "MD041": false
}
```

# COMMON RULES

```
MD001 - Heading increment
MD013 - Line length
MD022 - Heading blank lines
MD033 - Inline HTML
```

# CAVEATS

CLI (markdownlint-cli) separate from library. Rules may conflict with some Markdown processors. Auto-fix limited to some rules.

# HISTORY

markdownlint was created by **David Anson** as a Node.js library, with the CLI wrapper (markdownlint-cli) developed separately.

# SEE ALSO

[prettier](/man/prettier)(1), [remark](/man/remark)(1), [markdown](/man/markdown)(1), [vale](/man/vale)(1)
