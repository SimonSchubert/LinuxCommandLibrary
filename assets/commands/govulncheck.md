# TAGLINE

report known vulnerabilities that affect Go source or binaries

# TLDR

Scan the **current module** and dependencies

```govulncheck ./...```

Scan a **package path**

```govulncheck [./cmd/mytool]```

Scan a compiled **binary**

```govulncheck -mode binary [path/to/binary]```

Extract a compact blob for later **binary** analysis

```govulncheck -mode extract [path/to/binary]```

Include **test** files

```govulncheck -test ./...```

Print **full call stacks**

```govulncheck -show traces ./...```

Emit **JSON**, **SARIF**, or **OpenVEX**

```govulncheck -format json ./...```

# SYNOPSIS

**govulncheck** [_options_] [_package_ | _binary_...]

# PARAMETERS

**-mode** _source|binary|extract_
> Analysis mode. Default is source (Go package patterns). **binary** uses a binary's symbol table. **extract** writes a blob you can pass back to **-mode binary**.

**-format** _text|json|sarif|openvex_
> Output format. JSON/SARIF/OpenVEX always exit 0 regardless of findings.

**-show** _traces|verbose_
> Extra detail: full stacks or progress.

**-test**
> Include test files in a source scan.

**-tags** _list_
> Build tags (comma-separated), same idea as **go** **test** **-tags**.

**-db** _url_
> Vulnerability database (default https://vuln.go.dev). Must implement the Go vuln DB spec.

# DESCRIPTION

**govulncheck** (module **golang.org/x/vuln**) reports CVEs and Go vulnerability IDs that can actually reach your program. In source mode it uses the same package patterns as the **go** command (`./...` means this package and all subpackages). It matches findings against the Go vulnerability database and, for source, prints a short call-stack summary from your code into the vulnerable function.

Binary mode cannot reconstruct call graphs, so it may report symbols that are present but unreachable. Requests to vuln.go.dev send module paths already known to that database, not your source.

Exit code 0 means no vulnerabilities in **text** mode; a finding makes the process fail. Machine formats succeed even when issues exist.

# CAVEATS

Interface and function-pointer calls are treated conservatively (false positives). **reflect** and **unsafe** can hide real calls (false negatives). There is no official way to silence a finding. Binaries built before Go 1.18 only get standard-library vulns. Source analysis uses the **go** tool on **PATH**.

# HISTORY

Part of the Go vulnerability management work from the Go security team. Install with `go install golang.org/x/vuln/cmd/govulncheck@latest`.

# INSTALL

```apt: sudo apt install govulncheck```

```dnf: sudo dnf install govulncheck```

```pacman: sudo pacman -S govulncheck```

```zypper: sudo zypper install govulncheck```

```brew: brew install govulncheck```

```nix: nix profile install nixpkgs#govulncheck```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[go](/man/go)(1), [trivy](/man/trivy)(1)

# RESOURCES

```[Documentation](https://pkg.go.dev/golang.org/x/vuln/cmd/govulncheck)```

```[Source code](https://go.googlesource.com/vuln)```

```[Homepage](https://go.dev/security/vuln/)```

<!-- verified: 2026-08-26 -->
