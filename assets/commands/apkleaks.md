# TAGLINE

Scan APKs for hardcoded secrets and keys

# TLDR

**Scan** APK for hardcoded secrets

```apkleaks -f [app.apk]```

Scan with **JSON output**

```apkleaks -f [app.apk] -o [results.json]```

Scan with **custom patterns**

```apkleaks -f [app.apk] -p [patterns.json]```

**Verbose** output

```apkleaks -f [app.apk] -v```

# SYNOPSIS

**apkleaks** -f _apk_file_ [_-o output_] [_-p patterns_] [_options_]

# DESCRIPTION

**apkleaks** scans Android APK files for hardcoded secrets, API keys, and sensitive information. It decompiles the APK, searches through code and resources using regex patterns, and reports potential security issues.

The tool helps identify accidental exposure of credentials, private keys, URLs with tokens, and other sensitive data that developers may have inadvertently included in their applications.

# PARAMETERS

**-f** _file_
> APK file to analyze

**-o** _file_
> Output file for results

**-p** _file_
> Custom patterns file (JSON)

**-a** _args_
> Additional arguments to pass to the jadx decompiler.

**--json**
> Output results in JSON format.

**-v**, **--verbose**
> Verbose output, including matched line numbers.

**--disassemble**
> Disassemble bytecode (slower, may catch additional secrets).

# DETECTED PATTERNS

- API keys (AWS, Google, Facebook, etc.)
- Private keys and certificates
- Tokens and secrets in URLs
- Hardcoded passwords
- Database credentials
- Custom regex patterns

# CAVEATS

May produce false positives requiring manual verification. Only detects string-based secrets; encrypted or obfuscated data won't be found. Decompilation may fail for heavily protected APKs.

# HISTORY

**apkleaks** was created for Android security assessments, automating the process of identifying leaked secrets that manual code review might miss.

# INSTALL

```brew: brew install apkleaks```

```nix: nix profile install nixpkgs#apkleaks```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apktool](/man/apktool)(1), [jadx](/man/jadx)(1), [androguard](/man/androguard)(1)
