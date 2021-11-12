package rpgame.entity;


import rpgame.domain.npc.Merchant;

public interface Seller {
    String sell(Merchant.Goods goods);
}
