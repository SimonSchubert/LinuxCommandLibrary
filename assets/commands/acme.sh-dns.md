# TLDR

**Issue** certificate using Cloudflare DNS

```export CF_Token="[token]" && acme.sh --issue -d [example.com] --dns dns_cf```

Issue using **AWS Route53**

```export AWS_ACCESS_KEY_ID="[key]" && export AWS_SECRET_ACCESS_KEY="[secret]" && acme.sh --issue -d [example.com] --dns dns_aws```

Issue using **DigitalOcean** DNS

```export DO_API_KEY="[token]" && acme.sh --issue -d [example.com] --dns dns_dgon```

Issue **wildcard** certificate with DNS

```acme.sh --issue -d [example.com] -d [*.example.com] --dns dns_cf```

# SYNOPSIS

**acme.sh** --issue -d _domain_ --dns _dns_provider_ [_options_]

# DESCRIPTION

**acme.sh** DNS mode enables automated certificate issuance using DNS-01 validation. This method proves domain ownership by creating a specific TXT record in the domain's DNS zone. It's required for wildcard certificates and useful when HTTP validation isn't possible.

The tool supports over 100 DNS providers through API integration. Credentials are typically provided via environment variables, and acme.sh handles creating and removing the validation records automatically.

# PARAMETERS

**--dns** _provider_
> DNS provider plugin name (dns_cf, dns_aws, dns_gd, dns_ali, etc.)

**--dnssleep** _seconds_
> Seconds to wait for DNS propagation (default: automatic)

**--dns-alias** _domain_
> Use alias domain for DNS validation (CNAME delegation)

**-d** _domain_
> Domain name (repeat for wildcards: -d example.com -d *.example.com)

# COMMON DNS PROVIDERS

**dns_cf**
> Cloudflare (CF_Token or CF_Key + CF_Email)

**dns_aws**
> AWS Route53 (AWS_ACCESS_KEY_ID + AWS_SECRET_ACCESS_KEY)

**dns_gd**
> GoDaddy (GD_Key + GD_Secret)

**dns_dgon**
> DigitalOcean (DO_API_KEY)

**dns_ali**
> Aliyun/Alibaba Cloud (Ali_Key + Ali_Secret)

**dns_gcloud**
> Google Cloud DNS (CLOUDSDK_ACTIVE_CONFIG_NAME)

**dns_linode**
> Linode (LINODE_V4_API_KEY)

**dns_ovh**
> OVH (OVH_AK + OVH_AS + OVH_CK)

# CAVEATS

API credentials are stored in account.conf for automatic renewal. DNS propagation can take time; increase --dnssleep if validation fails. Some providers have rate limits on API calls. API token permissions should be limited to DNS management only.

# HISTORY

DNS validation support was added to **acme.sh** in **2016** following the ACME protocol specification. The number of supported DNS providers has grown substantially, with community contributions adding new providers regularly.

# SEE ALSO

[acme.sh](/man/acme.sh)(1), [certbot](/man/certbot)(1), [dig](/man/dig)(1), [nslookup](/man/nslookup)(1)
