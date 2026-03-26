# TAGLINE

Stripe payment platform developer CLI

# TLDR

**Login to Stripe**

```stripe login```

**Listen for webhooks**

```stripe listen```

**Forward to local server**

```stripe listen --forward-to [localhost:3000/webhook]```

**Trigger test event**

```stripe trigger [payment_intent.succeeded]```

**List customers**

```stripe customers list```

**Create payment intent**

```stripe payment_intents create --amount [1000] --currency [usd]```

**View logs**

```stripe logs tail```

**Open dashboard**

```stripe open```

# SYNOPSIS

**stripe** _command_ [_subcommand_] [_options_]

# PARAMETERS

**login**
> Authenticate the CLI with your Stripe account via browser.

**listen**
> Listen for webhook events and optionally forward them to a local endpoint.

**trigger** _EVENT_
> Trigger a test webhook event (e.g., payment_intent.succeeded, charge.failed).

**logs tail**
> Stream real-time API request and response logs.

**open**
> Open Stripe dashboard pages in the default browser.

**status**
> Check the current status of the Stripe API.

**samples**
> Download and set up sample Stripe integration projects.

**get** _RESOURCE_
> Make a GET request to the Stripe API.

**post** _RESOURCE_
> Make a POST request to the Stripe API.

**--forward-to** _URL_
> Forward received webhook events to a local URL (used with listen).

**--api-key** _KEY_
> Use a specific Stripe API secret key for the command.

**-p**, **--project-name** _NAME_
> Run the command for a specific project configuration (default: "default").

**--color** _on|off_
> Enable or disable colored output.

**--log-level** _LEVEL_
> Set log verbosity level (default: info).

**-h**, **--help**
> Display help for a command.

**-v**, **--version**
> Display the CLI version.

# DESCRIPTION

**stripe** is the official command-line interface for the Stripe payment platform, designed to streamline development and testing of payment integrations. It provides direct access to the Stripe API, allowing developers to create and manage resources like customers, payment intents, and subscriptions without writing code.

A key feature is webhook listening, which receives Stripe events locally and forwards them to a development server. This eliminates the need for public URLs during development. The trigger command simulates specific events like successful payments or failed charges, enabling thorough testing of webhook handlers.

The CLI also provides real-time log tailing for monitoring API requests and responses, and can open the Stripe dashboard directly. Authentication is handled through the login command, which manages API keys and supports both test and live modes.

# CAVEATS

Requires a Stripe account and authentication via **stripe login** before use. API keys are sensitive credentials and should not be shared or committed to version control. The **listen** command only receives events while running; events fired when it is not active are missed. Webhook forwarding uses a temporary webhook signing secret that changes each session. Resource commands (e.g., **stripe customers list**) operate on live data unless using a test mode API key.

# HISTORY

The **Stripe CLI** was released by **Stripe** in **2019** as an open-source tool to improve the developer experience for building payment integrations. It was built in Go and published on GitHub. The CLI addressed the common pain point of testing webhooks locally, which previously required tools like ngrok. It has since expanded to include API resource management, log tailing, sample project scaffolding, and Stripe Apps development support.

# SEE ALSO

[curl](/man/curl)(1), [jq](/man/jq)(1)
