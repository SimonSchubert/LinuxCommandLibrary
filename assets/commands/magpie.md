# TAGLINE

Opinionated double-entry accounting CLI for humans and AI agents

# TLDR

**Initialize** a local encrypted book store

```magpie --store .magpie init```

Create a **chart account** with a workflow role

```magpie --store .magpie --actor owner ledger account create --number 1000 --name Checking --type asset --role bank_account```

Import a normalized **invoice** from JSON

```magpie --store .magpie --actor owner invoice import-json --file ./external-invoice.json```

**Post** an invoice (basis-aware journals)

```magpie --store .magpie --actor owner invoice post --invoice-id inv:...```

Mark an invoice **paid**

```magpie --store .magpie --actor owner invoice mark-paid --invoice-id inv:... --cash-account-id acct:... --paid-date 2026-06-15 --amount-cents 108500```

Create a **named snapshot** before a risky agent run

```magpie --store .magpie --actor owner snapshot create --name before-agent-run```

Read reconstructed **state** or **audit** trail

```magpie --store .magpie --actor owner state```

# SYNOPSIS

**magpie** [**--store** _DIR_] [**--jaybase-url** _URL_] [**--actor** _USER_ID_] [**--role** _ROLE_] _command_ ...

# PARAMETERS

**--store** _DIR_
> Local store directory (default **.magpie**). Mutually exclusive with hosted mode

**--jaybase-url** _URL_
> Hosted Jaybase HTTPS origin (or `JAYBASE_URL`). Token only via `JAYBASE_TOKEN`

**--actor** _USER_ID_
> Caller identity for RBAC (default **owner** after init)

**--role** _ROLE_
> Optional role assertion; must match the actor's assigned role

**init**
> Bootstrap a local or empty hosted book (`cash` basis, **owner** with Owner role)

**book settings get**|**set**
> Read or set book-level settings (e.g. **--accounting-basis** cash|modified_cash|accrual)

**ledger account** ...
> Create/list accounts, set numbers, roles, and external refs

**ledger journal create** **--file** _entry.json_
> Privileged manual journal (requires **journal:adjust** and **manual_reason**)

**customer**|**invoice**|**payout** ...
> First-class source-document workflows with basis-aware journals

**note put**|**get**|**list**
> Markdown operational notes

**snapshot create --name** _NAME_
> Named recovery root

**rbac** ...
> Permissions, roles, users, and defaults repair

**state** / **audit**
> Reconstructed state and immutable audit nodes (needs **audit:read**)

# DESCRIPTION

**magpie** is a CLI and domain engine for double-entry bookkeeping designed for small teams and AI agents. Every write checks RBAC and accounting invariants, then appends an encrypted, immutable event to [Jaybase](https://github.com/kyle-visner/jaybase). Stdout is JSON by default for agent consumption; stderr carries structured errors.

The book has a single **accounting basis** (`cash`, `modified_cash`, or `accrual`). Invoice and payout workflows generate origin-tagged journals with the correct A/R versus cash semantics. Generic `ledger journal create` is restricted to manual adjustments and imports with a required reason — ordinary operating activity should use domain commands.

Local mode stores objects under `.magpie/` with AES-256-GCM payloads. Hosted mode talks to a Jaybase service over HTTPS with bearer auth, optimistic concurrency, and idempotent writes. Agents should follow `llm.md` in the project: never edit store files directly, use account **roles** not names for workflow decisions, and snapshot before large changes.

# CAVEATS

Pre-1.0. `--actor` is not cryptographically bound to the Jaybase token principal — run only in trusted automation or behind a wrapper that maps authenticated callers. No native QuickBooks parser; agents must normalize external data into Magpie JSON contracts. Hosted full-history replay grows with ledger size. AGPL-3.0-or-later. Requires a recent Go toolchain to build from source.

# HISTORY

Built as an agent-safe accounting surface on the Jaybase append-only encrypted event store, with explicit workflow origins, RBAC, and basis-aware posting rules.


# SEE ALSO

[jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/kyle-visner/magpie)```

```[Documentation](https://github.com/kyle-visner/magpie/blob/main/README.md)```

<!-- verified: 2026-07-29 -->
