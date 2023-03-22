package com.example.mdc.adapter;


import org.jetbrains.annotations.NotNull;

/**
 * Holds the image resource references used by the grid and the pager fragments.
 */
abstract class ImageData {

  // Image assets (free for commercial use, no attribution required, from pixabay.com)
  @NotNull
  static final String[] IMAGES_URL_LIST = {
          "https://www.gstatic.com/404",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQqNZNZvSkBzt5rPSmUNYKNG1MpuC6h1LppdQ",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQcikPF2V9GSmCy98NUw0u9lehuYk_V0tTTPQ",
          "https://upload.wikimedia.org/wikipedia/commons/4/43/ESO-VLT-Laser-phot-33a-07.jpg",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSR6FeU1LpnDc51eJEbJY6fn_rg6md8SfAbQw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQyoGWuJ1GFcGfQ2EWMcCA7piB5AtvdN-USSw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLYPN9b5PVwzB50Nrebay37z79Xr18rH9rdQ",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzhSXSznpKjRjkVSDai0I22GlBHMcVXHPjZg",
          "lalala",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKMBWXDkh39EwFfxTgsvf-f-IuC_cMHDX1Sg",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSWmWDG5z0KEBbc-My7aGzu7vNdzyyVjsu4Vw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKPLHQe7eDJwGkcSdhhgH6rwHsGQ7ccSvBog",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiAiBlU5Oi9hhA1OOExgc-RK0ZSlqoon9aAQ",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmOIDvtPWSLzribzOkcHNoBS_csNNr_ITK6Q",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1ap_Z70D4gjMxteYl6AU_RkajV-ZtHvt0AQ",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQLsuyPZUIejeqbwJHNChiqeuUzJyfX1chj7w",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRSljmIAENV5PNzvZxA9z3y5t_V1AiIVhGzWw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmf84YLb5lqDzJ-fcz-qHJO6Q6Bll7RprXcg",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPbrKAhzUA3a1EF0gSiESp8xSnBd5dqwtCzw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMUUwSom7iJMnW8WEQZSMLlSPsf4PUmjJl0A",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTwXWNNzDd6Y1AlD7tv8U1IY6GnTNufZUvLww",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAMciox9h7r0gIk3FNEsXWChd3lzV31KrMyQ",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIkdASh8WV9dQzFm85iPsqbT3J4_MadA1VCg",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5TUu8wKRm0kaQfhIxGBTPMOGl4pDtS45rnQ",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQopxrijy0yFX-a1-OcErv-viDJjHP4RzjuDQ",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQknXxFL2Aqwf_kL8r6GwoMJ7ISNa23reW8-w",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsR-oHmKFQ-etDR6SookjLSuB4tuqycrfDXg",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRonU9NIJPlvSe062MhYSSHkp1pBqfKHOCdfQ",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqqqLZE-H00eKWVu_S2XgazHYlbis_J0Pcyg",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8VB-mzmcyP4Aqp6-dJD43xppcT91H3Tu-Og",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6xicA3xjOlOw-nuhyf3IuJDvtIPOOKGJ7mA",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqlfmEE5Lc_6dbOhfJz7yoNk51ILAklwdLow",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcREQMeJCscqF5d3tCfHKyGNdVFETK_jJa9EWw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTspRGS0Kr-KZSgtYQm0o-uakrCbSARzKEKrA",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbgQy-JV9afC8wCqgEKCfPPFxd8HO3onz3Hw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_LWY6AzP8KRci245oPJVSzzxW_FrKBt7rSA",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTq0CRKe4KtIGBIMETQ0ex9Qpd02lNsC6lP_Q",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRbFj32yJTt3NY97WhgH4OWeUKxMkZ8DMcfLA",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSXpdIihbWRDkaGmKI-NgKIqBluMv0pMZ8YRA",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQydDs-n02itkgiAgQjr3wDS0sq4ePfXbL6-Q",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS63NjywoT8PBy_7mQt2yiUUtqcXgUj-PDKJw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQeycLgA0t_qfu1p4CnGxXxv-lwrKnTOlVX0w",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRT3jAF42-4SeO_UbPlfov8lFAFS3hNp3tDEw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8M-jtdLzUuC_Udzj2_hENNnHYV7OgrSfFIw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5Mz0Y6_TKW63m1WntkSc3Bp4EEyR4d4S2Ww",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnbq3IHwxptU2b8FUeKM9njDB7y3JgCBBCUA",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToSVwmJboplM-PgS_8X4l9LYu7krlUjsvi2w",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMOXQmElJGqPoI22kTDkxCLoUvlS3rpQ67Xw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTHnVjJ5ccbeKgntqSV12DshaZxV2RksgSFKA",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQwfsaC4husVgkQFURu3lYHdzo5HVr7FPZYng",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTv5hnwbcXDw2Oh61t6ijPAocTFd55pOeXi5A",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcR20ygXALVfLcRoqOaLtfKE2rqdAyTEJEpg",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9CGIStKypQWhWQFPFi91ApQBlQJeLzkRwCg",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRFTIXdqf2UVa4kZ7hlZJ2WFrlh5CP4e1H4bQ",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdRbAmtzvPx_gMEjETiZoNxY60NNZIn1BIPw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSVllqE8SdCDumUSuRnlfkwIH58FbkqxhPpvQ",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRCye_hJi0H1golAqgB2RsjBaPt-v4xdsevqg",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpQButNDdFgkST2IyOSm3wsjNnnJ72Kca2LA",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQA4GxhMBrzPV6q629aesS2bzvvXE0YYxNJPw",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThhBMDZ3T_irgDB8OCERv0glmnaQfyXsYZKg",
          "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQrhlRkRWv2JlitnghwdCG_YF_vTOgxjMHEDg",
  };

}
