# TAGLINE

Neofetch-like country information fetcher

# TLDR

**Display** information about your current country (auto-detected via IP)

```countryfetch```

**Display** information about a country using its 2-letter code

```countryfetch [us]```

**Display** information about multiple countries by name

```countryfetch [UnitedStates] [UnitedKingdom]```

**List** all available country names and codes

```countryfetch --list-countries```

**Display** information about every country

```countryfetch --all-countries```

**Show** only specific fields for a country

```countryfetch [us] --select flag population capital```

# SYNOPSIS

**countryfetch** [_OPTIONS_] [_COUNTRY_...]

# PARAMETERS

**COUNTRY**
> One or more country names or 2-letter ISO codes (case-insensitive). If omitted, auto-detects via public IP geolocation.

**--all-countries**
> Print information about all countries.

**--list-countries**
> Print a list of all available country names and codes.

**--select** _FIELD..._
> Select which fields to show: area, flag, emoji, continent, population, tlds, languages, currencies, neighbours, establishment-date, iso-code, driving-side, capital, dialing-code, palette, color.

**--version**
> Print version.

**--help**
> Print help.

# DESCRIPTION

**countryfetch** displays country information in a terminal layout similar to neofetch. It renders an ASCII-art version of the country's flag alongside key facts such as population, area, capital, languages, currencies, neighboring countries, top-level domains, dialing codes, driving side, establishment date, and ISO codes. Output text is colorized using the brightest color extracted from the country's flag. All country data is embedded at compile time, so no runtime API calls are needed for country information.

# CAVEATS

Country detection relies on a public IP lookup, so it will not work offline and may reflect VPN location rather than physical location. Country data is baked into the binary at compile time, so updating data requires a new release. Requires Rust/Cargo 1.85+ to build from source.

# HISTORY

**countryfetch** was created by **Nik Revenco** and first released in **March 2025**. Written in Rust under the MIT/Apache-2.0 dual license. The latest version is v0.2.0. Available in the official Arch Linux repositories, Homebrew, and via Cargo. Inspired by the "fetch" family of tools (neofetch, fastfetch), applying the same terminal aesthetic to country data.

# SEE ALSO

[neofetch](/man/neofetch)(1), [fastfetch](/man/fastfetch)(1), [onefetch](/man/onefetch)(1), [cpufetch](/man/cpufetch)(1)
