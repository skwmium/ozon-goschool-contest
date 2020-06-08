SELECT id, name FROM goods g
LEFT JOIN tags_goods tg ON tg.goods_id = g.id
GROUP BY g.id, g.name
HAVING COUNT(tg.tag_id) = (SELECT COUNT(*) FROM tags); 