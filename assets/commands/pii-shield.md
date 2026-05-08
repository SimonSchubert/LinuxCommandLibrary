# TAGLINE

Detect and mask personally identifiable information in text

# TLDR

**Detect PII** in an inline string

```pii-shield detect "Contact john@example.com for help"```

**Mask** PII by **replacing** it with entity-type labels

```pii-shield mask "My email is john@example.com" --strategy [replace]```

**Redact** PII (remove the matching span entirely)

```pii-shield mask "SSN 123-45-6789" --strategy [redact]```

**Hash** PII to a stable, deterministic value

```pii-shield mask "Card 4111-1111-1111-1111" --strategy [hash]```

**Process a file** and write the masked output to another file

```pii-shield file [input.txt] -o [output.txt] --strategy [redact]```

# SYNOPSIS

**pii-shield** _command_ _input_ [**--strategy** _STRATEGY_] [**-o** _output_]

# PARAMETERS

**detect** _TEXT_
> Print the PII entities found in _TEXT_ (entity type, position, score) without modifying the input.

**mask** _TEXT_
> Return _TEXT_ with detected PII rewritten according to **--strategy**.

**file** _INPUT_
> Read PII from _INPUT_ file and emit masked output to **stdout** or to the path given with **-o**.

**--strategy** _STRATEGY_
> How to rewrite each detected entity. One of:
>
> **replace** — substitute with the entity label, e.g. `<EMAIL_ADDRESS>`.
> **redact** — delete the matching span entirely.
> **mask** — replace each character with `*` (the default).
> **hash** — replace with a deterministic hash of the original value.

**-o** _FILE_
> Write masked output to _FILE_ instead of standard output (used with **file**).

# DESCRIPTION

**pii-shield** is a command-line front-end to a dual-engine PII detection library. Each input is run through **Microsoft Presidio** locally (using spaCy NER models plus regex patterns), and, when configured, also through **Microsoft Foundry / Azure Language Service** in the cloud. Results from both engines are merged so that high-confidence cloud detections complement the local ones, while traffic stays local when no Azure endpoint is configured.

The library recognises common entity types out of the box, including person names, email addresses, phone numbers, credit-card numbers, social security numbers, IBAN/bank account numbers, IP addresses and URLs. Detected entities are then transformed by one of four masking strategies (**replace**, **redact**, **mask**, **hash**), making the same tool useful both for safely sharing log/data samples and for producing deterministically-anonymised datasets.

The CLI is intended for one-off operations and pipeline integration; the same engine is also reachable through a Python API and a REST server for embedding in larger applications.

# CONFIGURATION

Configuration is read from a **.env** file (or the corresponding environment variables) in the working directory. Setting **AZURE_FOUNDRY_ENDPOINT** to your Azure Cognitive Services endpoint and authenticating with **az login** enables the dual-engine path. Leaving **AZURE_FOUNDRY_ENDPOINT** unset restricts detection to the local Presidio engine. Optional variables tune model selection, score thresholds, and the entity allow/deny lists.

# CAVEATS

PII detection is best-effort: false negatives (missed PII) are inevitable with NER and regex, and false positives can mangle legitimate text. Always review high-stakes output. The **hash** strategy preserves equality but reveals frequency patterns and is not a substitute for proper anonymisation. Local mode requires the spaCy models to be downloaded; the first invocation may be slow as models are pulled. Cloud mode sends input text to Azure — confirm this is permitted by your data-handling policy before enabling it.

# HISTORY

**pii-shield** is published by Microsoft as part of the AI Build internal-to-open-source pipeline at **github.com/MSFT-AI-BUILD-INTERNAL/pii-shield**. It builds on **Presidio**, Microsoft's open-source data-protection SDK first released in **2019**, by adding cloud co-detection through **Azure Foundry / Azure Language Service** and exposing the result as a thin CLI.

# SEE ALSO

[presidio-analyze](/man/presidio-analyze)(1), [presidio-anonymize](/man/presidio-anonymize)(1), [scrubadub](/man/scrubadub)(1)
